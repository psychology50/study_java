//MyStudy002.java에 생성한 Student 클래스를 불러온다.

public class MyStudy003 {
	
	public static void main(String[] args) {
		
		Student student1 = new Student();
		//student1.studentName = "양재서";
		student1.setStudentName("양재서");
		System.out.println(student1.getStudentName());
		
		Student student2 = new Student();
		//student2.studentName = "홍길동";
		student2.setStudentName("홍길동");
		System.out.println(student2.getStudentName());
	}

}
