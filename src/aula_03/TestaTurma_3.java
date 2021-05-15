package aula_03;
public class TestaTurma_3
{
    public static void main(String[] args){
    Turma t = new Turma();
    t.periodo = "Manhã";
    t.serie = 7;
    t.sigla = "B";
    t.tipodeensino = "Fundamental";
        
    Turma t1 = new Turma();
    t1.periodo = "Manhã";
    t1.serie = 5;
    t1.sigla = "A";
    t1.tipodeensino = "Fundamental";
        
    System.out.println (t.periodo);
    System.out.println (t.serie);
    System.out.println (t.sigla);
    System.out.println (t.tipodeensino);
        
    System.out.println (t1.periodo);
    System.out.println (t1.serie);
    System.out.println (t1.sigla);
    System.out.println (t1.tipodeensino);
    }        
}   

