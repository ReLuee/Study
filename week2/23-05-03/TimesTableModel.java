package times;

import java.util.InputMismatchException;

public class TimesTableModel {

	public static void Multiplication() {

		try {

			int num = TimesTableController.inputNum();

			if (num < 1 || num > 999) { // �Է¹�������
				System.err.println("1���� 999 ������ ������ �Է��ϼ���.");
				return;
			}

			System.out.println(num + "���� ����մϴ�.");

			for (int i = 1; i < 10; i++) {	// ���
				System.out.println(num + " x " + i + " = " + (num * i));
			}

		} catch (InputMismatchException e) {	// ����ó��
			System.err.println("�ùٸ� ������ �Է��ϼ���.");
			return;
		}
	}

}
