package by.htp.les03.logic;

// ����� ������� ������, ���������� ������ �������� ����� r, � ������� � R (R> r).

public class Task23 {

	public static void task() {

		double r, R, s;

		r = 10;
		R = 12;

		s = Math.PI * (Math.pow(R, 2) - Math.pow(r, 2));

		System.out.println(
				"23. ������� ������, ���������� ������ �������� ����� " + r + ", � ������� - " + R + " ����� " + s);

	}

}
