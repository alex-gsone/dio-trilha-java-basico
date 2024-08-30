package contador;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
/**
 *
 * @author alex
 */
public class Contador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Digite dois números, o primeiro precisa ser maior que o segundo:");
        int parametroUm = input.nextInt();
        int parametroDois = input.nextInt();
        
        try{
            contar(parametroUm, parametroDois);
            
        }catch(ParametroInvalidoException e){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro!");
        }
        
    }
    public static void contar(int parametroUm, int parametroDois) throws ParametroInvalidoException{
//      validar se parametroUm é MAIOR que parametroDois e lançar a exceção 
        if(parametroUm > parametroDois){
            throw new ParametroInvalidoException();  
        }
        
        int contagem = parametroDois - parametroUm;
        for(int i=0; i <= contagem; i++ ){
            System.out.println("contagem: "+(i+1));
        }

    }
    
}
