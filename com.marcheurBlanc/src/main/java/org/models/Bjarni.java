package org.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Bjarni {
    private String nom;
    private Emplacement positionInitiale;
    private List<Emplacement> trajectoire;
    Emplacement position;
    Bjarni() {
        this.nom = "Bjarni";
        this.positionInitiale = Emplacement.HEI;
        this.trajectoire = new ArrayList<Emplacement>();
        this.trajectoire.add(Emplacement.HEI);
    }


    public List<Emplacement> seDeplacerHEI() {
        List<Emplacement> baseHEI = new ArrayList<>();
        baseHEI.add(Emplacement.Pullman);
        baseHEI.add(Emplacement.Balance);
        baseHEI.add(Emplacement.Sekolintsika);

        Random random = new Random();
        int randomHEIindex = random.nextInt(baseHEI.size());
        Emplacement emplacementAleatoire = baseHEI.get(randomHEIindex);
        position = emplacementAleatoire;
        trajectoire.add(emplacementAleatoire);

        // Appel de seDeplacerSekolintsika si Sekolintsika est dans la trajectoire
        if (position.equals(Emplacement.Sekolintsika)) {
            this.seDeplacerSekolintsika();
        } else if (position.equals(Emplacement.Pullman)) {
            this.seDeplacerPullman();
        } else if (position.equals(Emplacement.Balance)) {
            this.seDeplacerBalance();
        }

        return trajectoire;
    }

    public List<Emplacement> seDeplacerSekolintsika() {
        List<Emplacement> baseSekolintsika = new ArrayList<>();
        baseSekolintsika.add(Emplacement.Marais);
        baseSekolintsika.add(Emplacement.HEI);

        Random random = new Random();
        int randomSekolintsikaIndex = random.nextInt(baseSekolintsika.size());
        Emplacement emplacementAleatoire = baseSekolintsika.get(randomSekolintsikaIndex);
        position = emplacementAleatoire;
        trajectoire.add(emplacementAleatoire);
        if (position.equals(Emplacement.HEI)){
            this.seDeplacerHEI();
        } else if (position.equals(Emplacement.Marais)) {
            this.seDeplacerMarais();
        }
        return trajectoire;
    }
    public List<Emplacement> seDeplacerMarais() {
        List<Emplacement> baseMarais = new ArrayList<>();
        baseMarais.add(Emplacement.Sekolintsika);

        Random random = new Random();
        int randomMaraisIndex = random.nextInt(baseMarais.size());
        Emplacement emplacementAleatoire = baseMarais.get(randomMaraisIndex);
        position = emplacementAleatoire;
        trajectoire.add(emplacementAleatoire);
        if (position.equals(Emplacement.Sekolintsika)){
            this.seDeplacerSekolintsika();
        }
        return trajectoire;
    }
    public List<Emplacement> seDeplacerPullman() {
        List<Emplacement> basePullman= new ArrayList<>();
        basePullman.add(Emplacement.HEI);
        basePullman.add(Emplacement.Balance);
        basePullman.add(Emplacement.Nexta);

        Random random = new Random();
        int randomPullmanIndex = random.nextInt(basePullman.size());
        Emplacement emplacementAleatoire = basePullman.get(randomPullmanIndex);
        position = emplacementAleatoire;
        trajectoire.add(emplacementAleatoire);
        if (position.equals(Emplacement.HEI)){
            this.seDeplacerHEI();
        } else if (position.equals(Emplacement.Balance)) {
            this.seDeplacerBalance();
        } else if (position.equals(Emplacement.Nexta)) {
            this.seDeplacerNexta();
        }
        return trajectoire;
    }
    public List<Emplacement> seDeplacerBalance() {
        List<Emplacement> baseBalance= new ArrayList<>();
        baseBalance.add(Emplacement.HEI);
        baseBalance.add(Emplacement.Pullman);
        baseBalance.add(Emplacement.Boulevard);
        baseBalance.add(Emplacement.ESTI);


        Random random = new Random();
        int randomPullmanIndex = random.nextInt(baseBalance.size());
        Emplacement emplacementAleatoire = baseBalance.get(randomPullmanIndex);
        position = emplacementAleatoire;
        trajectoire.add(emplacementAleatoire);
        if (position.equals(Emplacement.HEI)){
            this.seDeplacerHEI();
        } else if (position.equals(Emplacement.Pullman)) {
            this.seDeplacerPullman();
        } else if (position.equals(Emplacement.Boulevard)) {
            this.seDeplacerBoulevard();
        }
        return trajectoire;
    }
    public List<Emplacement> seDeplacerNexta() {
        List<Emplacement> baseNexta= new ArrayList<>();
        baseNexta.add(Emplacement.Pullman);



        Random random = new Random();
        int randomNextaIndex = random.nextInt(baseNexta.size());
        Emplacement emplacementAleatoire = baseNexta.get(randomNextaIndex);
        position = emplacementAleatoire;
        trajectoire.add(emplacementAleatoire);
        if (position.equals(Emplacement.Pullman)) {
            this.seDeplacerPullman();
        }
        return trajectoire;
    }

    public List<Emplacement> seDeplacerBoulevard() {
        List<Emplacement> baseBoulevard= new ArrayList<>();
        baseBoulevard.add(Emplacement.ESTI);
        baseBoulevard.add(Emplacement.Balance);

        Random random = new Random();
        int randomBoulevardIndex = random.nextInt(baseBoulevard.size());
        Emplacement emplacementAleatoire = baseBoulevard.get(randomBoulevardIndex);
        position = emplacementAleatoire;
        trajectoire.add(emplacementAleatoire);
        if (position.equals(Emplacement.Balance)) {
            this.seDeplacerBalance();
        }
        else{
            return trajectoire;
        }
        return trajectoire;
    }

}
