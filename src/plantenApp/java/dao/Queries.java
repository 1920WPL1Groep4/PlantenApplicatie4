package plantenApp.java.dao;

public interface Queries {
    //region GETBYID
    String GETPLANTBYID = "SELECT * FROM plant WHERE plant_id = ?";

    String GETFENOTYPEBYPLANTID = "SELECT * FROM fenotype WHERE plant_id = ?";
    String GETFENOTYPEMULTIBYPLANTID = "SELECT * FROM fenotype_multi WHERE plant_id = ?";

    String GETABIOTISCHBYPLANTID = "SELECT * FROM abiotische_factoren WHERE plant_id = ?";
    String GETABIOTISCHBMULTIYPLANTID = "SELECT * FROM abiotisch_multi WHERE plant_id = ?";

    String GETCOMMENSALISMEBYPLANTID = "SELECT * FROM commensalisme WHERE plant_id = ?";
    String GETCOMMENSALISMEMULTIBYPLANTID = "SELECT * FROM commensalisme_multi WHERE plant_id = ?";

    String GETBEHEERBYPLANTID = "SELECT * FROM beheer WHERE plant_id = ?";

    String GETEXTRABYPLANTID = "SELECT * FROM extra WHERE plant_id = ?";

    String GETFOTOBYPLANTID = "SELECT * FROM foto WHERE plant_id = ?";
    //endregion

    //region GETIDBYKENMERKEN
    String GETIDSBYPLANT =
            "SELECT plant_id FROM plant WHERE " +
                    "planttype = ? OR  1=? " +
                    "AND " +
                    "familie = ? OR 1=?" +
                    "AND " +
                    "fgsv LIKE ? OR 1=?";

    String GETPLANTSBYSTATUS =
            "SELECT * FROM plant WHERE "+
                    "status = ?";

    String GETIDSBYEXTRA =
            "SELECT plant_id FROM extra WHERE " +
                    "plant_id IN ? " +
                    "AND " +
                    "nectarwaarde = ? OR 1=?" +
                    "AND " +
                    "pollenwaarde = ? OR 1=?" +
                    "AND " +
                    "bijvriendelijk = ? OR 1=?" +
                    "AND " +
                    "eetbaar = ? OR 1=?" +
                    "AND " +
                    "kruidgebruik = ? OR 1=?" +
                    "AND " +
                    "geurend = ? OR 1=?" +
                    "AND " +
                    "vorstgevoelig = ? OR 1=?";

    String GETIDSBYABIO =
            "SELECT plant_id FROM abiotische_factoren " +
                    "WHERE " +
                    "plant_id IN ? " +
                    "AND " +
                    "bezonning = ? OR 1=?" +
                    "AND " +
                    "grondsoort = ? OR 1=?" +
                    "AND " +
                    "vochtbehoefte = ? OR 1=?" +
                    "AND " +
                    "voedingsbehoefte = ? OR 1=?" +
                    "AND " +
                    "reactie_antagonistische_omg = ? OR 1=?";
    String GETIDSBYABIOMULTI =
            "SELECT plant_id FROM abiotische_factoren " +
                    "WHERE " +
                    "plant_id IN ? " +
                    "AND " +
                    "eigenschap = ? "+
                    "AND " +
                    "waarde = ? OR 1=?";

    String GETIDSBYCOMM =
            "SELECT plant_id FROM commensalisme " +
                    "WHERE " +
                    "plant_id IN ? " +
                    "AND " +
                    "strategie = ? OR 1=?" +
                    "AND " +
                    "ontwikkelingssnelheid = ? OR 1=?";
    String GETIDSBYCOMMMULTI =
            "SELECT plant_id FROM commensalisme_multi " +
                    "WHERE " +
                    "plant_id IN ? " +
                    "AND " +
                    "eigenschap = ? "+
                    "AND " +
                    "waarde = ? OR 1=?";

