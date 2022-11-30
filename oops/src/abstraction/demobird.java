package abstraction;
abstract class Bird{
	abstract  void fly();
	public abstract void eat();
	 //abstract public void eat();
}
abstract class Eagle extends Bird {

	@Override
	 void fly() {
		// TODO Auto-generated method stub
		System.out.println("eagle is flying");
	}
}
class SerpentEagle extends Eagle{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("serpent eagle is eatting");
	}
	
}
class GoldenEagle extends Eagle{
	
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("golden eagle is eatting");
	}
	
}
class species{
	static void permit(Eagle eagle){
		eagle.eat();
		eagle.fly();
	}
}

public class demobird {
	public static void main(String[] args) {
		species.permit(new SerpentEagle());
		species.permit(new GoldenEagle());
	}

}
