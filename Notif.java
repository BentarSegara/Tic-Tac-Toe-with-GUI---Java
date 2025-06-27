package components;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Notif extends JOptionPane{
    private String message;
    private ImageIcon icon;

    public Notif(String message, ImageIcon icon){
        this.message = message;
        this.icon = icon;
    }

    public Notif(String message, String URLicon){
        this.message = message;
        this.icon = new ImageIcon(URLicon);
    }

    public int showNotif(){
        return showOptionDialog(null, this.message, "Win Notif", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, this.icon, null, 0);
    }
    // public static void main(String[] args) {
    //     String[] option = {"Restart", "Stop"};
    //     int confirm = JOptionPane.showConfirmDialog(null, "You win, restart the game", "Player Win", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

    //     if (confirm == 0) System.out.println("Lets start the game");
    //     else if (confirm == 1) System.out.println("Game Over");
    // }
}
