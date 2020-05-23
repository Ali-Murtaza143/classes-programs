class Thd extends Thread{

public void run(){
for ( int i=1;i<=10;i++)
System.out.println("Thread A"+i);
}
}


class Thd1 extends Thread{

public void run(){
for ( int i=1;i<=10;i++)
System.out.println("Thread B"+i);
}
}

public class B{
public static void main(String a[]){
Thd d=new Thd();
d.start();

Thd1 d1=new Thd1();
d1.start();

}
}