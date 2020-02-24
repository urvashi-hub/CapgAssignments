package lab6;
import java.io.*;
import java.util.Scanner;
public class MirrorString 
{
Scanner sc=new Scanner(System.in);
public String getImage(String str)
{
	StringBuffer s=new StringBuffer(str);
	StringBuffer s1=new StringBuffer(str);
	s1.reverse();
	s.append("|");
	s.append(s1);
	return s.toString();
}
}
