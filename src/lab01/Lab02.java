package lab01;

import java.util.Random;

public class Lab02 {
	public static String[] SHORT_NAMES = 
		{ "A","R", "N", "D", "C", "Q", "E", 
		"G",  "H", "I", "L", "K", "M", "F", 
		"P", "S", "T", "W", "Y", "V" };
	
	public static String[] FULL_NAMES = 
		{
		"alanine","arginine", "asparagine", 
		"aspartic acid", "cysteine",
		"glutamine",  "glutamic acid",
		"glycine" ,"histidine","isoleucine",
		"leucine",  "lysine", "methionine", 
		"phenylalanine", "proline", 
		"serine","threonine","tryptophan", 
		"tyrosine", "valine"};
	
	public static void main(String[] args)
	{
		Random random = new Random();
		int z = 1;
		long startTime = System.currentTimeMillis();
		long elapsedTime = 0L;
		int total = 0;
		while (z == 1 && elapsedTime < 30 * 1000) 
		{
			int y = random.nextInt(20);
			System.out.println("Type the one letter code of the amino acid:");
			System.out.println(FULL_NAMES[y]);
			String aString = System.console().readLine().toUpperCase();
			String aChar = ""+aString.charAt(0);
			if (aChar.equals(SHORT_NAMES[y]))
			{
				System.out.println("Correct!");
				elapsedTime = System.currentTimeMillis() - startTime;
				System.out.println("Elapsed time: " + elapsedTime/1000 + " seconds.");
				total++;
			}
			else 
			{
				System.out.println("Incorrect!");
				System.out.println("Correct answer: " + SHORT_NAMES[y]);
				System.out.println("Total score: " + total);
				z++;
			}
		}
	}
}
