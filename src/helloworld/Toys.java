package helloworld;

interface Dog {
	void getcolour();
}

abstract class Cat implements Dog {
   abstract void makesound();
  
	}


class Toys extends Cat {
	public void getcolour()
	{
		System.out.println("My colour is black");
	}
	public void makesound(){
		System.out.println("woof woof");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cat a1=new Toys();
		a1.getcolour();	
		a1.makesound();
	}
	}




