package by.htp.les03.logic;

// Текущее показание электронных часов: т ч (0 <= т <= 23) п мин (0 <= п <= 59) к с (0 <= к <= 59).
// Какое время будут показывать часы через р ч q мин r с?

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

		System.out.println("32. Часы будут показывать " + t + " ч " + n + " мин " + k + " с.");
	}

}
