package by.htp.les03.logic;

// ����� ������� �������������� �������� � ����������� � � b � ����� alfa ��� ������� ��������� �.

public class Task24 {

	public static void task() {

		double a, b, alfa, s;

		a = 12;
		b = 10;
		alfa = Math.PI / 3;

		s = (a + b) / 2 * (a - b) / 2 * Math.tan(alfa);

		System.out.println("24. ������� �������������� �������� � ����������� " + a + " � " + b + " � ����� " + alfa
				+ " ��� ������� ��������� ����� " + s);
	}

}
