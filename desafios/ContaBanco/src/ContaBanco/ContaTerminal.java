package ContaBanco;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Por favor, digite o seu nome!");
        String nameCliente = scanner.nextLine();
       
        System.out.println("digite o número!");
        int numero = scanner.nextInt();
        
        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scanner.next();
        
        System.out.println("Saldo!");
        double saldo = scanner.nextDouble();
        System.out.println();
        
        System.out.println("Olá " + nameCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia +", conta "+ numero +" e seu saldo " + saldo + " já está disponível para saque.");
        scanner.close();
        

	}
	
	
}
