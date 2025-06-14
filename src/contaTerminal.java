
import java.util.Scanner;

public class contaTerminal {



        public static void main(String[] args) {
            // Método principal que coordena o fluxo do programa
            int numeroConta = obterNumeroConta();
            String agencia = obterAgencia();
            String nomeCliente = obterNomeCliente();
            double saldo = obterValorDeposito();

            imprimirDadosConta(numeroConta, agencia, nomeCliente, saldo);
        }

        /**
         * Solicita e retorna o número da conta (inteiro)
         * @return Número da conta fornecido pelo usuário
         */
        public static int obterNumeroConta() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o número da conta (somente números): ");
            int numero = scanner.nextInt();
            return numero;
        }

        /**
         * Solicita e retorna o número da agência (texto)
         * @return Número da agência fornecido pelo usuário
         */
        public static String obterAgencia() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o número da agência (ex: 123-4): ");
            String agencia = scanner.nextLine();
            return agencia;
        }

        /**
         * Solicita e retorna o nome do cliente (texto)
         * @return Nome completo do cliente
         */
        public static String obterNomeCliente() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o nome do cliente: ");
            String nome = scanner.nextLine();
            return nome;
        }

        /**
         * Solicita e retorna o valor do depósito inicial (decimal)
         * @return Valor do depósito fornecido pelo usuário
         */
        public static double obterValorDeposito() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o valor do depósito inicial: ");
            double valor = scanner.nextDouble();
            return valor;
        }

        /**
         * Exibe os dados da conta formatados no console
         * @param numero Número da conta
         * @param agencia Número da agência
         * @param nome Nome do cliente
         * @param saldo Saldo disponível
         */
        public static void imprimirDadosConta(int numero, String agencia, String nome, double saldo) {
            System.out.println("\nDados da conta:");
            System.out.println("Número da conta: " + numero);
            System.out.println("Agência: " + agencia);
            System.out.println("Nome do cliente: " + nome);
            System.out.printf("Saldo disponível: R$ %.2f", saldo);
            System.out.println("\nConta cadastrada com sucesso! Saldo já está disponível para transações.");
        }
    }

