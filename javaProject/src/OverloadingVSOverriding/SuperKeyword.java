package OverloadingVSOverriding;

public class SuperKeyword {

	String pet = "Dog";
	
	void voice() {
		System.out.println("Bark");
	}
}

class child extends SuperKeyword{
	String pet = "Cat";
	
	void displayPet() {
		System.out.println(super.pet);
		voice();
		super.voice();
	}
	
	void voice() {
		System.out.println("meow");
	}
}