public class Main {
    public static void main(String[] args) {
       
        Personagem personagem1 = new Personagem("Anita", "Guerreiro", 5, 100, 15.5); // Instacia a classe Personagem na criadção do personagem 1
        Personagem personagem2 = new Personagem("Hudson", "Mago", 4, 80, 12.5); // Instacia a classe Personagem na criadção do personagem 2

        personagem1.exibirStatus(); // exibe informações do personagem 1
        personagem2.exibirStatus(); // exibe informações do personagem 2

    }
}
