package org.camunda.bpm.spring.boot.example.web;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.DelegateTask;
import org.camunda.bpm.engine.impl.history.event.HistoryEvent;
import org.camunda.bpm.spring.boot.starter.event.ExecutionEvent;
import org.camunda.bpm.spring.boot.starter.event.TaskEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
class MyListener {

    @EventListener
    public void onTaskEvent(DelegateTask taskDelegate) {
        boolean a = true;
    }

    @EventListener
    public void onTaskEvent(TaskEvent taskEvent) {
    }

    @EventListener
    public void onExecutionEvent(DelegateExecution executionDelegate) {
    }

    @EventListener
    public void onExecutionEvent(ExecutionEvent executionEvent) {
    }

    @EventListener
    public void onHistoryEvent(HistoryEvent historyEvent) {
    }

}