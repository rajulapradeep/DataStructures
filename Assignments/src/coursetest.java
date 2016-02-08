
public class coursetest {

	public static void main(String[] args) {
		person p = new person("Tan Ah Teck", "ahteck@somewhere.com", 'm');
		//professor pname = p.getName();
		course c = new course("Algorithms",null, 2.50);  // check this // how to access p.name in the field
		System.out.println(c);
	}
}
