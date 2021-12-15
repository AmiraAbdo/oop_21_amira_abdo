import mooc.logic.ApplicationLogic;
import mooc.ui.UserInterface;
import mooc.ui.TextUserInterface;

public class main {
	
	public static void main(String[] args) {
		
		UserInterface ui= new TextUserInterface();
		ApplicationLogic al= new ApplicationLogic(ui);
		//  al.execute(3);
		
		Person p= new Person("lol", -4);
		
	}

}
