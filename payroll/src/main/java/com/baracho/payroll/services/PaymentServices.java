package com.baracho.payroll.services;

import org.springframework.stereotype.Service;

import com.baracho.payroll.entities.Payment;

@Service
public class PaymentServices {
	
	public Payment getPayment(long workerId, int days) {
		return new Payment("Bob", 200.0, days);
	}

}
