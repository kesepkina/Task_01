package by.htp.les03.logic;

// Дана величина А, выражающая объем информации в байтах.
// Перевести А в более крупные единицы измерения информации. 

public class Task34 {

	public static void task() {

		int a, k, m, g, a1;

		a1 = a = 2_146_690_045;

		k = m = g = 0;

		k = Math.floorDiv(a, 1024);

		m = Math.floorDiv(k, 1024);

		g = Math.floorDiv(m, 1024);

		System.out.println("34. " + a1 + " B соответствуют " + g + " GB или " + m + " MB или " + k + " KB.");

	}

}
