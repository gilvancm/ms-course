package com.devsuperior.hrpayroll.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.devsuperior.hrpayroll.entities.Payment;
import com.devsuperior.hrpayroll.entities.Worker;

//registro o componente no sprint boot
//aminha url

@Service
public class PaymentService {
	//pegar o valor do caminho lá na propriedade depois guardo num atributo da classe abaixo
	@Value("${hr-worker.host}")
	private String workerHost;
	
	
	//injeção de dependencia
	@Autowired
	private RestTemplate restTemplate;
	
	public Payment getPayment(long workerId, int days) {
	//como fazer uma requisição para um API externo
	//temos que criar uma classe worker neste projeto ai temos uma declaração do worker
		Map<String, String> uriVariables = new HashMap<>();
		uriVariables.put("id",""+ workerId); //"" para converter para String
		////caminho da requisição, passar os parametros uriVariables
		Worker worker = restTemplate.getForObject(workerHost + "/workers/{id}", Worker.class, uriVariables);
		//preenchimento dinamico pegando no projeto worker
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
