import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Objeto criado com base no construtor VAZIO
        Pessoa p = new Pessoa ();
        //Objeto criado com o construtor totalmente CHEIO
        Pessoa m = new Pessoa("Anderson", 123);
        //Objeto criado com o construtor com o atributo NOME
        Pessoa n = new Pessoa ("Anderson");

        ClienteComum c = new ClienteComum("Anderson",123, 4000);




        }
    }
