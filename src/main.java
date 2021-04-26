import javax.swing.*;

public class main {

    public static void main(String arg[])
    {
        String firstPlayer = JOptionPane.showInputDialog(null, "First Player name:");
        String secondPlayer = JOptionPane.showInputDialog(null, "Second Player name:");
        Player X = new Player(firstPlayer, 'X');
        Player O = new Player(secondPlayer, 'O');
        System.out.println("Welcome to Tic Tac Toe!");
        int run = 0;
        while(run == 0)
        {
            Board.initBoard();
            Board.printBoard();
            while (!Board.isBoardFull())
            {
                if (!Turn.isWinner('O')) {
                    X.move();
                    Board.printBoard();
                } else {
                    JOptionPane.showMessageDialog(null, O.name + " won");
                    break;
                }
                if (!Turn.isWinner('X')) {
                    O.move();
                    Board.printBoard();
                } else {
                    JOptionPane.showMessageDialog(null, X.name + " won");
                    break;
                }
            }
            run = JOptionPane.showConfirmDialog(null, "Do you want to play again ?");
        }
    }
}
