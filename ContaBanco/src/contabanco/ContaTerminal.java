/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contabanco;
import java.util.Scanner;
/**
 *
 * @author alex
 */
public class ContaTerminal {
    
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        ContaBanco novaConta = new ContaBanco();
        Scanner input = new Scanner(System.in);
        
        System.out.println("Por favor, digite o nome do cliente!");
        String nome = input.nextLine();
        novaConta.nomeCliente = nome;
        
        System.out.println("Por favor, digite o número da Agência!");
        String agencia = input.nextLine();
        novaConta.agencia = agencia;
        
        System.out.println("Por favor, digite o número da Conta!");
        int conta = input.nextInt();
        novaConta.contaNumero = conta; 
       
        System.out.println("Por favor, digite o seu saldo!");
        double saldo = input.nextDouble();
        novaConta.saldo = saldo;
        
        System.out.println("Olá "+novaConta.nomeCliente+ ", obrigado por "
                + "criar uma conta em nosso banco, sua agência é "+ novaConta.agencia
                +", conta "+novaConta.contaNumero+", e seu saldo "+novaConta.saldo+
                " já está disponível para saque.");        
    }
    
}
