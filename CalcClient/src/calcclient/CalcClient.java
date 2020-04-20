package calcclient;

import java.util.List;
import ru.webcl.akr.User;
import ru.webcl.akr.WebCl;
import ru.webcl.akr.WebCl_Service;

/**
 *
 * @author Aleks
 */
public class CalcClient {

    static WebCl proxy;

    public static void main(String[] args) {
        proxy = (new WebCl_Service()).getWebClPort();
        User u0 = proxy.getUser();
        List<User> u1 = proxy.operation();

        System.out.println("u0: name = " + u0.getName() + ", age = " + u0.getAge());
        for (User u : u1) {
            System.out.println("u0 name: " + u.getName() + ", age = " + u.getAge());
        }
    }
}
