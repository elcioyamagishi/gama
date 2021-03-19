package exemplos.exemplo05;

public class AppRobo {
    public static void main(String[] args) {
        Robo robo = new Robo(155,6,80,80);
        System.out.println("Posicao Atual: " + robo.getX() + "," + robo.getY());
        robo.norte();
        robo.leste();
        System.out.println("Posicao Atual: " + robo.getX() + "," + robo.getY());

        
    }
    
}
