import java.util.Scanner;

public class TimesTable {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String[] splited = input.split(",");
		int first = Integer.parseInt(splited[0]);
		int second = Integer.parseInt(splited[1]);
		
		for(int i=2;i<=first;i++){
			int[] arr = new int[second];
			arr = TimesAtion.calc(i,second);
			TimesAtion.print(arr);		
		}
	}
}


























