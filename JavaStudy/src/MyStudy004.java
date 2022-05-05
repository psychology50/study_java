//MyStudy002.java에 생성한 Student 클래스를 불러온다.

public class MyStudy004 {
	
	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.studentName = "양재서";
		
		Student student2 = new Student();
		student2.studentName = "홍길동";
		
		System.out.println(student1); // 데이터가 저장된 주소
		System.out.println(student2);
		System.out.println(student1.getStudentName()); // 양재서
		System.out.println(student2.getStudentName()); // 홍길동
		System.out.println();
		
		student1 = student2;
		System.out.println(student1); 
		System.out.println(student2);
		System.out.println(student1.getStudentName()); // 홍길동
		System.out.println(student2.getStudentName()); // 홍길동   => student1 = student2; 기준이 뭘까???
	}
	

}