    String GETIDSBYFENO =
            "SELECT plant_id FROM commensalisme " +
                    "WHERE " +
                    "plant_id IN ? " +
                    "AND " +
                    "bladvorm = ? OR 1=?" +
                    "AND " +
                    "levensvorm = ? OR 1=?" +
                    "AND " +
                    "habitus = ? OR 1=?" +
                    "AND " +
                    "bloeiwijze = ? OR 1=?" +
                    "AND " +
                    "bladgrootte = ? OR 1=?" +
                    "AND " +
                    "ratio_bloei_blad = ? OR 1=?" +
                    "AND " +
                    "spruitfenologie = ? OR 1=?";
    String GETIDSBYFENOMULTI =
            "SELECT plant_id FROM commensalisme_multi " +
                    "WHERE " +
                    "plant_id IN ? " +
                    "AND " +
                    "eigenschap = ? "+
                    "AND " +
                    "jan = ? OR 1=?" +
                    "AND " +
                    "feb = ? OR 1=?" +
                    "AND " +
                    "maa = ? OR 1=?" +
                    "AND " +
                    "apr = ? OR 1=?" +
                    "AND " +
                    "mei = ? OR 1=?" +
                    "AND " +
                    "jun = ? OR 1=?" +
                    "AND " +
                    "jul = ? OR 1=?" +
                    "AND " +
                    "aug = ? OR 1=?" +
                    "AND " +
                    "sep = ? OR 1=?" +
                    "AND " +
                    "okt = ? OR 1=?" +
                    "AND " +
                    "nov = ? OR 1=?" +
                    "AND " +
                    "dec = ? OR 1=?";
    String GETIDSBYBEHEER =
            "SELECT plant_id FROM Beheer " +
                    "WHERE " +
                    "plant_id IN ? " +
                    "AND " +
                    "beheerdaad = ? OR 1=? "+
                    "AND " +
                    "maand = ? OR 1=?" +
                    "AND " +
                    "frequentie_jaar = ? OR 1=?";
//endregion

    //region NAAKTETABELLEN

    String NTTYPE =
            "SELECT planttype_naam FROM planttype";

    String NTFAMILIE =
            "SELECT familie_naam FROM familie";

    String NTLEVENSDUURCONCURRENTIEKRACHT =
            "SELECT waarde FROM levensduur_concurrentiekracht";

    String NTSTRATEGIE =
            "SELECT waarde FROM strategie";

    String NTONTWIKKELINGSSNELHEID =
            "SELECT waarde FROM ontwikkelingssnelheid";

    String NTVOEDINGSBEHOEFTE =
            "SELECT waarde FROM voedingsbehoefte";

    String NTVOCHTBEHOEFTE =
            "SELECT waarde FROM vochtbehoefte";

    String NTHABITAT =
            "SELECT waarde FROM habitat";

    String NTREACTIEOMGEVING =
            "SELECT waarde FROM reactieomgeving";

    String NTGRONDSOORT =
            "SELECT waarde FROM grondsoort";

    String NTBEZONNING =
            "SELECT waarde FROM bezonning";

    String NTHABITUS =
            "SELECT waarde FROM habitus";

    String NTKLEUREN =
            "SELECT kleur FROM kleuren";

    String NTBLADVORM =
            "SELECT waarde FROM bladvorm";

    String NTRATIOBLOEIBLAD =
            "SELECT waarde FROM ratio_bloeiblad";

    String NTSPRUITFENOLOGIE =
            "SELECT waarde FROM spruitfenologie";

    String NTBLOEIWIJZE =
            "SELECT waarde FROM bloeiwijze";

    String NTSOCIABILITEIT =
            "SELECT waarde FROM sociabiliteit";

    String NTBEHEERDAAD =
            "SELECT waarde FROM beheerdaad";

    String NTNECTARWAARDE =
            "SELECT waarde FROM nectarwaarde";

    String NTPOLLENWAARDE =
            "SELECT waarde FROM pollenwaarde";

    String NTBLADGROOTTE =
            "SELECT waarde FROM maxbladgrootte";

    String NTLEVENSVORM =
            "SELECT waarde FROM levensvorm";

    String NTFOTOHABITUS =
            "SELECT afbeelding FROM habitus";

    String NTFOTOBlOEIWIJZE =
            "SELECT afbeelding FROM bloeiwijze";
    //endregion

    //Groep 4
    //Insert queries voor toevoegen
    String INSERTABIOTISCHEFMULTI =
            "INSERT INTO abiotisch_multi(plant_id, eigenschap, waarde)" +
                    "VALUES(?, ?, ?)";

