public class ValidarTipoBebida {
    public static Boolean exec(int escolhabebida) {
        if (escolhabebida == 1 || escolhabebida == 2 || escolhabebida == 3 || escolhabebida == 4 || escolhabebida == 5) {
            return true;
        }
        return false;
    }
}
