package in.naveenit.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository("mySqlDBReportDao")
@Primary
public class MySqlDBReportDao  implements    ReportDao{

	public void GetData() {
		System.out.println(" getting data from oracle DB Dao");
		
	}

}
