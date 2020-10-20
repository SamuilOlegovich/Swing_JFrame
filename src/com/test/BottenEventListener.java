package com.test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BottenEventListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        String s = "";
        s += "Button was press\n";
        s += "Text is " + Gasket.getSimpleGUE().getjLabel().getText() + "\n";
        s += Gasket.getSimpleGUE().getjRadioButton1().isSelected() ?  "Radio #1 " : "Radio #2 ";
        s += "is selected!\n";
        s += "CheckBox is ";
        s += Gasket.getSimpleGUE().getjCheckBox().isSelected() ? "checked" : "unchecked";
        // Выводим новым окном новое сообщение
        JOptionPane.showMessageDialog(null, s, "Output", JOptionPane.PLAIN_MESSAGE);
    }
}
