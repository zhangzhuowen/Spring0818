import com.navinfo.bean.Person;
import com.navinfo.config.MainConfig;
import com.navinfo.config.MainConfig2;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * @author zhangZhuoWen
 * @ClassName testAnno
 * @date 2020/12/16 15:23
 * @Description TODO
 */
public class testAnno {


    @Test
    public void testConfiguration() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        Person bean = context.getBean(Person.class);
        System.out.println(bean);

        String[] namesForType = context.getBeanNamesForType(Person.class);

        for (String str : namesForType) {
            System.out.println(str);
        }
    }

    @Test
    public void testComponentScan() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] beanDefinitionNames = context.getBeanDefinitionNames();

        for (String str : beanDefinitionNames) {
            System.out.println(str);
        }
    }


    @Test
    public void testConfiguration2() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig2.class);
        Person bean = context.getBean(Person.class);
        System.out.println(bean);

        String[] namesForType = context.getBeanNamesForType(Person.class);

        for (String str : namesForType) {
            System.out.println(str);
        }
        Person bean1 = context.getBean(Person.class);

        Person bean2 = context.getBean(Person.class);


        System.out.println(bean1 == bean2);

    }

    @Test
    public void testConditional() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig2.class);
        String[] namesForType = context.getBeanNamesForType(Person.class);

        for (String str : namesForType) {
            System.out.println(str);
        }

        Map<String, Person> persons = context.getBeansOfType(Person.class);
        System.out.println(persons);
    }

    @Test
    public void testImport() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig2.class);
        String[] beanDefinitionNames = context.getBeanDefinitionNames();

        for (String str : beanDefinitionNames) {
            System.out.println(str);
        }
    }
}
