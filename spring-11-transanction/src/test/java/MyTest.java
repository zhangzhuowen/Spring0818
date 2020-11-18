import com.navinfo.mapper.UserMapper;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author zhangZhuoWen
 * @ClassName MyTest
 * @date 2020/10/12 17:29
 * @Description TODO
 */
public class MyTest {

    @Test
    public void testMybatisSpring2() throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);

        System.out.println(userMapper.selectUser());
    }


}
