public class dani2 {

//программа про футбольные команды

	public static void main(String[] args) {
		String a = args[0];
		StringBuilder kom1 = new StringBuilder("");
		StringBuilder kom2 = new StringBuilder("");
		StringBuilder countA = new StringBuilder("");
		StringBuilder countB = new StringBuilder("");
		int golkom1 = 0;
		int golkom2 = 0;
		int k = 0;
		int k1 = 0;
		String temp = "";
		for (int i=0; i < a.length(); i++) {
			k = i;
			if (a.charAt(i) != '-') {
				kom1.append(a.charAt(i));
			}
			else 
				break;
		}	
		for (int i = k + 1; i < a.length(); i++) {
			if (a.charAt(i) != ' ') {
				kom2.append(a.charAt(i));
			}
			else 
				break;
		}
		for(int i = 1; i < args.length; i++) {
			for(int j = 0; j < args[i].length(); j ++) {
				k1=j;
			 	if (args[i].charAt(j) != ':') {
			 		countA.append(args[i].charAt(j));
			 	}
			 	else 
			 		break;	 	
			}
			for(int j = k1+1; j < args[i].length(); j ++) {
			 		countB.append(args[i].charAt(j));
			}

			golkom1 = golkom1 + Integer.valueOf(countA.toString());
			golkom2 = golkom2 + Integer.valueOf(countB.toString());	
			countA.delete(0, countA.length());
			countB.delete(0, countB.length()); 	
		} 	
		System.out.println(kom1 + ": " + getBeautifullString(golkom1));
		System.out.println(kom2 + ": " + getBeautifullString(golkom2));
	}
	public static String getBeautifullString(int a){
		StringBuilder b = new StringBuilder();
		if ((a%100 > 10) && (a%100 < 20)){
			b.append(a + " golov");
		}
		else{
			switch(a % 10){
				case 1:
					b.append(a + " gol");
					break;
				case 2:
				case 3:
				case 4:
					b.append(a + " gola");
					break;
				case 5:
				case 6:
				case 7:
				case 8:
				case 9:
				case 0:
					b.append(a + " golov");
					break;
			}
		}
		return b.toString();
	}
}