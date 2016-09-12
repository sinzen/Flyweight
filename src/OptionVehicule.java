/**
 * Created by yassirhessane on 13/08/16.
 */
public class OptionVehicule {

    protected String nom;
    protected String description;
    protected int prixStandard;

    public OptionVehicule(String nom) {
        this.nom =  nom;
        this.description = "Description de => "+nom;
        prixStandard = 100;
    }

    public void affiche(String prixDeVente)
    {
        System.out.println("Option");
        System.out.println("Nom: "+this.nom);
        System.out.println(this.description);
        System.out.println("Prix standard : "+this.prixStandard);
        System.out.println("Prix de vente : "+prixDeVente);

    }
}
