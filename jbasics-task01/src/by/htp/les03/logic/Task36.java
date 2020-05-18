package by.htp.les03.logic;

// Найти частное произведений четных и нечетных цифр четырехзначного числа.

public class Task36 {

	public static void task() {

		int x, mul1, mul2, a;
		double res;
		boolean ch, nech;

		x = 1235;
		mul1 = mul2 = 1;
		ch = nech = false;

		for (int i = x; i > 0; i /= 10) {
			a = i % 10;
			if (a % 2 == 0) {
				mul1 *= a;
				ch = true;
			} else {
				mul2 *= a;
				nech = true;
			}
		}

		if (ch && nech) {
			res = (double) mul1 / mul2;
			System.out.println(
					"36. Частное произведений четных и нечетных цифр четырехзначного числа " + x + " равно " + res);
		} else
			System.out.println("36. В числе содержатся цифры только одного типа чётности.");
	}

}
