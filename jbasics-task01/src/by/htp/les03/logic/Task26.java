package by.htp.les03.logic;

// Ќайти площадь треугольника, две стороны которого равны а и b, а угол между этими сторонами у.

public class Task26 {

	public static void task() {

		double a, b, y, s;

		a = 2;
		b = 9.1;
		y = Math.PI / 6;

		s = a * b * Math.sin(y) / 2;

		System.out.println("26. ѕлощадь треугольника, две стороны которого равны " + a + " и " + b
				+ ", а угол между этими сторонами " + y + ", равна " + s);

	}

}
