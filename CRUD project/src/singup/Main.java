package singup;

import java.util.*;

public class Main {

		public static void main(String[] args) {
			ArrayList<user> users = new ArrayList<user>();
			Scanner sc = new Scanner(System.in);
			int n = 0;
			
			Boolean flag = true;
			while (flag) {
				System.out.println("-------------------------------------------------");
				System.out.println("1. ȸ������ 2.ȸ��Ż�� 3.ȸ������Ʈ 4.ȸ�� ���� ���� 5.����");
				System.out.println("-------------------------------------------------");
				System.out.println("�����Ͻ� �޴��� ��ȣ�� �Է����ּ���:");
				n= sc.nextInt();
				
				switch (n) {
					case 1: //ȸ������
						System.out.println();
						System.out.println("ȸ���� ������ �Է����ּ���");
						System.out.println("--------------------");
						System.out.println("�̸�:");
						String name =sc.next();
						System.out.println("���̵�:");
						String id = sc.next();
						System.out.println("��й�ȣ:");
						String pw = sc.next();
						System.out.println("�̸���:");
						String email = sc.next();
						System.out.println("����:");
						String age = sc.next();
						users.add(new user(name, id, pw, email, age));
						System.out.println("ȸ�������� �Ǿ����ϴ�");
						break;
					
					case 2: //ȸ��Ż��	
						break;
					
					case 3: //ȸ������Ʈ
						break;
					
					case 4: //ȸ�� ���� ����
						break;
						
					case 5: //����
						flag = false;
						System.out.println("�ý����� ����Ǿ����ϴ�.");
						break;
					
					default:
						System.out.println("1~5 ���̿� ���ڸ� �Է����ּ���.");
						break;
				}
			}
		}
}