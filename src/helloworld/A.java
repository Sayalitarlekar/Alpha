package helloworld;

class A extends Animal {
	public void getcolour()
	{
		System.out.println("My colour is black");
	}
	public void makesound(){
		System.out.println("woof woof");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Animal a1=new A();
		a1.getcolour();	
		a1.makesound();
	}
	}

