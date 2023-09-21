package S1;
import java.util.*;
import java.util.stream.*;

public class Demo1 {
	public static void main(String[] args) {

		 List<String> inputList= new ArrayList<>();

		 inputList.add("ramesh");

		 inputList.add("adarsh");

		 inputList.add("pranay");

		 inputList.add("akash");

		 Stream<String>stringStream=inputList.stream();

		 List<String> outputList = stringStream.filter((x)->{

				if(x.startsWith("a")) return true;

				else return false;

			}).collect(Collectors.toList());

			System.out.println(outputList);

		}
}
