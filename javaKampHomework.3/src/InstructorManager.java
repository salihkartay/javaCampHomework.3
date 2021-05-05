public class InstructorManager {
    public void addCourse(Course course){
        System.out.println(course.getTitle() + " İsimli kurs eklendi \n");
    }

    public void deleteCourse(Course course){
        System.out.println(course.getTitle() + " İsimli kurs silindi \n");
    }

    public void updateCourse(Course course){
        System.out.println(course.getTitle() + " İsimli kurs güncellendi \n");
    }
}
