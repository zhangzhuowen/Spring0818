import com.navinfo.pojo.Student;
import com.navinfo.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhangZhuoWen
 * @ClassName SpringTest
 * @date 2020/8/19 10:32
 * @Description TODO
 */
public class SpringTest {

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());

    }

    @Test
    public void testP(){
        ApplicationContext context = new ClassPathXmlApplicationContext("userBean.xml");

        User user1 = context.getBean("user", User.class);
        User user = (User) context.getBean("user");
        System.out.println(user.toString());

    }

    @Test
    public void testC(){
        ApplicationContext context = new ClassPathXmlApplicationContext("userBean.xml");

        User user1 = context.getBean("user2", User.class);
        System.out.println(user1.toString());

    }

    @Test
    public void testSingleTon(){
        ApplicationContext context = new ClassPathXmlApplicationContext("userBean.xml");

        User user1 = context.getBean("user2", User.class);
        User user2 = context.getBean("user2", User.class);
        System.out.println(user1==user2);
        System.out.println(user1.equals(user2));
        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());

    }

}
