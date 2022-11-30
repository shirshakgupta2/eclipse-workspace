import java.util.Scanner;
@interface FSAnnotation{
	
}
@interface Loser{
	String subject();
}
@interface Value{
	String value();
}
@interface Winner{
	String subject() default "SQL";
}
enum Mobile{
	APPLE,SAMSUNG(10000),NOKIA;
	int price;
	Mobile(int price){
		this.price=price;
	}
	Mobile(){
		
	}
}
@FSAnnotation@Loser(subject = "JAVA")@Value("helo")
public class ENUMDEFAULT {
	@Winner
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile mobile = Mobile.NOKIA;
		Mobile mobile1 = Mobile.SAMSUNG;
		System.out.println(mobile+":"+mobile.price);
		System.out.println();
		System.out.println(mobile1+":"+mobile1.price);
		@SuppressWarnings({ "unused", "resource" })
		Scanner scanner = new Scanner(System.in);
	}
	

}
