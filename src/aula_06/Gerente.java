package aula_06;
public class Gerente {
    private String usuario;
    private String senha;
    
    public double bonificacaofunc()
    {
        return this.getSalario() * 0.6 + 100;
    }
    
    public void Dados() {
        super.Dados();
        System.out.println("User: " + this.usuario);
        System.out.println("Senha: " + this.senha);
    }

    private double getSalario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
