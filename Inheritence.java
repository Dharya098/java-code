import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Animal{
	void walk(){
		System.out.println("I am walking");
	}
}

class Bird extends Animal{
    void fly(){
        System.out.println("i am Flying");
        
    }
}
class Sing extends Bird{
    void sing(){
        System.out.println("I am Singing");
    }
}

public class Inheritence{

   public static void main(String args[]){

	  Sing sing = new Sing();
	  sing.walk();
	  sing.fly();
	  sing.sing();
	
   }
}