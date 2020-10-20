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
    private JCheckBox jCheckBox = new JCheckBox("Check", false);

    public SimpleGUE() throws HeadlessException {
    }

}
