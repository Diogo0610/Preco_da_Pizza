package PizzaJava;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	private List<Pizza> pizzas = new ArrayList<>();
	public void AdicionarPizza(Pizza pizza) {
		if (pizza.ingredientes.isEmpty()) {
            throw new IllegalArgumentException("Não é possível adicionar uma pizza sem ingredientes.");
        }
		else {
			pizzas.add(pizza);
		}
	}
	
	public int ValorTotal() {
        int valorTotal = 0;
        for (Pizza pizza : pizzas) {
            valorTotal += pizza.getPreco();
        }
        return valorTotal;
    }
}
