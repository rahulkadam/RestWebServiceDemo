package client;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import controller.Student;

public class RestClient {

	public static void main(String args[])
	{
		Client c=new Client();
		WebResource web=c.resource("http://localhost:8181/RestWeb/"); //base URL
		String input="/pictt";
	//	System.out.println(web.post(ClientResponse.class));
	    ClientResponse cr=web.path("student").path("post").post(ClientResponse.class,input);
		System.out.println(cr.toString());
		Student s=cr.getEntity(Student.class);
		System.out.println(s);
	}
}
