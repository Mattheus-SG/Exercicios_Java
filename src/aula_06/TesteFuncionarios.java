package aula_06;
public class TesteFuncionarios {
    private static void main(String[] args ) {
        Gerente b = new Gerente() ;
        b.setNome (" Adriana Silva ");
        b.setSalario (3000);
        b.setusuario ("adriana.silva ");
        b.setsenha (" 12345 ");

        Telefonista c = new Telefonista();
        c.setNome (" Bruna.caroline ");
        c.setSalario (3300);
        c.setestTrabalho (16);

        Secretaria d = new Secretaria();
        d.setNome (" Gabriel Rodrigo ");
        d.setSalario (2000) ;
        d.setramal (208) ;
        
        System.out.println(" Gerente ");
        b.Dados();

        System.out.println(" TELEFONISTA ");
        c.Dados();

        System.out.println(" SECRETARIA ");
        d.Dados();
    }
}
