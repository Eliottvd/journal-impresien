package applic_salle_presse;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 *
 * @author Admin
 */
public class NewsCounterBean implements PropertyChangeListener{
    
    private javax.swing.JLabel _affcompteur;
    public javax.swing.JLabel getAffCompteur(){return _affcompteur;}
    public void setAffCompteur (javax.swing.JLabel aff){_affcompteur=aff;}
    private mainWindow _ref;
    public void setRef(mainWindow mw){_ref=mw;}
    public mainWindow getRef (){return _ref;}
    
    public NewsCounterBean(javax.swing.JLabel affcompteur,mainWindow ref)
    {
        setRef(ref);
        setAffCompteur(affcompteur);
    }
    
    @Override
    public void propertyChange(PropertyChangeEvent even)
    {
        getAffCompteur().setText(Integer.toString((int) even.getNewValue()));
        System.out.println("applic_salle_presse.NewsCounterBean.propertyChange()");
    }
    

}
