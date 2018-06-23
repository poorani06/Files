import java.io.*;
import java.util.Scanner;
class Qu1
{
String[] id=new String[4];
String name[]=new String[4];
int age[]=new int[4];
String[] city=new String[4];
String[] country=new String[4];
String[] data=new String[4];
int count=0;

public static void main(String d[]) throws IOException
{

Qu1 u=new Qu1();
u.write();
u.read();
}
public void write() throws IOException
{ 
FileWriter fw=new FileWriter("abc.txt");
BufferedWriter bw=new BufferedWriter(fw);
Scanner s=new Scanner(System.in);
for(int i=0;i<4;i++)
{
System.out.println("enter id");
id[i]=s.next();
System.out.println("enter name");
 name[i]=s.next();
System.out.println("enter age");
age[i] =s.nextInt();
System.out.println("enter city");
city[i]=s.next();
System.out.println("enter country");
country[i]=s.next();
data[i]=id[i]+ " "+name[i]+"  " +age[i]+"  "+city[i]+"  "+country[i]+" ";
bw.write(data[i]);
bw.newLine();
}
bw.close();
}

public void read() throws IOException
{
/*FileReader fr=new FileReader("C:\\Users\\Poorani\\Desktop\\javaniit\\abc.txt");
BufferedReader br=new BufferedReader(fr);
int e=0;
while((e=br.read())!=-1)
{
System.out.print((char)e);

}*/
for(int j=0;j<4;j++)
{
if(age[j]>=21)
{
count++;
}
}
System.out.println("students greater than 18 are :"+count);
for(int k=0;k<4;k++)
{
char[] c=name[k].toCharArray();

if(c[0]=='a')
{
System.out.println(name[k]);
}
}
}
}