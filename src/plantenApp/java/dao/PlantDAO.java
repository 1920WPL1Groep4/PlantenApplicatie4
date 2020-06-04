package plantenApp.java.dao;

import plantenApp.java.model.Plant;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**@author Siebe*/
public class PlantDAO implements Queries {

    private Connection dbConnection;

    private static final String INSERTSTANDAARD =
            "INSERT INTO plant (type, familie, geslacht, soort, variatie, plantdichtheid_min, plantdichtheid_max, fgsv) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

    private PreparedStatement stmtSelectById;
    private PreparedStatement stmtSelectByPlant;

    private PreparedStatement stmtInsertByStandard;

    public PlantDAO(Connection dbConnection) throws SQLException {
        this.dbConnection = dbConnection;
        stmtSelectById = dbConnection.prepareStatement(GETPLANTBYID);
        stmtSelectByPlant = dbConnection.prepareStatement(GETIDSBYPLANT);

        stmtInsertByStandard = dbConnection.prepareStatement(INSERTSTANDAARD,
                Statement.RETURN_GENERATED_KEYS);
    }

    /**
     * @param id -> plant_id
     * @return -> alle basis factoren van de specifieke plant
     * @author Siebe
     */
    public Plant getPlantById(int id) throws SQLException {
        Plant plant = null;

        stmtSelectById.setInt(1, id);
        ResultSet rs = stmtSelectById.executeQuery();
        if (rs.next()) {
            plant = new Plant(
                    rs.getInt("plant_id"),
                    rs.getString("type"),
                    rs.getString("familie"),
                    rs.getString("geslacht"),
                    rs.getString("soort"),
                    rs.getString("variatie"),
                    rs.getInt("plantdichtheid_min"),
                    rs.getInt("plantdichtheid_max")
            );
        }
        return plant;
    }
    public void createPlant(Plant plant) throws SQLException {
        stmtInsertByStandard.setString(1, plant.getType());
        stmtInsertByStandard.setString(2, plant.getFamilie());
        stmtInsertByStandard.setString(3, plant.getGeslacht());
        stmtInsertByStandard.setString(4, plant.getSoort());
        stmtInsertByStandard.setString(5, plant.getVariatie());
        stmtInsertByStandard.setInt(6, plant.getMinPlantdichtheid());
        stmtInsertByStandard.setInt(7, plant.getMaxPlantdichtheid());
        stmtInsertByStandard.setString(8, plant.getFgsv());
        stmtInsertByStandard.executeUpdate();
        ResultSet rs = stmtInsertByStandard.getGeneratedKeys();
        rs.next();
        Integer plant_id = rs.getInt(1);
        plant.setId(plant_id);
    }
}
