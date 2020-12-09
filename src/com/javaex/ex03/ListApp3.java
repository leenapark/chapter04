package com.javaex.ex03;

public class ListApp3 {

	public static void main(String[] args) {
		// 범용으로 만든 ObjList를 사용하여
		// 메모리(new) 올릴 때
		// 각 틀로 사용할 수 있게 만들어버린다

		System.out.println("==사각형=======================================");

		// 메모리(new)에 올라갈 때 사각형은 사각형 용으로 만들어버린다
		MyList<Rectangle> rList = new MyList<Rectangle>();

		Rectangle r01 = new Rectangle(5, 5);
		Rectangle r02 = new Rectangle(10, 10);

		rList.add(r01);
		rList.add(r02);

		for (int i = 0; i < rList.size(); i++) {
			rList.get(i).draw();
		}

		System.out.println("==원=======================================");

		// 메모리(new)에 올라갈 때 원은 원 용으로 만들어버린다
		MyList<Circle> cList = new MyList<Circle>();

		Circle c01 = new Circle(7);
		Circle c02 = new Circle(10);

		cList.add(c01);
		cList.add(c02);

		for (int i = 0; i < cList.size(); i++) {
			// ((Circle)(cList.get(i))).draw(); 메모리에 올라갈 때 이미 틀이 원형으로 바뀌었기 때문에 형변환을 안해줘도 된다
			cList.get(i).draw();
		}

		System.out.println("==삼각형=======================================");

		// 메모리(new)에 올라갈 때 삼각형은 삼각형 용으로 만들어버린다
		// ObjList tList = new ObjList<Triangle>();
		MyList<Triangle> tList = new MyList<Triangle>();

		Triangle t01 = new Triangle(1, 1);
		Triangle t02 = new Triangle(2, 2);

		tList.add(t01);
		tList.add(t02);

		for (int i = 0; i < tList.size(); i++) {
			tList.get(i).draw();
		}

	}

}
