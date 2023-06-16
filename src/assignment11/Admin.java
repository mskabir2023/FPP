package assignment11;
import java.util.*;
public class Admin {
	public static HashMap<Key, Student> processStudents(List<Student> allstudent) {
		HashMap<Key, Student> studentMap = new HashMap<>();
		for (Student student : allstudent) {
			Key key = new Key(student.getFirstName(), student.getLastName());
			studentMap.put(key, student);
		}
		return studentMap;
	}
	public static double computeAverageGPA(HashMap<Key,Student> maps){
		Set<Key> keySet = maps.keySet();
		double gpa = 0.0;
		for (Key key : keySet) {
			gpa += maps.get(key).getGpa();
		}
		double avgGPA = gpa / keySet.size();
		return avgGPA;
}
}
