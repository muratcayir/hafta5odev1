package business.abstracts;

import entities.concretes.User;

public interface LoginService {
    void emailAvailable(String email);
    void login(String email,String password);
    void register(User user);
}
