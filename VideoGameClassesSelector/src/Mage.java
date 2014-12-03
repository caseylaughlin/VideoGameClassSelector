public class Mage extends Range {
	public Mage()
	{
		name = "Mage";
		health = 40;
		Damage = 20;
		weapon = "Staff";
		companion = "Gremlin";
		
	}
	@Override
	public void whatIsItGoodFor()
	{
	System.out.println("The " + name + " is a vital role in supporting as it can heal other players but suffers in damage.");
	}
	public void getStats()
	{
		System.out.println("The " + name + " has " + health + " health out of 50, uses a " + weapon + " and does " + Damage + " damage out of 50. Also he can conjure a " + companion + " to aid in healing.");
	}

}