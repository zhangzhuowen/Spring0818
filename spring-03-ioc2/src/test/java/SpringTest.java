import com.navinfo.pojo.User;
import com.navinfo.pojo.UserT;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhangZhuoWen
 * @ClassName SpringTest
 * @date 2020/8/18 17:56
 * @Description TODO
 */
public class SpringTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = (User) context.getBean("user");
        user.show();

        User user2 = (User) context.getBean("qq");
        user2.show();

    }

    @Test
    public void testUserT(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserT user = (UserT) context.getBean("u2");
        user.show();

    }
}
