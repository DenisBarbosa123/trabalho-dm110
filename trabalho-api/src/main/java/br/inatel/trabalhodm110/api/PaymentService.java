package br.inatel.trabalhodm110.api;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PATCH;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/payment")
public interface PaymentService {

	@POST
	@Path("/create")
	@Consumes(MediaType.APPLICATION_JSON)
	public void savePayment(PaymentTO paymentTO);
	
	@GET
	@Path("/get/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public PaymentTO getPayment(@PathParam("id") Integer id);
	
	@PATCH
	@Path("/update/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public void updatePayment(@PathParam("id") Integer id, PaymentTO paymentTO);

	@GET
	@Path("/getAll")
	@Produces(MediaType.APPLICATION_JSON)
	public List<PaymentTO> getAllPayments();
}
