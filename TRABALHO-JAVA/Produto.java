

public class Produto {
    private String Nome;
    private double Preco;
    private boolean Disponivel;

    public Produto(String Nome, double Preco) {
        this.Nome = Nome;
        this.Preco = Preco;
        Disponivel = true;
    }

   public String getNome(){
     return(Nome);

    }
    public double getPreco(){
        return(Preco);
    }
    public boolean isDisponivel(){
        return(Disponivel);
    }
    public void marcarIndisponivel(){
        Disponivel = false;
    }
    public void marcarDisponivel(){
        Disponivel = true;
    }

}