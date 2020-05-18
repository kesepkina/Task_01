package by.htp.les03.logic;

// Найти (в радианах в градусах) все углы треугольника со сторонами а, b, с.

public class Task29 {

	public static void task() {

		double a, b, c, alfar, alfag, betar, betag, gammar, gammag;

		a = 3;
		b = 3;
		c = 3;

		alfar = Math.acos((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / (2 * a * b));
		betar = Math.acos((Math.pow(a, 2) + Math.pow(c, 2) - Math.pow(b, 2)) / (2 * a * c));
		gammar = Math.PI - alfar - betar;
		alfag = Math.round(alfar * 180 / Math.PI);
		betag = Math.round(betar * 180 / Math.PI);
		gammag = 180 - alfag - betag;

		System.out.println("29. Углы треугольника со сторонами " + a + ", " + b + ", " + c + " равны " + alfar + " рад("
				+ alfag + " град), " + betar + " рад(" + betag + " град) и " + gammar + " рад(" + gammag + " град).");

	}

}
