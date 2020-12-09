package com.javaex.ex06;

import java.util.HashSet;
import java.util.Set;

public class MiniLottoApp {

	public static void main(String[] args) {
		//Set을 이용해서 로또 만들기

		Set<Integer> lotto = new HashSet<Integer>();
		
		for(int i=1; i<=6; i++) {
			lotto.add((int)(Math.random()*45)+1);
		}
		System.out.println(lotto);
		
		//강사님 풀이
		Set<Integer> lottoset = new HashSet<Integer>();
		
		while(lottoset.size()<6) {	//얼마나 반복될지 알 수 없어서 while문 사용 / 갯수는 0부터 시작 6개
			int num = (int)(Math.random()*45)+1;
			lottoset.add(num);
		}
		
		for(int no : lottoset) {
			System.out.print(no + "\t");
		}
		
	}

}
