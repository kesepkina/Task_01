package by.htp.les03.logic;

// Ввести любой символ и определить его порядковый номер, а также указать предыдущий и последующий символы.

public class Task33 {

	public static void task() {

		char s, s1, s2;
		int i;

		s = 'z';

		i = s;
		s1 = (char) (i - 1);
		s2 = (char) (i + 1);

		System.out.println("33. Порядковый номер символа '" + s + "' - " + i + ", предыдущий символ - " + s1
				+ ", последующий - " + s2);

	}

}
