package by.htp.les03.logic;

// ���� ����������� ����� � � N. ������� ������� ����� ������� ����� � ������� ����� ����� ����� ����� M/N.

public class Task35 {

	public static void task() {

		int m, n, st, ml;
		double x;

		m = 45234;
		n = 100;
		x = (double) m / n;

		ml = (int) x % 10;
		st = (int) (x * 10) % 10;

		System.out.println("35. ������� ����� ������� ����� � ������� ����� ����� ����� ����� " + x
				+ " ����� �������������� " + st + " � " + ml);
	}

}
