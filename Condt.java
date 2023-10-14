import java.util.*;
/**
	 * DECLARE TWO VARIABLES
	 * customerType = 'T' - Titanium , D - Diamond
	 * rewardPoint = 
	 * if rewardpoints > 10000 - 20% discount
	 * rewardpoints > 15000 - 30% discount
	 * you need to check if the customer is titanium 
	 * or diamond
	 * if titanium - cashback - 2%
	 * if diamond - cashback - 5%
	 */
class Condt
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		char custromer;
		int reward ;
		System.out.println("enter the custumer type");
		custromer=sc.next().charAt(0);
		System.out.println("enter the reward point");
		reward=sc.nextInt();
		if(reward>10000 && (custromer=='T'||custromer='D'))
		{
			if(reward > 10000)
			{

			}
		}

	}
}