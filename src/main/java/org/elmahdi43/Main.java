package org.elmahdi43;

import java.util.List;
import java.util.logging.Logger;


    public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {

        logger.info("Mr7aban");
        System.out.println("Hello and welcome!");
        List<String> data = List.of("item 1", "item 2", "item 3", "item 4");
        OtherClass otherClass = new OtherClass();

        for (String item : data) {
            otherClass.printer(item);
        }
    }
}