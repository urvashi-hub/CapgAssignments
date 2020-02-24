package lab89;

import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.lang.Thread;


public class MyTimerTask2 implements Callable<Integer> {
Date d;


public void run()  {
//TODO Auto-generated method stub
for(int i=0;i<10;i++)
{
d=new Date();
System.out.println(d);
try {
Thread.sleep(10000);
}
catch(InterruptedException e) {
e.printStackTrace();
}}
}
public static <T> void main(String[] args) throws InterruptedException, ExecutionException
{
ExecutorService eservice= Executors.newSingleThreadExecutor();
Future<Integer> callFuture= (Future<Integer>) eservice.submit((Callable<T>) new MyTimerTask1());
MyTimerTask1 t=new MyTimerTask1();
Thread t1=new Thread(t);
t1.run();
}
@Override
public Integer call() throws Exception {
// TODO Auto-generated method stub
return null;
}
}



