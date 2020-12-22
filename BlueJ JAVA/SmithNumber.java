import java.io.*;
class SmithNumber
{
int n;
SmithNumber(int num)
{
n=num;
}
int Sum(int p)
{
int a,b;
b=0;
while(p!=0)
{
a=p%10;
b=b+a;
p=p/10;
}
return b;
}
int isPrime(int k)
{
	int c=0;
	int i;
	for(i=1;i<=k;i++)
	{
	if(k%i==0)
	c++;
	}
	if(c==2)
	return 1;
	else
	return 0;
}

void Display()
{
int sum1=0;
int sum2=Sum(n);
for(int j=1;j<n;j++)
{
	int k=isPrime(j);
	if(n%j==0 && k==1)
	sum2=sum2+Sum(j);
}
int l=isPrime(n);
if(sum1==sum2 && l==0)
System.out.println("IT IS A SMITH NUMBER");
else
System.out.println("IT IS NOT A SMITH NUMBER");
}
}
class TrySmithNumber
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ENTER A NUMBER TO BE CHECKED");
		int n=Integer.parseInt(br.readLine());
		SmithNumber obj=new SmithNumber(n);
		obj.Display();
	}
}




