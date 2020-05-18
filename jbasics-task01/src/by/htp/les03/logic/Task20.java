package by.htp.les03.logic;

// »звестна длина окружности. Ќайти площадь круга, ограниченного этой окружностью.

public class Task20 {

	public static void task() {

		double l, s;

		l = 2 * Math.PI * 10;

		s = Math.pow(l / (2 * Math.PI), 2) * Math.PI;

		System.out.println("20. ѕлощадь круга, ограниченного окружностью длиной " + l + " равна " + s);

	}

}
