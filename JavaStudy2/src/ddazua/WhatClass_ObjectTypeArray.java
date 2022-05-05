package ddazua;

// 객체 배열 생성 방법
// 클래스명 객체배열명[] = new 클래스명[크기];
// ex) Aclass ar[] = new Aclass[3] : 배열의 크기를 지정했을 뿐, 객체 값은 아직 생성되지 않았다.

class Aclass {
	int x;
	void f1() {
		System.out.println("f1()");
	}
}

class Animal {
	String kind;
	String name;
	int age;
	void info() {
		System.out.println("kind: "+ kind);
		System.out.println("name: "+ name);
		System.out.println("age: "+ age);
		System.out.println();
	}
}

public class WhatClass_ObjectTypeArray {
	public static void main(String[] args) {
		Aclass ar[] = new Aclass[3];
		
		ar[0] = new Aclass(); // 얘를 안 만들면 객체 값이 없어서 호출이 안 된다.
		
		ar[0].x = 100;
		ar[0].f1();
		System.out.println(ar[0].x);
		
		System.out.println("-----------------------");
		
		
		Animal animals[] = new Animal[3];
		for(int i = 0; i<3; i++) {
			animals[i] = new Animal();
		}
		
		animals[0].kind = "고양이";
		animals[0].name = "나르";
		animals[0].age  = 1;
		
		animals[1].kind = "강아지";
		animals[1].name = "초코";
		animals[1].age  = 3;
		
		animals[2].kind = "고양이";
		animals[2].name = "니코";
		animals[2].age  = 1;
		
		for(int i = 0; i<3; i++) {
			animals[i].info();
		}
	}
	 

}
