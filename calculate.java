public class calculate 
{
public static void main(String[] arg) {
System.out.println("Calculate...");
int f = Integer.valueOf(arg[0]);
int s = Integer.valueOf(arg[1]);
int su = f+s;
System.out.println("Sum= "+su);
int f1 = Integer.valueOf(arg[2]);
int s2 = Integer.valueOf(arg[3]);
int sum = f1-s2;
System.out.println("Sum= "+sum);
int f3 = Integer.valueOf(arg[4]);
int s3 = Integer.valueOf(arg[5]);
int summ = f3*s3;
System.out.println("Sum= "+summ);
int f4 = Integer.valueOf(arg[6]);
int s4 = Integer.valueOf(arg[7]);
int summ1 = f4/s4;
System.out.println("Sum= "+summ1);
}
}