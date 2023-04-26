public abstract class Pessoa {
     public String nome;
     public int numeroConta;

     /* CONSTRUTORES
      São objetos criados de forma automática para a
      instaciação de objetos da classe. Geralmente,
      o construtor VAZIO é o construtor que é criado
      automaticamente. PORÉM, podemos ter vários
      construtores ao mesmo tempo, na mesma classe.
    */
    // Construtor da Classe VAZIO
    public Pessoa () {}
    // Construtor da Classe CHEIO
    public Pessoa (String nome, int numeroConta){
        this.nome = nome;
        this.numeroConta = numeroConta;
    }
    public Pessoa (String nome) {
        this.nome = nome;
    }
}
