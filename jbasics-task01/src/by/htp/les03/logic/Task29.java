package by.htp.les03.logic;

// ����� (� �������� � ��������) ��� ���� ������������ �� ��������� �, b, �.

public class Task29 {

	public static void task() {

		double a, b, c, alfar, alfag, betar, betag, gammar, gammag;

		a = 3;
		b = 3;
		c = 3;

		alfar = Math.acos((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / (2 * a * b));
		betar = Math.acos((Math.pow(a, 2) + Math.pow(c, 2) - Math.pow(b, 2)) / (2 * a * c));
		gammar = Math.PI - alfar - betar;
		alfag = Math.round(alfar * 180 / Math.PI);
		betag = Math.round(betar * 180 / Math.PI);
		gammag = 180 - alfag - betag;

		System.out.println("29. ���� ������������ �� ��������� " + a + ", " + b + ", " + c + " ����� " + alfar + " ���("
				+ alfag + " ����), " + betar + " ���(" + betag + " ����) � " + gammar + " ���(" + gammag + " ����).");

	}

}
