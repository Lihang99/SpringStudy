import com.leo.pojo.Student;
import com.leo.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());
    }


    @Test
    public void test2(){
        ApplicationContext context=new ClassPathXmlApplicationContext("userbeans.xml");
        User user = (User) context.getBean("user");
        System.out.println(user);
    }

    @Test
    public void test3(){
        ApplicationContext context=new ClassPathXmlApplicationContext("userbeans.xml");
        User user=(User) context.getBean("user2");
        System.out.println(user);
    }
}
