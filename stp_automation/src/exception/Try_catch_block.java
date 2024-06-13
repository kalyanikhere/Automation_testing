package exception;

public class Try_catch_block {

	public static void main(String[] args) {

//   try {
//	Thread.sleep(20000); 
//   } catch (InterruptedException e) {
//	e.printStackTrace();
//	}catch (Exception e) {
//		e.printStackTrace();
//	}finally {
//		System.out.println("exception handled");
//	finally is a block and final is non access modifier
//	}

   /*   try {
	riskey code;
} catch (InterruptedException e) {
exception name reference variable 
reference variable.method	
	e.printStackTrace();
}
}*/
   
   
   try {
	Thread.sleep(2000);	
} catch (InterruptedException e) {
	e.printStackTrace();	
}catch (Exception e) {

}catch (Throwable e) {

}finally {
	System.out.println("give");
}
               
   
	}
	}

