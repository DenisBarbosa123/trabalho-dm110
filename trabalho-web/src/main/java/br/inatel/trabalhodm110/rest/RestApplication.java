package br.inatel.trabalhodm110.rest;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import br.inatel.trabalhodm110.impl.PaymentServiceImpl;

@ApplicationPath("/api")
public class RestApplication extends Application 
{
	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> classes = new HashSet<>();
		classes.add(PaymentServiceImpl.class);
		return classes;
	}
}
