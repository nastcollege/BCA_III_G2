import bca.Faculty;//this will import a class thet we  created arlier
import bca.first.Student;//this will import sum package class 
public class Launcher{
	public static void main(String... args){
		Faculty f = new Faculty();
		f.facultyInfo();

		Student s= new Student();
		s.info();
	}
}