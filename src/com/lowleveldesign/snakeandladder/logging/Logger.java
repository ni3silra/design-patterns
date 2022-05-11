package com.lowleveldesign.snakeandladder.logging;

public class Logger {
    private static Logger logger;

    private Logger() {
    }

    public static synchronized Logger getInstance() {
        if (logger == null)
            logger = new Logger();
        return logger;
    }

    public void log(String msg) {
        System.out.println(msg);
    }

}
