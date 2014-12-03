public class Assassin extends Combat{
	public Assassin()
	{
		name = "Assassin";
		health = 40;
		Damage = 40;
		weapon = "daggers";
		special = "turn invisible and deal 3X his base damage to unsespecting enemies";
	}
	@Override
	public void whatIsItGoodFor()
	{
	System.out.println("The " + name + " can stay in the shadows and deal killing blows to the enemy without them even knowing.");
	}
	public void getStats()
	{
		System.out.println("The " + name + " has " + health + " health out of 50, uses a " + weapon + " and does " + Damage + " damage out of 50. Also he can " + special + ".");
	}

}