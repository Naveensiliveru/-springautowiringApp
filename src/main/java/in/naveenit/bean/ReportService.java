package in.naveenit.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ReportService {
	@Autowired
@Qualifier("Mysqldao")
 private ReportDao dao;
	 public void  generatedReport() {
		 dao.GetData();
		 System.out.println("Report Generated");
		 
	 }
}
