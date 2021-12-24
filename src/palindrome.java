public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="Gaurav";
		String b="";
		for(int i=a.length()-1;i>=0;i--) {
			b=b + a.charAt(i);
		}
		System.out.println(b);
		if(a==b) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}

}