    String INSERTABIOTISCHEF =
            "INSERT INTO abiotische_factoren(plant_id, bezonning, grondsoort, vochtbehoefte, voedingsbehoefte, reactie_antagonistische_omg) " +
                    "VALUES (?, ?, ?, ?, ?, ?)";

    String INSERTBEHEER =   "INSERT INTO beheerdaad (waarde)" +
            "VALUES(?)";

    String INSERTBEHEERMULTI =
            "INSERT INTO beheer_multi(plant_id, beheerdaad, opmerking, maand, frequentie_jaar)" +
                    "VALUES(?, ?, ?, ?, ?)";

    String INSERTSTANDAARD =
            "INSERT INTO plant (planttype, familie, geslacht, soort, variatie, plantdichtheid_min, plantdichtheid_max, fgsv, status, laatste_update_datum) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?,?)";

    String INSERTCOMMESALISME =
            "INSERT INTO commensalisme(plant_id, strategie, ontwikkelingssnelheid)" +
                    "VALUES(?, ?, ?)";

    String INSERTCOMMESALISMEMULTI =
            "INSERT INTO commensalisme_multi(plant_id, eigenschap, waarde)" +
                    "VALUES(?, ?, ?)";

    String INSERTEXTRA =

            "INSERT INTO extra(plant_id, nectarwaarde, pollenwaarde, bijvriendelijk, vlindervriendelijk, eetbaar, kruidgebruik, geurend, vorstgevoelig)" +
                    "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";


    String INSERTFENOTYPE =
            "INSERT INTO fenotype(plant_id, bladvorm, levensvorm, habitus, bloeiwijze, bladgrootte, ratio_bloei_blad, spruitfenologie)" +
                    "VALUES(?, ?, ?, ?, ?, ?, ?, ?)";

    String INSERTFENOTYPEMULTI =
            "INSERT INTO fenotype_multi(plant_id,eigenschap, jan, feb, maa, apr, mei, jun, jul, aug, sep, okt, nov, dec)" +
                    "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

    String INSERTFOTO =
            "INSERT INTO foto(plant_id, eigenschap, url, figuur)" +
                    "VALUES(?, ?, ?, ?)";

    //Insert queries voor naaktetabellen
    String INSERTBEHEERDAAD =
            "INSERT INTO beheerdaad(waarde)" +
                    "VALUES(?)";

    String INSERTBEZONNING =
            "INSERT INTO bezonning(waarde) VALUES(?)";

    String INSERTBLADVORM =
            "INSERT INTO bladvorm(waarde) VALUES(?)";

    String INSERTBLOEIWIJZE =
            "INSERT INTO bloeiwijze(waarde) VALEUS(?)";

    String INSERTFAMILIE =
            "INSERT INTO familie(familie_naam, planttype_id) VALUES(?, ?)";

    String INSERTGESLACHT =
            "INSERT INTO geslacht(geslacht_naam, familie_id) VALUES(?, ?)";

    String INSERTGRONDSOORT =
            "INSERT INTO grondsoort(waarde) VALUES(?)";

    String INSERTHABITAT =
            "INSERT INTO habitat(waarde, afkorting) VALUES(?, ?)";

    String INSERTHABITUS =
            "INSERT INTO habitus(waarde, afbeelding) VALUES(?, ?)";

    String INSERTKLEUR =
            "INSERT INTO kleuren(kleur) VALUES(?)";

    String INSERTLEVENSDUUR =
            "INSERT INTO levenduur_concurrentiekracht(waarde) VALUES (?)";

    String INSERTMAXBLADGROOTTE =
            "INSERT INTO maxbladgrootte(waarde) VALUES(?)";

    String INSERTNECTARWAARDE =
            "INSERT INTO nectarwaarde(waarde) VALUES(?)";

    String INSERTONTWIKKELINGSSNELHEID =
            "INSERT INTO ontwikkelingssnelheid(waarde) VALUES(?)";

    String INSERTPOLLENWAARDE =
            "INSERT INTO pollenwaarde(waarde) VALUES(?)";

    String INSERTRATIO =
            "INSERT INTO ratio_bloeiblad(waarde) VALUES(?)";

    String INSERTREACTIEOMGEVING =
            "INSERT INTO reactieomgeving(waarde) VALUES(?)";

    String INSERTSOCIABILITEIT =
            "INSERT INTO sociabiliteit(waarde) VALUES(?)";

