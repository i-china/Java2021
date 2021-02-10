package com.data.cn;

import cn.data.com.Main;

import java.io.UnsupportedEncodingException;
import java.util.logging.Logger;

/**
 * @author HaleLv
 * @date 2021-02-09
 **/
public class LoggerDemo {
    public static void main(String[] args) {
        LoggerOne lo = new LoggerOne();
    }
}

class LoggerTwo{
    LoggerTwo(){
        Logger logger = Logger.getGlobal();
        logger.info("start proceess ");
        try{
            "".getBytes("invalidCharsetName");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        logger.info("process end");
    }
}

class LoggerOne{
    LoggerOne(){
        Logger one = Logger.getGlobal();
        one.info("Strart process");
        one.warning("warning ");
        one.fine("this fine");
        one.severe("process will be terminated");
    }
}