public class UserManager {


    public void login (User user){
        System.out.println(user.getFirstName() + " tekrar hoşgeldin");
    }

    public void logout (User user){
        System.out.println(user.getUserName() + "arayı fazla uzatma :) ");
    }
}
