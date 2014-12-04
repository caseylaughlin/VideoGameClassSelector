public class Warrior extends Combat{
	public Warrior()
	{
		health = 50;
		name = "Warrior";
		Damage = 45;
		weapon = "two handed braod sword";
		special = "smash the ground for an AOE effect dealing double his base damage";
		
		
	}
	@Override
	public void whatIsItGoodFor()
	{
	System.out.println("The " + name + " is extremley good at taking damage and dealing it aswell.");
	}
	public void getStats()
	{
		System.out.println("The " + name + " has " + health + " health out of 50, uses a " + weapon + " and does " + Damage + " damage out of 50. Also he can " + special + ".");
	}

}