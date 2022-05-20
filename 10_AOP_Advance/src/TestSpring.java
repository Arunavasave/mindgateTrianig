import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sky.aop.ApplicationService;

public class TestSpring {
	public static void main(String[] args) {
		ApplicationContext beanfactory = new ClassPathXmlApplicationContext("new.xml");
		
		//Aspect
		ApplicationService annoservice = (ApplicationService)beanfactory.getBean(ApplicationService.class);
		System.out.println(annoservice);
		annoservice.processApplication();
		annoservice.processApplicationWithAudit();
		
	}

}
