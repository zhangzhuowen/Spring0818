import com.navinfo.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhangZhuoWen
 * @ClassName SpringTest
 * @date 2020/8/18 16:57
 * @Description TODO
 */
public class SpringTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans/bens.xml");
        Hello hello = (Hello) context.getBean("hello");
        System.out.println(hello.toString());

    }
}
