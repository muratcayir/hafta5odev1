package business.concretes;

import business.abstracts.LoginService;
import business.abstracts.UserService;
import core.abstracts.SourceService;
import entities.concretes.User;

public class UserManager implements UserService {

    private LoginService loginService;
    private SourceService outService;

    public UserManager(LoginService loginService, SourceService outService) {
        this.loginService = loginService;
        this.outService = outService;
    }



    @Override
    public void register(User user) {
        loginService.register(user);
    }

    @Override
    public void login(String email, String password) {
        loginService.login(email, password);
    }

    @Override
    public void loginSystem() {
        outService.outServiceloginWith();
    }

    @Override
    public void registerSystem() {
        outService.outServiceregister();
    }
}
