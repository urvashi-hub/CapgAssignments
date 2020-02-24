package lab89;
import java.util.Date;
public class MyTimerTask1 implements Runnable
{
Date d;

@Override
public void run() 
{
//TODO Auto-generated method stub
for(int i=0;i<10;i++)
{
d=new Date();
System.out.println(d);
try 
{
Thread.sleep(10000);
}
catch(InterruptedException e)
{
e.printStackTrace();
}
}
}
public static void main(String[] args)
 {
MyTimerTask1 t=new MyTimerTask1();
Thread t1=new Thread(t);
t1.run();
}
}