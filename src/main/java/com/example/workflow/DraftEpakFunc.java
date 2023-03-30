package com.example.workflow;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;

import javax.inject.Named;

@Named
public class DraftEpakFunc implements JavaDelegate {
    @Autowired
    private EmailSenderService senderService;
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {

        System.out.println("epak rejected by user");
        senderService.sendEmail("aditya.agarwal@msbdocs.com", " Epak rejected  ", " User have rejected the epak. I think he dont have girlfriend. he drink without any reason.  ");
//
//        senderService.sendEmail("mahender.nirwan@msbdocs.com", " Epak rejected  ", " User have rejected the epak. I think he dont have girlfriend. he drink without any reason.  ");
//        senderService.sendEmail("naman.batra@msbdocs.com", " Epak rejected  ", " User have rejected the epak. I think he dont have girlfriend. he drink without any reason.  ");

//        delegateExecution.setVariable("type", "Draft");

    }
}

