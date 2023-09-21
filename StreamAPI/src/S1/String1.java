package S1;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class String1 {
	public static void main(String[] args) {
		
	
   Consumer<String> con = new Consumer<String>() {

	@Override
	public void accept(String t) {
		String str="Hello ";
		str=str.concat(t);
		System.out.println(str);
		
	}
	   
   };
   
   String str[]=new String[]{"Java","Python","API"};
   for(String s : str) {
	   con.accept(s);
   }
  
	System.out.println("----------------Through Lambda-----------------");

	Consumer<String> con2=(t)->{

		String b="Hello ";
		b=b.concat(t);
		System.out.println(b);

	};

	for(String s:str) {
		con.accept(s);

	}

	

	System.out.println("-----------------Through StreamOf---------------------");

	Stream.of(str).forEach((t)->{
		String c="Hello ";
		c=c.concat(t);
		System.out.println(c);

	});
   
}
}





