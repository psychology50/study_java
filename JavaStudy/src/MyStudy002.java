class Student {
	
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public void showStudentInfo() {
		System.out.println(studentName + "," + address); //이름, 주소
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
}

public class MyStudy002 {
	
	public static void main(String[] args) {
		
		Student studentAhn = new Student();
		studentAhn.studentName = "���缭";
		
		System.out.print(studentAhn.studentName);
		System.out.print(studentAhn.getStudentName());
	}

}
