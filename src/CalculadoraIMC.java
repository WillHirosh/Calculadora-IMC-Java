import java.util.Calendar;
import java.util.Scanner;

public class CalculadoraIMC {

	public CalculadoraIMC() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		String nome;
		int idade, ano_atual, ano_nascimento, peso;
		float imc, altura;
		System.out.println("Digite seu nome:");
		nome = entrada.nextLine();
		System.out.println("Digite sua idade");
		idade = entrada.nextInt();
		Calendar calendario = Calendar.getInstance();
		ano_atual = calendario.get(Calendar.YEAR);
		ano_nascimento = ano_atual - idade;
		System.out.println("Para calcular o IMC, digite sua altura");
		altura = entrada.nextFloat();
		System.out.println("Para calcular o IMC, digite seu peso");
		peso = entrada.nextInt();
		imc = peso / (altura * 2);

		/* mostrar Nome, idade e IMC */

		System.out.printf("Seu nome " + nome + "\n");
		System.out.printf("Você nasceu em " + ano_nascimento + "\n");
		System.out.printf("Resultado do calculo IMC: " + Math.round(imc)  + "\n");
		if (imc < 18.5)
			System.out.printf("Abaixo do peso ideal.");
		else if ((imc > 18.5) && (imc < 24.9))
			System.out.printf("Você está no peso ideal..");
		else if ((imc > 25.0) && (imc < 29.9))
			System.out.printf("Você está com excesso de peso");
		else if ((imc > 30.0) && (imc < 34.9))
			System.out.printf("Obesidade classe 1");
		else if ((imc > 35.0) && (imc < 39.9))
			System.out.printf("Obesidade classe 2");

		else if (imc>40)
			System.out.printf("Obesidade classe 3");
		
		System.out.println("Obrigado");
					
		
	}

}
