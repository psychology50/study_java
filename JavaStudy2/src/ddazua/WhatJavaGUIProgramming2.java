package ddazua;

import javax.swing.*;
import java.awt.FlowLayout;

public class WhatJavaGUIProgramming2 extends JFrame {
	WhatJavaGUIProgramming2() {
		setTitle("JFrame");
		setSize(300, 300);
		
		// Component Constructor Create
		JButton button = new JButton("Button");
		JCheckBox box = new JCheckBox("check box");
		JSlider slide = new JSlider();
		JTextField tf = new JTextField("input text", 20);
		this.setLayout(new FlowLayout()); // 컴포넌트를 부착하는 위치를 정하는 관리자 설정
			// setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
			// new FlowLayout(int align, int hgap, int vgap) 생성자로 정렬기준 뿐 아니라 상하좌우 간격 지정도 가능.
		
		
		// Component Constructor Add
		this.add(button);
		this.add(box);
		this.add(slide);
		this.add(tf);
		
		setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new WhatJavaGUIProgramming2();
	}

}
