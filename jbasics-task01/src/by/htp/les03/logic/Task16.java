package by.htp.les03.logic;

public class Task16 {

	public static void task() {

		int num, mul, n1, n2, n3, n4;

		num = 1215;

		n4 = Math.floorDiv(num, 1000);
		n3 = Math.floorDiv(num - n4 * 1000, 100);
		n2 = Math.floorDiv(num - n4 * 1000 - n3 * 100, 10);
		n1 = num - n4 * 1000 - n3 * 100 - n2 * 10;
		mul = n1 * n2 * n3 * n4;

		System.out.println("16. Произведение цифр четырехзначного числа " + num + " равно " + mul);

	}

}
