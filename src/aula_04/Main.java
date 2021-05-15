package aula_04;
public class Main {
    public static void main(String[] args) {
        Funcionario func = new Funcionario();
        func.nome = "Matheus";
        func.valeRefeicaoDiario = 25.00;
        func.salario = 2500.00;
        func.reajusteValeR(10);
        System.out.println(func.valeRefeicaoDiario);
    }
}
