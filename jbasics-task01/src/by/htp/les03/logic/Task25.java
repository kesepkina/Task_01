package by.htp.les03.logic;

// ��������� ����� ����������� ��������� ��2+ b� + � = 0 � ��������� �������������� a, b � � 
// (��������������, ��� �!=0 � ��� ������������ ��������� �������������).

public class Task25 {

	public static void task() {

		double a, b, c, x1, x2, d;

		a = 4;
		b = 16;
		c = 16;

		d = Math.pow(b, 2) - 4 * a * c;
		x1 = (-b + Math.sqrt(d)) / (2 * a);
		x2 = (-b - Math.sqrt(d)) / (2 * a);

		if (x1 == x2)
			System.out.println("25. ������ ����������� ��������� " + a + "x2 + " + b + "x + " + c + " = 0 ����� " + x1);
		else
			System.out.println(
					"25. ����� ����������� ��������� " + a + "x2 + " + b + "x + " + c + " = 0 ����� " + x1 + " � " + x2);

	}

}
