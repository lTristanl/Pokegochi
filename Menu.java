import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.filechooser.*;
import java.io.*;   

public class Menu{
JLabel lab;
JButton start;
JFrame  frame;
JPanel panel;

public Menu(){
 frame = new JFrame ("Pokegochi");
 start = new JButton ("Start");
 panel = new JPanel();
 lab = new JLabel("POKEGOCHI");

frame.add(panel, BorderLayout.SOUTH);
frame.add(lab,BorderLayout.CENTER);
panel.add(start);

frame.setVisible(true);
frame.setSize(600,600);

}
public void menu(){




}

public static void main(String args[]){
Menu obj=new Menu();



}
}