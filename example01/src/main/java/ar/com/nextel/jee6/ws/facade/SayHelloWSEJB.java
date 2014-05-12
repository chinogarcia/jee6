package ar.com.nextel.jee6.ws.facade;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebService;

import ar.com.nextel.jee6.ws.service.EjbService;

@WebService
@Stateless
public class SayHelloWSEJB {

	@Inject
	private EjbService ejbService;
	
	public String hello(String name) {
		return ejbService.hello(name);
	}
}
