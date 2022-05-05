package javaPractice02;

class User2 {
	private String name;
	private int age;
	
	User2(String name, int age) { // 매개변수를 가진 생성자
		this.name = name;
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
}

public class Practice65 {
	
	public static void main(String[] args) {
		
		User2 user1 = new User2("철수", 29); // instance 생성
		User2 user2 = new User2("영희", 24); // instance 생성
		
		// user2.age = 99; //에러발생. 직접적으로 접근 불가능
		user2.setAge(20);
		System.out.println(user2.getName() + "의 나이는 " + user2.getAge());
	}

}
