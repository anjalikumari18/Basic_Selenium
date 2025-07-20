package java_programs;

public class revserse_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		       /* String original = "hello";

		        StringBuilder sb = new StringBuilder(original);
		        String reversed = sb.reverse().toString();

		        System.out.println("Reversed string: " + reversed);
		        
		        */
		
		String string1="Apple";
		String reversed="";
		char ch;
		
		for(int i=0; i<string1.length();i++) {
			ch=string1.charAt(i);
			
			reversed=ch+reversed;
		}
		
		System.out.println(reversed);
		



	}
}
