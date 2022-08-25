package stringBuilder;

public class Builder {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("Hello ");  //append method
		sb.append("Java");
		System.out.println(sb);  

//		StringBuilder sb=new StringBuilder("Hello "); 
//		sb.insert(1,"Java");                            //Insert method
//	    System.out.println(sb);

//	    StringBuilder sb=new StringBuilder("Hello "); 
//	    sb.replace(1,3,"Java");                            //Replace method
//  	System.out.println(sb); 

//  	StringBuilder sb=new StringBuilder("Hello "); 
//  	sb.delete(1,3);                                  //Delete method
//		System.out.println(sb);  
//		
//		StringBuilder sb=new StringBuilder("Hello "); 
//		sb.reverse();                                       //Reverse method
//		System.out.println(sb);  
	}
}
