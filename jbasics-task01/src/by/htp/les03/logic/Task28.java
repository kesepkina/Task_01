package by.htp.les03.logic;

// —оставить программу перевода радианной меры угла в градусы, минуты и секунды.

public class Task28 {

	public static void task() {

		double rad, grad, min, s;

		rad = 3;

		s = rad * 180 / Math.PI;
		grad = Math.floor(s);
		min = Math.floor((s - grad) * 60);
		s = Math.floor((s - grad - min / 60) * 3600);

		System.out.println("28. " + rad + "рад равны " + grad + "град. " + min + "мин " + s + "с.");

	}

}
