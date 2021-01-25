package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {
    private static final Logger logger = LogManager.getLogger(App.class.getName());

    public static void main(String[] args) {
        logger.trace("trace!");
        logger.debug("debug!");
        logger.info("info!");
        logger.warn("warn!");
        logger.error("error!");
        logger.fatal("fatal!");
    }
}
