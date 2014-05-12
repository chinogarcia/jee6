package ar.com.nextel.jee6.ws.facade;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import ar.com.nextel.jee6.ws.service.ManagedService;

//The Java class will be hosted at the URI path "/helloworld"
@RequestScoped
@Path("/")
public class SayHelloWSREST{
	
	@Inject
	private ManagedService managedService;
	
	@GET
	@Produces("text/plain")
	@Path("/helloworld/{name}")
	public String hello(@PathParam("name") String name) {
		return managedService.hello(name);
	}
}
