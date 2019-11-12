import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.filechooser.*;
import java.io.*;   
public class Menu{
JButton start;
JFrame  frame;

public Menu(){
 frame = new JFrame ("Pokegochi");
 start = new JButton ("Start");

frame.add(start);
}

public void menu(){



frame.setVisible(true);
frame.setSize(600,600);
}





}