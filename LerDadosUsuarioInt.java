import java.util.Scanner;

public class LerDadosUsuarioInt {

        public static int exec(String message){
            //ler dados
            Scanner scanner = new Scanner(System.in);
            System.out.println(message);
            int response = scanner.nextInt();
            return response;
        }
}
