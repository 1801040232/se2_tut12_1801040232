package jersey.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import jersey.model.Enrollment;
import jersey.service.EnrollmentService;

@Path("/enrollment")
public class EnrollmentResource {
	EnrollmentService enrollmentService = new EnrollmentService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON) 
	public List<Enrollment> getEnrollment() {
		return enrollmentService.getAllEnrollments();
	}
}
