package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


public class MetierImpl implements IMetier{
    private IDao dao;

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    public MetierImpl() { }

    @Override
    public double calcul() {
        double t = dao.getData();
        double res = t * 2;
        return res;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
