//������� 5 ������� � ���� �������� ������ = �+1 �������� �������

public class z5 {
	public static void main(String[] args) {
		int p=0;
		int[] m={2,4,16};
		for(int i=1;i<=2;i++){
			if (m[i-1]*m[i-1]==m[i]){
				p=p+1;
			}
		}
				
		
		if (p==2){
			System.out.println("��������� ��������� �����");
		}else {
			System.out.println("��������� ��������� �� �����");
		}
		
		
	}
}