class sweet
{
 void price()
 {
  System.out.print("Sweet-10");
 }
}
class sugar extends sweet
{
 void price()
 {
  super.price();
  System.out.print("Sugar-20");
 }
}
public class Java
{
 public static void main(String[] args)
 {
  sugar su=new sugar();
  su.price();
 }
}      
