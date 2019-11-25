import com.leo.config.LeoConfig;
import com.leo.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Mytest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(LeoConfig.class);
        User user = (User) context.getBean("user");
        System.out.println(user);
    }
}
