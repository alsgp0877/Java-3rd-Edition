package Practice;

import java.util.Scanner;

public class �����ڵ� {

	/*
	 * public static void main(String[] args) { double d = 85.4; int score=(int)d;
	 * 
	 * System.out.println("score="+score); System.out.println("d="+d);
	 * 
	 * }
	 */

	/*
	 * public static void main(String[] args) { int i =5; i++;
	 * System.out.println(i); i=5; ++i; System.out.println(i);
	 * 
	 * }
	 */

	/*
	 * public static void main(String[] args) { int i =5,j=0; j=i++;
	 * System.out.println("j=i++;���� ��, i="+i+",j="+j); i=5; j=0;
	 * 
	 * j=++i; System.out.println("j=++i;���� ��, i="+i+",j="+j);
	 * 
	 * }
	 */

	/*
	 * public static void main(String[] args) { char c1 ='a'; char c2 =c1+1; char c3
	 * ='a'+1;
	 * 
	 * System.out.println(c2);
	 * 
	 * }
	 */

	/*
	 * public static void main(String[] args) { char lc ='a'; char uc
	 * =(char)(lc-32);
	 * 
	 * 
	 * System.out.println(uc);
	 * 
	 * }
	 */
	/*
	 * public static void main(String[] args) { int a=5; int b=0;
	 * System.out.printf("a=%d,b=%d%n",a,b);
	 * 
	 * System.out.printf("a!=0 || ++b!=0 = %b%n", a!=0 || ++b!=0);
	 * System.out.printf("++b!=0 = %b%n", ++b!=0);
	 * 
	 * System.out.printf("%d%n", ++b); System.out.printf("%d%n", b);
	 * 
	 * 
	 * }
	 */
	/*
	 * //����4-7 public static void main(String[] args) {
	 * System.out.print("����(1),����(2),��(3) �� �ϳ��� �Է��ϼ���>"); Scanner scanner = new
	 * Scanner(System.in);
	 * 
	 * int user = scanner.nextInt(); int com = (int)(Math.random()*3)+1;
	 * 
	 * System.out.print("�����"+user+"�Դϴ�."); System.out.print("����"+com+"�Դϴ�.");
	 * 
	 * switch(user-com) { case 2: case -1: System.out.print("����������ϴ�."); break; case
	 * 1: case -2: System.out.print("������̰���ϴ�."); break; case 0:
	 * System.out.print("�����ϴ�."); break; }
	 * 
	 * 
	 * }
	 */

	/*
	 * //����4-14 public static void main(String[] args) {
	 * 
	 * for(int i=1,j=10;i<=10;i++,j--) { System.out.printf("%d\t %d\n",i,j);
	 * 
	 * }
	 * 
	 * for(int i=1;i<=10;i++) { System.out.printf("%d\t %d\n",i,11-i); } }
	 */
	
	/*
	 * //����4-15 public static void main(String[] args) { for(int i=1;i<=10;i++) {
	 * System.out.printf("%d\t %d\n",i%3,i/3); } }
	 */
	
	/*
	 * //���� 4-23 while�� public static void main(String[] args) { int i=5;
	 * while(--i!=0) { System.out.printf(i+"- i can do it");
	 * 
	 * } }
	 */
	
	//4-30 break��
	public static void main(String[] args) { 
		int sum=0;
		int i=0;
		
		while(true) {
			if(sum>100) {
				break;
			}
			//--break���� ����Ǹ� �� �κ��� ������� �ʰ� while���� ������ �����.
			++i;
			sum+=i;
			//--
			
		}//end of while
	  
		System.out.println("i="+i); 
		System.out.println("sum="+sum);
	  
	}
	
	
}

