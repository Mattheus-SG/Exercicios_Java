package aula_07;
public class FuncionarioBanco {
    public String nome;
    public double salario;
    public double valeAlimetacaoDiario;
    public int funcionarioId;
    
    public int getId(){
        return this.funcionarioId;
    }
    
    public String toString(){
        return "nome: " + this.nome + "\nSalário: " + this.salario + "\nVale Alimetação: " + this.valeAlimetacaoDiario;
    }
}
