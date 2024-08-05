/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Bibek Kunwar
 */
import javax.swing.*;
public class RadioButton {
    RadioButton(){
        JFrame f = new JFrame("ABC");
        f.setSize(350,400);
        f.setVisible(true);
        f.setLayout(null);
        JLabel l = new JLabel("Gender");
        l.setBounds(60, 80, 80, 20);
        JRadioButton rb1 = new JRadioButton("Male");
        rb1.setBounds(170,50,50,20);
        JRadioButton rb2 = new JRadioButton("Female");
        rb2.setBounds(170, 100, 40, 20);
        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        f.add(rb1);
        f.add(rb2);
        
    }
    public static void main(String[] args)
    {
        new RadioButton();
    }
}
