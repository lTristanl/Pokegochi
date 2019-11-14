import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Select extends WindowAdapter implements ActionListener{

JFrame frame;
JPanel panel_select;
CheckboxGroup checkbox;
JCheckBox charmander, squirtle, bulbasaur;
GridLayout grid;
JPanelBackground back;

public Select(){
    
}

public void select(){
    frame = new JFrame("Pokegochi");
    panel_select = new JPanel();
    grid = new GridLayout(1,3);
    back =new JPanelBackground(".\\Image\\fondo\\landscape.png");

    charmander = new JCheckBox("Charmander",new ImageIcon(getClass().getResource("\\Image\\Charmander.png")),false);
    squirtle = new JCheckBox("Squirtle",new ImageIcon(getClass().getResource("\\Image\\Squirtle.png")),false);
    bulbasaur = new JCheckBox("Bulbasaur",new ImageIcon(getClass().getResource("\\Image\\Bulbasaur.png")),false);

    frame.add(back);
    //frame.add(back,BorderLayout.CENTER);
    frame.addWindowListener(this);
    frame.setLayout(new BorderLayout());
    back.setLayout(grid);
    frame.setContentPane(back);
    back.add(charmander);
    back.add(squirtle);
    back.add(bulbasaur);
    charmander.addActionListener(this); 
    squirtle.addActionListener(this); 
    bulbasaur.addActionListener(this); 
    
    charmander.setContentAreaFilled(false);
    charmander.setBorderPainted(false);
    squirtle.setContentAreaFilled(false);
    squirtle.setBorderPainted(false);
    bulbasaur.setContentAreaFilled(false);
    bulbasaur.setBorderPainted(false);
    frame.setVisible(true);
    frame.setSize(600,600);
    frame.setLocationRelativeTo(null);
    frame.setResizable(false);
}

public void actionPerformed (ActionEvent e){
     if(e.getSource().equals(charmander)){
        int answer = JOptionPane.showConfirmDialog(null,"¿Seleccionarás a Charmander?");
        if (answer ==JOptionPane.YES_OPTION){
        Charmander charmander = new Charmander();
        charmander.Start();
        }
    }
    if(e.getSource().equals(squirtle)){
        int answer = JOptionPane.showConfirmDialog(null,"¿Seleccionarás a Squirtle?");
        if (answer ==JOptionPane.YES_OPTION){
        Charmander charmander = new Charmander();
        charmander.Start(); 
        }
    }
    if(e.getSource().equals(bulbasaur)){
        int answer = JOptionPane.showConfirmDialog(null,"¿Seleccionarás a Bulbasaur?");
        if (answer ==JOptionPane.YES_OPTION){
        Charmander charmander = new Charmander();
        charmander.Start(); 
        }
    }

    }

    public class JPanelBackground extends JPanel {
        private Image background;
          public JPanelBackground(String imagePath){
             setBackground(imagePath);
          }
            public void paintComponent(Graphics g) {
              int width = this.getSize().width;
              int height = this.getSize().height;
              if (this.background != null) {
                g.drawImage(this.background, 0, 0, width, height, null);
              }
              super.paintComponent(g);
            }
        
            public void setBackground(String ruta) {
              this.setOpaque(false);
              this.background = new ImageIcon(ruta).getImage();
              repaint();
            }
           
          }
public void windowClosing (WindowEvent e){
    System.exit(0);
}

}