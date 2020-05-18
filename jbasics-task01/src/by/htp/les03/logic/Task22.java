package by.htp.les03.logic;

// Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
// Вывести данное значение длительности в часах, минутах и секундах в следующей форме: ННч ММмин SSc.

public class Task22 {

	public static void task() {

		int t, h, m, s;

		t = 23456;

		h = Math.floorDiv(t, 60 * 60);
		m = Math.floorDiv(t - 60 * 60 * h, 60);
		s = t - 60 * 60 * h - 60 * m;

		System.out.println("22. " + t + "c равны " + h + "ч " + m + "мин " + s + "с.");

	}

}
