package aula_08;
public abstract class Funcionario {
    public String nome;
    public double salario;
    public int funcionarioId;
    
    public int getId(){
        return this.funcionarioId;
    }
    
    public void setId(int id){
        this.funcionarioId = id;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public double getSalario(){
        return this.salario;
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }
    
    public abstract void bonificacao(int porcent);
}
