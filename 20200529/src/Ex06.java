// alt + shift + r ������ �ٽ� ���� �ڵ����� �� ��ȯ
class Box<T extends Number>{
	T t;
	public Box(T t) {
		super();
		this.t = t;
	}
	@Override
	public String toString() {
		return "Box [t=" + t + "]";
	}
}
public class Ex06 {
	Ex06(){
		Box<Integer> box1 = new Box(11);
		System.out.println("box1 = "+box1);
//		Box<String> box2 = new Box("��Ʈ��");
//		System.out.println("box2 = "+box2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex06();
	}

}
