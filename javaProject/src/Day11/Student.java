package Day11;

public class Student {
	
	int sid;
	String sname;
	char grad;
	
	void printStudentData() {
		System.out.println(sid + "  " + sname + "   " + grad);
	}
	
	void setStudentData(int id,String name, char gr) {
		sid = id;
		sname = name;
		grad = gr;
	}
	
	// method name could be anything 
			// but constructor should have name of class
			// Constructor cannot return any value not even void
			// Constructor take parameters
			// we only use this for assigning the data / initializing the data
	Student(int id,String name, char gr){
		sid = id;
		sname = name;
		grad = gr;
	}

}
