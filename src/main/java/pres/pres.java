package pres;

import dao.DaoImpl;
import dao.IDao;
import ext.DaoImplV2;
import metier.IMetier;
import metier.MetierImpl;

public class pres {
    public static void main(String[] args) {

        /* Injection des dépendances par instanciation statique*/

        DaoImpl d = new DaoImpl();
        DaoImplV2 dd = new DaoImplV2();
        MetierImpl metier =  new MetierImpl(d);
        MetierImpl metier1 =  new MetierImpl(dd);
        //metier.setDao(d);
        //metier1.setDao(dd);
        System.out.println("Resultat : " + metier.calcul());
        System.out.println("************");
        System.out.println("Resultat : " + metier1.calcul());

    }
}
