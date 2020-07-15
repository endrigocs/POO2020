import java.util.Scanner;

public class Ex1Teste {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o valor A: ");
		int valorA = in.nextInt();
		System.out.println("Digite o valor B:");
		int valorB = in.nextInt();
		
		Ex1 ex1 = new Ex1();
		ex1.numeroImpar(valorA, valorB);
		
		
		in.close();
	}

}