package by.htp.les03.logic;

// ���� �������� a. �� ��������� ������� ������� � ������� ��������, ����� ���������,
// �������� �������� �8 �� ��� �������� � �10 �� ������ ��������.

public class Task27 {

	public static void task() {

		double a, a2, a4, a8, a10;

		a = 2;

		a2 = a * a;
		a4 = a2 * a2;
		a8 = a4 * a4;
		a10 = a8 * a2;

		System.out.println("27. ��� a = " + a + " a^8 = " + a8 + ", a^10 = " + a10);

	}

}
