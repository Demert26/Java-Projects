package com.revature;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Logger logger = LoggerFactory.getLogger("com.revature.App");

        logger.trace("Something happened.");
        logger.debug("Hello World.");
        logger.info("Give some information about the program.");
        logger.error("Something bad happened.");


    }
}
