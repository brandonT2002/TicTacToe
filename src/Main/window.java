package Main;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

public class window extends JFrame {
	private static final long serialVersionUID = 1L;
	public JLabel player1, player2, ties, turnOf, resetBoard;
	Color mainColor = new Color(168, 190, 201);
	Color background1 = new Color(25, 42, 50);
	Color background2 = new Color(31, 53, 64);
	Color primary = new Color(49, 196, 190);
	Color secondary = new Color(242, 178, 56);
	public JPanel temporal;

	String turn = "x";
	JLabel[][] lb = new JLabel[3][3];
	int p1 = 0;
	int p2 = 0;

	public window() {
		super("Totito");
		this.setLayout(null);
		this.setSize(500, 700);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		temporal = matrixPanel();
		this.setContentPane(temporal);
		this.getContentPane().setBackground(background1);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		head();
		resetTurn();
		gameData();
	}

	public void head() {
		player1 = new JLabel("x");
		player1.setFont(new Font("Sans-Serif", Font.BOLD, 40));
		player1.setForeground(primary);
		player1.setBounds(45, 70, 30, 35);
		this.add(player1);

		player2 = new JLabel("o");
		player2.setFont(new Font("Sans-Serif", Font.BOLD, 40));
		player2.setForeground(secondary);
		player2.setBounds(70, 70, 30, 35);
		this.add(player2);

		resetBoard = new JLabel("⭮", SwingConstants.CENTER);
		resetBoard.setFont(new Font("Sans-Serif", Font.BOLD, 25));
		resetBoard.setBackground(mainColor);
		resetBoard.setForeground(background1);
		resetBoard.setBounds(400, 73, 35, 35);
		resetBoard.setOpaque(true);
		resetBoard.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				resetBPress(evt);
			}
		});
		this.add(resetBoard);
	}

	public JPanel matrixPanel() {
		JPanel tablero = new JPanel();
		tablero.setLayout(null);
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				tablero.add(new Panel(i, j));
			}
		}
		return tablero;
	}

	public void gameData() {
		player1 = new JLabel("", SwingConstants.CENTER);
		player1.setFont(new Font("Sans-Serif", Font.PLAIN, 20));
		player1.setText("<html><center>x Player1<br>" + p1 + "</center></html>");
		player1.setBackground(primary);
		player1.setForeground(background1);
		player1.setBounds(45, 525, 120, 50);
		player1.setOpaque(true);
		this.add(player1);

		ties = new JLabel("Ties", SwingConstants.CENTER);
		ties.setFont(new Font("Sans-Serif", Font.PLAIN, 20));
		ties.setBackground(mainColor);
		ties.setForeground(background1);
		ties.setBounds(180, 525, 120, 50);
		ties.setOpaque(true);
		this.add(ties);

		player2 = new JLabel("", SwingConstants.CENTER);
		player2.setFont(new Font("Sans-Serif", Font.PLAIN, 20));
		player2.setText("<html><center>o Player2<br>" + p2 + "</center></html>");
		player2.setBackground(secondary);
		player2.setForeground(background1);
		player2.setBounds(315, 525, 120, 50);
		player2.setOpaque(true);
		this.add(player2);
	}

	public void resetTurn() {
		turnOf = new JLabel(turn + " Turn", SwingConstants.CENTER);
		turnOf.setFont(new Font("Sans-Serif", Font.BOLD, 25));
		turnOf.setBackground(background2);
		turnOf.setForeground(mainColor);
		turnOf.setBounds(180, 73, 120, 35);
		turnOf.setOpaque(true);
		this.add(turnOf);
	}

	public void updateTurn() {
		this.remove(turnOf);
		this.revalidate();
		this.repaint();
		resetTurn();
	}

	public void updateData() {
		this.remove(player1);
		this.remove(player2);
		this.remove(ties);
		this.revalidate();
		this.repaint();
		gameData();
	}

	public void reset() {
		for (int i = 0; i < lb.length; i++) {
			for (int j = 0; j < lb[i].length; j++) {
				lb[i][j].setText("");
			}
		}
	}

	public void pressMatrix(int row, int column) {
		if (lb[row][column].getText().equals("")) {
			lb[row][column].setText(turn);
			if (turn.equals("x")) {
				lb[row][column].setForeground(primary);
			} else {
				lb[row][column].setForeground(secondary);
			}
			if (winRow(lb) || winColumn(lb) || winDiagonal(lb)) {
				JOptionPane.showMessageDialog(null, "!Ha ganado " + turn + "!");
				reset();
				updateData();
			} else {
				change();
			}
		}
	}

	public void change() {
		if (turn.equals("x")) {
			turn = "o";
		} else {
			turn = "x";
		}
	}

	public boolean winRow(JLabel[][] matrix) {
		for (int i = 0; i < 3; i++) {
			if (matrix[i][0].getText().equals("x") && matrix[i][1].getText().equals("x")
					&& matrix[i][2].getText().equals("x")) {
				p1++;
				return true;
			} else if (matrix[i][0].getText().equals("o") && matrix[i][1].getText().equals("o")
					&& matrix[i][2].getText().equals("o")) {
				p2++;
				return true;
			}
		}
		return false;
	}

	public boolean winColumn(JLabel[][] matrix) {
		for (int i = 0; i < 3; i++) {
			if (matrix[0][i].getText().equals("x") && matrix[1][i].getText().equals("x")
					&& matrix[2][i].getText().equals("x")) {
				p1++;
				return true;
			} else if (matrix[0][i].getText().equals("o") && matrix[1][i].getText().equals("o")
					&& matrix[2][i].getText().equals("o")) {
				p2++;
				return true;
			}
		}
		return false;
	}

	public boolean winDiagonal(JLabel[][] matrix) {
		if (matrix[0][0].getText().equals("x") && matrix[1][1].getText().equals("x")
				&& matrix[2][2].getText().equals("x")) {
			p1++;
			return true;
		} else if (matrix[0][0].getText().equals("o") && matrix[1][1].getText().equals("o")
				&& matrix[2][2].getText().equals("o")) {
			p2++;
			return true;
		} else if (matrix[0][2].getText().equals("x") && matrix[1][1].getText().equals("x")
				&& matrix[2][0].getText().equals("x")) {
			p1++;
			return true;
		} else if (matrix[0][2].getText().equals("o") && matrix[1][1].getText().equals("o")
				&& matrix[2][0].getText().equals("o")) {
			p2++;
			return true;
		}
		return false;
	}

	private void label1Press(java.awt.event.MouseEvent evt) {
		pressMatrix(0, 0);
		updateTurn();
	}

	private void label2Press(java.awt.event.MouseEvent evt) {
		pressMatrix(0, 1);
		updateTurn();
	}

	private void label3Press(java.awt.event.MouseEvent evt) {
		pressMatrix(0, 2);
		updateTurn();
	}

	private void label4Press(java.awt.event.MouseEvent evt) {
		pressMatrix(1, 0);
		updateTurn();
	}

	private void label5Press(java.awt.event.MouseEvent evt) {
		pressMatrix(1, 1);
		updateTurn();
	}

	private void label6Press(java.awt.event.MouseEvent evt) {
		pressMatrix(1, 2);
		updateTurn();
	}

	private void label7Press(java.awt.event.MouseEvent evt) {
		pressMatrix(2, 0);
		updateTurn();
	}

	private void label8Press(java.awt.event.MouseEvent evt) {
		pressMatrix(2, 1);
		updateTurn();
	}

	private void label9Press(java.awt.event.MouseEvent evt) {
		pressMatrix(2, 2);
		updateTurn();
	}

	private void resetBPress(java.awt.event.MouseEvent evt) {
		reset();
		updateTurn();
	}
}
