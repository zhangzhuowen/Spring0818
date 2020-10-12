import com.navinfo.pojo.People;
import com.navinfo.pojo.PeopleX;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhangZhuoWen
 * @ClassName SpringTest
 * @date 2020/8/19 13:59
 * @Description TODO
 */
public class SpringTest {

    @Test
    public void testAutowired(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        People people = context.getBean("people", People.class);
        people.getDog().shout();
        people.getCat().shout();

    }

    @Test
    public void testRescource(){
        ApplicationContext context = new ClassPathXmlApplicationContext("RescourceBeans.xml");
        PeopleX people = context.getBean("people", PeopleX.class);
        people.getDog().shout();
        people.getCat().shout();

    }

}
