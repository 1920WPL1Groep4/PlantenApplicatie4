package plantenApp.java.model;


import java.sql.Date;

/**
 * @author Siebe
 */
public class Plant {
    private Integer id;
    private String planttype;
    private String familie;
    private String geslacht;
    private String soort;
    private String variatie;
    private Integer minPlantdichtheid;
    private Integer maxPlantdichtheid;
    private String fgsv;
    private Integer status;
    private java.sql.Date laatsteupdatedatum;

    public java.sql.Date getLaatsteupdatedatum() {
        return laatsteupdatedatum;
    }

    public void setLaatsteupdatedatum(java.sql.Date laatsteupdatedatum) {
        this.laatsteupdatedatum = laatsteupdatedatum;
    }

    public String getFgsv() {
        return fgsv;
    }

    public void setFgsv(String fgsv) {
        this.fgsv = fgsv;
    }

    private AbiotischeFactoren abiotischeFactoren;
    private Beheer beheer;
    private Commensalisme commensalisme;
    private Beheerdaad_Eigenschap beheerdaad_eigenschap;
    private Extra extra;
    private FenoMulti_Eigenschap fenoMulti_eigenschap;
    private Foto foto;
    private Fenotype fenotype;
    private Foto_Eigenschap foto_eigenschap;
    private InfoTables infoTables;

    //Constructor met id
    public Plant(int id, String planttype, String familie, String geslacht, String soort, String variatie, int minPlantdichtheid, int maxPlantdichtheid, String fgsv, int status, java.sql.Date lastupdatedatum) {
        this.id = id;
        this.planttype = planttype;
        this.familie = familie;
        this.geslacht = geslacht;
        this.soort = soort;
        this.variatie = variatie;
        this.fgsv = fgsv;
        this.minPlantdichtheid = minPlantdichtheid;
        this.maxPlantdichtheid = maxPlantdichtheid;
        this.status = status;
        this.laatsteupdatedatum = lastupdatedatum;

    }
    public Plant(Plant plant) {
        this.id = plant.getId();
        this.planttype = plant.getType();
        this.familie = plant.getFamilie();
        this.geslacht = plant.getGeslacht();
        this.soort = plant.getSoort();
        this.variatie = plant.getVariatie();
        this.minPlantdichtheid = plant.getMinPlantdichtheid();
        this.maxPlantdichtheid = plant.getMaxPlantdichtheid();
        this.fgsv=plant.getFgsv();
        this.status = plant.getStatus();
        this.laatsteupdatedatum = plant.getLaatsteupdatedatum();

    }

    //Constructor voor Insert : id wordt gegenereerd door de database.
    public Plant(String planttype, String familie, String geslacht, String soort, String variatie,Integer minPlantdichtheid, Integer maxPlantdichtheid, String fgsv, int status, Date lastupdatedatum) {
        this.planttype = planttype;
        this.familie = familie;
        this.geslacht = geslacht;
        this.soort = soort;
        this.variatie = variatie;
        this.minPlantdichtheid = minPlantdichtheid;
        this.maxPlantdichtheid = maxPlantdichtheid;
        this.fgsv = fgsv;
        this.status = status;
        this.laatsteupdatedatum = lastupdatedatum;

    }

    //Constructor voor PlantNaam
    public Plant(String planttype, String familie, String geslacht, String soort, String variatie) {
        this.planttype = planttype;
        this.familie = familie;
        this.geslacht = geslacht;
        this.soort = soort;
        this.variatie = variatie;
    }

    public Plant(int id){
        this.id = id;
    }

    //Plant_id wordt gegenereerd door de database.
    //gebeurt enkel als niet gebeurd is. Primary key!
    public void setId(int id) {
        if (this.id != null) {
            throw new UnsupportedOperationException("Id change not permitted");
        }
        this.id = id;
    }


    public int getId() {
        return id;
    }

    public String getType() {
        return planttype;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "id=" + id +
                ", planttype='" + planttype + '\'' +
                ", familie='" + familie + '\'' +
                ", geslacht='" + geslacht + '\'' +
                ", soort='" + soort + '\'' +
                ", variatie='" + variatie + '\'' +
                ", minPlantdichtheid=" + minPlantdichtheid +
                ", maxPlantdichtheid=" + maxPlantdichtheid +
                ", fgsv='" + fgsv + '\'' +
                ", status=" + status + '\'' +


                '}';
    }

    public String getFamilie() {
        return familie;
    }

    public String getGeslacht() {
        return geslacht;
    }

    public String getSoort() {
        return soort;
    }

    public String getVariatie() {
        return variatie;
    }

    public int getMinPlantdichtheid() {
        return minPlantdichtheid;
    }

    public int getMaxPlantdichtheid() {
        return maxPlantdichtheid;
    }

    public AbiotischeFactoren getAbiotischeFactoren() {
        return abiotischeFactoren;
    }

    public void setAbiotischeFactoren(AbiotischeFactoren abiotischeFactoren) {
        this.abiotischeFactoren = abiotischeFactoren;
    }

    public Beheer getBeheer() {
        return beheer;
    }

    public void setBeheer(Beheer beheer) {
        this.beheer = beheer;
    }

    public Beheerdaad_Eigenschap getBeheerdaad_eigenschap() {
        return beheerdaad_eigenschap;
    }

    public void setBeheerdaad_eigenschap(Beheerdaad_Eigenschap beheerdaad_eigenschap) {
        this.beheerdaad_eigenschap = beheerdaad_eigenschap;
    }

    public Commensalisme getCommensalisme() {
        return commensalisme;
    }

    public void setCommensalisme(Commensalisme commensalisme) {
        this.commensalisme = commensalisme;
    }

    public Extra getExtra() {
        return extra;
    }

    public void setExtra(Extra extra) {
        this.extra = extra;
    }

    public FenoMulti_Eigenschap getFenoMulti_eigenschap() {
        return fenoMulti_eigenschap;
    }

    public void setFenoMulti_eigenschap(FenoMulti_Eigenschap fenoMulti_eigenschap) {
        this.fenoMulti_eigenschap = fenoMulti_eigenschap;
    }

    public Fenotype getFenotype() {
        return fenotype;
    }

    public void setFenotype(Fenotype fenotype) {
        this.fenotype = fenotype;
    }

    public Foto getFoto() {
        return foto;
    }

    public void setFoto(Foto foto) {
        this.foto = foto;
    }

    public Foto_Eigenschap getFoto_eigenschap() {
        return foto_eigenschap;
    }

    public void setFoto_eigenschap(Foto_Eigenschap foto_eigenschap) {
        this.foto_eigenschap = foto_eigenschap;
    }

    public InfoTables getInfoTables() {
        return infoTables;
    }

    public void setInfoTables(InfoTables infoTables) {
        this.infoTables = infoTables;
    }


    public int getStatus() {
        return status;
    }




    public void setStatus(int status) {
        this.status = status;
    }
}
