
import java.util.ArrayList;
import java.util.List;

public class Restaurante {

    private List<Mesa> mesas;
    private List<Produto> produtos;
    private List<Pedido> pedidos;
    private List<Mesa> resultadoFinal;

    public Restaurante() {
        mesas = new ArrayList<>();
        produtos = new ArrayList<>();
        pedidos = new ArrayList<>();

    }

    public void cadastrarMesas(Mesa mesa) {
        mesas.add(mesa);
    }

    public void cadastrarProduto(Produto produto) {
        produtos.add(produto);
    }

    public Pedido abrirPedido(Mesa mesa) {
        if (mesa.isDisponivel() == false) {
            System.out.println("Não foi possível abrir pedido: mesa já está ocupada.");
            return null;

        } else {
            System.out.println("Pedido aberto com sucesso na mesa!");
            Pedido pedido = new Pedido(mesa);
            mesa.ocuparMesa();
            pedidos.add(pedido);
            return pedido;

        }

    }

    public List<Mesa> consultarMesasDisponiveis() {
        resultadoFinal = new ArrayList<>();

        for (int i = 0; i < mesas.size(); i++) {
            if (mesas.get(i).isDisponivel()) {
                System.out.println("Mesa " + mesas.get(i).getNumero() + " está disponível.");
                resultadoFinal.add(mesas.get(i));

            }

        }
        return resultadoFinal;
    }

}
