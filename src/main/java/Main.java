import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Cat cat = (Cat) context.getBean("cat");
        System.out.println("Cat colour is " + cat.getColor());
    }

}
