import java.util.ArrayList;

public class ExArray {
	ExArray(){
		int[] a = new int[4];
		System.out.println("�迭");
		for(int temp : a) {
			System.out.println("temp = "+temp);
		}
		System.out.println();
		
//		���� �迭 �ؿ��� �迭
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(0);
		al.add(1);
		al.add(2);
		System.out.println("�ݷ���");
		for(int temp2 : al) {
			System.out.println("temp2 = "+temp2);
		}
	}
	public static void main(String[] args) {
		new ExArray();
	}
}
