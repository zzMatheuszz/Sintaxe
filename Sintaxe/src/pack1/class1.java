package pack1;
import java.util.Locale;
import java.util.Scanner;



public class class1 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Locale.setDefault(Locale.US);

	int minutos = sc.nextInt();
	
	double  conta = 50.0;
	if (minutos > 100) {
		conta = conta + (minutos - 100) * 2.0;
	}
	System.out.printf("valor da conta = R$ %.2f%n", conta);
	
	sc.close();
}
}