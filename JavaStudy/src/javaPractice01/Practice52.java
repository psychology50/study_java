package javaPractice01;

class IniVar {
	//클래스의 특징!!! 멤버 변수 선언 = 초기화 자동화
	boolean bi;
	byte bbi;
	char cy;
	short sx;
	int ix;
	long lx;
	float fz;
	double cz;
}

public class Practice52 {
	
	public static void main (String[] args) {
		IniVar ivar = new IniVar ();
		System.out.println("boolean = " + ivar.bi); 	// false
		System.out.println("byte = " + ivar.bbi);		// 0
		System.out.println("char = " + (int)ivar.cy);	// 0
		System.out.println("short = " + ivar.sx);		// 0
		System.out.println("int = " + ivar.ix);			// 0
		System.out.println("long = " + ivar.lx);		// 0
		System.out.println("float = " + ivar.fz);		// 0.0
		System.out.println("double = " + ivar.cz);		// 0.0
	}

}
