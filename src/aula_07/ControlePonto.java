package aula_07;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ControlePonto{
    
    public static void registraEntradaG (Gerente g){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date agora = new Date();
        System.out.println("ENTRADA: " + g.nome);
        System.out.println("HORARIO ENTRADA: " + sdf.format(agora));
    }
    
    public static void registraSaidaG (Gerente g) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date agora = new Date();
        System.out.println("NOME: " + g.nome);
        System.out.println("HORARIO SAIDA: " + sdf.format(agora));
    }
    
    public static void registraEntradaT (Telefonista t){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date agora = new Date();
        System.out.println("ENTRADA: " + t.nome);
        System.out.println("HORARIO ENTRADA: " + sdf.format(agora));
    }
    
    public static void registraSaidaT (Telefonista t) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date agora = new Date();
        System.out.println("NOME: " + t.nome);
        System.out.println("HORARIO SAIDA: " + sdf.format(agora));
    }
}
