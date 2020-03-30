package org.camunda.bpm.spring.boot.example.web;

import org.camunda.bpm.engine.spring.SpringProcessEngineConfiguration;
import org.springframework.context.annotation.Bean;

public class BeanConfiguration {

    @Bean(name="sayHelloDelegate")
    public SayHelloDelegate delegate(){
        return new SayHelloDelegate();
    }


}
