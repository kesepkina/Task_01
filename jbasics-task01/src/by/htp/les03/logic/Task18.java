package by.htp.les03.logic;

public class Task18 {

	public static void task() {

		double rib, sside, sfull, v;

		rib = 2;

		sside = Math.pow(rib, 2);
		sfull = 6 * sside;
		v = sside * rib;

		System.out.println("18. Площадь грани, площадь полной поверхности и объём куба с длиной ребра " + rib
				+ " равны соответственно " + sside + ", " + sfull + " и " + v);

	}

}
