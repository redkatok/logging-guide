package com.katkov.core.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppService {
    Logger logger= LoggerFactory.getLogger(AppService.class);

    public void sayHiFromService(){
        logger.trace("helloFromTraceService");
    }
}
