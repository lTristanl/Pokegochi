import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.filechooser.*;
import java.io.*;   

public class Menu extends WindowAdapter implements ActionListener{
JLabel lab;
JButton start;
JFrame  frame;
JPanel panel;

public Menu(){
 
}
public void start(){
frame = new JFrame ("Pokegochi");
 start = new JButton ("Start");
 panel = new JPanel();
 lab = new JLabel("POKEGOCHI");
frame.add(panel, BorderLayout.SOUTH);
frame.add(lab,BorderLayout.CENTER);
panel.add(start);
start.addActionListener(this); 
start.setContentAreaFilled(false);
start.setBorderPainted(false);
frame.setVisible(true);
frame.setSize(600,600);
frame.setLocationRelativeTo(null);


}
public void actionPerformed (ActionEvent e){
if (e.getSource().equals(start)){
    Select select = new Select();
    select.select();
}
}
public void windowClosing (WindowEvent e){
    System.exit(0);
}
}