package by.htp.les02.main;

public class Task10 {

	public static void main(String[] args) {

		double x, y, z;

		x = Math.PI / 2;
		y = 1.57;

		z = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);

		System.out.println("z=" + z);

	}

}
