package Session5;

public class StudentData extends Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentData studentdata = new StudentData();
		studentdata.registrationNumber = 1211;
		studentdata.studentName = "Mahendra";
		studentdata.studentRollNo = 21;
		System.out.println("Student Details: ");
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Student Name : " + studentdata.studentName);
		System.out.println("Student Roll No: " + studentdata.studentRollNo);
		System.out.println("Student Registration no : " + studentdata.registrationNumber);
		
		
	}

}
