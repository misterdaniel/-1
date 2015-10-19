//€вл€ютс€ ли словo полиндромом

public class e33 {
	public static void main(String[] args) {
		String a = args[0];
		int p = a.length()-1;
		int c = 0;
		
			for(int j=0;j<(a.length())/2;j++){
				if( a.charAt(j) ==  a.charAt(p) ){
					c++;                				}
				p--;                    
			}
			
		if (c == (a.length())/2){
			System.out.println("Cово полиндром");
		}
		
		if (c != (a.length())/2){
			System.out.println("Cово не полиндром");
		}
	}
}

