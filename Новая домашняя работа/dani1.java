public class dani1 {
	public static void main(String[] args) {
		String a = args[0];
		int p =0;
		for(int i=0;i<=a.length();i++){
			for(int j=i+1;j<a.length();j++){
				if( a.charAt(i) ==  a.charAt(j) ){
					System.out.println("C����� - " + a.charAt(i) + " �����������");
					p=p++;
				}
			}
		}
		if (p == 0){
			System.out.println("good job, its work right");
	}
}
}
//���� ������ �����������, �� ������� ���, ���� ���, �� ��� �����
