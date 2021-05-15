package aula_02;

import java.util.Scanner;

public class Exercicio_04 {
    public void exercicio_04() {
        int opc = 1;
        while (opc != 0){      
            System.out.println("\n 1- Padrão \n 2-Padrão \n 3- Padrão \n 4- Padrão \n 5- Padrão \n 0- Sair");
            System.out.println("\n Digite a opção desejada: ");
            Scanner scanner = new Scanner(System.in);
            String valor1 = scanner.nextLine();
            opc = Integer.parseInt(valor1);
            
            if(opc == 1) {
                System.out.println("==> Opção 1");    
            } else if(opc == 2) {
                System.out.println("==> Opção 2");
            } else if(opc == 3) {
                System.out.println("==> Opção 3");
            } else if (opc == 4) {
                System.out.println("==> Opção 4");
            } else if (opc == 5) {
                System.out.println("==> Opção 5"); 
            }
            System.out.println("=========================================");
        }
        System.out.println("Programa Finalizado");
    }
}
