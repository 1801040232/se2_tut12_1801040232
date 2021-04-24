package jersey.service;

import java.util.ArrayList;
import java.util.List;

import jersey.model.Enrollment;

public class EnrollmentService {

	public List<Enrollment> getAllEnrollments() {
		Enrollment e1 = new Enrollment(1, 1, "mpr", 10);
		Enrollment e2 = new Enrollment(2, 2, "se2", 10);
		List<Enrollment> list = new ArrayList<Enrollment>();
		list.add(e1);
		list.add(e2);
		return list;
	}
}
