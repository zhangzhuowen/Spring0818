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
    public void testMybatisSpring1() throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);

        System.out.println(userMapper.selectUser());
    }

    /**
     * testMybatisSpring2(自己在XML中创建sqlSession) 比  testMybatisSpring1好（继承类帮忙创建sqlSession）
     *
     * @throws IOException
     */
    @Test
    public void testMybatisSpring2() throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = context.getBean("userMapper2", UserMapper.class);

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
