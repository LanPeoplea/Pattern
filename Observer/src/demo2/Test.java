package demo2;

public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcreteSubject s=new ConcreteSubject();
		
		Observer a=new ConcreteObserver(s, "x");
		s.attach(a);
		s.attach(new ConcreteObserver(s, "y"));
		s.attach(new ConcreteObserver(s, "z"));
		
		s.setSubjectState("ABC");
		s.Notify();
		System.out.println("1");
	} 
}