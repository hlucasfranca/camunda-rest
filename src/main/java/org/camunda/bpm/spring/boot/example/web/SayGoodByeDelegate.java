package org.camunda.bpm.spring.boot.example.web;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class SayGoodByeDelegate implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        System.out.println("Goodbye" + delegateExecution.getProcessInstanceId());
    }
}
