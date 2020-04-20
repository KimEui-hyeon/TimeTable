
public class TimesAtion {
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
