public class Archer extends Range {
	public Archer()
	{
		name = "Archer";
		health = 45;
		weapon = "Bow";
		Damage = 35;
		companion = "wolf";
	}
	@Override
	public void whatIsItGoodFor()
	{
	System.out.println("The " + name + " is great for staying back and providong lots of cover damage.");
	}
	public void getStats()
	{
		System.out.println("The " + name + " has " + health + " health out of 50, uses a " + weapon + " and does " + Damage + " damage out of 50. Also she can summon a " + companion + " to help in the fight.");
	}

}
