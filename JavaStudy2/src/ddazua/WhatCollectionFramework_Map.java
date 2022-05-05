package ddazua;

import java.util.HashMap;
import java.util.Scanner;

// Map : 키를 통해서 값을 참조할 수 있는 구조
//       (1) 인터페이스이므로 사용 시 UpCasting (2) Map을 구현한 대표 클래스 : HashMap, TreeMap

/*
 	<맵과 관련된 메서드>
 	 (1) boolean containsKey(Object key)	 : 해당 키가 있는지 여부 반환
 	 (2) boolean containsValue(Object value) : 해당 값이 있는지 여부 반환
 	 (3) V get(Object key)					 : 해당 key와 쌍인 값을 반환
 	 (4) boolean isEmpty()					 : 맵 객체에 요소가 없으면 true 반환
 	 (5) Set<Key> keySet()					 : 키들을 Set 형태로 반환
 	 (6) V put(K key, V value)				 : 키와 값을 요소로 추가
 	 (7) V remove(Object key)				 : 이 키를 가진 요소를 제거
 	 (8) int size()							 : 전체 요소의 개수를 반환
 
 */

/* 
   [1] HashMap : Key와 Value 값으로 데이터를 저장하는 형태 // 얘넨 어떤 원리로 메모리에 저장..?
				 - Map 인터페이스를 구현한 하나의 클래스
				 - Map의 모든 속성을 갖고 있으며 저장 방식이 동일하다.
				 - **해싱(Hashing)**이라는 검색 알고리즘 사용
				 - key의 중복은 허용하지 않으나 value의 중복은 허용
	   ** Hashing **
	   	 · 알고리즘 : 문제를 해결하기 위한 절차적 해결 과정
	   	 · 검색 알고리즘 : 자료구조 내의 데이터 중 원하는 데이터를 찾는 과정
	   	 · 배열 내 데이터를 가장 빠르게 찾는 방법? 저장된 데이터의 위치값을 알아오는 것.
	   	 	-> 원하는 값의 위치를 모를 경우, 처음부터 끝까지 비교하게 된다. 따라서 데이터를 넣을 때 해당 데이터 값을 '위치값'으로 저장하면 가장 빠르게 찾아올 수 있다.
			=> 하지만, 입력개수<입력최댓값 일 때는, 메모리 낭비가 심하다. (LinkedList와 같은 단점) 
			   따라서, 찾을 값(key)를 갖고 저장된 위치를 알 수 있으며, 메모리 낭비를 최소화해주는 방법이 해싱(Hashing)이다.
		 · 해싱 : 메모리 낭비를 최소화하기 위해 저장할 값을 입력받을 시, 연산을 통해 새로운 주소 값을 생성하여 메모리에 저장(mapping)하는 기법
		 · 해싱의 구조
		   > 키 값을 해시 값으로 변경해주는 해시 함수
		   > 변경된 해시 값으로 저장할 공간인 해시 테이블
		   
		   
     # 더 알아보자!
     
     1. Direct Addressing Table
        - (key : value)쌍의 데이터를 배열에 저장할 key값을 직접적으로 배열의 인덱스로 사용한다.
           ex) 키 값이 400인 데이터가 존재한다면, 배열의 인덱스가 400인 위치에 키 값을 저장하고 포인터로 연결한다.
        - 똑같은 키 값이 존재하지 않는다면, 각 키마다 자신의 공간이 존재한다. 삭제 시, NULL값을 넣어주면 된다.
        - 탐색 시에는 해당 키의 위치를 그냥 찾아가서 참조하면 된다.
        - 찾고자 하는 데이터의 key값을 알고 있으면 탐색, 저장, 삭제, 수정 모두 매우 빠른 속도로 처리 가능하다.
        - 단, key값의 최대 크기만큼 배열이 할당되므로 크기는 크나, 저장하고자 하는 데이터가 적다면 공간 낭비가 심하다.
        customer
     2. Hash Table
        - key값을 함수를 이용해 계산을 수행한 후, 그 '결과값'을 배열의 인덱스로 사용하여 저장한다.
        - key를 계산하는 함수는 Hash Function이라고 부르고, 해쉬 함수는 입력으로 key를 받아서 0부터 -1 사이 값을 출력한다. => 임의의 숫자를 배열의 크기만큼으로 변환시킨 것
        - 이렇게 키값(k)을 통해 결과값(h(k))을 인덱스에 저장했을 때, k값이 h(k)로 해쉬되었다고 하며, h(k)는 k의 해쉬값이라고 한다.
        - 공간 낭비가 굉장히 적다. h(k)만큼의 공간만큼만 만들어 저장하면 되기 때문이다.
        - 충돌이 일어날 수 있다! k1과 k12에 같은 문자열을 저장했을 때, 해쉬 테이블은 두 객체를 같은 값으로 인식한다.
				 

*/

public class WhatCollectionFramework_Map {
	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
		Scanner sc = new Scanner(System.in);
		
		hm.put("apple", "사과");
		hm.put("paper", "종이");
		hm.put("flower", "꽃");
		
//		for (int i = 0; i < hm.size(); i++) { // 내 의도와는 조금 다르지만....
//			System.out.println(hm.keySet());  // 해당 메서드의 쓰임새를 알 수있는 부분
//		}
		
		String voca;		
		System.out.print("알고 싶은 단어를 입력하세요: ");
		voca = sc.nextLine();
		
		if(hm.containsKey(voca)) {
			System.out.println("해당하는 뜻은 : " + hm.get(voca));
		}
		else {
			System.out.println("해등 단어에 대한 뜻은 데이터 베이스에 없습니다.");
		}
		
	}

}
