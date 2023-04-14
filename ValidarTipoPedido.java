public class ValidarTipoPedido {
    public static Boolean exec(int tipoDePedido) {
        if(tipoDePedido == 1 || tipoDePedido == 2 || tipoDePedido == 3){
            return true;
        }
        return false;
    }
}