package unidade3;

public class TesteString {

	public static void main(String[] args) {
		
		String s1 = "Alo";
		String s2 = "Alo";
		String s3 = s2;
		
		String s4 = new String("Alo");
		String s5 = new String("Alo");
		
		System.out.println(s1==s2);
		System.out.println(s1==s4);
		System.out.println(s1.equals(s4));

		
		
	}

}
