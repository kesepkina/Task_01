package by.htp.les03.logic;

// Вычислить корни квадратного уравнения ах2+ bх + с = 0 с заданными коэффициентами a, b и с 
// (предполагается, что а!=0 и что дискриминант уравнения неотрицателен).

public class Task25 {

	public static void task() {

		double a, b, c, x1, x2, d;

		a = 4;
		b = 16;
		c = 16;

		d = Math.pow(b, 2) - 4 * a * c;
		x1 = (-b + Math.sqrt(d)) / (2 * a);
		x2 = (-b - Math.sqrt(d)) / (2 * a);

		if (x1 == x2)
			System.out.println("25. Корень квадратного уравнения " + a + "x2 + " + b + "x + " + c + " = 0 равен " + x1);
		else
			System.out.println(
					"25. Корни квадратного уравнения " + a + "x2 + " + b + "x + " + c + " = 0 равны " + x1 + " и " + x2);

	}

}
