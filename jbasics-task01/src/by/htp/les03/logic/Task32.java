package by.htp.les03.logic;

// ������� ��������� ����������� �����: � � (0 <= � <= 23) � ��� (0 <= � <= 59) � � (0 <= � <= 59).
// ����� ����� ����� ���������� ���� ����� � � q ��� r �?

public class Task32 {

	public static void task() {

		int t, n, k, p, q, r;

		t = 22;
		n = 41;
		k = 4;

		p = 2;
		q = 23;
		r = 20;

		k += r;
		if (k > 59) {
			q += Math.floorDiv(k, 60);
			k %= 60;
		}

		n += q;
		if (n > 59) {
			p += Math.floorDiv(n, 60);
			n %= 60;
		}

		t += p;
		if (t > 23) {
			t %= 24;
		}

		System.out.println("32. ���� ����� ���������� " + t + " � " + n + " ��� " + k + " �.");
	}

}
