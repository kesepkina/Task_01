package by.htp.les03.logic;

// ���� ����������� ����� �, ������� ������������ ������������ ���������� ������� � ��������.
// ������� ������ �������� ������������ � �����, ������� � �������� � ��������� �����: ��� ����� SSc.

public class Task22 {

	public static void task() {

		int t, h, m, s;

		t = 23456;

		h = Math.floorDiv(t, 60 * 60);
		m = Math.floorDiv(t - 60 * 60 * h, 60);
		s = t - 60 * 60 * h - 60 * m;

		System.out.println("22. " + t + "c ����� " + h + "� " + m + "��� " + s + "�.");

	}

}
