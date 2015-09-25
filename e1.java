//Mogilnikov Daniil 11-505

package boom;
import java.util.*;

	public class eda {
		static Scanner reader= new Scanner(System.in);
		public static void main(String[] args) {
	    double a = 0,b = 0,c = 0;
	    double x,x1,x2;
	    double d,z;
	    Scanner s = new Scanner(System.in);
	    System.out.println("Введите число а");
        a = s.nextInt();
	    System.out.println("Введите число b");
        b = s.nextInt();
	    System.out.println("Введите число c");
        c = s.nextInt();
	    //Решение квадратного уравнения вида a*x*x+b*x+c=0
	    if (a!=0.0)
	        {d=b*b-4*a*c;
	         z=Math.sqrt(d);
	         if (d>0) 
	            {x1=(-b+z)/2/a;
	            x2=(-b-z)/2/a;
	            System.out.println("x1="+x1);
	            System.out.println("x2="+x2);}
	         if (d==0) 
	            {x=-b/2/a;
	            System.out.println("Корень уравнения равен "+x);}
	         if (d<0)
	            {System.out.println("Уравнение не имеет корней");}
	        }
	    else
	        {System.out.println("Уравнение не является квадратным");}
	    
	}
	}