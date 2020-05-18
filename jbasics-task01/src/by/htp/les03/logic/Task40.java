package by.htp.les03.logic;

// Дано значение х. Получить значения -2х + 3х2 - 4х3 и 1 + 2х + 3х2 + 4х3 . Позаботьтесь об экономии операций.

public class Task40 {

	public static void task() {

		double x, y1, y2;

		x = 1;

		y1 = x * (-2 + x * (3 - 4 * x));
		y2 = 1 - y1 + 6 * x * x;

		System.out.println("40. -2*" + x + " + 3*" + x + "^2 - 4*" + x + "^3 = " + y1 + "  1 + 2*" + x + " + 3*" + x
				+ "^2 + 4*" + x + "^3 = " + y2);
	}

}
