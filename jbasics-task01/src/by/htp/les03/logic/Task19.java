package by.htp.les03.logic;

// Дана сторона равностороннего треугольника. Найти площадь этого треугольника, его высоту, радиусы вписанной и описанной окружностей.

public class Task19 {

	public static void task() {

		double a, s, h, rin, rout;

		a = 2;

		s = Math.pow(a, 2) * Math.sqrt(3) / 4;
		h = Math.sqrt(Math.pow(a, 2) - Math.pow(a / 2, 2));
		rin = a / (2 * Math.sqrt(3));
		rout = a / Math.sqrt(3);

		System.out
				.println("19. Площадь, высота, радиусы вписанной и описанной окружностей для треугольника со стороной "
						+ a + " равны соответственно " + s + ", " + h + ", " + rin + " и " + rout);
	}

}
