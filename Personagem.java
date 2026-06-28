public class Personagem {
   
    // Atrubutos da classe Personagem
    String nome;
    String classe;
    int nivel;
    int pontosDeVida;
    double poderBase;

    // Construtor para inicialização dos atrubutos
    public Personagem (String nome, String classe, int nivel, int pontosDeVida, double poderBase) {
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.pontosDeVida = pontosDeVida;
        this.poderBase = poderBase;
    };

        // Método que vai exibir informações dos personagens na classe Mais
    public void exibirStatus (){
            System.out.println("Nome: " + nome + "\n" + "Classe: " + classe + "\n" + "Nível: " + nivel + "\n" + "Pontos de Vida: " + pontosDeVida + "\n" + "Poder Base: " + poderBase + "\n");


    };
}

