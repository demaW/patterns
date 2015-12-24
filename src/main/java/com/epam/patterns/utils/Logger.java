package com.epam.patterns.utils;

import java.util.List;

public class Logger {
    public static final Logger out = new Logger();

    private final org.apache.log4j.Logger logger;

    public Logger() {
        this.logger = org.apache.log4j.Logger.getLogger(Logger.class.getName());
    }

    public void trace(final Object message) {
        logger.trace(message);
    };

    public void trace(final Object message, final Throwable e) {
        logger.trace(message, e);
    };

    public void trace(final Object... objects) {
        logger.trace(objectsAsString(objects));
    };

    public void trace(final String format, final Object... objects) {
        logger.trace(String.format(format, objects));
    };

    public void debug(final Object message) {
        logger.debug(message);
    };

    public void debug(final Object message, final Throwable e) {
        logger.debug(message, e);
    };

    public void debug(final Object... objects) {
        logger.debug(objectsAsString(objects));
    };

    public void debug(final String format, final Object... objects) {
        logger.debug(String.format(format, objects));
    };

    public void info(final Object message) {
        logger.info(message);
    };

    public void info(final Object message, final Throwable e) {
        logger.info(message, e);
    };

    public void info(final Object... objects) {
        logger.info(objectsAsString(objects));
    };

    public void info(final String format, final Object... objects) {
        logger.info(String.format(format, objects));
    };

    public void warn(final Object message) {
        logger.warn(message);
    };

    public void warn(final Object message, final Throwable e) {
        logger.warn(message, e);
    };

    public void warn(final Object... objects) {
        logger.warn(objectsAsString(objects));
    };

    public void warn(final String format, final Object... objects) {
        logger.warn(String.format(format, objects));
    };

    public void error(final Object message) {
        logger.error(message);
    };

    public void error(final Object message, final Throwable e) {
        logger.error(message, e);
    };

    public void error(final Object... objects) {
        logger.error(objectsAsString(objects));
    };

    public void error(final String format, final Object... objects) {
        logger.error(String.format(format, objects));
    };

    public void fatal(final Object message) {
        logger.fatal(message);
    };

    public void fatal(final Object message, final Throwable e) {
        logger.fatal(message, e);
    };

    public void fatal(final Object... objects) {
        logger.fatal(objectsAsString(objects));
    };

    public void fatal(final String format, final Object... objects) {
        logger.fatal(String.format(format, objects));
    };

    private String objectsAsString(final Object... objects) {
        final StringBuilder stringBuilder = new StringBuilder();
        for (Object obj : objects) {
            stringBuilder.append((stringBuilder.length() == 0) ? obj : ", " + obj);
        }
        return stringBuilder.toString();
    }

    public void traceErrorMessages(final String loggerMessage, final List<String> errorMessages) {
        StringBuilder sbdr = new StringBuilder();
        for (String message : errorMessages) {
            sbdr.append(String.format("[%s]", message));
        }
        Logger.out.trace("%s: [%s]", loggerMessage, sbdr.toString());
    }
}
