package aula_03;

import java.util.Scanner;

class TestaFuncionario2_3
{
    public static void main(String[] args)
    {
        Funcionario f = new Funcionario();
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nome do funcionario: ");
        String nome = scanner.nextLine();
        f.nome = nome;
        
        int opc = 1;
        while (opc != 0)
        {
           System.out.println("Escolha uma opção: ");
           System.out.println("0 - Sair");
           System.out.println("1 - Aumento de salario");
           System.out.println("2 - Alterar nome do funcionario");
           System.out.println("3 - Visualizar dados");
           
           String valordatela = scanner.nextLine();
           opc = Integer.parseInt(valordatela);
           
            if (opc == 1)
                {
                System.out.print("Valor do aumento: ");
                valordatela = scanner.nextLine();
                int aumentar = Integer.parseInt(valordatela);
                
                If (aumentar < 0){
                    System.out.println ("erro");
                }
                    }else{
                    f.salario += aumentar;
                    System.out.println("sucesso");
                }
                else if (opc == 2)
                {
                System.out.println("Nome: " + f.nome);
                }
                System.out.println("Novo nome: ");
                valordatela = scanner.nextLine();
                f.nome = valordatela;
                
                System.out.println ("Sucesso na operação");
                    
                else if (opc == 3)
                {
                System.out.println("Dados");
                System.out.println("nome:" + f.nome);        
                System.out.println("salario: " + f.salario);
            
                else if (opc => 4)
                {
                    System.out.println("Digite uma opção valida");
                }
                }
        }
                        
    }                       
        }    
        
    }        
}
