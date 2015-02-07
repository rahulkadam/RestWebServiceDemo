package controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("student")
public class RestController {

	@GET
	@Path("/fetch/{name:[a-zA-Z][a-zA-Z_0-9]*}")
	@Produces("text/plain")
	public  String fetctStudent(@PathParam("name") String name)
	{
		return "User name is : "+name;
	}
	

	@GET
	@Path("/friends/{name:[a-zA-Z][a-zA-Z_0-9]*}/{name1:[a-zA-Z][a-zA-Z_0-9]*}")
	@Produces("text/plain")
	public  String fetctStudent(@PathParam("name") String name,@PathParam("name1") String name1)
	{
		return ""+name + " and "+name1+ " are best friend";
	}

	
	
	@GET
	@Path("/list")
	@Produces("application/xml")
	public Student getStudentList()
	{
		Student s=new Student();
		s.setCollege("pict");
		s.setName("rahul");
		return s;
	}
	
	@GET
	@Path("/list1")
	@Produces("application/json")
	public Student getStudentList1()
	{
		Student s=new Student();
		s.setCollege("pict");
		s.setName("rahul");
		return s;
	}
	
	@POST
	@Path("/post")
	@Consumes("text/plain")
	public Response getPostStudent(String pict,String rahul)
	{
		System.out.println("hiiiiiiiiiii");
		Student s=new Student();
		s.setCollege("pict"+ " : "+pict);
		s.setName("rahul :  "+rahul );
		return Response.status(607).entity(s).build();
	}

}
