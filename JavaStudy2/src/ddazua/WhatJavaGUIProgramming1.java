package ddazua;

import javax.swing.JFrame;

/*
  [1] GUI(Graphical User Interface)
   	  : 컴퓨터를 사용하는 사용자를 위해 만들어진 특정한 기능을 가진 그래픽 요소
  	  1. Java GUI Programing
  	  	 : 사용자가 프로그램을 쉽게 다룰 수 있도록 그래픽을 제공하도록 프로그래밍 하는 것
  [2] AWT와 Swing
  	  1. AWT
  	  	 (1) Def
  	  	 	 : 자바에서 GUI를 프로그래밍 하기 위해 처음으로 제공한 라이브러리
  	  	 (2) 특징
  	  	 	 · java.awt 패키지에 Frame, Window, Panel, Button, Laber 등이 존재한다.
  	  	 	 · 운영체제의 자원 활용 (윈도우, 리눅스, IOS etc...)
  	  2. Swing
  	  	 (1) Def
  	  	 	 : AWT를 대체하기 위해 자바로 작성된 GUI 객체
  	  	 (2) 특징
  	  	 	 · javax.swing 패키지에 JFrame, JWindow, JPanel, JButton, JLabel 등이 존재
  	  	 	 · 운영체제에 의존적이지 않으며, 자바에서 제공하는 동일한 모양을 사용함.
  	  3. 컴포넌트(Component)와 컨테이터(Container)
  	  	 (1) 컴포넌트
  	  	 	 · JAVA에서 GUI를 구성하는 요소
  	  	 	 · 버튼, 체크박스, 슬라이더, 텍스트 필드와 같은 요소들
  	  	 (2) 컨테이너
  	  	 	 · 다른 컴포넌트를 포함할 수 있는 컴포넌트
  	  	 	 · JFrame은 다른 컨테이너에 포함시킬 수 없다. (최상위 컨테이너)
  	  	 (3) Method
  	  	 	 · setLocation(int x, int y) : 프레임 위치 지정
  	  	 	 · setSize(int width, int height) : 프레임 크기 지정
  	  	 	 · setIconImage(Image IconImage) : 프레임 타이틀 바에 보여질 아이콘 설정
  	  	 	 · setTitle(String title) : 타이틀 바의 제목 설정
  	  	 	 · setVisible(boolean b) : 화면에 표시 여부 설정
  	  4. GUI 프로그래밍 순서
  	  	 - Extends JFrame
  	  	   · JFrame 클래스 상속, 나만의 프레임 클래스 작성
  	  	   · 생성자에서 컴포넌트 및 프레임의 디자인 구현하기
  	  	 - 기본설정 (생성자에서 하기)
  	  	   : title, size, visible 설정하기
  	  	    · title 	 : setTitle("타이틀명");
  	  	    · size   	 : setSize(width, height);
  	  	    · visible 	 : setVisible(true);
  	  5. 배치 관리자 (Layout Manager)
  	     : 컨테이너 내부에 컴포넌트 추가 시 각각의 위치와 크기에 관해 결정
  	      · FlowLayout   : 왼 -> 오 순서대로 배치
  	      · BorderLayout : 컨테이너 공간을 동서남북 중앙으로 나누고 지정한 영역에 배치
  	      · GridLayout   : 컨테이너 공간을 동일 크기의 2차원 격자로 나누고 들어오는 순서대로 왼->오 배치
  	      · CardLayout   : 카드를 쌓아놓은 듯이 컴포넌트를 쪼개어 배치
  	  
 */

public class WhatJavaGUIProgramming1 extends JFrame {
	WhatJavaGUIProgramming1() {
		setTitle("JFrame");
		setSize(300, 300);
		setVisible(true);
		
	
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프로그램 닫는 기능을 닫기 버튼으로 설정
	}
	
	public static void main(String[] args) {
		new WhatJavaGUIProgramming1();
	}

}









