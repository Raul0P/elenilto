public class ValidarTipoSaborPizza {
    public static Boolean exec(int escolhapizza) {
        if (escolhapizza == 1 || escolhapizza == 2 || escolhapizza == 3 || escolhapizza == 4 || escolhapizza == 5
                || escolhapizza == 6 || escolhapizza == 7 || escolhapizza == 8 || escolhapizza == 9
                || escolhapizza == 10 || escolhapizza == 11 || escolhapizza == 12 || escolhapizza == 13
                || escolhapizza == 14 || escolhapizza == 15 || escolhapizza == 16 || escolhapizza == 17
                || escolhapizza == 18 || escolhapizza == 19 || escolhapizza == 20) {
            return true;
        }
        return false;
    }
}
