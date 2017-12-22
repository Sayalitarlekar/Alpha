package helloworld;

interface Dog {
	void getcolour();
}

abstract class cat{
   abstract void makesound();
  
	}


class Toys extends cat implements Dog {
	public void getcolour()
	{
		System.out.println("My colour is black");
	}
	public void makesound(){
		System.out.println("woof woof");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog a1=new Toys();
		a1.getcolour();
		cat a2=new Toys();
		a2.makesound();
	}
	}




