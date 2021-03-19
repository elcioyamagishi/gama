package exemplos.exemplo05;

public class Robo {
    private int x, y, maxX, maxY;  // restrito a classe Robo

    // construtor
    public Robo(int x, int y, int maxX, int maxY){
        setX(x);
        setY(y);
    }

    // metodos - fazem alguma acao
    public void norte() {
        y++;
    }

    public void sul() {
        y--;
    }

    public void leste() {
        x++;
    }

    public void oeste() {
        x--;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public void setY(int novoY) {
        if(novoY >= -maxY && novoY <= maxY){
            y = novoY;
        }
    }

    public void setX(int novoX) {  // o novoX é uma variavel local desse metodo
        if(novoX >= -maxX && novoX <= maxX){
            x = novoX;
        }
    }


}
