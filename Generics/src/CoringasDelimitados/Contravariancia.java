package CoringasDelimitados;

import java.util.ArrayList;
import java.util.List;

public class Contravariancia {
	public static void main(String[] args) {
		List<Object> myObjs = new ArrayList<Object>();
		myObjs.add("Maria");
		myObjs.add("Alex");
		
		//Pode ser um number ou qualquer tipo de super number ou seja, object
		List<? super Number> myNums = myObjs;
		myNums.add(10);
		myNums.add(3.14);
		Number x = myNums.get(0); // erro de compilacao
	}
}
