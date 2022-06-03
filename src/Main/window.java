package Main;

import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

public class window extends JFrame {
	private static final long serialVersionUID = 1L;
	public JLabel title, text;
	public JLabel label1, label2, label3;
	public JLabel label4, label5, label6;
	public JLabel label7, label8, label9;
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

		text = new JLabel("Human");
		text.setFont(new Font("Sans-Serif", Font.PLAIN, 20));
		text.setForeground(principal);
		text.setBounds(85, 85, 60, 25);
		this.add(text);

		text = new JLabel("Machine");
		text.setFont(new Font("Sans-Serif", Font.PLAIN, 20));
		text.setForeground(principal);
		text.setBounds(210, 85, 75, 25);
		this.add(text);

		matrixLabel();
	}

	public void matrixLabel() {
		label1 = new JLabel("", SwingConstants.CENTER);
		label1.setFont(new Font("Sans-Serif", Font.BOLD, 60));
		label1.setBackground(fondo2);
		label1.setBounds(45, 120, 120, 120);
		label1.setOpaque(true);
		this.add(label1);

		label2 = new JLabel("", SwingConstants.CENTER);
		label2.setFont(new Font("Sans-Serif", Font.BOLD, 60));
		label2.setBackground(fondo2);
		label2.setBounds(180, 120, 120, 120);
		label2.setOpaque(true);
		this.add(label2);

		label3 = new JLabel("", SwingConstants.CENTER);
		label3.setBackground(fondo2);
		label3.setBounds(315, 120, 120, 120);
		label3.setOpaque(true);
		this.add(label3);

		label4 = new JLabel("", SwingConstants.CENTER);
		label4.setBackground(fondo2);
		label4.setBounds(45, 255, 120, 120);
		label4.setOpaque(true);
		this.add(label4);

		label5 = new JLabel("", SwingConstants.CENTER);
		label5.setBackground(fondo2);
		label5.setBounds(180, 255, 120, 120);
		label5.setOpaque(true);
		this.add(label5);

		label6 = new JLabel("", SwingConstants.CENTER);
		label6.setBackground(fondo2);
		label6.setBounds(315, 255, 120, 120);
		label6.setOpaque(true);
		this.add(label6);

		label7 = new JLabel("", SwingConstants.CENTER);
		label7.setBackground(fondo2);
		label7.setBounds(45, 390, 120, 120);
		label7.setOpaque(true);
		this.add(label7);

		label8 = new JLabel("", SwingConstants.CENTER);
		label8.setBackground(fondo2);
		label8.setBounds(180, 390, 120, 120);
		label8.setOpaque(true);
		this.add(label8);

		label9 = new JLabel("", SwingConstants.CENTER);
		label9.setBackground(fondo2);
		label9.setBounds(315, 390, 120, 120);
		label9.setOpaque(true);
		this.add(label9);
	}
}
