import com.navinfo.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author zhangZhuoWen
 * @ClassName MyTest
 * @date 2020/10/12 17:29
 * @Description TODO
 */
public class MyTest {


    @Test
    public void testMybatisSpring() throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);

        System.out.println(userMapper.selectUser());
    }

    @Test
    public void testMybatis() throws IOException {
        String file = "mybatis-config.xml";
        InputStream in = Resources.getResourceAsStream(file);

        //读取文件
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(in);

        //参数可以自动提交事务
        SqlSession sqlSession = sessionFactory.openSession(true);

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        System.out.println(mapper.selectUser());


    }


}
