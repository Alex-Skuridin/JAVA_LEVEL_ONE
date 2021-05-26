package dz8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyWindow extends JFrame {
    public MyWindow() {
//        setTitle("Test Window");
//        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        setBounds(300, 300, 400, 400);
//        JButton[] jbs = new JButton[5];
//        for (int i=0; i<jbs.length;i++){
//            jbs[i] = new JButton("# "+i);
//        }
//        setLayout(new BorderLayout());
//        add(jbs[0],BorderLayout.EAST);
//        add(jbs[1],BorderLayout.WEST);
//        add(jbs[2],BorderLayout.SOUTH);
//        add(jbs[3],BorderLayout.NORTH);
//        add(jbs[4],BorderLayout.CENTER);

//        JButton button = new JButton("Button 1 (PAGE_START)");
//        add(button, BorderLayout.PAGE_START);
//        button = new JButton("Button 2 (CENTER)");
//        button.setPreferredSize(new Dimension(200,100));
//        add(button,BorderLayout.CENTER);
//        button = new JButton("Button 3 (LINE_START)");
//        add(button,BorderLayout.LINE_START);
//        button = new JButton("Long-Named Button 4 (PAGE_END)");
//        add(button,BorderLayout.PAGE_END);
//        button = new JButton("5 (LINE_END)");
//        add(button,BorderLayout.LINE_END);


//        setBounds(500,500,550,300);
//        setTitle("BoxLayoutDemo");
//        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        JButton[] jbs = new JButton[10];
//        setLayout(new BoxLayout(getContentPane(),BoxLayout.X_AXIS));
//        setLayout(new BoxLayout(getContentPane(),BoxLayout.Y_AXIS));
//        for(int i = 0; i<jbs.length;i++){
//            jbs[i] = new JButton("# "+i);
//            jbs[i].setAlignmentX(CENTER_ALIGNMENT);
//            add(jbs[i]);
//        }


//        setBounds(500,500,400,300);
//        setTitle("FlowLayoutDemo");
//        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        JButton[] jbs = new JButton[10];
//        setLayout(new FlowLayout());
//        for(int i = 0; i<jbs.length;i++){
//            jbs[i] = new JButton("# "+i);
//            add(jbs[i]);
//        }

//        setBounds(300, 100, 400, 200);
//        setTitle("GridLayoutDemo");
//        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        JButton[] jbs = new JButton[10];
//        setLayout(new GridLayout(2, 5));
//        for (int i = 0; i < jbs.length; i++) {
//            jbs[i] = new JButton("# " + i);
//            add(jbs[i]);
//        }
//        jbs[0].addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("Button 0 pressed");
//            }
//        });
//
//        jbs[1].addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("Button 1 pressed");
//            }
//        });


//        setBounds(300, 100, 400, 200);
//        setTitle("Demo");
//        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        JTextField field = new JTextField();
//        add(field);
//        field.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("Your message"+field.getText());
//            }
//        });


        setBounds(300, 100, 400, 200);
        setTitle("Demo");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel pan = new JPanel();
        add(pan);
        pan.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println("MousePos:" + e.getX() + "  " + e.getY());
            }
        });

        setVisible(true);
    }

}
