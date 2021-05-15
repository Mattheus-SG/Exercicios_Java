package aula_07;
public class Main {
    public static void main(String[] args){
        Gerente gerente1 = new Gerente();
        gerente1.nome = "Pedro Diniz";
        gerente1.salario = 2500.00;
        gerente1.valeAlimetacaoDiario = 25.55;
        
        System.out.println(gerente1);
        System.out.println("");
        ControlePonto.registraEntradaG(gerente1);
        System.out.println("-------------------------------------------");
        ControlePonto.registraSaidaG(gerente1);
        
        Telefonista telefonista1 = new Telefonista();
        telefonista1.nome = "Bruno G";
        telefonista1.salario = 1300.00;
        telefonista1.valeAlimetacaoDiario = 21.00;
            
        System.out.println("");
        System.out.println(telefonista1);

        System.out.println("");
        ControlePonto.registraEntradaT(telefonista1);
        System.out.println("-------------------------------------------");
        ControlePonto.registraSaidaT(telefonista1);
    }
}
