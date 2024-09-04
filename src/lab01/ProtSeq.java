package lab01;

import java.util.Random;

public class ProtSeq 
{
	public static void main(String[] args)
	{
		//Redo of modified frequencies
		String dna = "";
		Random random = new Random();
		float f = random.nextFloat();
		int AAA_count = 0;
		char[] dnachar = {'A','C','G','T'};
		float ranges[] = new float[] {0.12f,0.50f,0.89f};
		
		for ( int x = 0; x < 1000; x++)
		{
			dna = "";
			for ( int y = 0; y < 3; y++)
			{
				
			}
			
			if (dna.equals("AAA"))
			{
				AAA_count++;
			}
		}
	}

}
