import java.net.Socket;
import java.io.InputStream;
import java.io.IOException;

public class Client {
    public static void main(String[] args) {

        //This client gets the current time from a server in Germany.

        try {

            //Connect to the server.
            Socket socket =
                    new Socket("time-a-g.nist.gov", 13);

            InputStream stream = socket.getInputStream();
            int i;
            while ((i = stream.read()) != -1) {
                System.out.print((char)i);
            }
        }

        catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}