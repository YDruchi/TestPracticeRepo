package TEST;

public class array_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] a= {10,22,5,1,40};
int temp=0;
for (int i =0 ; i<a.length;i++)
{
	for (int j =0 ; j<a.length;j++)
	{
		if(a[i]<a[j]) 
		{
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
	}
}
System.out.println(a);
for (int i =0 ; i<a.length;i++){
	System.out.println(a[i]);
}


	}

}
