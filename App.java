import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tipo_pedido = 0;
        int tamanhoPizza = 0;
        int escolhapizza = 0;
        int escolhabebida = 0;
        // preciso ler os dados do usuario
        Welcome.exec();
        String name = LerDadosUsuarioString.exec("Digite seu nome:");
        String endereco = "";
        Usuario usuario = new Usuario(name, endereco);
        Boolean condition = true;
        while (condition) {
            tipo_pedido = LerDadosUsuarioInt.exec(
                    "POR FAVOR ESCOLHA UM MODELO DE PEDIDO\n\n-Digite (1) para La Carte\n\n-Digite (2) para Balcao\n\n-Digite (3) para Delivery\n\nSUA ESCOLHA:");
            Boolean response = ValidarTipoPedido.exec(tipo_pedido);
            if (response) {
                condition = false;
                switch (tipo_pedido) {
                    case 1:
                        System.out.println("Você escolheu: LA CARTE");
                        break;
                    case 2:
                        System.out.println("Você escolheu: BALCAO");
                        break;
                    case 3:
                        System.out.println("Você escolheu: DELIVERY");
                        endereco = LerDadosUsuarioString.exec("Para fins de entrega digite seu endereço abaixo:");
                        break;
                }
                break;
            }
            System.out.println("\n\nPor favor digite um valor válido\n\n");
        }

        ArrayList<Pizza> pizzas = new ArrayList<Pizza>();
        boolean adicionarpizza = true;
        //ArrayList<String> escolhasaboresdapizza = new ArrayList<>();
        while (adicionarpizza) {
            ArrayList<Float> valortotaldossabores = new ArrayList<>();
            ArrayList<String> escolhasaboresdapizza = new ArrayList<>();
            Pizza pizza = new Pizza(0, escolhasaboresdapizza, valortotaldossabores);
            condition = true;
            while (condition) {
                tamanhoPizza = LerDadosUsuarioInt.exec(
                        "ESCOLHA O TAMANHO DA PIZZA\n- Digite [1] PEQUENO\n- Digite [2] MEDIO\n- Digite [3] GRANDE\nSUA ESCOLHA:");
                Boolean response = ValidarTamanhoPizza.exec(tamanhoPizza);
                if (response) {
                    condition = false;
                    pizza.setTamanho(tamanhoPizza);
                    break;
                }
                System.out.println("\n\nPor favor digite um valor válido\n\n");
            }
            System.out.println("\nSegue abaixo o Cardapio das Pizzas:");
            for (int i = 0; i < CardapioPizza.pizzasabores.length; i++) {
                System.out.print("\n" + (i + 1) + " - " + (CardapioPizza.pizzasabores[i]) + "  R$"
                        + (CardapioPizza.pizzasvalores[i]));
            }
            int auxiliar = 0;
            while (tamanhoPizza > auxiliar) {
                condition = true;
                while (condition) {
                    escolhapizza = LerDadosUsuarioInt.exec("\nEscolha seu sabor numero "+(auxiliar+1)+" de "+tamanhoPizza+":");
                    escolhasaboresdapizza.add(CardapioPizza.pizzasabores[escolhapizza - 1]);
                    valortotaldossabores.add(CardapioPizza.pizzasvalores[escolhapizza - 1]);
                    auxiliar = auxiliar + 1;
                    Boolean response = ValidarTipoSaborPizza.exec(escolhapizza);
                    if (response) {
                        condition = false;
                        break;
                    }
                    for (int i = 0; i < CardapioPizza.pizzasabores.length; i++) {
                        System.out.print("\n" + (i + 1) + " - " + (CardapioPizza.pizzasabores[i]) + "  R$"
                                + (CardapioPizza.pizzasvalores[i]));
                    }
                    System.out.print("\n\nPor favor digite um valor válido");
                }
                
            }
            System.out.print("Deseja outra pizza? Digite (1) para SIM      Digite (2) para NAO ");
            pizzas.add(pizza);
            int adicionarpizzaint = scanner.nextInt();

            if (adicionarpizzaint == 2) {
                adicionarpizza = false;
            }
        }

        float somavalorespizzas = 0.0f;
        for (Float valor : Pizza.getValor_total_pizza()){
           somavalorespizzas +=  valor;
        }

        for (Pizza pizza : pizzas) {
            System.out.println("TAMANHO: " + pizza.getTamanho() + ", Sabor: " + pizza.getSabores() + ", Valor: "
                    + pizza.getValor_total_pizza());
        }

        ArrayList<Bebida> bebidas = new ArrayList<Bebida>();
        boolean adicionarbebida = true;
        while(adicionarbebida){
            ArrayList<Float> valorbebidas = new ArrayList<>();
            ArrayList<String> escolhabebidas = new ArrayList<>();
            Bebida bebida = new Bebida(escolhabebidas, valorbebidas);

            System.out.println("Segue abaixo o Cardapio das Bebidas:");
            for (int i = 0; i < CardapioBebidas.listabebidas.length; i++) {
                System.out.print("\n" + (i + 1) + " - " + (CardapioBebidas.listabebidas[i]) + "  R$"
                        + (CardapioBebidas.listavaloresbebidas[i]));
            }
            condition = true;
            while(condition){
                escolhabebida = LerDadosUsuarioInt.exec("\nEscolha sua bebida:");
                Boolean response = ValidarTipoBebida.exec(escolhabebida);
                if (response) {
                    condition = false;
                    escolhabebidas.add(CardapioBebidas.listabebidas[escolhabebida-1]);
                    valorbebidas.add(CardapioBebidas.listavaloresbebidas[escolhabebida-1]);
                    break;
                }
                System.out.println("\nPor favor digite um valor válido\n");
            }
            System.out.println("Deseja outra Bebida? Digite (1) para SIM      Digite (2) para NAO:");
            bebidas.add(bebida);
            int adicionarbebidas = scanner.nextInt();

            if (adicionarbebidas == 2) {
                adicionarbebida = false;
            }
        }

        for (Bebida bebida : bebidas) {
            System.out.println("Bebida: " + bebida.getBebidas() + ", Valor: " + bebida.getValor_bebida());
        }
        
    }
}
