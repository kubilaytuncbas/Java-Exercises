
public class Main {

	public static void main(String[] args) {
		
		Course course1=new Course(1,"Java kursu");
		Course course2=new Course(2,"C# kursu");
		Course [] courses= {course1,course2};
		for(Course course:courses) {
			System.out.println(course.CourseName);
		};
		Instructor instructor1=new Instructor("Kubilay","Tuncbas");
		Instructor instructor2 = new Instructor("Bill","Gates");
		Instructor [] instructors= {instructor1,instructor2};
		for(Instructor instructor:instructors) {
			System.out.println(instructor.Name);
			
		};
		
		CourseManager courseManager=new CourseManager();
		
		courseManager.ShowCourses(course1);
		
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.ChooseTheInstructor(instructor2);
		
		
	

	}

}
