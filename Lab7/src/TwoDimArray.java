
public class TwoDimArray {

	public static int[][] myArray;// global = {{1,2,3},{4,5,6},{7,8,9}};

	public static void main(String[] args) {
		String fileName = args[0]; // file name
		myArray = fillArray(fileName);
		printArray(myArray);
		printArrayEven(myArray);
	}

	public static int[][] fillArray(String myFile) {
		TextFileInput in = new TextFileInput(myFile);
		int row = Integer.parseInt(in.readLine());
		int col = Integer.parseInt(in.readLine());
		int[][] array = new int[row][col];
		for (int r = 0; r < row; r++) {
			for (int c = 0; c < col; c++) {
				array[r][c] = Integer.parseInt(in.readLine());
			}
		}
		return array;

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
			System.out.print(num + "  ");
		else
			System.out.print(num + " ");
	}

	private static void printArrayEven(int[][] theArray) {
		for (int i = 0; i < theArray.length; i++) {
			for (int j = 0; j < theArray[i].length; j++) {
				if (theArray[i][j] % 2 == 0)
					display(theArray[i][j]);
				else
					System.out.print("* ");

			}
			System.out.println();

		}

	}
}