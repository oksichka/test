package lgs.service.imp;

import lgs.dao.BookD;
import lgs.dao.imp.BookDI;
import lgs.service.BookS;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("/META-INF/appContext.xml");
			
		
			BookS bookS = applicationContext.getBean(BookS.class);
			bookS.save("bukvar");
		
//		BookDI bookDI = applicationContext.getBean(BookDI.class);
		
		applicationContext.close();
		
	}

}
