class Orange{
	public String toString() {
		return "�������ڽ�";
	}
}
class AppleBox{
	String name;

	public AppleBox(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "AppleBox [name=" + name + "]";
	}
}
class OrangeBox{
	Orange orange;

	public OrangeBox(Orange orange) {
		super();
		this.orange = orange;
	}

	@Override
	public String toString() {
		return "OrangeBox [name=" + orange + "]";
	}
}
public class ExGeneric {
//	Generic�� �ؿ� ExArray���� <T>�� ����
	ExGeneric(){
		AppleBox ab1 = new AppleBox("����ڽ�");
		OrangeBox ob1 = new OrangeBox(new Orange());
		
		System.out.println("ab1 = "+ab1);
		System.out.println("ob1 = "+ob1);
	}
	public static void main(String[] args) {
		new ExGeneric();
	}
}
