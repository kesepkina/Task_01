package by.htp.les03.logic;

// ���� �������������� ����� R ���� nnn.ddd (��� �������� ������� � ������� � ����� ������).
// �������� ������� ������� � ����� ����� ����� � ������� ���������� �������� �����.

public class Task21 {

	public static void task() {

		double r, n, d, r2;

		r = 123.456;

		n = Math.floor(r);
		d = r - n;
		r2 = Math.floor((d * 1000 + n / 1000) * 1000) / 1000;

		System.out.println("21. " + r + " -> " + r2);

	}

}
