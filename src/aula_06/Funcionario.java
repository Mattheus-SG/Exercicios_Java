package aula_06;
public class Funcionario {
    private String nome ;
    private double Salario;
    
    public double bonificacaofunc() {
        return this.Salario * 0.1;
    }
    public void Dados() {
        System.out.println ("Nome: " + this.nome);
        System.out.println ("Salario: " + this.Salario);
        System.out.println ("Bonificação: " + this.bonificacaofunc());
    }
}
