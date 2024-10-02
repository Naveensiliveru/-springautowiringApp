

package in.naveenit.test;

import java.text.Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.naveenit.AppConfig;
import in.naveenit.bean.ReportService;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	
	  ReportService service=context.getBean(ReportService.class);
	  service.generatedReport();
	}

}
