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
}
