package guitools;

import java.awt.Color;
import java.awt.Component;
import java.awt.LayoutManager;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class Frame extends JPanel{

    public Frame(LayoutManager layout){
        super();
        setLayout(layout);
    }


    public Frame(int x, int y, int width, int height, LayoutManager layout){
        this(layout);
        setBounds(x, y, width, height);
        setLayout(layout);
    }

    public Frame setBorder(Color color, int thickness){
        setBorder(BorderFactory.createLineBorder(color, thickness));
        return this;
    }

    public Frame setDisplay(boolean isDisplay){
        setVisible(isDisplay);
        return this;
    }

    public Frame addComponents(Component...components){
        for (Component component : components) add(component);
        return this;
    }

    public Frame setBackGround(Color background){
        super.setBackground(background);
        return this;
    }

    public void refresh(){
        revalidate();
        repaint();
    }

    public Component getComponent() {
        return this;
    }
}
