package week3.day1;

public class Students {

	public void getStudentInfo(int id) {
		System.out.println("Student id is " + id);

	}

	public void getStudentInfo(int id, String name) {
		System.out.println("Student id is " + id);
		System.out.println("Student name is "+ name);

	}

	public void getStudentInfo(String email, int phone) {
		System.out.println("Student email is " + email);
		System.out.println("Student phone number is "+ phone);
	}


	public static void main(String[] args) {
		Students obj = new Students();
		obj.getStudentInfo(1234);
		obj.getStudentInfo(1235, "Tom");
		obj.getStudentInfo("test@test.com", 99999);


	}

}
