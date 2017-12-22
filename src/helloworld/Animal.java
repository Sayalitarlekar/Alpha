package helloworld;

abstract class Animal {
	 abstract void makesound();
}
class dog extends Animal{
	public void makesound(){
		System.out.println("woof woof");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Animal a1=new dog();
	a1.makesound();
}
}
	