package org.elmahdi43;

import java.util.logging.Level;
import java.util.logging.Logger;

public class OtherClass {
    private static final Logger logger = Logger.getLogger(OtherClass.class.getName());

    public void printer(String item){
        logger.log(Level.INFO, "had item daz: {0}", item);
    }
}
