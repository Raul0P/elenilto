import java.util.Scanner;

public class LerDadosUsuarioString {
    public static String exec(String message){
        //ler dados
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        String response = scanner.nextLine();
        return response;
    }
}