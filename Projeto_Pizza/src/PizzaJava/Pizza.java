package PizzaJava;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pizza {
	public static HashMap<String, Integer> ingredientesUsados = new HashMap<>();
	List<String> ingredientes = new ArrayList<>();
	public int qtdIngredientes;
	int preco;
	
	public void adicionarIngredientes(String ingrediente){
		ingredientes.add(ingrediente);
		qtdIngredientes++;
		contabilizaIngrediente(ingrediente);
	}
	
	public static void contabilizaIngrediente(String ingrediente) {
        if (ingredientesUsados.containsKey(ingrediente)) {
        	ingredientesUsados.put(ingrediente, ingredientesUsados.get(ingrediente) + 1);
        } 
        else {
        	ingredientesUsados.put(ingrediente, 1);
        }
    }
	
	public int getPreco(){
		if(qtdIngredientes > 0 && qtdIngredientes < 3) {
			preco = 15;
		}
		else if(qtdIngredientes < 6){
			preco = 20;
		}
		else {
			preco = 23;
		}
		return preco;
	}
	
	 public static void imprimeIngredientesUtilizados() {
	        for (Map.Entry<String, Integer> entrada : ingredientesUsados.entrySet()) {
	            System.out.println(entrada.getKey() + ": " + entrada.getValue() + " unidades");
	        }
	    }
	
	public Pizza(String string){
	}
}
