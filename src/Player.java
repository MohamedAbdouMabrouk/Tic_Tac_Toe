import javax.swing.*;

public class Player
{
    public String name;
    public char letter;
    public Player(String name, char letter)
    {
        this.name = name;
        this.letter = letter;
    }
    public void move()
    {
        String row1 = JOptionPane.showInputDialog(null, "please " + name + " enter the row number");
        String column1 = JOptionPane.showInputDialog(null, "please " + name + " enter the column number");
        int row;
        int column;
        try {
            row = Integer.parseInt(row1);
            column = Integer.parseInt(column1);
        }
        catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "WRONG INPUT");
            move();
            return;
        }
        if(row > 6 || column > 7) {
            JOptionPane.showMessageDialog(null, "Out Of Range.....Try Again");
            move();
        }
        else
        if(Board.spaceIsFree(row, column))
            Board.updateBoard(letter, row, column);
        else {
            JOptionPane.showMessageDialog(null, "This is place is not free.....Try Again");
            move();
        }
    }
}


