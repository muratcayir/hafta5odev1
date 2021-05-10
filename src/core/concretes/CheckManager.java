package core.concretes;

import core.abstracts.CheckService;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckManager implements CheckService {



    @Override
    public boolean checkfirstName(String firstName) {
        if(firstName.length()>1) {
            return true;
        }
        else {
            throw new ArithmeticException("Ad ve soyad en az iki karakterden oluşmalıdır!");

        }
    }

    @Override
    public boolean checklastName(String lastName) {
        if(lastName.length()>1) {
            return true;
        }
        else {
            throw new ArithmeticException("Ad ve soyad en az iki karakterden oluşmalıdır!");
        }
    }

    @Override
    public boolean checkemail(String email) {


        Pattern pattern= Pattern.compile("\\b[A-Z0-9._%-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}\\b");
        Matcher matcher = pattern.matcher(email);



        if (matcher.find()) {
            return true;
        } else {
            System.out.println("    Lütfen en az 6 karakter içerecek şekilde tekrar giriniz!");
            return false;
        }

    }

    @Override
    public boolean checkpassword(String password) {
        if(password.length()>5) {
            return true;
        }
        else {
            throw new ArithmeticException("");
        }
    }
}
