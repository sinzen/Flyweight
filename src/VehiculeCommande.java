
import java.util.ArrayList;

/**
 * Created by yassirhessane on 13/08/16.
 */
public class VehiculeCommande {
    
    protected ArrayList<OptionVehicule> options = new ArrayList<>();
    
    protected ArrayList<Integer> prixDeVenteOptions = new ArrayList<>();
    
    public void ajouteOptions(String nom,int prixDeVente, FabriqueOption fabrique)
    {
        this.options.add(fabrique.getOption(nom));
        this.prixDeVenteOptions.add(prixDeVente);
    }
    public void afficheOptions()
    {
        for (int i=0;i<this.options.size();i++)
        {
            options.get(i).affiche(String.valueOf(this.prixDeVenteOptions.get(i)));

        }
    }
}
