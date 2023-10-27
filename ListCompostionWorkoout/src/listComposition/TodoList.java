package listComposition;

public class TodoList implements ListInterface {

	String monday = "Piano studying";
	String tuesday = "Guitar studing";
	String wednesday = "Java studying";

	// How to initialize this array of String[] ???????--> put stuff inside
	String[] stringArrayTodo = new String[3];

	public TodoList() {
		
	}

	public String weekTodoList() {
		return "The week Todo list is: " + monday + " " + tuesday + " " + wednesday;
	}

	@Override
	public String toString() {
		return monday + " " + tuesday + " " + wednesday;

	}
}
