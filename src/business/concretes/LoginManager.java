package business.concretes;

import core.abstracts.CheckService;
import core.abstracts.EmailVertificationService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class LoginManager {

    private UserDao userDao;
    private CheckService checkService;
    private EmailVertificationService emailService;


    public LoginManager(UserDao userDao, CheckService checkService, EmailVertificationService emailService) {
        super();
        this.userDao = userDao;
        this.checkService = checkService;
        this.emailService = emailService;
    }


    public void emailAvailable(String email) {
        for(User user: userDao.getAll()) {
            if(user.getEmail() == email) {
                throw new ArithmeticException("e posta zaten mevcut!");
            }
        }


    }


    public void login(String email, String password) {
        if(!checkService.checkemail(email)) {
            return;
        }
        if(!checkService.checkpassword(password)) {
            return;
        }
        for(User user:userDao.getAll()) {
            if(email==user.getEmail() && password==user.getPassword()) {
                System.out.println(user.getFirstName()+user.getLastName()+" Giriş Başarılı");
                return;
            }
        }

        throw new ArithmeticException("Email veya şifre hatalı!");


    }


    public void register(User user) {

        if(!checkService.checkemail(user.getEmail())) {
            return;		}
        System.out.println("Email doğrulama başarılı");

        if(!checkService.checkpassword(user.getPassword())) {
            return;
        }
        System.out.println("Ad doğrulama başarılı");
        if(!checkService.checkfirstName(user.getFirstName())) {
            return;
        }
        System.out.println("Şifre doğrulama başarılı");
        if(!checkService.checklastName(user.getLastName())) {
            return;
        }
        System.out.println("Soyad doğrulama başarılı");
        emailService.Vertification(user);
        userDao.add(user);
        System.out.println(user.getFirstName()+" "+user.getLastName()+ " Kayıt başarılı");
    }

}
