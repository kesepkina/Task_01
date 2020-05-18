package by.htp.les03.logic;

public class Task17 {

	public static void task() {

		double a, b, ameancube, gmeanabs;

		a = 1;
		b = -3;

		ameancube = (Math.pow(a, 3) + Math.pow(b, 3)) / 2;
		gmeanabs = Math.sqrt(Math.abs(a) * Math.abs(b));

		System.out.println("17. Среднее арифметическое кубов и среднее геометрическое модулей чисел " + a + " и " + b
				+ " равны соответсвенно " + ameancube + " и " + gmeanabs);

	}

}
