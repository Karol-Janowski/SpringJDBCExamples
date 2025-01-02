package pl.zajavka;

import javax.xml.transform.Result;
import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        // JDBC - Java Database Connectivity
        // JDBC URL - <protokol>:<rodzaj_bazy_danych>://adres>/<nazwa_bazy>
        // jdbc:postgresql://localhost:5432/zajavka

        String url = "jdbc:postgresql://localhost:5432/zajavka";
        String user = "postgresql";
        String password = "postgresql";

        Connection connection = DriverManager.getConnection(url, user, password);
        Statement statement = connection.createStatement();

        int i = statement.executeUpdate(query);
        ResultSet resultSet = statement.executeQuery(query);
        boolean execute = statement.execute(query);

        // DDL - Data Definition Language
        // DML - Data MAnipulation Language
        // DQL - Data Query LAnguage
        // DCL - Data Control Language

        //                          DDL                     DML                 DQL                 DCL
        // execute()                TAK                     TAK                 TAK                 TAK
        // executeUpdate()          TAK                     TAK                 NIE                 NIE
        // executeQuery()           NIE                     NIE                 TAK                 NIE

        // DDL - CREATE, DROP, ALTER, TRUNCATE
        // DML - INSERT, UPDATE, DELETE
        // DQL - SELECT
        // DCL - GRANT, REVOKE

        // ARCHITEKTURA OPRGRAMOWANIA
        // ARCHITEKTURA TROJWARSTWOWA (three tier/ three layer)
        // DAO - Data Access Object

        // Transaction
        //ACID - Atomicity, Consistency, Isolation, Durability


        //efekty wspolbieznosci transakcji
        //dirty read
        //non repatable read
        //phantom read




    }
}
