package study002;

class C02Book {
	int bookcode;
	String booktitle;
	
	C02Book(int code, String title) {
		this.bookcode = code;
		this.booktitle = title;
		
	}

	@Override
	public String toString() {
		return this.bookcode + this.booktitle;
	}
	
}

public class Practice008 {

	public static void main(String[] args) {
		C02Book book1 = new C02Book(1010, "개미");
		System.out.println(book1.toString());
		
		C02Book book2 = new C02Book(2020, "미움받을용기");
		System.out.println(book2.toString());
		
		Object ob = new Object();
		String str = new String("Test입니다.");
		
		System.out.println(str.toString());
		System.out.println(str);
		
		
	}

}
