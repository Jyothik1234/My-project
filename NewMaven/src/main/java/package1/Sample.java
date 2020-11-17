package package1;

public class Sample {

	public static void main(String[] args) {
		int e=0;
		int o=0;
		for(int i=10;i<=20;i++)
		{
		int c=i%2;
		if(c==0){
		e++;
		}
		else{
		o++;
		}
		}
		System.out.println("Count of even:"+e);
		System.out.println("Count of odd:"+o);

	}

}
