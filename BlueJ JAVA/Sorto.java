import java.io.*;
class Sorto
{
    private String name;
    private int age;
    public void acceptData()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER NAME OF THE STUDENT");
        name=br.readLine();
        System.out.println("ENTER AGE OF THE STUDENT");
        age=Integer.parseInt(br.readLine());
    }
    public void SortOnName(Sorto a[],int n)
    {
		Sorto k=new Sorto();
		String t;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(a[j].name.compare(a[j+1],name)<0)
				{
					k=a[i];
					a[i]=a[i+1];
					a[i+1]=k;
		        }
	        }
	    }
	    displayDetails();
     }
     private void displayDetails(Sorto a[],int  n)
     {
		 for(int i=0;i<n;i++)
		 {
			 System.out.print("NAME "+a[i].name+"\t"+"AGE "+a[i].age);
			 System.out.println();
	     }
     }
 }
 class TrySorto
 {
	 public static void main(String args[])throws IOException
	 {
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("ENTER NUMBER OF OBJECTS TO BE CREATED");
		 int n=Integer.parseInt(br.readLine());
		 int i=0;
		 Sorto y[]=new Sorto[n];
		 for(i=0;i<n;i++)
		 {
			 y[i]=new Sorto();
	     }
	     for(i=0;i<n;i++)
	     {
			 y[i].acceptData();
			 Sorto obj=new Sorto();
			 obj.sortOnName(y,n);
	     }
     }
 }



