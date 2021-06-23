/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_jframe2;

import javax.swing.*;
import java.awt.*;
import java.util.HashSet;
import java.util.Set;
import javax.swing.border.*;

/**
 *
 * @author JoanS
 */
public class Proyecto_Jframe2 extends JFrame{

    public Proyecto_Jframe2(){
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension screenSize= tk.getScreenSize();
        Border newborder = BorderFactory.createLineBorder(Color.white,3);
        ImageIcon icon = new ImageIcon("src/assets/check.png");
        ImageIcon icon2 = new ImageIcon("src/assets/uncheck.png");
        
        
        int width = screenSize.width;
        int height = screenSize.height;
        
        this.setBounds(width/3,height/5,450,450);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Menu");
        this.getContentPane().setBackground(Color.gray);
        this.setLayout(null);
        
        JLabel texto = new JLabel();
        
            texto.setText("Bienvenido al menu");
            texto.setForeground(Color.white);
            texto.setBounds(100, 50, 250, 40);
            texto.setHorizontalAlignment((int) CENTER_ALIGNMENT);
            texto.setFont(new Font("Arial Black",Font.BOLD,16));
         
        JButton btn = new JButton();
        
            btn.setBounds(175,100,100,50);
            btn.setText("boton");
            btn.setForeground(Color.white);
            btn.setBackground(Color.BLACK);
            btn.setFocusable(false);
            btn.setBorder(newborder);
            btn.setFont(new Font("Arial Black",Font.BOLD,12));
            
        JTextField itext= new JTextField();
        
            itext.setBounds(175,160,100,40);
            itext.setForeground(Color.white);
            itext.setBackground(Color.BLACK);
            itext.setText("escritura");
            itext.setEditable(false);
            itext.setBorder(newborder);
            itext.setFont(new Font("Arial Black",Font.BOLD,12));
            
            
        JCheckBox chb = new JCheckBox();
        
            chb.setBounds(175,200,100,40);
            chb.setText("rellenar");
            chb.setForeground(Color.white);
            chb.setBackground(Color.BLACK);
            chb.setFocusable(false);
            chb.setFont(new Font("Arial Black",Font.BOLD,12));
            chb.setBorder(newborder);
            //chb.setSelectedIcon(icon);
            //chb.setIcon(icon2);
            
            System.out.println(chb.isSelected());
            
        String[] st = {"maria","pablo","pedro"};
        JComboBox students = new JComboBox(st);
        
            students.setBounds(175,285,75,30);
            students.addItem("lucho");
            students.setForeground(Color.white);
            students.setBackground(Color.BLACK);
            students.setBorder(newborder);
            students.setFocusable(false);
            students.setSelectedIndex(1);
            students.removeItem("maria");
            System.out.println(students.getSelectedIndex());
            
        JRadioButton btn1= new JRadioButton();
        
            btn1.setText("boton 1");
            btn1.setBounds(50,240,100,40);
            btn1.setForeground(Color.white);
            btn1.setBackground(Color.BLACK);
           
        JRadioButton btn2= new JRadioButton();
        
            btn2.setText("boton 1");
            btn2.setBounds(150,240,100,40);
            btn2.setForeground(Color.white);
            btn2.setBackground(Color.BLACK);
        JRadioButton btn3= new JRadioButton();
        
            btn3.setText("boton 1");
            btn3.setBounds(250,240,100,40);
            btn3.setForeground(Color.white);
            btn3.setBackground(Color.BLACK);
        
        ButtonGroup grupo = new ButtonGroup();
        
            grupo.add(btn1);
            grupo.add(btn2);
            grupo.add(btn3);
            
            System.out.println(btn1.isSelected());
            
        JSlider slider = new JSlider(0,100,20);
        
            slider.setBounds(100,280,45,100);
            slider.setPaintTicks(true);
            slider.setMinorTickSpacing(5);
            slider.setMajorTickSpacing(25);
            slider.setPaintLabels(true);
            slider.setForeground(Color.white);
            slider.setBackground(Color.BLACK);
            slider.setOrientation(SwingConstants.VERTICAL);
            
            texto.setText("Bienvenido al menu  "+slider.getValue());
            System.out.print(slider.getValue());
            
        this.add(texto);
        this.add(btn);
        this.add(itext);
        this.add(chb);
        this.add(students);
        this.add(btn1);
        this.add(btn2);
        this.add(btn3);
        this.add(slider);
        
        
        
            
        
    }
    
}
