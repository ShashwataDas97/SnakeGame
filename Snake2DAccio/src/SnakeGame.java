import javax.swing.*;
public class SnakeGame extends JFrame {
    Board board;
    SnakeGame() {
        board = new Board();
        setTitle("Snake Game");
        add(board);
        pack();
        setResizable(false);
        setVisible(true);
    }
    public static void main(String[] args) {
        SnakeGame snakeGame = new SnakeGame();
    }
}