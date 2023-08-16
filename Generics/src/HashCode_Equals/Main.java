package HashCode_Equals;

public class Main {
	public static void main(String[] args) {
		Cliente c1 = new Cliente("Pablo", "pablo@pablo.com");
		Cliente c2 = new Cliente("Maria", "maria@maria.com");
		
		String s1 = "Teste";
		String s2 = "Teste";
		
		String s3 = new String("Teste");
		String s4 = new String("Teste");
		
		System.out.println(c1.equals(c2));
		System.out.println(s1 == s2);
		System.out.println(s3 == s4);
	}
}