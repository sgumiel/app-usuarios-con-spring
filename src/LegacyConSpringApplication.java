import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LegacyConSpringApplication {

  public static void main(String[] args) {

    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

    final PrincipalService principalService = (PrincipalService) applicationContext.getBean("principalService");
    principalService.execute(args);
  }
}
