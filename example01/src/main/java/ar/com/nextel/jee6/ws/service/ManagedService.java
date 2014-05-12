package ar.com.nextel.jee6.ws.service;

import javax.annotation.PostConstruct;

public class ManagedService {

	
	public String hello(String name) {
		return "hello " + name;
	}
	
	@PostConstruct
	public void pepe(){
		System.out.println("pase por acá");
	}

}
