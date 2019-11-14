import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Squirtle{
JFrame frame;
public Charmander(){

}

public void Start(){
frame = new JFrame("Hello");
frame.setVisible(true);
frame.setSize(600,600);
frame.setLocationRelativeTo(null);
frame.setResizable(false);
System.out.println("Holis");
}
/*
public void paintComponent(Graphics g){
    Dimension tam=getSize();
    ImageIcon image = new ImageIcon(new ImageIcon(getClass().getResource(".\\Image\\Charmander.png").getImage()));
    g.drawImage(image.getImage(), 0, 0, tam.height,null);
    setOpaque(false);
    super.paintComponent(g);
}

private void initComponents(){
    
}
*/
}