package javaPractice01;

public class Practice38 {
	
	public static void main(String[] args) {
		
		int[][] score = {{ 100, 100, 100},
					 	 { 20, 20, 20} ,
						 { 30, 30, 30} ,
						 { 40, 40, 40} ,
						 { 50, 50, 50}};
		int koreanTotal = 0;
		int englishTotal = 0;
		int mathTotal = 0;
		
		System.out.println("번호 국어 영어 수학 총점    평균 ");
		System.out.println("=================================");
		//System.out.println(score.length);
		for(int i = 0; i < score.length; i++) {
			int sum = 0;
			koreanTotal += score[i][0];
			englishTotal += score[i][1];
			mathTotal += score[i][2];
			System.out.print(" " + (i + 1) + "  "); // 번호
			for(int j=0; j<score[i].length; j++) {
				sum += score[i][j]; // 총점
				System.out.print(score[i][j]+"  "); // 해당 과목의 점수
			}
			System.out.println(sum + "  " + sum/(float)score[i].length); // 총점 평균
		}
		
		System.out.println("=================================");
		System.out.println("총점:" + koreanTotal + " " + englishTotal + " " + mathTotal); // 총점
		
	}

}
