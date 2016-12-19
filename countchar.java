import java.util.*;
class countchar
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
String str;
int count=0;
str=sc.nextLine();
char c[]=str.toCharArray();
for(int i=0;i<str.length();i++)
{
if((c[i]>=65&&c[i]<=97)||(c[i]>97&&c[i]<=122))
{
count++;
}
}
System.out.println("Total counting of character is:"+count);
}
}
