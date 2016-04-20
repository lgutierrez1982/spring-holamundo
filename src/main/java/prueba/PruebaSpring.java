package prueba;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import beans.BeanSpring;

public class PruebaSpring {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");//manda a llamar al applicationContext.xml
		BeanFactory factory = context;// Fabrica de Spring
		BeanSpring miBean = (BeanSpring) factory.getBean("miBean");//se solicita el bean a Spring definido en el applicationContext
		System.out.println("Mensaje: " + miBean.getMensaje());
	}
}
