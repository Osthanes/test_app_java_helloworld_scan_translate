package com.ibm.cloudoe.samples;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Path("/hello")
public class HelloResource {
/*
	@GET
	public String getInformation() {

		// 'VCAP_APPLICATION' is in JSON format, it contains useful information about a deployed application
		// String envApp = System.getenv("VCAP_APPLICATION");

		// 'VCAP_SERVICES' contains all the credentials of services bound to this application.
		// String envServices = System.getenv("VCAP_SERVICES");
		// JSONObject sysEnv = new JSONObject(System.getenv());
		
		ResourceBundle messages = ResourceBundle.getBundle("com.ibm.cloudoe.samples.Messages", locale);
        String hello = messages.getString("hello");
        String resume = messages.getString("resume");
		return hello + resume;
	}
	*/

    public void doGet( HttpServletRequest request, HttpServletResponse response)
    {
        String name = request.getParameter( "name" );
        response.setContentType( "text/html" );
        PrintWriter out = response.getWriter();
        out.println( "<HTML><HEAD><TITLE>Hello World</TITLE></HEAD><BODY>" );
        out.println( "Hello, " + name );
        out.println( "</BODY></HTML>" );
    }

}