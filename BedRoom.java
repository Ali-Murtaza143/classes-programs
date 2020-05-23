class Room {
int W,L;
int ComputeArea(){
return(W*L);
}}

class BedRoom extends Room
{

int H;
int ComputeVolume(){
return(W*L*H);
}
public static void main (String ai[])
{
BedRoom b=new BedRoom();
b.W=1;
b.L=8;
b.H=15;
System.out.println(b.ComputeArea()+"  "+b.ComputeVolume());
}}