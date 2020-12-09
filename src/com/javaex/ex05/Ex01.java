package com.javaex.ex05;

import java.util.HashSet;
import java.util.Set;

public class Ex01 {

	public static void main(String[] args) {
		//Set --> HashSet
		
		Set<Integer> iSet = new HashSet<Integer>();

		//Integer i01 = new Integer(3);
		//Integer i03 = 3;	//박싱
		
		//추가 (데이터)
		iSet.add(3);
		iSet.add(5);
		iSet.add(8);
		
		//toString()
		System.out.println(iSet.toString());
		
		//size()
		System.out.println("size" + iSet.size());
		
		//출력: 기존 for문은 사용할 수 없다
		//다른 for문을 사용해야 한다 --> 향상된 for문
		for(Integer i : iSet) {
			System.out.println(i.toString());
		}
		
		System.out.println("===");
		for(int i:iSet) { //언박싱
			System.out.println(i);
		}
		System.out.println("===");
		//삭제
		iSet.remove(3);
		//삭제 test
		for(Integer i : iSet) {
			System.out.println(i.toString());
		}
		
		System.out.println("===");
		//중복값 추가 - Set은 중복이 안된다
		iSet.add(8);
		for(Integer i : iSet) {
			System.out.println(i.toString());
		}
		
		
	}

}
