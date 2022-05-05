package study04_DTO;

public class memberDTO {	// 회원가입 정보
	
	private String userId;
	private String name;
	private String age;
	private String phone;
	
	// 우클릭 -> Source -> Generate Getter and Setter
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	

}
