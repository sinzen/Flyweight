import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * Created by yassirhessane on 13/08/16.
 */
public class FabriqueOption {

    protected ArrayList<OptionVehicule> options = new ArrayList<>();

    public OptionVehicule getOption(String nom)
    {
        OptionVehicule resultat = null;
        if (this.options.contains(nom))
        {
            for (int i=0;i<options.size();i++)
            {
                resultat = this.options.get(i);
            }
        }
        else{
            resultat = new OptionVehicule(nom);
            this.options.add(resultat);
        }
        return resultat;
    }
}
