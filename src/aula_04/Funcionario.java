package aula_04;
public class Funcionario {
    public String nome;
    public double salario;
    public double valeRefeicaoDiario;
    
    public void reajusteValeR(double aumento){
        this.valeRefeicaoDiario += aumento;
    };
}
