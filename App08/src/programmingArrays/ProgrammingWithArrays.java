package programmingArrays;

import javax.swing.JOptionPane;

public class ProgrammingWithArrays
{
	public ProgrammingWithArrays() // constructor
	{
		fiveIntegerArrayWithUserInput();

		sevenDoublesArrayDivideDoubles();

		the100StringArray();

		elementsOfTimesTableSeven();

		reverseInverseOddsEvens();

		acceptNameUntilTrailer();
	}

	public void acceptNameUntilTrailer() // accepts ten names into the array or until trailer is entered
	{
		String[] acceptName;
		int howManyStrings;
		howManyStrings = 10;

		acceptName = new String[howManyStrings];

		for (int numberOfInts = 0; numberOfInts < howManyStrings; numberOfInts++)
		{
			acceptName[numberOfInts] = JOptionPane.showInputDialog("Enter up to 10 Names:\nOr -99 to end the program ");

			if (acceptName[numberOfInts].equals("-99")) // trailer
			{
				break;
			}

		}

		for (int numberOfInts = 0; numberOfInts < howManyStrings; numberOfInts++)
		{
			if (acceptName[numberOfInts] != null) // allows for null to not be printed
			{

				if (!acceptName[numberOfInts].equals("-99")) // allows for -99 to not be printed
				{
					System.out.println(acceptName[numberOfInts]);
				}

			}
		}

		JOptionPane.showMessageDialog(null, "You ended the program or entered all ten names");
	}

	public void reverseInverseOddsEvens() // input 10 integers into array, prints in reverse, inverse, then even and odd
	{
		int[] tenIntegers;
		int howMany = 10;

		tenIntegers = new int[howMany];

		for (int numberOfInts = 0; numberOfInts < howMany; numberOfInts++)
		{
			tenIntegers[numberOfInts] = Integer.parseInt(JOptionPane.showInputDialog("Enter 10 numbers: " + "\nNumber: " + (numberOfInts + 1)));
			// System.out.println(tenIntegers[numberOfInts]);
		}

		reverseInverseMessage(); // message for user to understand what is happening

		for (int numberOfInts = tenIntegers.length - 1; numberOfInts >= 0; numberOfInts--)
		{
			System.out.println(tenIntegers[numberOfInts]);
		}

		System.out.println();

		for (int numberOfInts = 0; numberOfInts < howMany; numberOfInts++)
		{
			System.out.println(tenIntegers[numberOfInts]);
		}

		System.out.println();

		for (int numberOfInts = 0; numberOfInts < tenIntegers.length; numberOfInts++) // prints odd numbers
		{

			if (tenIntegers[numberOfInts] % 2 != 0)
			{
				System.out.println(tenIntegers[numberOfInts] + " is odd.");
			}

		}

		System.out.println();

		for (int numberOfInts = 0; numberOfInts < tenIntegers.length; numberOfInts++) // prints even numbers
		{

			if (tenIntegers[numberOfInts] % 2 == 0)
			{
				System.out.println(tenIntegers[numberOfInts] + " is even.");
			}

		}
	}

	public void reverseInverseMessage()
	{
		JOptionPane.showMessageDialog(null,	"Now the program will print the numbers in reverse order from what they were entered, then inverse, then will diplay which is even or odd.");
	}

	public void elementsOfTimesTableSeven() // takes multiples of 7 from 0 to ten and prints out if even or odd
	{
		int[] timesSeven = { 0, 7, 14, 21, 28, 35, 42, 49, 56, 63, 70 };

		timesSevenMessage(); // message for the user

		for (int i = 0; i < timesSeven.length; i++)
		{

			if (timesSeven[i] % 2 != 0)
			{
				System.out.println(timesSeven[i] + " is odd.");
			}

		}

		System.out.println();

		for (int i = 0; i < timesSeven.length; i++)
		{

			if (timesSeven[i] % 2 == 0)
			{
				System.out.println(timesSeven[i] + " is even.");
			}

		}

		JOptionPane.showMessageDialog(null, "The program has ended");
	}

	public void timesSevenMessage()
	{
		JOptionPane.showMessageDialog(null, "This program takes multiples of 7 and displays if they are even or odd");
	}

	public void the100StringArray() // allows for 100 strings into the array with trailer of -99
	{
		String[] oneHundredStrings;
		oneHundredStrings = null;
		int howManyStrings = 100;

		oneHundredStrings = new String[howManyStrings];

		for (int numberOfStrings = 0; numberOfStrings < howManyStrings; numberOfStrings++)
		{
			oneHundredStrings[numberOfStrings] = JOptionPane
					.showInputDialog("Enter up to 100 strings:\nOr -99 to end the program ");

			if (oneHundredStrings[numberOfStrings].equals("-99"))
			{
				break;
			}

		}
		for (int numberOfStrings = 0; numberOfStrings < howManyStrings; numberOfStrings++)
		{
			if (oneHundredStrings[numberOfStrings] != null)
			{

				if (!oneHundredStrings[numberOfStrings].equals("-99"))
				{
					System.out.println(oneHundredStrings[numberOfStrings]);
				}

			}

		}

		JOptionPane.showMessageDialog(null, "You ended the program by entering \"-99\" or by entering 100 strings");

	}

	public void sevenDoublesArrayDivideDoubles() // method for entering 7 doubles, divide them by 2, then display the
													// array
	{
		double[] sevenDoubles;
		int userInput = 7;
		double dividedByTwo;

		sevenDoubles = new double[(int) userInput];

		for (int i = 0; i < userInput; i++) // loop for user input
		{
			sevenDoubles[(int) i] = Double.parseDouble(JOptionPane.showInputDialog("Enter 7 doubles: " + "\nDouble number " + (i + 1)));
		}

		for (int i = 0; i < userInput; i++) // loop for displaying double divided by two
		{
			dividedByTwo = sevenDoubles[(int) i] / 2;

			System.out.println("Double " + sevenDoubles[(int) i] + " divided by 2 = " + dividedByTwo);
		}

		for (int i = 0; i < userInput; i++) // loop for displaying the array
		{
			System.out.println("Doubles entered into the sevenDoubles array: " + sevenDoubles[(int) i]);
		}

		JOptionPane.showMessageDialog(null, "You ended the program by entering all 7 doubles");
	}

	public void fiveIntegerArrayWithUserInput() // method for user to input and print five integers
	{
		int[] fiveIntegers;

		int userInput = 5;

		fiveIntegers = new int[userInput];

		for (int i = 0; i < userInput; i++)
		{
			fiveIntegers[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter 5 Numbers into an array: " + "\nNumber " + (i + 1)));
		}

		for (int i = 0; i < userInput; i++)
		{
			System.out.println(fiveIntegers[i]);
		}

		JOptionPane.showMessageDialog(null, "You ended the program by entering all 5 numbers");
	}

}
