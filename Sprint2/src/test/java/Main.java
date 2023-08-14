import clients.DBClient;
import containers.PostgreSQLTestContainer;
import org.testcontainers.containers.ContainerLaunchException;

import java.sql.SQLException;
import models.db.test_schema.tables.records.StudentsRecord;
import static models.db.test_schema.Tables.STUDENTS;

public class Main {

    public static void main(String[] args) throws SQLException {
        PostgreSQLTestContainer postgresDb = new PostgreSQLTestContainer(
                "test_user",
                "qwerty",
                "test_db",
                "scripts/init_db.sql");
        try {
            postgresDb.start();
        } catch (Exception exception) {
            System.out.println(postgresDb.getLogs());
            throw new ContainerLaunchException(exception.getCause().toString());
        }
        DBClient myDb = new DBClient();
        myDb.openDBConnection();
        DBClient.insertIntoTable(STUDENTS, new StudentsRecord(1, "Oleg", "Information Technology") );
        DBClient.insertIntoTable(STUDENTS, new StudentsRecord(2, "Victor", "Information Technology") );
        myDb.closeDBConnection();

        System.out.println("Hello world!");
    }
}