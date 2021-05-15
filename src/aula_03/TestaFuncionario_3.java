package aula_03;

class TestaFuncionario
{
    public static void main(String[] args)
    {
        Funcionario f = new Funcionario();
        f.nome = "Ada";
        f.salario = 1100;
        f.aumentodesalario(300);
        
        Funcionario f1 = new Funcionario();
        f1.nome = "Adriano";
        f1.salario = 2000;
        f1.aumentodesalario(200);
        
        System.out.println (f.nome);
        System.out.println (f.salario);
        System.out.println (f.consultadedados());
        System.out.println (f1.nome);
        System.out.println (f1.salario);
        System.out.println (f1.consultadedados());
    }        
}
