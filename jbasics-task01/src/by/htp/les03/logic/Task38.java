package by.htp.les03.logic;

// ƒл€ данных областей составить линейную программу, котора€ печатает true, если точка с координатами
// (х, у) принадлежит закрашенной области, и false Ч в противном случае.

public class Task38 {

	public static void task() {

		double x, y;
		boolean istina;

		x = 1;
		y = 2;

		if (y >= 0 && x + y <= 4)
			istina = true;
		else
			istina = false;
		System.out
				.println("38.a “очка (" + x + "," + y + ") принадлежит закрашенной области на графике a) - " + istina);

		if ((y >= -3 && y <= 0 && Math.abs(x) <= 4) || (y >= 0 && y <= 4 && Math.abs(x) <= 2))
			istina = true;
		else
			istina = false;
		System.out
				.println("38.b “очка (" + x + "," + y + ") принадлежит закрашенной области на графике b) - " + istina);

		if (x >= 0 && ((y >= 0 && Math.sqrt(x * x + y * y) <= 4) || (y <= 0 && Math.sqrt(x * x + y * y) <= 5)))
			istina = true;
		else
			istina = false;
		System.out
				.println("38.c “очка (" + x + "," + y + ") принадлежит закрашенной области на графике c) - " + istina);

	}

}
