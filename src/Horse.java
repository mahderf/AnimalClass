/* we have added a Horse to our Animal class now*/

public class Horse extends Animal{
	
	public Horse()
	{
		System.out.println("we got a new Horse in the family");
	}
	
@Override
public String sleep(){
	return("my horse sleeps well");
}
@Override
public String eat(){
	return("this horse eats a lot");
}

public String ride(){
	return ("I love riding this horse");
}
public String walk(){
	return ("this horse knows how to walk");
}
}
/* Horse is the only animal you can ride*/