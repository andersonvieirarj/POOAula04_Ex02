public class Main2 {
    public static void main(String[] args) {
        Pessoa p = new Pessoa ();
        Pessoa n = new Pessoa ("Anderson", 123,4000);
        // Os objetos acima não puderam ser instanciados
        // porque marcamos a classe Pessoa como
        // abstract, ou seja, é uma classe abstrata
        // que jamais poderá gerar objetos

        ClienteComum c = new ClienteComum();
        // O uso dos atributos e métodos da classe mãe
        // ficam disponíveis quando eu instancio um
        // objeto da sua classe filha
        c.nome = "Anderson";
    }
}
