public class Main {
	public static void main(String[] args) {

		User user = new User(1, "Zehra", "Egilmez", "zehraEgilmez", "123456");
		UserManager userManager = new UserManager();
		userManager.add(user);
		userManager.delete(user);
		userManager.update(user);

		System.out.println("----------");

		Instructor instructor = new Instructor();
		instructor.id = 2;
		instructor.firsName = "Engin";
		instructor.lastName = "Demirog";
		instructor.userName = "enginDemirog";
		instructor.password = "654321";
		instructor.instructorDescription = "Kursa Baslıyoruz";

		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);
		instructorManager.delete(instructor);
		instructorManager.update(instructor);

		System.out.println("----------");

		Student student = new Student(3, "Nur", "Egilmez", "nurEgilmez", "13579", "Java");

		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		studentManager.delete(student);
		studentManager.update(student);

	}

}