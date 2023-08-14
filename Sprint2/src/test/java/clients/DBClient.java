package clients;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jooq.*;
import org.jooq.Record;
import org.jooq.conf.ParamType;
import org.jooq.impl.DSL;

public class DBClient {
    private static Logger logger = LogManager.getLogger(DBClient.class);
    private final String dbName = "test_db";
    private final String user = "test_user";
    private final String password = "qwerty";
    private String url = null;
    private static Connection connection;
    public Connection openDBConnection() throws SQLException {
        url = String.format("jdbc:postgresql://localhost:5432/%s", dbName);
        connection = DriverManager.getConnection(url, user, password);
        logger.info("Подключение к PostgreSQL создано");

        return connection;
    }

    public void closeDBConnection() {
        try {
            connection.close();
        } catch (Exception exception) {
            logger.info("При запуске тестов не выполнялось подключение к БД");
            logger.info(exception);
        }

        logger.info("Соединение с PostgreSQL успешно закрыто");
    }

    public static Result<Record> insertIntoTable(Table table, Record record) {
        DSLContext create = DSL.using(connection, SQLDialect.POSTGRES);

        String sql = create
                .insertInto(table)
                .set(record)
                .getSQL(ParamType.INLINED);

        logger.info("Запрос: " + sql);
        Result<Record> result = create.fetch(sql);
        logger.info("\n" + result);

        return result;
    }
}
