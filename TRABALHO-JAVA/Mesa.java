public class Mesa {
    private int numero;
    private int capacidade;
    private boolean disponivel;

    public Mesa(int numero, int capacidade){
        this.numero = numero;
        this.capacidade = capacidade;
        disponivel = true;

    }
    public int getNumero(){
        return numero;
    }
    public void ocuparMesa(){
        disponivel = false;

    }
     public void liberarMesa(){
        disponivel = true;
        
    }
    public boolean isDisponivel(){
        return(disponivel);
    }
}