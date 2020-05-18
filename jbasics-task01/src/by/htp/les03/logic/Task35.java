package by.htp.les03.logic;

// Даны натуральные числа М и N. Вывести старшую цифру дробной части и младшую цифру целой части числа M/N.

public class Task35 {

	public static void task() {

		int m, n, st, ml;
		double x;

		m = 45234;
		n = 100;
		x = (double) m / n;

		ml = (int) x % 10;
		st = (int) (x * 10) % 10;

		System.out.println("35. Старшая цифра дробной части и младшая цифра целой части числа " + x
				+ " равны соответственно " + st + " и " + ml);
	}

}
