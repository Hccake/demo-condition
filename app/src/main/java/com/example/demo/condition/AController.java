package com.example.demo.condition;

import com.example.biz.service.AService;

/**
 * @author hccake
 */
public class AController {

    private final AService aservice;

    public AController(AService aservice) {
        this.aservice = aservice;
    }
}
