package academy.learnprogramming;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloMaven {
    public final static Logger log = LoggerFactory.getLogger(HelloMaven.class);
    public static void main(String[] args) {
        System.out.println("Hello Maven - Daily Commit");
        log.info("Hello info");
        log.debug("Hello Debug");
    }
}
