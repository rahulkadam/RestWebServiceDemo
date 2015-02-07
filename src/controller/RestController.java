package controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
@Path("student")
public class RestController {

	@GET
	@Path("/fetch/{name}")
	@Produces("text/plain")
	public  String fetctStudent(@PathParam("name") String name)
	{
		return "printg student with name : "+name;
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

}
