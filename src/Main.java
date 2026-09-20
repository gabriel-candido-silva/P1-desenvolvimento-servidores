
void main() {
    System.out.println("Replicando o arco final da Saga freeza em Java");
    System.out.println("------------------------------------------------");
    DragonBall dragonBall = new DragonBall("Dragon ball z", "26 de abril de 1989", "Akira Toriyama", "Freeza", "Goku vs Freeza", 95);

    dragonBall.mostrarDados();
    System.out.println("------------------------------------");
    System.out.println("Criando personagens do episódio:" + dragonBall.getEpisodio());
    System.out.println("------------------------------------");
    Saiyajin Goku = new Saiyajin("Son Goku", "Saiyajin", 30, 1, "Super Saiyajin");

    Goku.mostrarDadosDoPersonagem();
    System.out.println("------------------------------------");
    Freeza Freeza = new Freeza("Freeza", "Raça Freeza", 30, 3, "Super Freeza");

    Freeza.mostrarDadosDoPersonagem();

    System.out.println("-----------------------------------------");
    System.out.println("Replicando a Luta de Goku contra Freeza");
    System.out.println("Iniciando transformações dos personagens");
    System.out.println("-----------------------------------------");

    Goku.transformar(1);
    Freeza.transformar();
    System.out.println("Fim da simulação!");
}