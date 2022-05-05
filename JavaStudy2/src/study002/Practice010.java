package study002;

class C04Point {
	int x;
	int y;
	C04Point (int x, int y) {
		this.x = x; 
		this.y = y;
	}
	@Override
	public boolean equals(Object obj) {
		// 두 객체간의 x,y값이 일치할 떄 true, 하나라도 불일치시 false를 리턴
		if (obj instanceof C04Point) {
			C04Point down = (C04Point)obj;
			return (this.x == down.x && this.y == down.y);
		}
		return false;
	}
}

public class Practice010 {
	
	public static void main(String[] args) {
		C04Point pos1 = new C04Point(10, 20);
		C04Point pos2 = new C04Point(30, 40);
		C04Point pos3 = new C04Point(10, 20);
		System.out.println(pos1.equals(pos2));
		System.out.println(pos2.equals(pos3));
		System.out.println(pos1.equals(pos3));
	}

}
