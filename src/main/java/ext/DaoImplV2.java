package ext;

import dao.IDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("dao2")
public class DaoImplV2 implements IDao {

    @Override
    public double getData() {
        System.out.println("version web service");
        double temp = 23;
        return temp;
    }
}
