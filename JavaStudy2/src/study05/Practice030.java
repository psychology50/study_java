package study05;

interface Providable {
	void leisureSports();
	void sightseeing();
	void food();	// public abstract 가 자동으로 붙어 있다. 즉 작성은 안 해도 되지만 없다고 착각하면 안 된다.
}

class KoreaTour implements Providable {
	public void leisureSports() {
		System.out.println("한강에서 수상스키 투어");
	}
	public void sightseeing() {
		System.out.println("경복궁 관람 투어");
	}
	public void food() {
		System.out.println("전주 비빔밥 투어");
	}
}

class TourGuide {
	private Providable tour = new KoreaTour();
	// 인터페이스로 타입 선언
	public void leisureSports() {
		tour.leisureSports();
	}
	public void sightseeing() {
		tour.sightseeing();
	}
	public void food() {
		tour.food();
	}
}

public class Practice030 {
	public static void main(String[] args) {
		TourGuide guide = new TourGuide();
		guide.leisureSports();
		guide.sightseeing();
		guide.food();
	}

}
