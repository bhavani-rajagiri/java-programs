package classCreation;

public class StudentsMain {

	public static void main(String[] args) {
		
		Students stu1 = new Students();
		stu1.stu_id=101;
		stu1.stu_name="Bhavani GR";
		stu1.stu_ph = 234567891;
		stu1.displayStudentDetails();

		
		
		Students stu2 = new Students();
		stu2.stu_id=102;
		stu2.stu_name="karan GR";
		stu2.stu_ph = 234567892;
		stu2.displayStudentDetails();
	}

}
