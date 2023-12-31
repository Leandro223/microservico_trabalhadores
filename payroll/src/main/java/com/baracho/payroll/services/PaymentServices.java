package com.baracho.payroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baracho.payroll.entities.Payment;
import com.baracho.payroll.entities.Worker;
import com.baracho.payroll.feignclients.WorkerFeignClient;

@Service
public class PaymentServices {
	
	@Autowired
	private WorkerFeignClient workerFeignClient;
	
	public Payment getPayment(long workerId, int days) {
		
		
		
		Worker worker = workerFeignClient.findById(workerId).getBody();
		
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}

}
