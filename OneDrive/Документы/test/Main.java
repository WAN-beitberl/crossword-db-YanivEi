interface Animal{
	public void makeSound();
}

class Cat implements Animal{
	public void makeSound(){
		System.out.println("miao");
	}
}

class Dog implements Animal{
	public void makeSound(){
		System.out.println("hoo");
	}
}

class Cow implements Animal{
	public void makeSound(){
		System.out.println("moo");
	}
}

class Main{ 
	public static void main(String[] args){
		Cat CatObj= new Cat();
		Dog DogObj = new Dog();
		Cow CowObj = new Cow();
		CatObj.makeSound();
		DogObj.makeSound();
		CowObj.makeSound();
	}
}
