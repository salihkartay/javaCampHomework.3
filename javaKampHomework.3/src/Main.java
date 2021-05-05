public class Main {

    public static void main(String[] args) {

        User user = new User(1,"salihKartay", "Salih", "Kartay", "salihkartay@outlook.com", "12345");

        Course course = new Course(1 , "Java Programlama", "Nitelikli Java Geliştiricisi Yetiştime kursu");

        Instructor instructor = new Instructor();
        instructor.setId(2);
        instructor.setUserName("EDeniroğ");
        instructor.setFirstName("Engin");
        instructor.setLastName("Demiroğ");
        instructor.setEmail("engin@example.com");

        InstructorManager instructorManager = new InstructorManager();
        instructorManager.addCourse(course);
        instructorManager.deleteCourse(course);
        instructorManager.updateCourse(course);

        UserManager userManager = new UserManager();
        userManager.login(user);
        userManager.logout(user);

        StudentManager studentManager = new StudentManager();
        studentManager.register(user);

    }
}
