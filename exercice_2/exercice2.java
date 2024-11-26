public class GestionnaireNotes { 

    // Affiche les notes et leur moyenne
    public void afficherNotesEtMoyenne(String nomEtudiant, int[] notes) {
        System.out.println("Notes de " + nomEtudiant + ":");
        int somme = 0;

        for (int note : notes) {
            System.out.println("- " + note);
            somme += note;
        }

        System.out.println("Moyenne : " + (double) somme / notes.length);
    }
}
