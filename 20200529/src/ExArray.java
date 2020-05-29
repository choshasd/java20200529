import java.util.ArrayList;

public class ExArray {
	ExArray(){
		int[] a = new int[4];
		System.out.println("배열");
		for(int temp : a) {
			System.out.println("temp = "+temp);
		}
		System.out.println();
		
//		위도 배열 밑에도 배열
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(0);
		al.add(1);
		al.add(2);
		System.out.println("콜렉션");
		for(int temp2 : al) {
			System.out.println("temp2 = "+temp2);
		}
	}
	public static void main(String[] args) {
		new ExArray();
	}
}
