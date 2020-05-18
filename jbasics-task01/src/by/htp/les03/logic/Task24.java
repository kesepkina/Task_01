package by.htp.les03.logic;

// Найти площадь равнобедренной трапеции с основаниями а и b и углом alfa при большем основании а.

public class Task24 {

	public static void task() {

		double a, b, alfa, s;

		a = 12;
		b = 10;
		alfa = Math.PI / 3;

		s = (a + b) / 2 * (a - b) / 2 * Math.tan(alfa);

		System.out.println("24. Площадь равнобедренной трапеции с основаниями " + a + " и " + b + " и углом " + alfa
				+ " при большем основании равна " + s);
	}

}
