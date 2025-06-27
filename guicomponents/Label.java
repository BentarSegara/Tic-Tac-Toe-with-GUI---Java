package guitools;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Label extends JLabel{
    public Label(){
        super();
    }

    public Label(String text){
        this();
        setText(text);
    }

    public Label(ImageIcon icon){
        super(icon);
    }

    public Label(String text, int x, int y, int width, int height){
        this(text);
        setBounds(x, y, width, height);
    }

    public Label(String text, int horizontalAlignment, int verticalAlignment){
        this(text);
        setHorizontalAlignment(horizontalAlignment);
        setVerticalAlignment(verticalAlignment);
    }

    public Label setColorText(Color color){
        setForeground(color);
        return this;
    }

    public Label setFont(String fontName, int style, int size){
        super.setFont(new Font(fontName, style, size));
        return this;
    }
    
    public Component getComponent() {
        return this;
    }
}
