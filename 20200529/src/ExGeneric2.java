class NCBox<L, R>{
	L name;
	R count;
	
	public NCBox(L name, R count) {
		super();
		this.name = name;
		this.count = count;
	}
	@Override
	public String toString() {
		return "NCBox [ name=" + name + ", count=" + count + "ea ]";
	}
	
	
}
public class ExGeneric2 {
	ExGeneric2(){
		NCBox<String, Integer> ncb1 = new NCBox<String, Integer>("»ç°ú", 30);
		System.out.println(ncb1);
	}
	public static void main(String[] args) {
		new ExGeneric2();
	}
}
