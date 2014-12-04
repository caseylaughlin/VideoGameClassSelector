
public class ClassRunner
	{

	public static void main(String[] args)
		{
		VideoGameClassSelector [] v = new VideoGameClassSelector[1];
		v[0] = new VideoGameClassSelector();
		VideoGameClassSelector[] vg = new VideoGameClassSelector[2];
		vg[0] = new Range();
		vg[1] = new Combat();
		Range [] r = new Range[2];
		r[0] = new Mage();
		r[1] = new Archer();
		Combat[] c = new Combat[2];
		c[0] = new Warrior();
		c[1] = new Assassin();

		
		for (int i = 0; i < v.length; i++)
			{	
			v[i].getAlphaClasses();
			v[i].getClasses();
			System.out.println();
		}
		for(int h = 0; h < vg.length; h++)
		{
			vg[h].whatIsItGoodFor();
			vg[h].useSpecial();
			System.out.println();
		}
		for ( int j = 0; j < r.length; j++)
		{
			r[j].whatIsItGoodFor();
			r[j].getStats();
			//r[j].doesPoison.ArcherPoison();
			VideoGameClassSelector.getSuper();
			System.out.println();
		}
		for(int c1 = 0; c1 < c.length; c1++)
		{
			c[c1].whatIsItGoodFor();
			c[c1].getStats();
			VideoGameClassSelector.getSuper();
			System.out.println();
			
		}

	}
	}
