package Interface;

interface PedidoRestaurante{
    void adicionarItem(String item, double preco);
    double calcularTotal();
}


public class Pedido implements PedidoRestaurante{
    private double total = 0;

    @Override
    public void adicionarItem(String item,double preco){
        System.err.println("Adicionando " +  item + "(R$" + preco + ") ao pedido.");
        total += preco;
    }

    @Override
    public double calcularTotal(){
        return total;
    }
    
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.adicionarItem("Hamburguer", 15.0);
        pedido.adicionarItem("Lasanha", 25.0);
        pedido.adicionarItem("Pizza", 40.0);

        System.out.println("O valor total do pedido é: " + pedido.calcularTotal());

        
    }
}
