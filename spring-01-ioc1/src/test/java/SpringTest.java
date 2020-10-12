import com.navinfo.dao.UserDaoMysqlImpl;
import com.navinfo.dao.UserDaoOracleImpl;
import com.navinfo.service.UserService;
import com.navinfo.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhangZhuoWen
 * @ClassName SpringTest
 * @date 2020/8/18 16:00
 * @Description TODO
 */
public class SpringTest {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();


        /**
         * 仔细去思考一下 , 以前所有东西都是由程序去进行控制创建 , 而现在是由我们自行控制创建对象 , 把主动权交给了调用者 . 程序不用去管怎么创建,怎么实现了 . 它只负责提供一个接口 .
         *
         * 这种思想 , 从本质上解决了问题 , 我们程序员不再去管理对象的创建了 , 更多的去关注业务的实现 . 耦合性大大降低 . 这也就是IOC的原型 !
         */
        UserServiceImpl service = new UserServiceImpl();
        service.setUserDao( new UserDaoMysqlImpl() );
        service.getUser();
        service.setUserDao( new UserDaoOracleImpl() );
        service.getUser();

        /**
         * 控制反转IoC(Inversion of Control)，是一种设计思想，DI(依赖注入)是实现IoC的一种方法，个人认为所谓控制反转就是：获得依赖对象的方式反转了(交给了用户)。
         */

    }

    @Test
    public void testConext(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        UserDaoMysqlImpl mysqlImpl = (UserDaoMysqlImpl) context.getBean("mysqlImpl");
//        mysqlImpl.getUser();
        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("userServiceImpl");
        userServiceImpl.getUser();

    }

}
