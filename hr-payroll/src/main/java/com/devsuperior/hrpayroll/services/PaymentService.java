package com.devsuperior.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.devsuperior.hrpayroll.entities.Payment;

//registro o componente no sprint boot
//aminha url

@Service
public class PaymentService {
	
	public Payment getPayment(long workerId, int days) {
		//pagamento mocado MOCK
		return new Payment("Bob", 200.0, days);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
