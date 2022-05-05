package javaPractice01;

public class Practice29 {
	
	public static void main(String[] args) {
		double[] data = new double[5];
		
		data[0] = 10.0;
		data[1] = 20.0;
		data[2] = 30.0;
		
		for(int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
			
		//Java는 메모리 관리가 자동으로 되므로 출력 가능함.
		}
	}

}
