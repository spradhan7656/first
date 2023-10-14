class ToStrings
{
	double width;
	double height;
	double depth;

	ToStrings(double w,double h,double d)
	{
		width=w; height=h; depth=d;
	}

	public String toString()// this method are automatically called in and return main method
	{
		return "Dimension are "+width +" by "+ depth+" by"+height+".";
			
	}
}
class ToString
{
	public static void main(String []args)
	{
		ToStrings t=new ToStrings(10,20,30); 

		String s="Box b :"+t;// concatinate the s in t object
		System.out.println(t);
		System.out.println(s);
	}
}