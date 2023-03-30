package com.example.workflow;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;
//
//import java.util.*;
//import javax.mail.*;
//import javax.mail.internet.*;
//import javax.activation.*;

import javax.inject.Named;

@Named
public class SignEpakFunc implements JavaDelegate {
    @Autowired
    private EmailSenderService senderService;
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        System.out.println("epak created successfully");
senderService.sendEmail("aditya.agarwal@msbdocs.com", "Epak created !", "Ram Ram ,Epak created successfully ");
//        senderService.sendEmail("mahender.nirwan@msbdocs.com", "Epak created !", "Ram Ram ,Epak created successfully ");
//        senderService.sendEmail("naman.batra@msbdocs.com", "Epak created !", "Ram Ram ,Epak created successfully ");
        System.out.println("Do you want to Sign Epak?");
//        String decision = "Yes";
//        delegateExecution.setVariable("signit", decision);
//        String str= (String) delegateExecution.getVariable("signit");
//        System.out.println(str);
//        System.out.println("after epak signing");
    }
}

