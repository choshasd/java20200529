class Orange{
	public String toString() {
		return "오렌지박스";
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
//	Generic은 밑에 ExArray에서 <T>쓴 형태
	ExGeneric(){
		AppleBox ab1 = new AppleBox("사과박스");
		OrangeBox ob1 = new OrangeBox(new Orange());
		
		System.out.println("ab1 = "+ab1);
		System.out.println("ob1 = "+ob1);
	}
	public static void main(String[] args) {
		new ExGeneric();
	}
}
