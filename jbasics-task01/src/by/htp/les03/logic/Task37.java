package by.htp.les03.logic;

//��������� �������� ���������, ���������� �������� true, ���� ��������� ������������ �������� ��������, � false � � ��������� ������:
// -����� ����� N �������� ������ ���������� ������.
// -����� ���� ������ ���� ��������� ��������������� ����� ����� ����� ���� ��� ��������� ����.
// -����� ���� ������� ������������ ����� N �������� ������ ������.
// -����� � ������������ (�, �) ����������� ����� ���������, ������� ����� ������� �= �, �= � (�<�).
// -������� ��������� ������������ ����� ����� ���� ����� ���� ����� �����.
// -����������� �� ��������� �,b,� �������� ��������������.
// -����� �����-���� ���� ���� ��������� ������������ ������������ ����� N ����� ������� �����.
// -�������� ����� N �������� �������� ����� � (���������� ������� ����� ���������� � ��������� �� 0 �� 4).
// -������ ������� � = ��2 + b�+ � �������� ����� �������� ����� � ������������ (m, �).

public class Task37 {

	public static void task() {

		int n1, n2, n3, figure1, figure2, figure3;
		boolean istina;
		double x, y, t, p, a, b, c;

		n1 = 12;
		n2 = 3407;
		n3 = 345;

		if (n1 % 2 == 0 && (int) (n1 / 100) == 0)
			istina = true;
		else
			istina = false;
		System.out.println("37.1 ����� ����� " + n1 + " �������� ������ ���������� ������ - " + istina);

		if ((n2 / 1000 + n2 / 100 % 10) == (n2 / 10 % 10 + n2 % 10))
			istina = true;
		else
			istina = false;
		System.out.println("37.2 ����� ���� ������ ���� ��������� ��������������� ����� " + n2
				+ " ����� ����� ���� ��� ��������� ���� - " + istina);

		if ((n3 % 10 + n3 / 10 % 10 + n3 / 100 % 10) % 2 == 0)
			istina = true;
		else
			istina = false;
		System.out.println("37.3 ����� ���� ������� ������������ ����� " + n3 + " �������� ������ ������ - " + istina);

		x = -1;
		y = 455;
		t = -5;
		p = 0;

		if (x > t && x < p)
			istina = true;
		else
			istina = false;
		System.out.println("37.4 ����� � ������������ (" + x + ", " + y
				+ ") ����������� ����� ���������, ������� ����� ������� �= " + t + ", �= " + p + " - " + istina);

		if (n3 * n3 == Math.pow(n3 % 10 + n3 / 10 % 10 + n3 / 100, 3))
			istina = true;
		else
			istina = false;
		System.out.println(
				"37.5 ������� ��������� ������������ ����� " + n3 + " ����� ���� ����� ���� ����� ����� - " + istina);

		a = 1.2;
		b = 2;
		c = 1.2;

		if (a == b || a == c || b == c)
			istina = true;
		else
			istina = false;
		System.out.println(
				"37.6 ����������� �� ��������� " + a + "," + b + "," + c + " �������� �������������� - " + istina);

		n3 = 103;

		figure1 = n3 / 100;
		figure2 = n3 / 10 % 10;
		figure3 = n3 % 10;

		if (figure1 + figure2 == figure3 || figure2 + figure3 == figure3 || figure1 + figure3 == figure3)
			istina = true;
		else
			istina = false;
		System.out.println("37.7 ����� �����-���� ���� ���� ��������� ������������ ������������ ����� " + n3
				+ " ����� ������� ����� - " + istina);

		x = 8;
		a = 2;

		if (x == 1 || x == a || x == a * a || x == a * a * a || x == a * a * a * a)
			istina = true;
		else
			istina = false;
		System.out.println("37.8 �������� ����� " + x + " �������� �������� ����� " + a
				+ " (���������� ������� ����� ���������� � ��������� �� 0 �� 4) - " + istina);

		x = 0;
		y = 0;
		a = 2;
		b = 4;
		c = 0;

		if (a * x * x + b * x + c == y)
			istina = true;
		else
			istina = false;
		System.out.println("37.9 ������ ������� � = " + a + "�^2 + " + b + "� + " + c
				+ " �������� ����� �������� ����� � ������������ (" + x + "," + y + ") - " + istina);

	}

}
