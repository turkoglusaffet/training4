package com.spring.training4.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("com.spring.training4.*")
@EnableAspectJAutoProxy
public class AppInitConfig {

}
