package aula_03;

class Testaalunoeturma 
{
    public static void main(String[] args)
    {
        Alunos j = new Alunos();
        Turma l = new Turma();
        
        j.nome = "Antonio";
        l.sigla = "C";
        
        j.turma = l;
        
        System.out.println(j.nome);
        System.out.println(j.turma.sigla);
    
    }
}
