
public class ClassRunner
	{

	public static void main(String[] args)
		{
		VideoGameClassSelector [] v = new VideoGameClassSelector[6];
		v[0] = new Range();
		v[1] = new Combat();
		v[2] = new Archer();
		v[3] = new Mage();
		v[4] = new Warrior();
		v[5] = new Assassin();
		
		for (int i = 0; i < v.length; i++)
			{	
			v[i].getAlphaClasses();
			v[i].getClasses();
			v[i].whatIsItGoodFor();
			v[i].
			System.out.println();

		}

	}
	}
