import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

enum Subject{
	HTML,CSS,JAVA,SQL,DSA,J2EE,JDBC
}

 
@Target(value = { ElementType.FIELD,ElementType.LOCAL_VARIABLE,ElementType.METHOD,ElementType.TYPE,ElementType.PARAMETER })
@interface FSAnnotation{
	Subject[] value();
	int marks();
}

@FSAnnotation(marks = 0, value = { Subject.CSS,Subject.DSA,Subject.HTML  })
public class Annotation {
	
	@FSAnnotation(marks = 0, value = { Subject.CSS,Subject.DSA,Subject.HTML  })
	int a=0;
	
	void add(@FSAnnotation(marks = 0, value = { Subject.CSS,Subject.DSA,Subject.HTML  })int a){
		
	}
	
	@FSAnnotation(marks = 0, value = { Subject.CSS,Subject.DSA,Subject.HTML  })
 	public static void main(String[] args) {
	 @FSAnnotation(marks = 0, value = { Subject.CSS,Subject.DSA,Subject.HTML  })
	 int x=10;
}
}
