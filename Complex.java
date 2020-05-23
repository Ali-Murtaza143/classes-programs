import java.util.*;
class Complex{

static void method(int r1 , int i1 ,int r2, int i2){
int f=(r1+r2);
int e=(i1+i2);
if (e<0)
System.out.println("addition of two complex numbers is "+ f +e+"i");
else
System.out.println("addition of two complex numbers is "+ f + "+"+e+"i");
}

static void method1(int r1 , int i1 ,int r2, int i2){
int f=(r1-r2);
int e=(i1-i2);
if (e<0)
System.out.println("difference of two complex numbers is "+ f +e+"i");
else
System.out.println("difference of two complex numbers is "+ f + "+"+e+"i");
}


public static void main(String abc[]){

System.out.println("enter 1st complex number real part then imagniary part: ");
Scanner S=new Scanner(System.in);
int x=S.nextInt();
int a=S.nextInt();
System.out.println("enter 2nd complex number real part then imagniary part: ");
int y=S.nextInt();
int z=S.nextInt();
method(x,a,y,z);
method1(x,a,y,z);
}}
