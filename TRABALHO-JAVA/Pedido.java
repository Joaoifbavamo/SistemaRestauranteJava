
import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private Mesa mesa;
    private List<ItemPedido> itens;
    private boolean finalizado;

    public Pedido(Mesa mesa) {
        this.mesa = mesa;
        finalizado = false;
        itens = new ArrayList<>();

    }

    public void adicionarProduto(Produto produto, int quantidade) {

        if (produto.isDisponivel() == false) {
            System.out.println("Não foi possível adicionar: produto indisponível.");
        } else {
            System.out.println("Produto adicionado ao pedido com sucesso!");
            itens.add(new ItemPedido(produto, quantidade));
        }
    }

    public double calcularTotal() {
        double total = 0.0;
        for (int i = 0; i < itens.size(); i++) {
            total += itens.get(i).calcularSubtotal();
        }
        return total;

    }

    public double calcularTotalRecursivo(List<ItemPedido> lista) {
        if (lista.isEmpty()) {
            return 0.0;
        } else {
            return lista.get(0).calcularSubtotal() + calcularTotalRecursivo(lista.subList(1, lista.size()));
        }
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void finalizarPedido() {
        if (itens.isEmpty() == true) {
            System.out.println("Não foi possível finalizar: pedido não possui itens.");
        } else {
            System.out.println("Pedido finalizado com sucesso! Mesa liberada.");
            finalizado = true;
            mesa.liberarMesa();
        }
    }

}
