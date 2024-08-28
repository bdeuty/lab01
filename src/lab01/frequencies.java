package lab01;

import java.util.Random;

public class frequencies
{
	public static void main(String[] args)
	{
		String dna = "";
		int AAA_count = 0;
		Random random = new Random();
		int y;
		
		for ( int x=0; x < 1000; x++)
		{
			dna="";
			for (int z=0; z<3; z++)
			{
				y=random.nextInt(4);
				if (y==0)
				{
					dna=dna+"A";
				}
				else if ( y == 1)
				{
					dna = dna + "T";
				}
				else if (y == 2)
				{
					dna = dna + "C";
				}
				else
				{
					dna = dna + "G";
				}
			}
			System.out.println(dna);
			if (dna.equals("AAA"))
			{
				AAA_count++;
			}
		}
		System.out.println("Expected AAA count: 15.5");
		System.out.println("Computer generated AAA count:"+AAA_count);
		
		//Modified frequencies
		AAA_count=0;
		for ( int x=0; x<1000;x++)
		{
			dna="";
			for ( int z = 0; z < 3; z++)
			{
				y=random.nextInt(100);
				if ( y < 12)
				{
					dna = dna + "A";
				}
				else if (y >= 12 && y < 50)
				{
					dna = dna + "C";
				}
				else if ( y >= 50 && y > 89)
				{
					dna = dna + "G";
				}
				else
				{
					dna = dna + "T";
				}
			}
			System.out.println(dna);
			if ( dna.equals("AAA")) 
			{
				AAA_count++;
			}
		}
		System.out.println("Expected AAA count: 1.7");
		System.out.println("Computer generated AAA count:"+AAA_count);
	}

}

