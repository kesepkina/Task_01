package by.htp.les03.logic;

// ��� ������ �������� ��������� �������� ���������, ������� �������� true, ���� ����� � ������������
// (�, �) ����������� ����������� �������, � false � � ��������� ������.

public class Task38 {

	public static void task() {

		double x, y;
		boolean istina;

		x = 1;
		y = 2;

		if (y >= 0 && x + y <= 4)
			istina = true;
		else
			istina = false;
		System.out
				.println("38.a ����� (" + x + "," + y + ") ����������� ����������� ������� �� ������� a) - " + istina);

		if ((y >= -3 && y <= 0 && Math.abs(x) <= 4) || (y >= 0 && y <= 4 && Math.abs(x) <= 2))
			istina = true;
		else
			istina = false;
		System.out
				.println("38.b ����� (" + x + "," + y + ") ����������� ����������� ������� �� ������� b) - " + istina);

		if (x >= 0 && ((y >= 0 && Math.sqrt(x * x + y * y) <= 4) || (y <= 0 && Math.sqrt(x * x + y * y) <= 5)))
			istina = true;
		else
			istina = false;
		System.out
				.println("38.c ����� (" + x + "," + y + ") ����������� ����������� ������� �� ������� c) - " + istina);

	}

}
