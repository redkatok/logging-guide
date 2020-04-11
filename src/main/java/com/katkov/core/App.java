package com.katkov.core;

import com.katkov.core.service.AppService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class App {
    public static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {


        logger.info("helloFromInfoMainInfo");
        logger.trace("helloFromInfoMainTrace");

        AppService appService = new AppService();
        appService.sayHiFromService();
    }
}
