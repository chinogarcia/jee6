package ar.com.nextel.jee6.ws.facade;

import javax.inject.Inject;
import javax.jws.WebService;

import ar.com.nextel.jee6.ws.service.ManagedService;

@WebService
public class SayHelloWS {

	@Inject
	private ManagedService myService;
	
	public String hello(String name) {
		return myService.hello(name);
	}
}
