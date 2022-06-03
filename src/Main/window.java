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
	Color mainColor = new Color(168, 190, 201);
	Color background1 = new Color(25, 42, 50);
	Color background2 = new Color(31, 53, 64);
	Color primary = new Color(49, 196, 190);
	Color secondary = new Color(242, 178, 56);

	String turn = "x";
	JLabel[][] lb = new JLabel[3][3];

	public window() {
		super("Totito");
		this.setLayout(null);
		this.setSize(490, 700);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.getContentPane().setBackground(background1);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		title();
		matrixLabel();
	}

	public void title() {
		title = new JLabel("Totito");
		title.setFont(new Font("Sans-Serif", Font.BOLD, 30));
		title.setForeground(mainColor);
		title.setBounds(192, 50, 85, 25);
		this.add(title);

		text = new JLabel("x Player 1");
		text.setFont(new Font("Sans-Serif", Font.BOLD, 20));
		text.setForeground(primary);
		text.setBounds(45, 85, 100, 20);
		this.add(text);

		text = new JLabel("o Player 2");
		text.setFont(new Font("Sans-Serif", Font.BOLD, 20));
		text.setForeground(secondary);
		text.setBounds(180, 85, 100, 20);
		this.add(text);
	}

	public void matrixLabel() {
		label1 = new JLabel("", SwingConstants.CENTER);
		label1.setFont(new Font("Sans-Serif", Font.BOLD, 60));
		label1.setBackground(background2);
		label1.setBounds(45, 120, 120, 120);
		label1.setOpaque(true);
		label1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				label1Press(evt);
			}
		});
		this.add(label1);

		label2 = new JLabel("", SwingConstants.CENTER);
		label2.setFont(new Font("Sans-Serif", Font.BOLD, 60));
		label2.setBackground(background2);
		label2.setBounds(180, 120, 120, 120);
		label2.setOpaque(true);
		label2.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				label2Press(evt);
			}
		});
		this.add(label2);

		label3 = new JLabel("", SwingConstants.CENTER);
		label3.setFont(new Font("Sans-Serif", Font.BOLD, 60));
		label3.setBackground(background2);
		label3.setBounds(315, 120, 120, 120);
		label3.setOpaque(true);
		label3.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				label3Press(evt);
			}
		});
		this.add(label3);

		label4 = new JLabel("", SwingConstants.CENTER);
		label4.setFont(new Font("Sans-Serif", Font.BOLD, 60));
		label4.setBackground(background2);
		label4.setBounds(45, 255, 120, 120);
		label4.setOpaque(true);
		label4.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				label4Press(evt);
			}
		});
		this.add(label4);

		label5 = new JLabel("", SwingConstants.CENTER);
		label5.setFont(new Font("Sans-Serif", Font.BOLD, 60));
		label5.setBackground(background2);
		label5.setBounds(180, 255, 120, 120);
		label5.setOpaque(true);
		label5.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				label5Press(evt);
			}
		});
		this.add(label5);

		label6 = new JLabel("", SwingConstants.CENTER);
		label6.setFont(new Font("Sans-Serif", Font.BOLD, 60));
		label6.setBackground(background2);
		label6.setBounds(315, 255, 120, 120);
		label6.setOpaque(true);
		label6.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				label6Press(evt);
			}
		});
		this.add(label6);

		label7 = new JLabel("", SwingConstants.CENTER);
		label7.setFont(new Font("Sans-Serif", Font.BOLD, 60));
		label7.setBackground(background2);
		label7.setBounds(45, 390, 120, 120);
		label7.setOpaque(true);
		label7.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				label7Press(evt);
			}
		});
		this.add(label7);

		label8 = new JLabel("", SwingConstants.CENTER);
		label8.setFont(new Font("Sans-Serif", Font.BOLD, 60));
		label8.setBackground(background2);
		label8.setBounds(180, 390, 120, 120);
		label8.setOpaque(true);
		label8.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				label8Press(evt);
			}
		});
		this.add(label8);

		label9 = new JLabel("", SwingConstants.CENTER);
		label9.setFont(new Font("Sans-Serif", Font.BOLD, 60));
		label9.setBackground(background2);
		label9.setBounds(315, 390, 120, 120);
		label9.setOpaque(true);
		label9.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				label9Press(evt);
			}
		});
		this.add(label9);

		lb[0][0] = label1;
		lb[0][1] = label2;
		lb[0][2] = label3;
		lb[1][0] = label4;
		lb[1][1] = label5;
		lb[1][2] = label6;
		lb[2][0] = label7;
		lb[2][1] = label8;
		lb[2][2] = label9;
	}

	public void pressMatrix(int row, int column) {
		if (lb[row][column].getText().equals("")) {
			lb[row][column].setText(turn);
			if (turn.equals("x")) {
				lb[row][column].setForeground(primary);
			} else {
				lb[row][column].setForeground(secondary);
			}
			change();
		}
	}

	public void change() {
		if (turn.equals("x")) {
			turn = "o";
		} else {
			turn = "x";
		}
	}

	private void label1Press(java.awt.event.MouseEvent evt) {
		pressMatrix(0, 0);
	}

	private void label2Press(java.awt.event.MouseEvent evt) {
		pressMatrix(0, 1);
	}

	private void label3Press(java.awt.event.MouseEvent evt) {
		pressMatrix(0, 2);
	}

	private void label4Press(java.awt.event.MouseEvent evt) {
		pressMatrix(1, 0);
	}

	private void label5Press(java.awt.event.MouseEvent evt) {
		pressMatrix(1, 1);
	}

	private void label6Press(java.awt.event.MouseEvent evt) {
		pressMatrix(1, 2);
	}

	private void label7Press(java.awt.event.MouseEvent evt) {
		pressMatrix(2, 0);
	}

	private void label8Press(java.awt.event.MouseEvent evt) {
		pressMatrix(2, 1);
	}

	private void label9Press(java.awt.event.MouseEvent evt) {
		pressMatrix(2, 2);
	}
}
