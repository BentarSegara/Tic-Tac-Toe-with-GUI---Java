package guitools;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JTextField;

public class FormText extends JTextField{

    public FormText(){
        super();
    }

    public FormText(String text){
        this();
        this.setText(text);
    }

    public FormText(int x, int y, int width, int height){
        this();
        setBounds(x, y, width, height);
        setBorder(Color.BLACK, 1);
    }

    public FormText setEnable(boolean isEnable){
        setEnabled(isEnable);
        return this;
    }

    public FormText setPreferredSize(int width, int height){
        setPreferredSize(new Dimension(width, height));
        return this;
    }

    public FormText setBorder(Color color, int thickness){
        setBorder(BorderFactory.createLineBorder(color, thickness));
        return this;
    }

    public boolean isNull(){
        return (getText().trim().isEmpty());
    }

    public Component getComponent() {
        return this;
    }
}
