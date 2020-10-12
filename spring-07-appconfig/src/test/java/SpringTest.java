import com.navinfo.config.MyConfig;
import com.navinfo.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhangZhuoWen
 * @ClassName SpringTest
 * @date 2020/8/19 13:59
 * @Description TODO
 */
public class SpringTest {

    @Test
    public void test(){
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        User getUser = context.getBean("getUser", User.class);

        System.out.println(getUser.toString());

    }


}
