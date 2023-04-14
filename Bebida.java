import java.util.ArrayList;

public class Bebida {
    private static ArrayList<String> bebidas;
    private static ArrayList<Float> valor_bebida;


    public Bebida(ArrayList<String> sabores, ArrayList<Float> valorbebida){
        this.bebidas = bebidas;
        this.valor_bebida = valorbebida;
    }

    public void setBebidas(ArrayList<String> bebidas) {
        this.bebidas = bebidas;
    }
    
    public static void setValor_bebida(ArrayList<Float> valor_bebida) {
        Bebida.valor_bebida = valor_bebida;
    }

    public static ArrayList<String> getBebidas() {
        return bebidas;
    }

    public static ArrayList<Float> getValor_bebida() {
        return valor_bebida;
    }
}
