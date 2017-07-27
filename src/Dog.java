/* a new animal Dog is now part of the Animal class*/

public class Dog extends Animal{
	

public Dog()
{
	System.out.println("we have a dog in the family now");
}
@Override
public String sleep(){
	return("The dog is sleeping now");
}
@Override
public String eat(){
	return("the dog is eating now");
}

public String bark() {
	return("The dog jumps high");
}
public String scare(){
	return("my dog looks scary but he is just chubby");
}
}

/* a dog is the only animal that barks in this family
 * so it is a unique dog class*/

