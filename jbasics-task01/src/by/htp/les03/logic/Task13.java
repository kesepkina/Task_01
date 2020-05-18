package by.htp.les03.logic;

public class Task13 {

	public static void task() {

		double x1, x2, x3, y1, y2, y3, a, b, c, p, s, p2;

		x1 = 0;
		y1 = 5;
		x2 = 0;
		y2 = 0;
		x3 = 2;
		y3 = 0;

		a = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		b = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
		c = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));

		p = a + b + c;
		p2 = p / 2;
		s = Math.sqrt(p2 * (p2 - a) * (p2 - b) * (p2 - c));

		System.out.println("13. Площадь и периметр треугольника с координатами вершин (" + x1 + "," + y1 + "), (" + x2
				+ "," + y2 + "), (" + x3 + "," + y3 + ") равны соответственно " + s + " и " + p);

	}

}
