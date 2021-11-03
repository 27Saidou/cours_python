public class Candidat {
    private String code;
    private String nom, prenom, parti, sexe, nationalite;

    public Candidat() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getParti() {
        return parti;
    }

    public void setParti(String parti) {
        this.parti = parti;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public static void main(String[] args) {
        Candidat nbcandidat = new Candidat();
        nbcandidat.setCode("0021GN");
        nbcandidat.setNom("Diallo");
        nbcandidat.setPrenom("Massoud");
        nbcandidat.setSexe("Masculin");
        nbcandidat.setNationalite("Americain");
        nbcandidat.setParti("Republicain");
        System.out.println(nbcandidat.getCode());
        System.out.println(nbcandidat.getNom());
        System.out.println(nbcandidat.getPrenom());
        System.out.println(nbcandidat.getSexe());
        System.out.println(nbcandidat.getNationalite());
        System.out.println(nbcandidat.getParti());
    }
}
