package boom;

	import java.util.Scanner;
	
	public class hausaufgabe1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();//���������� �����
		int a = in.nextInt();
		int b = in.nextInt();
		int R = in.nextInt();//��������� ���������� ���� Math.pow(x-a,2) + Math.pow(x-b,2)=R*R
		
		if (R*R == Math.pow(x-a,2) + Math.pow(x-b,2))
		{System.out.println("����� ��������� �� ����������");}
		
			if (R*R > Math.pow(x-a,2) + Math.pow(x-b,2))
			{System.out.println("����� ��������� ������ ����������");}
			
				if (R*R < Math.pow(x-a,2) + Math.pow(x-b,2))
				{System.out.println("����� ��������� ������� ����������");}			
	}
}
