package aula_03;

 class Funcionario 
{
    String nome;
    double salario;

    
    void aumentodesalario(double sal)
    {
        this.salario += sal;
    }        
    
    String consultadedados()
    {
        return "nome: " + this.nome + "\nsalario: " + this.salario;
    }                  
}
