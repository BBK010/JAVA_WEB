/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Bibek Kunwar
 */
import javax.swing.*;
public class CheckBox {
     CheckBox() {
        JFrame f = new JFrame("ABC");
        f.setSize(350,400);
        f.setVisible(true);
        f.setLayout(null);
        JLabel l = new JLabel("Select Course");
        l.setBounds(60, 80, 80, 20);
        JCheckBox cb1 = new JCheckBox("Java");
        cb1.setBounds(170,50,70,20);
        JCheckBox cb2 = new JCheckBox("C++");
        cb2.setBounds(170, 100,70,20);
        f.add(l);
        f.add(cb1);
        f.add(cb2);
    }
     public static void main(String[] args)
     {
         new CheckBox();
     }
    
}
