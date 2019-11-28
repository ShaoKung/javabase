package com.yy;

/**
 * @program: javabase
 * @description: 加密解密
 * @author: Andy
 * @create: 2019-11-28 16:08
 **/

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Encrypt extends JFrame {
    private static final long serialVersionUID = 1L;
    private JLabel keyL = new JLabel("密钥");
    private JLabel encryptTextL = new JLabel("明文");
    private JLabel passwordL = new JLabel("密文");
    private JTextArea key = new JTextArea(1, 48);
    private JTextArea encryptText = new JTextArea(12, 50);
    private JTextArea password = new JTextArea(14, 50);
    private JButton ok = new JButton("加密");
    private JButton clear = new JButton("清空");
    private JButton cancel = new JButton("退出");

    public Encrypt() {
        super("加密工具");
        this.setSize(600, 730);
        this.setLayout(new BorderLayout());
        this.password.setEditable(false);
        this.setLocationRelativeTo((Component)null);
        this.setDefaultCloseOperation(3);
        FlowLayout f = new FlowLayout();
        this.setLayout(f);
        JPanel p1 = new JPanel();
        p1.setLayout(new BorderLayout());
        this.key.setLineWrap(true);
        this.key.setAutoscrolls(true);
        JScrollPane keyPane = new JScrollPane(this.key);
        p1.add(this.keyL, "North");
        p1.add(keyPane, "South");
        JPanel p2 = new JPanel();
        p2.setLayout(new BorderLayout());
        this.encryptText.setLineWrap(true);
        this.encryptText.setAutoscrolls(true);
        JScrollPane textPane = new JScrollPane(this.encryptText);
        textPane.setVerticalScrollBarPolicy(22);
        textPane.setPreferredSize(new Dimension(580, 265));
        p2.add(this.encryptTextL, "North");
        p2.add(textPane, "South");
        JPanel p3 = new JPanel();
        p3.add(this.ok);
        p3.add(this.clear);
        p3.add(this.cancel);
        JPanel p4 = new JPanel();
        p4.setLayout(new BorderLayout());
        this.password.setBackground(Color.pink);
        this.password.setLineWrap(true);
        JScrollPane textshowPane = new JScrollPane(this.password);
        textshowPane.setVerticalScrollBarPolicy(22);
        textshowPane.setPreferredSize(new Dimension(580, 265));
        p4.add(this.passwordL, "North");
        p4.add(textshowPane, "South");
        this.add(p1);
        this.add(p2);
        this.add(p3);
        this.add(p4);
        this.setResizable(false);
        this.cancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        this.clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Encrypt.this.encryptText.setText("");
                Encrypt.this.password.setText("");
            }
        });
        this.ok.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (Encrypt.this.key.getText().equals("")) {
                    JOptionPane.showMessageDialog((Component)null, "请输入密钥!");
                } else if (Encrypt.this.encryptText.getText().equals("")) {
                    JOptionPane.showMessageDialog((Component)null, "请输入明文!");
                } else {
                    try {
                        EncryptUtils encryptUtils = new EncryptUtils(Encrypt.this.key.getText());
                        String pwd = encryptUtils.encrypt(Encrypt.this.encryptText.getText());
                        Encrypt.this.password.setText(pwd);
                        Encrypt.this.password.setForeground(Color.blue);
                    } catch (Exception var4) {
                        JOptionPane.showMessageDialog((Component)null, "加密失败!");
                    }

                }
            }
        });
    }

    public static void main(String[] args) {
        Encrypt oop = new Encrypt();
        oop.setVisible(true);
        oop.setDefaultCloseOperation(3);
    }
}
