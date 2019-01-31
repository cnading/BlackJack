
public class Character
	{
		private String name;
		private int level;
		private int money;
		private int experiencePoints;
		
		public Character (String name, int level, int money, int experiencePoints )
		{	
			this.name=name;
			this.level=level;
			this.money=money;
			this.experiencePoints=experiencePoints;
		}

		public String getName()
			{
				return name;
			}

		public void setName(String name)
			{
				this.name = name;
			}

		public int getLevel()
			{
				return level;
			}

		public void setLevel(int level)
			{
				this.level = level;
			}

		public int getMoney()
			{
				return money;
			}

		public void setMoney(int money)
			{
				this.money = money;
			}

		public int getExperiencePoints()
			{
				return experiencePoints;
			}

		public void setExperiencePoints(int experiencePoints)
			{
				this.experiencePoints = experiencePoints;
			}
 
}