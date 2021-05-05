public class StudentManager extends UserManager{
    public void register (User user){
        System.out.println("Sayın : " + user.getUserName() + " aramıza hoşgeldin.");
    }
}
