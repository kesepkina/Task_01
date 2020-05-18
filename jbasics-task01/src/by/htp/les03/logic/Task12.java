package by.htp.les03.logic;

public class Task12 {

	public static void task() {

		double x1, y1, x2, y2, d;

		x1 = 2;
		y1 = 3;
		x2 = -3;
		y2 = 6;

		d = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

		System.out.println("12. Расстояние между точками (" + x1 + "," + y1 + ") и (" + x2 + "," + y2 + ") равно " + d);
	}

}
