public class dani4 { 

//порядок алфавита

	public static void main(String[] args) {  
		
	String a = args[0];
	char b,c;
	int k=0;
	
		for(int i=0;i<a.length();i++){
			b=a.charAt(i);
			c=a.charAt(i+1);
			if (b == c+1){
			k=k++;	
			}
		}
		
		if (k==a.length()){
			System.out.println("Верный порядок");
			}
		else {
			System.out.println("Верный порядок");
		}
	
	}
}