import java.util.Scanner;

public class NOD {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

int nod;
int a;
a = scanner.nextInt();
int b;
b = scanner.nextInt();
while (a != b){
if (a>b)
a=a-b;
else if (b>a)
b=b-a;
}
nod=a;
System.out.println(nod);
}
}