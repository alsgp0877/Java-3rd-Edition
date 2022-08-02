package Practice;

import java.util.Scanner;

public class 예제코딩 {

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
	 * System.out.println("j=i++;실행 후, i="+i+",j="+j); i=5; j=0;
	 * 
	 * j=++i; System.out.println("j=++i;실행 후, i="+i+",j="+j);
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
	 * //예제4-7 public static void main(String[] args) {
	 * System.out.print("가위(1),바위(2),보(3) 중 하나를 입력하세요>"); Scanner scanner = new
	 * Scanner(System.in);
	 * 
	 * int user = scanner.nextInt(); int com = (int)(Math.random()*3)+1;
	 * 
	 * System.out.print("당신은"+user+"입니다."); System.out.print("컴은"+com+"입니다.");
	 * 
	 * switch(user-com) { case 2: case -1: System.out.print("당신이졌습니다."); break; case
	 * 1: case -2: System.out.print("당신이이겼습니다."); break; case 0:
	 * System.out.print("비겼습니다."); break; }
	 * 
	 * 
	 * }
	 */

	/*
	 * //예제4-14 public static void main(String[] args) {
	 * 
	 * for(int i=1,j=10;i<=10;i++,j--) { System.out.printf("%d\t %d\n",i,j);
	 * 
	 * }
	 * 
	 * for(int i=1;i<=10;i++) { System.out.printf("%d\t %d\n",i,11-i); } }
	 */
	
	/*
	 * //예제4-15 public static void main(String[] args) { for(int i=1;i<=10;i++) {
	 * System.out.printf("%d\t %d\n",i%3,i/3); } }
	 */
	
	/*
	 * //예제 4-23 while문 public static void main(String[] args) { int i=5;
	 * while(--i!=0) { System.out.printf(i+"- i can do it");
	 * 
	 * } }
	 */
	
	//4-30 break문
	/*
	 * public static void main(String[] args) { int sum=0; int i=0;
	 * 
	 * while(true) { if(sum>100) { break; } //--break문이 수행되면 이 부분은 실행되지 않고 while문을
	 * 완전히 벗어난다. ++i; sum+=i; //--
	 * 
	 * }//end of while
	 * 
	 * System.out.println("i="+i); System.out.println("sum="+sum);
	 * 
	 * }
	 */
	//4-29
	//숫자 중에 3의 배수(3,6,9)가 포함되어있으면, 포함된 개수만큼 박수를 치는 369게임을 1부터 100까지 출력하는 예제이다.
	/*
	 * public static void main(String[] args) { for(int i=1;i<=100;i++) {
	 * System.out.printf("i=%d",i); int tmp = i; do { //tmp%10이 3의 배수인지 확인(0제외)
	 * if(tmp%10%3==0 && tmp%10!=0) {//2자리안이라는 고정하에 끝자리만 검색하는거구나 그래도 홀수인지 아닌지 알수있으니까
	 * System.out.print("짝"); } }while((tmp/=10)!=0); } System.out.println();
	 * 
	 * }
	 */
	
	//4-34
	public static void main(String[] args) { 
		int menu = 0;
		int num = 0;
		
		outer:
		while(true) {
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.print("원하는 메뉴(1~3)를 선택하세요. (종료:0)>");
			Scanner scanner = new Scanner(System.in);
			String tmp = scanner.nextLine();
			menu = Integer.parseInt(tmp);
			if(menu==0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else if(!(1<=menu&&menu<=3)) {
				System.out.println("메뉴를 잘못 선택하셨습니다(종료는0) ");
				continue;
			}
			
			for(;;) {
				System.out.println("계산할 값을 입력하세요. (계산 종료:0, 전체종료:99)>");
				tmp= scanner.nextLine();
				num = Integer.parseInt(tmp);
				
				if(num==0) {
					break;
				}
				
				if(num==99) {
					break outer;
				}
				switch(menu) {
					case 1:
						System.out.println("result=" + num*num);
						break;
					case 2:
						System.out.println("result=" + Math.sqrt(num));
						break;
					case 3:
						System.out.println("result=" + Math.log(num));
						break;
				}
			}
		}
	  
	}
	
	
}

