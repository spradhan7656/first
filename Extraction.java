class Extraction
{
	public static void main(String []args)
	{
		String s="Santosh";
		char ch=s.charAt(3);//extract the charcter one 
		System.out.println(ch);
		char v[]=new char[5-3];
		s.getChars(3,5,v,0);//extract more character 
		System.out.println(v);
	}
}