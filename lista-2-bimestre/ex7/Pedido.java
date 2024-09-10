package ex7;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<ItemPedido> itens;
    private FormaPagamento formaPagamento;

    public Pedido(FormaPagamento formaPagamento) {
        this.itens = new ArrayList<>();
        this.formaPagamento = formaPagamento;
    }

    public void adicionarItem(ItemPedido item) {
        itens.add(item);
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.calcularSubtotal();
        }
        return total;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void setItens(List<ItemPedido> itens) {
        this.itens = itens;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pedido:\n");
        for (ItemPedido item : itens) {
            sb.append(item.toString()).append("\n");
        }
        sb.append("Forma de Pagamento: ").append(formaPagamento).append("\n");
        sb.append("Total: R$ ").append(calcularTotal());
        return sb.toString();
    }
}

