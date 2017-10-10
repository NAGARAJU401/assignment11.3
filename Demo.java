package Exception;
//package : Package is name that organizes a set of related classes and interfaces similar to 
///here I have created a package as Exception
public class Demo {
	//public : members which can access as public,public members are visible to all other classes.
	//class : is a context of java that are used to create objects and to define object data types and methods.
		//classes are the basics of opps(object oriented programming)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Public is a keyword that is used as an access modifier for methods and variables.
				//static used to prepare a field,method or inner classes as a class field.
				//void: it is void if the method does not return a value.
				//main:it is a function name When a program starts running, it has to start execution from somewhere.
				//String[] args: it is  defining a String array to pass arguments at command line. args is the variable name of the String array.
		void dosomething()
		//in main method we have another method doSomething
		{
			int n1=20,n2=30;//Initializing the variables
			int sum=n1+n2;//performs addition
			System.out.println("sum:"+sum);//prints the sum
			void doMore()//one more method doMore
			{
				int div=40,divi=0;//showing the division with zero
				int divide=div/divi;
				System.out.println("the output is:"+divide);//now it shows error in line 
			
		}

	}
	}
}
