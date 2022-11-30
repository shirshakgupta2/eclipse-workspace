enum Month{
	JAN,FEB,MAR,APR,MAY,JUNE,JULY,AUG,SEPT,OCT,NOV,DEC
}

public class Enum   {
	public static void main(String[] args) {
		Month birthMonth = Month.FEB;
		System.out.println(birthMonth);
		System.out.println(Month.class);
		Month[] months = Month.values();
		for (Month month : months) {
			System.out.println(month+":  "+(month.ordinal()+1));
		}
	}
}

 