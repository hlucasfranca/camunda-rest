package org.camunda.bpm.spring.boot.example.web;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class ErrorDelegate implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        Integer tentativas = Integer.valueOf(delegateExecution.getVariable("tentativas").toString());

        tentativas +=1;

        delegateExecution.setVariable("tentativas", tentativas);
        System.out.println("oi");

        if(tentativas != 4){
            throw new RuntimeException("erro");
        }





    }
}
