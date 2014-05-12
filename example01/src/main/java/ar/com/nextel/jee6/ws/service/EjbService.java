package ar.com.nextel.jee6.ws.service;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ar.com.nextel.jee6.entity.FormaPago;

@Stateless
public class EjbService {
	
	@PersistenceContext(unitName="primary")
	EntityManager em;
	
	public String hello(String name) {
		FormaPago formaPago = em.find(FormaPago.class,Long.valueOf(name));
		return formaPago.getDescripcion();
	}
}
