package aula_03;

public class TestaAluno_3 
{
    public static void main (String[] args)
    {
        Alunos a = new Alunos();
        a.nome = "Alberto";
        a.rg = "111111111-1";
        a.datanascimento = "20/05/1990";
        
        Alunos ab = new Alunos();
        ab.nome = "Adriana";
        ab.rg = "222222222-2";
        ab.datanascimento = "10/05/1980";
        
        System.out.println(a.nome);
        System.out.println(a.rg);
        System.out.println(a.datanascimento);
        
        System.out.println(ab.nome);
        System.out.println(ab.rg);
        System.out.println(ab.datanascimento);
    }        
    
}
