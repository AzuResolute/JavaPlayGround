package interfaceAbstract;

public class MobilePhone implements ITelephone {
    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        this.isOn = true;
        System.out.println("Mobile phone powered up");

    }

    @Override
    public void dial(int phoneNumber) {
        if(this.isOn) {
            System.out.println("Now ringing " + phoneNumber + " on mobile phone");
        } else {
            System.out.println("Phone is currently switched off");
        }
    }

    @Override
    public void answer() {
        if(isRinging) {
            System.out.println("Answering the desk phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber && this.isOn) {
            this.isRinging = true;
            System.out.println("Mobile Phone Ringing");
        } else {
            System.out.println("Mobile phone not on");
            this.isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return this.isRinging;
    }
}
