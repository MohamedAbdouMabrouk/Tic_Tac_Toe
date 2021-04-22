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
        int row = Integer.parseInt(JOptionPane.showInputDialog(null, "please " + name + " enter the row number"));
        int column = Integer.parseInt(JOptionPane.showInputDialog(null, "please " + name + " enter the column number"));
        if(row > 6 || column > 7) {
            JOptionPane.showMessageDialog(null, "Out Of Range.....Try Again");
            move();
        }
        else
        if(Bored.spaceIsFree(row, column))
            Bored.updateBorad(letter, row, column);
        else {
            JOptionPane.showMessageDialog(null, "This is place is not free.....Try Again");
            move();
        }
    }
}


