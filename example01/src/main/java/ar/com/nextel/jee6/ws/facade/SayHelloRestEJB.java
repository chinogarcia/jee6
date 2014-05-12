package ar.com.nextel.jee6.ws.facade;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import ar.com.nextel.jee6.ws.service.EjbService;


@Path("/helloworldejb/{name}")
@RequestScoped
public class SayHelloRestEJB {
	
	@Inject
	private EjbService ejbService;
	
	@GET
	@Produces("text/plain")
	public String hello(@PathParam("name") String name) {
		return ejbService.hello(name);
	}
}