import java.util.StringTokenizer;

public class TwoDimArray {

	public static int[][] myArray;// global = {{1,2,3},{4,5,6},{7,8,9}};

	public static void main(String[] args) {
		myArray = fillArray(args[0]);
		printArray(myArray);
	}

	private static void printArray(int[][] theArray) {
		for (int i = 0; i < theArray.length; i++) {
			for (int j = 0; j < theArray[i].length; j++)
				display(theArray[i][j]);
			System.out.println();
		}
	}

	private static void display(int num) {
		if (num < 10)
			System.out.print(num + " ");
		else
			System.out.print(num + " ");
	}

	public static int[][] fillArray(String myFile) {
		TextFileInput in = new TextFileInput(myFile);
		String line = in.readLine();
		StringTokenizer myTokens = new StringTokenizer(line, ",");
		int row = Integer.parseInt(myTokens.nextToken());
		int col = Integer.parseInt(myTokens.nextToken());
		int[][] array = new int[row][col];
		
		for (int r = 0; r < row; r++) {
			line = in.readLine();
			myTokens = new StringTokenizer(line, ",");

			for (int c = 0; c < col; c++) {
				array[r][c] = Integer.parseInt(myTokens.nextToken());
			}
		}
		return array;
	}
}