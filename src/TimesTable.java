import java.util.Scanner;

public class TimesTable {
	public static void main(String[] args) {
		//2,3단 계산 출력
		System.out.println("2단");
		System.out.println(2*1);
		System.out.println(2*2);
		System.out.println(2*3);
		System.out.println(2*4);
		System.out.println(2*5);
		System.out.println(2*6);
		System.out.println(2*7);
		System.out.println(2*8);
		System.out.println(2*9);
		
		System.out.println("3단");
		System.out.println(3*1);
		System.out.println(3*2);
		System.out.println(3*3);
		System.out.println(3*4);
		System.out.println(3*5);
		System.out.println(3*6);
		System.out.println(3*7);
		System.out.println(3*8);
		System.out.println(3*9);
		
		//4단 변수 사용
		
		System.out.println("4단");
		int result;
		result= 4*1;
		System.out.println(result);
		result = 4*2;
		System.out.println(result);
		result = 4*3;
		System.out.println(result);
		result = 4*4;
		System.out.println(result);
		result = 4*5;
		System.out.println(result);
		result = 4*6;
		System.out.println(result);
		result = 4*7;
		System.out.println(result);
		result = 4*8;
		System.out.println(result);
		result = 4*9;
		System.out.println(result);
		
		//5단 반복문  while사용
		
		System.out.println("5단");
		int whnum=1;
		while(whnum<10) {
			result = 5*whnum;
			whnum++;
			System.out.println(result);
		}
		
		//6단 반복문 for 사용 
		
		System.out.println("6단");
		for(int i=1;i<10;i++) {
			result = 6*i;
			System.out.println(result);
		}
		
		
		//scanner사용으로 사용자에게 입력 받은 단을 출력
		
		System.out.println("몇 단을 출력하시겠습니까?");
		Scanner scanner = new Scanner(System.in);
		int scannernum = scanner.nextInt();
		System.out.println(scannernum + "단을 출력합니다");
		for(int i= 1;i<=9;i++) {
			System.out.println(scannernum*i);
		}
		
		// 조건 문을 사용하여 오루 검출
		System.out.println("몇 단을 출력하시겠습니까?");
		scannernum = scanner.nextInt();
		if(2<=scannernum&&scannernum<=9) {
			for(int i=1;i<10;i++)
				System.out.println(scannernum*i);
		}
		else {
			System.out.println("2에서 9사이의 숫자를 입력해주십시오");
		}
		
		//배열을 이용
		
		int[] arr = new int [9];
		for(int i=2;i<10;i++) {
			for(int j=0;j<arr.length;j++) {
				arr[j]=i*(j+1);
			}
			for(int k=0;k<arr.length;k++) {
				System.out.println(arr[k]);
			}
		}
		
		// 메소드를 이용해보자
		int[] arr2 = new int [9];
		for(int i=2;i<10;i++){
			System.out.println("메소드 입니다.");
			arr2 = calc(i);
			print(arr2);
		}
	}
	//계산 메소드이다
	public static int[] calc(int a) {
		int [] arr  = new int[9];
		for(int i=0;i<arr.length;i++) {
			arr[i] = a*(i+1);
		}
		return arr;	
	}
	//출력 메소드이다
	public static void print(int[] arr2) {
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
	}
}


























