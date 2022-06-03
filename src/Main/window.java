package Main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.*;

public class window extends JFrame {
	private static final long serialVersionUID = 1L;
	public JLabel title, text;
	public JPanel panel1, panel2, panel3;
	public JPanel panel4, panel5, panel6;
	public JPanel panel7, panel8, panel9;
	public JLabel imagen1, imagen2;
	Color principal = new Color(168, 190, 201);
	Color fondo1 = new Color(25, 42, 50);
	Color fondo2 = new Color(31, 53, 64);

	JPanel[] table = new JPanel[9];

	public window() {
		super("Totito");
		this.setLayout(null);
		this.setSize(490, 700);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.getContentPane().setBackground(fondo1);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		title = new JLabel("Totito");
		title.setFont(new Font("Sans-Serif", Font.PLAIN, 30));
		title.setForeground(principal);
		title.setBounds(192, 50, 75, 25);
		this.add(title);

		imagen1 = new JLabel();
		imagen1.setBounds(45, 75, 40, 40);
		ImageIcon img1 = new ImageIcon("img/1.png");
		Icon icono1 = new ImageIcon(
				img1.getImage().getScaledInstance(imagen1.getWidth(), imagen1.getHeight(), Image.SCALE_DEFAULT));
		imagen1.setIcon(icono1);
		this.add(imagen1);

		text = new JLabel("Human");
		text.setFont(new Font("Sans-Serif", Font.PLAIN, 20));
		text.setForeground(principal);
		text.setBounds(85, 85, 60, 25);
		this.add(text);

		imagen2 = new JLabel();
		imagen2.setBounds(170, 75, 40, 40);
		ImageIcon img2 = new ImageIcon("img/0.png");
		Icon icono2 = new ImageIcon(
				img2.getImage().getScaledInstance(imagen2.getWidth(), imagen2.getHeight(), Image.SCALE_DEFAULT));
		imagen2.setIcon(icono2);
		this.add(imagen2);

		text = new JLabel("Machine");
		text.setFont(new Font("Sans-Serif", Font.PLAIN, 20));
		text.setForeground(principal);
		text.setBounds(210, 85, 75, 25);
		this.add(text);

		panel1 = new RoundedPanel(30);
		panel1.setBackground(fondo2);
		panel1.setBounds(45, 120, 120, 120);
		panel1.setOpaque(false);
		this.add(panel1);

		panel2 = new RoundedPanel(30);
		panel2.setBackground(fondo2);
		panel2.setBounds(180, 120, 120, 120);
		panel2.setOpaque(false);
		this.add(panel2);

		panel3 = new RoundedPanel(30);
		panel3.setBackground(fondo2);
		panel3.setBounds(315, 120, 120, 120);
		panel3.setOpaque(false);
		this.add(panel3);

		panel4 = new RoundedPanel(30);
		panel4.setBackground(fondo2);
		panel4.setBounds(45, 255, 120, 120);
		panel4.setOpaque(false);
		this.add(panel4);

		panel5 = new RoundedPanel(30);
		panel5.setBackground(fondo2);
		panel5.setBounds(180, 255, 120, 120);
		panel5.setOpaque(false);
		this.add(panel5);

		panel6 = new RoundedPanel(30);
		panel6.setBackground(fondo2);
		panel6.setBounds(315, 255, 120, 120);
		panel6.setOpaque(false);
		this.add(panel6);

		panel7 = new RoundedPanel(30);
		panel7.setBackground(fondo2);
		panel7.setBounds(45, 390, 120, 120);
		panel7.setOpaque(false);
		this.add(panel7);

		panel8 = new RoundedPanel(30);
		panel8.setBackground(fondo2);
		panel8.setBounds(180, 390, 120, 120);
		panel8.setOpaque(false);
		this.add(panel8);

		panel9 = new RoundedPanel(30);
		panel9.setBackground(fondo2);
		panel9.setBounds(315, 390, 120, 120);
		panel9.setOpaque(false);
		this.add(panel9);

		imagen1 = new JLabel();
		imagen1.setBounds(0, 0, 120, 120);
		img1 = new ImageIcon("img/1.png");
		icono1 = new ImageIcon(
				img1.getImage().getScaledInstance(imagen1.getWidth(), imagen1.getHeight(), Image.SCALE_DEFAULT));
		imagen1.setIcon(icono1);
		panel1.add(imagen1);

		imagen2 = new JLabel();
		imagen2.setBounds(0, 0, 120, 120);
		img2 = new ImageIcon("img/0.png");
		icono2 = new ImageIcon(
				img2.getImage().getScaledInstance(imagen2.getWidth(), imagen2.getHeight(), Image.SCALE_DEFAULT));
		imagen2.setIcon(icono2);
		panel2.add(imagen2);

		table[0] = panel1;
		table[1] = panel2;
		table[2] = panel3;
		table[3] = panel4;
		table[4] = panel5;
		table[5] = panel6;
		table[6] = panel7;
		table[7] = panel8;
		table[8] = panel9;
	}
}
