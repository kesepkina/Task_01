package by.htp.les03.logic;

// ���� ������� ��������������� ������������. ����� ������� ����� ������������, ��� ������, ������� ��������� � ��������� �����������.

public class Task19 {

	public static void task() {

		double a, s, h, rin, rout;

		a = 2;

		s = Math.pow(a, 2) * Math.sqrt(3) / 4;
		h = Math.sqrt(Math.pow(a, 2) - Math.pow(a / 2, 2));
		rin = a / (2 * Math.sqrt(3));
		rout = a / Math.sqrt(3);

		System.out
				.println("19. �������, ������, ������� ��������� � ��������� ����������� ��� ������������ �� �������� "
						+ a + " ����� �������������� " + s + ", " + h + ", " + rin + " � " + rout);
	}

}
