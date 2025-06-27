package guitools;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;

public class Button extends JButton{

    public Button(){
        super();
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }

    public Button(String text){
        this();
        setText(text);
    }

    public Button(String text, int x, int y, int width, int height){
        this(text);
        setBounds(x, y, width, height);
    }

    public Button(String text, int horizontalAlignment, int verticalAlignment){
        this(text);
        setHorizontalAlignment(horizontalAlignment);
        setVerticalAlignment(verticalAlignment);
    }

    public Button setCommands(Runnable...commands){
        for (Runnable command : commands) addActionListener(e -> command.run());
        return this;
    }

    public Button setTransparant(boolean isTransparant){
        setBorderPainted(false);
        setContentAreaFilled(false);
        setFocusPainted(false);
        setOpaque(false);
        return this;
    }

    public Button setFont(String font, int style, int size){
        setFont(new Font(font, style, size));
        return this;
    }

    public Button setFontSize(float size){
        setFont(getFont().deriveFont(size));
        return this;
    }

    public Button setForeGround(Color color){
        setForeground(color);
        return this;
    }

    public Button setPreferredSize(int width, int height){
        super.setPreferredSize(new Dimension(width, height));
        return this;
    }

    public Component getComponent(){
        return this;
    }
}
