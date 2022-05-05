package study05;

// Wearable Interface
interface Wearable {
	void putOn();		// 입는다.
	void putOff();		// 벗는다.
}

// Color Interface
interface Color {
	int RED = 1;
	int GREEN = 2;
	int BLUE = 3;
	void changeColor(int color);	// 색 변경
}

// Wearable Computer Class
class WearableComputer implements Wearable {
	private String name;	// 이름
	
	public WearableComputer(String name) { this.name = name; }
	
	public void putOn() { System.out.println(name + " ON!!"); }
	public void putOff() { System.out.println(name + " OFF!!"); }
}

// Wearable Robot Class
class WearableRobot implements Color, Wearable {
	private int color; 		// 색
	
	public WearableRobot(int color) { changeColor(color); }
	
	public void changeColor(int color) { this.color = color; }
	
	public String toString() {
		switch (color) {
		case RED 	: return "빨강 로봇";
		case GREEN  : return "녹색 로봇";
		case BLUE 	: return "파랑 로봇";
		}
		return "로봇";
	}
	
	public void putOn() {
		System.out.println(toString() + " 장착!!");
	}
	public void putOff() {
		System.out.println(toString() + " 해제!!");
	}
}

public class Homework_interface {
	public static void main(String[] args) {
		Wearable[ ] w = {
				new WearableComputer("HAL"),		// Computer
				new WearableRobot(Color.RED),		// Robot
				new WearableRobot(Color.GREEN),		// Robot
		};
		
		for (Wearable k : w) {
			k.putOn();
			k.putOff();
			System.out.println();
		}
	}
	

}
