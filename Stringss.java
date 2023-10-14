class Stringss
{
	public static void main(String []args)
	{
	char c[]={ 'a','b','c','d','e' };
	String s1=new String(c);//whole charcter are store in the string s1
	String s=new String(c,2,2);//but in this case character are store in the string s first 2=starting index next 2= how much char need
	System.out.println(s);
	System.out.println(s1);

	String s3=new String(s);//s string are store in the string in the s3
	System.out.println(s3);

	byte ascii[]={65,66,67,68,69,23};// ascii code 
	String s4=new String (ascii);//ascii code to store in string 
	String s5 =new String(ascii,3 ,2);//stating index how much character
	System.out.println(s4+"\n"+s5);
	int age=22;
	int sum=33;
	String ssss=" 299";

	String ss="hy what "+ age + sum+ssss +" hell0";//every value is concatinate
	String sss="hyyy"+" hello " +" java";//concatinate this value


	System.out.println(ss+"\n"+sss);

	String s6="hello "+4+5;//4 and 5 value are concatinate in the string output= hello 45
	String s7="hello "+(4+5);// 4 and 5 value are not concatinate in the string output = hello 9
	System.out.println(s6+"\n"+s7);

	}
}