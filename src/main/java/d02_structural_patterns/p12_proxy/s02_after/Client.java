package d02_structural_patterns.p12_proxy.s02_after;

public class Client {

    public static void main(String[] args) {
        GameService gameService = new GameServiceProxy();
        gameService.startGame();
    }
}
