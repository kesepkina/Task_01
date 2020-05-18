package by.htp.les03.logic;

// ƒано действительное число R вида nnn.ddd (три цифровых разр€да в дробной и целой част€х).
// ѕомен€ть местами дробную и целую части числа и вывести полученное значение числа.

public class Task21 {

	public static void task() {

		double r, n, d, r2;

		r = 123.456;

		n = Math.floor(r);
		d = r - n;
		r2 = Math.floor((d * 1000 + n / 1000) * 1000) / 1000;

		System.out.println("21. " + r + " -> " + r2);

	}

}
