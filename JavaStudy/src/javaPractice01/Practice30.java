// Practice29.java에서 값이 0.0인 값을 제외하는 방법.

package javaPractice01;

public class Practice30 {
	
	public static void main(String[] args) {
		double[] data = new double[5];
		int size = 0;
		
		data[0] = 10.0; size++;
		data[1] = 20.0; size++;
		data[2] = 30.0; size++;
		
		for(int i = 0; i < size; i++) {
		//for(int i=0; i<data.length; i++)
			System.out.println(data[i]);
			
		// 배열의 단점 : 초기의 세팅값을 중간에 바꿀 수가 없음.
		}
	}

}
