import java.util.ArrayList;

public class Pizza {
    private int tamanho;
    private ArrayList<String> sabores;
    private static ArrayList<Float> valor_total_pizza;



    public Pizza(int tamanho, ArrayList<String> sabores, ArrayList<Float> valortotal){
        this.tamanho = tamanho;
        this.sabores = sabores;
        Pizza.valor_total_pizza = valortotal;
    }

    public ArrayList<String> getSabores() {
        return sabores;
    }

    public int getTamanho() {
        return tamanho;
    }

    public static ArrayList<Float> getValor_total_pizza() {
        return valor_total_pizza;
    }

    public void setSabores(ArrayList<String> sabores) {
        this.sabores = sabores;
    }
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void setValor_total_pizza(ArrayList<Float> valor_total_pizza) {
        Pizza.valor_total_pizza = valor_total_pizza;
    }
}


