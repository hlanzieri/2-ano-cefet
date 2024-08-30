package ex7;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Produto produto1 = new Produto("Arroz", 20.0, 100);
        Produto produto2 = new Produto("Feijão", 10.0, 50);
        Produto produto3 = new Produto("Macarrão", 5.0, 200);

        System.out.println("Produtos disponíveis:");
        System.out.println(produto1);
        System.out.println(produto2);
        System.out.println(produto3);

        Pedido pedido = new Pedido(FormaPagamento.CARTAO); // Pode ser DINHEIRO, CHEQUE, ou CARTAO

        while (true) {
            System.out.print("\nDigite o nome do produto (ou 'fim' para encerrar): ");
            String nomeProduto = scanner.nextLine();

            if (nomeProduto.equalsIgnoreCase("fim")) {
                break;
            }

            Produto produtoSelecionado = null;
            switch (nomeProduto.toLowerCase()) {
                case "arroz":
                    produtoSelecionado = produto1;
                    break;
                case "feijão":
                    produtoSelecionado = produto2;
                    break;
                case "macarrão":
                    produtoSelecionado = produto3;
                    break;
                default:
                    System.out.println("Produto não encontrado.");
                    continue;
            }

            System.out.print("Digite a quantidade desejada: ");
            int quantidade = scanner.nextInt();
            scanner.nextLine();

            if (quantidade > produtoSelecionado.getQuantidadeEstoque()) {
                System.out.println("Quantidade solicitada maior do que o estoque disponível.");
                continue;
            }

            ItemPedido itemPedido = new ItemPedido(produtoSelecionado, quantidade);
            pedido.adicionarItem(itemPedido);

            produtoSelecionado.setQuantidadeEstoque(produtoSelecionado.getQuantidadeEstoque() - quantidade);
        }

        System.out.println("\nResumo do Pedido:");
        System.out.println(pedido);

        scanner.close();
    }
}

