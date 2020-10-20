package com.test;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class SimpleGUE extends JFrame {
    // кнопка
    private JButton jButton = new JButton("Press");
    // панель для ввода текста
    private JTextField jTextField = new JTextField("", 5);
    // надписть в пенеле для текста
    private JLabel jLabel = new JLabel("Input:");
    // радио кнопка
    private JRadioButton jRadioButton1 = new JRadioButton("Select this");
    private JRadioButton jRadioButton2 = new JRadioButton("Select that");
    //
    private JCheckBox jCheckBox = new JCheckBox("Check", false);


    public SimpleGUE() {
        super("Simple Example");
        Gasket.setSimpleGUE(this);
        // устанавливаем размер формы
        this.setBounds(100, 100, 250, 100);
        // для выхода при закрытии формы
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // контейнер это форма куда можем помещать все наши поля и кнопки
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3, 2, 2, 2));
        container.add(jLabel);
        container.add(jTextField);
        // для того чтобы сгрупировать кнопки и тогда при нажатии одной уберается галочка с другой
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(jRadioButton1);
        buttonGroup.add(jRadioButton2);
        // далее и их добавляем в контейнер
        container.add(jRadioButton1);
        // на этой кнопке ставим галочку включения по умолчанию
        jRadioButton1.setSelected(true);
        container.add(jRadioButton2);
        container.add(jCheckBox);
        // добавляем возможность реагировать на назатие кнопки
        jButton.addActionListener(new BottenEventListener());
        container.add(jButton);
    }

    public JLabel getjLabel() {
        return jLabel;
    }

    public JRadioButton getjRadioButton1() {
        return jRadioButton1;
    }

    public JCheckBox getjCheckBox() {
        return jCheckBox;
    }
}
