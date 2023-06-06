package com.gridnine.testing.util;


import lombok.extern.slf4j.Slf4j;


@Slf4j
public class Log {

    private Log() {
    }



    public static void info (String msg) {
        log.info(msg);
    }

    public static void error(Exception e) {
        log.error(e.getMessage());
    }

    public static void error(String s, Exception e) {
        log.error(s);
    }
}
