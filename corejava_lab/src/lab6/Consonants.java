package lab6;
public class Consonants
{
	boolean isVowel(char ch)
	{
		if((ch!='a')&&(ch!='e')&&(ch!='i')&&(ch!='o')&&(ch!='u'))
		{
			return false;
		}
		return true;
	}
	public String alterString(String str)
	{
		char[] ch=new char[str.length()];
		StringBuffer s=new StringBuffer(str);
		for(int i=0;i<str.length();i++)
		{
			ch[i]=str.charAt(i);
		}
		for(int i=0;i<str.length();i++)
		{
			if(!isVowel(ch[i]))
			{
				if(ch[i]=='z')
				{
					char a=str.charAt(i);
					a='b';
					
				}
				else
				{
					char a=str.charAt(i);
					a=(char)(str.charAt(i)+1);			}
		        }
	        }
		return str;
	}
}
	
