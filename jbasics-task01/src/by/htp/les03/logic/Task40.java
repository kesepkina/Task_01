package by.htp.les03.logic;

// ���� �������� �. �������� �������� -2� + 3�2 - 4�3 � 1 + 2� + 3�2 + 4�3 . ������������ �� �������� ��������.

public class Task40 {

	public static void task() {

		double x, y1, y2;

		x = 1;

		y1 = x * (-2 + x * (3 - 4 * x));
		y2 = 1 - y1 + 6 * x * x;

		System.out.println("40. -2*" + x + " + 3*" + x + "^2 - 4*" + x + "^3 = " + y1 + "  1 + 2*" + x + " + 3*" + x
				+ "^2 + 4*" + x + "^3 = " + y2);
	}

}
