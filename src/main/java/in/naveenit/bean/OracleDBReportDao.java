package in.naveenit.bean;

import org.springframework.stereotype.Repository;

@Repository("oracledao")
public class OracleDBReportDao implements ReportDao {

	public void GetData() {
	System.out.println("getting data from oracle report Dao");
		
	}

}