    String INSERTSOORT =
            "INSERT INTO soort(soort_naam, geslacht_id) VALUES(?, ?)";

    String INSERTSPRUITFENOLOGIE =
            "INSERT INTO spruitfenologie(waarde) VALUES(?)";

    String INSERTSTRATEGIE =
            "INSERT INTO strategie(waarde) VALUES(?)";

    String INSERTPLANTTYPE =
            "INSERT INTO planttype(planttype_naam) VALUES(?)";

    String INSERTVARIATIE =
            "INSERT INTO variatie(variatie_naam, soort_id) VALUES(?,?)";

    String INSERTVOCHTBEHOEFTE =
            "INSERT INTO vochtbehoefte(waarde) VALUES(?)";

    String INSERTVOEDINGSBEHOEFTE =
            "INSERT INTO voedingsbehoeft(waarde) VALUES(?)";

    String INSERTFOTOEIG =
            "INSERT INTO foto (plant_id, eigenschap, url, figuur)" +
                    "VALUES (?,?,?,?)";


    String UPDATESTATUSBYID =
           "UPDATE plant SET status = ? WHERE plant_id= ?";

    //Update queries voor aanpassen/wijzigen
    String UPDATEABIOTISCHEFMULTI =
            "UPDATE abiotisch_multi" +
                    "SET plant_id = plant_id, eigenschap = ?, waarde = ?" +
                    "WHERE plant_id = ?";

    String UPDATEABIOTISCHEF =
            "UPDATE abiotische_factoren" +
                    "SET plant_id = plant_id, bezonning = ?, grondsoort = ?, vochtbehoefte = ?, voedingsbehoefte = ?, reactie_antagonistische_omg = ?" +
                    "WHERE plant_id = ?";

    String UPDATEBEHEERMULTI =
            "UPDATE beheer_multi" +
                    "SET plant_id = plant_id, beheerdaad = ?, opmerking = ?, maand = ?, frequentie_jaar = ?" +
                    "WHERE plant_id = ?";

    String UPDATEPLANT =
            "UPDATE plant" +
                    "SET planttypt = ?, familie = ?, geslacht = ?, variatie = ?, plantdichtheid_min = ?, plantdichtheid_max = ?, fgsv = ?, status = ?, laatste_update_door = ?,  laatste_update_datum = ?" +
                    "WHERE plant_id = ?";

    String UPDATECOMMENSALISME =
            "UPDATE commensalisme" +
                    "SET plant_id = plant_id, strategie = ?, ontwikkelingssnelheid = ?" +
                    "WHERE plant_id = plant_id";

    String UPDATECOMMENSALISMEMULTI =
            "UPDATE commensalisme_multi" +
                    "SET plant_id = plant_id, eigenschap = ?, waarde = ?" +
                    "WHERE plant_id= ?";

    String UPDATEEXTRA =
            "UPDATE extra" +
                    "SET plant_id = plant_id, nectarwaarde = ?, pollenwaarde = ?, bijvriendelijk = ?, vlindervriendelijk = ?, eetbaar = ?, kruidgebruik = ?, geurend = ?, vorstgevoelig = ?" +
                    "WHERE plant_id = ?";

    String UPDATEFENOTYPE =
            "UPDATE fenotype" +
                    "SET plant_id = plant_id, bladvor = ?, levensvorm = ?, habitus = ?, bloeiwijze = ?, bladgrootte = ?, ratio_bloei_blad = ?, spruitfenologie = ?" +
                    "WHERE plant_id = ?";

    String UPDATEFENOTYPEMULTI =
            "UPDATE fenotype_multi" +
                    "SET plant_id = plant_id, eigenschap = ?, jan = ?, feb = ?, maa = ?, apr = ?, mei = ?, jun = ?, jul = ?, aug = ?, sep = ?, okt = ?, nov = ?, dec = ?" +
                    "WHERE plant_id = ?";

    //Update queries voor naakte tabellen
    String UPDATEBEHEERDAAD =
            "UPDATE beheerdaad" +
                    "SET waarde = ?";

    String UPDATEBEZONNING =
            "UPDATE bezonning" +
                    "SET waarde + ?";

    String UPDATEBLADVORM =
            "UPDATE bladvorm" +
                    "SET waarde = ?";

