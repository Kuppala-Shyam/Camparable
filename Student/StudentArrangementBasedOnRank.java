package InternPack;

import java.util.ArrayList;
import java.util.Collections;

public class StudentArrangementBasedOnRank {

	public static void main(String[] args) {
		ArrayList<StudentsInClass> arrayList = new ArrayList<StudentsInClass>();
		arrayList.add( new StudentsInClass("Shyam","A1",90.9));
		arrayList.add(new StudentsInClass("Tej", "A2", 85.6));
		arrayList.add(new StudentsInClass("Venkat","A3",78.7));
		arrayList.add(new StudentsInClass("Sri", "A4", 95.4));
		arrayList.add(new StudentsInClass("Vijaya", "A5", 91.4));
		System.out.println(arrayList);
		Collections.sort(arrayList);
		System.out.println("After sorting based on marks of students");
		int i =1;
		for(StudentsInClass s : arrayList) {
			s.rank = i++;
		}
		System.out.println(arrayList);
	}

}
