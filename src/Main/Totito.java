package Main;

public class Totito {

	public static void main(String[] args) {
		
		String [][] game = {
				{" 1 "," 0 "," 0 "},
				{" 1 "," 1 "," 0 "},
				{" 0 ","   "," 1 "}};
		
		Tablero tb = new Tablero();
		//tb.print(tb.startBoard());
		tb.winRow(game);
		//tb.winColumn(game);
	}

}
