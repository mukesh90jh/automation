package concepts.src.oops;

public class DynamicPolymorphism {

	void eat(){
		System.out.println("animal is eating...");
	}  
}  

class Dog extends DynamicPolymorphism{  
	void eat(){
		System.out.println("dog is eating...");
	}  
}  

class demo{  
	public static void main(String args[]){  
		DynamicPolymorphism a=new Dog();  
		a.eat();  
	}
}
