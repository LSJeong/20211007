package co.micol.dbprj;

import co.micol.dbprj.db.DevServiceImpl;

public class App 
{
    public static void main( String[] args )
    {
//    	DataSource dao = new DataSource();
    	
    	DevServiceImpl dao = new DevServiceImpl();
    	dao.selectList();
    }
}
