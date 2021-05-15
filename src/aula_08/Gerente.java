package aula_08;
public class Gerente extends Funcionario{
    public static String nome;
    public static double salario;

    public void setNome(String nome) {
        super.setNome(nome);
        this.nome = "João";
    }
    
    public void bonificacao(double porcent){
        this.salario = (porcent / 100) * this.salario;
    }

    @Override
    public void bonificacao(int porcent) {
        this.salario = (porcent / 100) * this.salario;
    }
}
