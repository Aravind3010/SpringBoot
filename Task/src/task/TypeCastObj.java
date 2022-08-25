package task;

class Base1{
	
}

class Base2{
	
}

class Der1 extends Base1{
	
}

class Der2 extends Base1{
	
}

class Der3 extends Base2{
	
}

class Der4 extends Base2{
	
}

public class TypeCastObj {
public static void main(String[] args) {
		
		Base2 b=new Der4();
		
		Der4 d=(Der4)b;
		Object o =(Der4)b; 
		Der4 od = (Der4)o;
		
	}
	}
