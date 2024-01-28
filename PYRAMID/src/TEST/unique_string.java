package TEST;

public class unique_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,22,1,3,60,60,7,8};

int c[] = new int[a.length];
boolean isDistinct;
int Count =0;
for(int i=0;i<a.length;i++)
{
	isDistinct=true;
	for(int j =0 ; j<=Count;j++)
	{
		if(a[i]==c[j])
		{
			isDistinct=false;
		}
	}
	if(isDistinct==true)
	{
		c[Count]=a[i];
		Count++;
	}
	
}

for (int i : c) {
	System.out.println(i);
}

	}

}
