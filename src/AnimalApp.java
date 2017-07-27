
public class AnimalApp {

	public static void main(String[] args) {

		Animal a = new Animal();
		print(a.eat());
		print(a.sleep());

		Cat c = new Cat();
		print(c.eat());
		print(c.sleep());
		print(c.purr());
		

		Bird b = new Bird();
		print(b.eat());
		print(b.sleep());
		print(b.fly());
		
		Dog d = new Dog();
		print(d.sleep());
		print(d.eat());

		Horse h= new Horse();
		print (h.sleep());
		print (h.eat());
		
	}
	private static void print(String s){
		System.out.println(s);
	}
	
}
