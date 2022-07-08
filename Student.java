package day9;

public abstract class Student {
	
		String name;
	    String address;
		
		public abstract int getPercentage();
			Student(){
			System.out.println(this.name);
			System.out.println(this.address);
		}
		
}
