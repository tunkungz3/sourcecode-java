package com.wisesoft.co.th.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DB {
    void getData() {
//        Connection connection = null;
//        PreparedStatement preparedStatement = null;
        String sql = "select * from user where id=?";

        // Try-resouces-catch
        try (
            // 1. Create database connection
            Connection connection = 
            DriverManager.getConnection("");
            // 2. Prepare SQL statement
            PreparedStatement preparedStatement = 
                    connection.prepareStatement(sql);
             ){
            preparedStatement.setString(1, "Admin");
        } catch (SQLException e) {
        }
    }
}
