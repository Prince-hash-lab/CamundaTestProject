//package com.example.workflow;
//
//import org.camunda.bpm.engine.delegate.DelegateExecution;
//import org.camunda.bpm.engine.delegate.JavaDelegate;
//
//import javax.inject.Named;
//
//public class CompletedEpakFunc {
//}
package com.example.workflow;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;

import javax.inject.Named;

@Named
public class CompletedEpakFunc implements JavaDelegate {
	@Autowired
	private EmailSenderService senderService;

	@Override
	public void execute(DelegateExecution delegateExecution) throws Exception {

		System.out.println("epak in signed successfully and in completed folder");
//		senderService.sendEmail("mahender.nirwan@msbdocs.com", " Signed successfully ", " You have signed the epak successfully, congo , mongo , dongoo.....   ");
//
//		senderService.sendEmail("naman.batra@msbdocs.com", " Signed successfully ", " You have signed the epak successfully, congo , mongo , dongoo.....   ");
//		delegateExecution.setVariable("type", "completed");
		senderService.sendEmail("aditya.agarwal@msbdocs.com", " Signed successfully ", " You have signed the epak successfully, congo , mongo , dongoo.....   ");

	}
}
//"nirwan.mahender@gmail.com"

