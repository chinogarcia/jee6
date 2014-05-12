package ar.com.nextel.jee6.servlet;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ar.com.nextel.jee6.ws.service.ManagedService;

@WebServlet("/myservlet")
public class MyServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Inject
	private ManagedService myService;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.getOutputStream().println(myService.hello("MyServlet"));
		
	}

	@Override
	protected void doPost(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		this.doGet(arg0, arg1);
	}

}
