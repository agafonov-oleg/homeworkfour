import containers.PostgreSQLTestContainer;
import org.testcontainers.containers.ContainerLaunchException;

public class Main {

    public static void main(String[] args) {
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

        postgresDb.start();
        System.out.println("Hello world!");
    }
}