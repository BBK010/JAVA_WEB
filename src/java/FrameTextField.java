/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Bibek Kunwar
 */
import javax.swing.*;
public class FrameTextField {
    FrameTextField(){
        JFrame f= new JFrame ("ABC");
        f.setSize(350,400);
        f.setVisible(true);
        f.setLayout(null);
        JLabel l = new JLabel ("Username");
        l.setBounds(50,50,90,20);
        JTextField t = new JTextField(20);
        t.setBounds(170,50,50,20);
        JButton b = new JButton("OK");
        b.setBounds(170, 100, 40, 20);
        f.add(l);
        f.add(t);
        f.add(b);
    }
    public static void main(String[] args)
    {
        new FrameTextField();
    }
}
