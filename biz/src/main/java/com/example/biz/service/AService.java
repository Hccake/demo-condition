package com.example.biz.service;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.stereotype.Component;

/**
 * @author hccake
 */
@Component
@ConditionalOnMissingBean(AService.class)
public class AService{
}
