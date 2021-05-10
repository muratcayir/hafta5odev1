import business.abstracts.LoginService;
import business.abstracts.UserService;
import business.concretes.LoginManager;
import business.concretes.UserManager;
import core.adapters.GoogleAdapter;
import core.concretes.CheckManager;
import core.concretes.EmailVertificationManager;
import dataAccess.abstracts.UserDao;
import dataAccess.concretes.HibernateUserDao;
import entities.concretes.User;

public class Main {

    public static void main(String[] args) {
        UserService userService = new UserManager((LoginService) new LoginManager(new HibernateUserDao(), new CheckManager(), new EmailVertificationManager()),
                new GoogleAdapter());
        EmailVertificationManager emailVertificationManager=new EmailVertificationManager();

        CheckManager checkManager=new CheckManager();

        User user1=new User();
        user1.setFirstName("Murat");
        user1.setLastName("ÇAYIR");
        user1.setEmail("mrtcyr12@hotmail.com");
        user1.setPassword("232323");

        userService.loginSystem();
        userService.registerSystem();


    }

}
