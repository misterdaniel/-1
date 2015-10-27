//задание 2 вывести треугольниу
//чтобы увеличить или уменьшить треугольник измените переменную V

public class z2 {
	public static void main(String[] args) {
		int v=5;
		long a=1;
		for(int i=0;i<=v;i++){
			for(int j=0;j<=v*2+1;j++){
				if (j==v-i){
				System.out.print(a);	
				}else {
					System.out.print(" ");
				}
				
			}
		System.out.println(); a=a*100;
		}
		
		
	}
}