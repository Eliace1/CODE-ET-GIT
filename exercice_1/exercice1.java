public class FactureManager {
    //class permettant le calcul des facture
    /**
     * calcule les factures totales avec reduction
     * @param typeProduit pour designer le type du produit
     * @param quantite pour designer la quantite du produit
     * @param prixUnitaire designe le prix unitaire du produit
     * @return retourne le total de la facture avec la reduction
     */
    public double calculerFacture(String typeProduit, int quantite, double prixUnitaire) {
        double resultat = calculTotal(quantite,prixUnitaire)(1-reduction(typeProduit));
         if ( resultat> 1000) {
          return  resultat*0.95; 
        }
        return resultat;    
    }
    /**
     * clacule le total sans reduction
     * @return retourne le total sans reduction
     * @param quantite pour designer la quantite du produit
     * @param prixUnitaire designe le prix unitaire du produit
     */
    public double calculTotal(int quantite, double prixUnitaire){
        return quantite*prixUnitaire;
    }
    /**
     * @return retourne la reduction selon le type du produit
     * @param typeProduit entrer le type du produit
     */
    public double reduction(double typeProduit){
        switch(typeProduit){
            case "Alimentaire":return 0.05;break;
            case "Electronique":return 0.1;break;
            case "Luxe": return 0.15;break;
            default : return 0;break;
        }
    }
        
}
