package q4;

public class UniversityDemo {
	  
		public static void main(String[] args)
		{
		
		University u= new University();
		
		u.addshools("1", "aaaa", 10, 6);	
		u.addshools("2", "bbbb", 90, 8);
		u.addshools("3", "cccc", 70, 6);
		u.addshools("4", "dddd", 60, 8);
		u.addshools("5", "eeee", 10, 6);
		u.addshools("6", "ffff", 50, 8);
		u.addshools("7", "gggg", 10, 6);
		u.addshools("8", "hhhh", 10, 8);
		
		u.displayinfo();

		System.out.println("total students in university :"+u.totalstrength_of_university());
			
		u.display_no_of_students_in_each_school();
		
		}
		
		
		
	}