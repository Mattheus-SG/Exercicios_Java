package aula_08;
public class Main {
    public static void main(String[] args){
        Gerente gerente1 = new Gerente();
        gerente1.nome = "Luiz";
        gerente1.salario = 1000.00;
        
       gerente1.bonificacao(10);
        
        System.out.println();
    }
}