    String UPDATEBLOEIWIJZE =
            "UPDATE bloeiwijze" +
                    "SET waarde = ?";

    String UPDATEFAMILIE =
            "UPDATE familie" +
                    "SET familie_naam = ?, planttype_id = planttype_id" +
                    "WHERE planttype_id = ?";

    String UPDATEGESLACHT =
            "UPDATE geslacht" +
                    "SETgeslacht_naam = ?, familie_id = familie_id" +
                    "WHERE familie_id = ?";

    String UPDATEGRONDSOORT =
            "UPDATE grondsoort" +
                    "SET waarde = ?";

    String UPDATEHABITAT =
            "UPDATE habitat" +
                    "SET waarde = ?, afkorting = ?";

    String UPDATEHABITUS =
            "UPDATE habitus" +
                    "SET waarde = ?, afbeelding = ?";

    String UPDATEKLEUR =
            "UPDATE kleuren" +
                    "SET kleur = ?";

    String UPDATELEVENSDUUR =
            "UPDATE levenduur_concurrentiekracht" +
                    "SET waarde = ?";

    String UPDATEMAXBLADGROOTTE =
            "UPDATE maxbladgrootte" +
                    "SET waarde = ?";

    String UPDATENECTARWAARDE =
            "UPDATE nectarwaarde" +
                    "SET waarde = ?";

    String UPDATEONTWIKKELINGSSNELHEID =
            "UPDATE ontwikkelingssnelheid" +
                    "SET waarde = ?";

    String UPDATEPOLLENWAARDE =
            "UPDATE pollenwaarde" +
                    "SET waarde = ?";

    String UPDATERATIO =
            "UPDATE ratio_bloeiblad" +
                    "SET waarde = ?";

    String UPDATEREACTIEOMGEVING =
            "UPDATE reactieomgeving" +
                    "SET waarde = ?";

    String UPDATESOCIABILITEIT =
            "UPDATE sociabiliteit" +
                    "SET waarde = ?";

    String UDATESOORT =
            "UPDATE soort" +
                    "SET soort_naam = ?, geslacht_id = geslacht_id" +
                    "WHERE geslacht_id = ?";

    String UPDATESPRUITFENOLOGIE =
            "UPDATE spruitfenologie" +
                    "SET waarde = ?";

    String UPDATESTRATEGIE =
            "UPDATE strategie" +
                    "SET waarde = ?";

    String UPDATETYPE =
            "UPDATE planttype" +
                    "SET planttype_id = planttyper_id, type_naam = ?" +
                    "WHERE planttype_id = ?";

    String UPDATEVARIATIE =
            "UPDATE variatie" +
                    "SET variatie_naam = ?, soort_id = soort_id" +
                    "WHERE soort_id = ?";

    String UPDATEVOCHTBEHOEFTE =
            "UPDATE vochtbehoefte" +
                    "SET waarde = ?";

    String UPDATEVOEDINGSBEHOEFTE =
            "UPDATE voedingsbehoeft" +
                    "SET waarde = ?";

    //Queries voor toevoegen naam
    String SELECTDUBBELENAAM = "select COUNT(*) from familie f,geslacht g,soort s,variatie v, planttype p " +
            "where p.planttype_naam = ? and f.familie_naam = ? and g.geslacht_naam = ? and s.soort_naam = ? and v.variatie_naam = ? " +
            "and f.familie_id = g.familie_id and g.geslacht_id = s.geslacht_id";
    String SELECTIDPLANTTYPE = "select planttype_id from planttype where planttype_naam = ?";
    String SELECTDUBBELEFAMILIE = "if exists (select familie_id from familie where familie_naam = ?) " +
            "select familie_id from familie where familie_naam = ? else select 0";
    String SELECTDUBBELEGESLACHT = "if exists (select geslacht_id from geslacht where geslacht_naam = ?) " +
            "select geslacht_id from geslacht where geslacht_naam = ? else select 0";
    String SELECTDUBBELESOORT = "if exists (select soort_id from soort where soort_naam = ?) " +
            "select soort_id from soort where soort_naam = ? else select 0";
    String SELECTDUBBELEVARIATIE = "if exists (select variatie_id from variatie where variatie_naam = ?) " +
            "select variatie_id from variatie where variatie_naam = ? else select 0";

}











