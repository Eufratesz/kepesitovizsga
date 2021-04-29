package hu.nive.ujratervezes.kepesitovizsga.jurassic;

import org.mariadb.jdbc.MariaDbDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JurassicPark {

    private DataSource dataSource;


    public JurassicPark(DataSource dataSource) {
        this.dataSource = dataSource;
    }

public boolean checkOverpopulation() {
    try (
            Connection conn = dataSource.getConnection();
            PreparedStatement stmt =
                    conn.prepareStatement("select breed from dinosaur where actual = ? AND expeced = ? order by breed");
    ) {
        stmt.setLong(1, expected);
        stmt.setLong(2, actual);


    } catch (SQLException sqle) {
        throw new IllegalArgumentException("Error", sqle);

    }
    return true;
}

        public List<String> getResult(PreparedStatement stmt){
            List<String> result = new ArrayList<>();
            try (
                    ResultSet rs = stmt.executeQuery();
            ) {
                while (rs.next()) {
                    Long expected = rs.getLong("expected");
                    Long actual = rs.getLong("actual");

                }
                throw new IllegalArgumentException("No result");
            } catch (SQLException sqle) {
                throw new IllegalArgumentException("Error", sqle);
            }

        }
    }

