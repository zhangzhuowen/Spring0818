import com.navinfo.diy.AnnotationPointCut;
import com.navinfo.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.CollectionUtils;

import java.lang.reflect.Array;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author zhangZhuoWen
 * @ClassName SpringTest
 * @date 2020/8/19 13:59
 * @Description TODO
 */
public class SpringTest {
    @Autowired
    public AnnotationPointCut annotationPointCut;

    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserService userService = (UserService) context.getBean("userService");
        userService.select();

    }




}
