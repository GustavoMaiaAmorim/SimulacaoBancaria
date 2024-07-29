import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

     

        while (continuar) {

            System.out.println("Escolha uma opção:");
            System.out.println("1. Opção 1");
            System.out.println("2. Opção 2");
            System.out.println("3. Opção 3");
            System.out.println("0. Sair");

            int opcao = scanner.nextInt();

           
            switch (opcao) {
                case 1:
                System.out.println("Digite o valor que você deseja depositar: ");
                double deposito = scanner.nextDouble();
                saldo = (deposito + saldo);
                System.out.println("Saldo atual: " +saldo);
                    break;

                case 2:
                System.out.println("Digite o valor que deseja sacar: ");
                double sacar = scanner.nextDouble();
                if (sacar <= saldo){
                    saldo = sacar - saldo;
                    System.out.println("Saque realizado com sucesso!");
                }else{
                    System.out.println("Saldo insuficiente.");
                }
                break; 
                  
                case 3:
                System.out.println("Saldo atual: " +saldo);
                break;

                case 0:
                    continuar = false;
                    System.out.println("Programa encerrado.");
                break;


                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
   
}