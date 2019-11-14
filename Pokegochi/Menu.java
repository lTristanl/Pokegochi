import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;   
import javax.sound.sampled.*;

public class Menu extends WindowAdapter implements ActionListener{
   JButton start;
   JFrame  frame;
   JLabel lb;
   JPanelBackground back;
   public Menu(){
   }
   
   public void start(){
   frame = new JFrame ("Pokegochi");
   start = new JButton ("Start");
   lb = new JLabel ("POKEGOCHI", JLabel.CENTER);
   back =new JPanelBackground(".\\Image\\fondo\\landscape.png");
   frame.add(back);
   frame.setContentPane(back);
   frame.add(lb, BorderLayout.CENTER);
   back.add(start,BorderLayout.SOUTH);
   frame.addWindowListener(this);
   start.addActionListener(this); 
   start.setContentAreaFilled(false);
   start.setBorderPainted(false);
   frame.setVisible(true);
   frame.setSize(600,600);
   frame.setLocationRelativeTo(null);
   this.reproduce("Pokémon_Menu.wav"); 
   }

public void actionPerformed (ActionEvent e){
if (e.getSource().equals(start)){
    Select select = new Select();
    select.select();
}
}
  
public void reproduce(String tema){
    try {
       BufferedInputStream bis=new 
BufferedInputStream(getClass().getResourceAsStream("/Sounds/"+tema));
       AudioInputStream audioIn = AudioSystem.getAudioInputStream(bis);
       Clip clip = AudioSystem.getClip();
       clip.open(audioIn);
       clip.start();
    } catch (UnsupportedAudioFileException e) {
       System.out.println("Audio NO soportado");
    } catch (IOException e) {
       System.out.println("Error de E/S");
    } catch (LineUnavailableException e) {
       System.out.println("Linea No disponible");
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