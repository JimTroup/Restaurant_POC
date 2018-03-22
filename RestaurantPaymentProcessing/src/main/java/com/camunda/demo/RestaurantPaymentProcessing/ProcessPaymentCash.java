package com.camunda.demo.RestaurantPaymentProcessing;

import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class ProcessPaymentCash implements JavaDelegate {

	  private final Logger LOGGER = Logger.getLogger("MyLogger");
	  
	@Override
	public void execute(DelegateExecution execution) throws Exception {
		// TODO Auto-generated method stub
	    LOGGER.info("\n\nWriteToLogfile\n  ... LoggerDelegate invoked by "
	            + "processDefinitionId=" + execution.getProcessDefinitionId()
	            + ", activtyId=" + execution.getCurrentActivityId()
	            + ", activtyName='" + execution.getCurrentActivityName() + "'"
	            + ", processInstanceId=" + execution.getProcessInstanceId()
	            + ", businessKey=" + execution.getProcessBusinessKey()
	            + ", executionId=" + execution.getId()
	            + " \n\n");


	}

}
