package listComposition;

import java.util.ArrayList;
import java.util.List;

public class ListLoopsToDo extends TodoList {

	// Composition
	static List<TodoList> firstTodoList = new ArrayList<TodoList>(); // write ArrayList<>();
	


	String iterator() {
		return weekTodoList();
	}

	// Object[] toArray();
	TodoList toArrayList;

	public void setFirstTodoList(List<TodoList> firstTodoList) {
		ListLoopsToDo.firstTodoList = firstTodoList;
	}

	public String getFirstTodoList() {
		return firstTodoList + " " + monday + " " + tuesday + " " + wednesday;
	}

	public ListLoopsToDo() {
		super();

	}

	public static void main(String[] args) {

		ListLoopsToDo newtodoList = new ListLoopsToDo();
		
		ListLoopsToDo.firstTodoList.add(0, newtodoList);
		
		
		try {
			System.out.println("Object TodoList Print: " + firstTodoList.add(new TodoList()));
		} catch (Exception e) {
			
			e.printStackTrace();
		}

		System.out.println("\nThe new instance List from Class TodoList, getMethod, gets an Object plus the STrings: "
				+ newtodoList.getFirstTodoList());
		System.out.println("\nThe Method week todo list from clas TodoList: " + newtodoList.weekTodoList());
		System.out.println("\nThe instance of List of Class TodoList, calls the Strings: " + newtodoList);
		System.out.println("\n" + TodoList.class);
		System.out.println(ListLoopsToDo.class);

		System.out.println("The Hashcode of instance newtodoList: " + newtodoList.hashCode());
		System.out.println("\nFirst Letter of String Piano Studying: " + newtodoList.monday.charAt(0));
		System.out.println("First letter of String Guitar Studying: " + newtodoList.tuesday.charAt(0));
		System.out.println("First Letter of String Java Studying: " + newtodoList.wednesday.charAt(0));
		System.out.println("Calling the toString method from TodoList: " + newtodoList.toString());

		System.out.println(newtodoList.iterator());
		System.out.println("\nThe TodoList toArrayList: " + newtodoList.toArrayList);
		System.out.println("The newtodoList.stringArrayTodo.toString(): " + newtodoList.stringArrayTodo.toString());

	}

}
