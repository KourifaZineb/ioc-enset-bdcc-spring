package pres;

import dao.DaoImpl;
import dao.IDao;
import ext.DaoImplV2;
import metier.IMetier;
import metier.MetierImpl;

public class pres {
    public static void main(String[] args) {
        DaoImpl d = new DaoImpl();
        DaoImplV2 dd = new DaoImplV2();
        MetierImpl metier =  new MetierImpl();
        MetierImpl metier1 =  new MetierImpl();
        metier.setDao(d);
        metier1.setDao(dd);
        System.out.println(metier.calcul());
        System.out.println("************");
        System.out.println(metier1.calcul());

    }
}
