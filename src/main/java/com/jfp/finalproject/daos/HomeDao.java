package com.jfp.finalproject.daos;

import com.jfp.finalproject.utils.DatabaseUtil;

import java.sql.*;

public class HomeDao {

    public int testDaoClass(int index) throws SQLException, ClassNotFoundException {
        try(Connection connection = DatabaseUtil.getConnection()){
            String query = "" +
                    "SELECT COUNT(0) AS `count` FROM `finalproject`.`test` WHERE `index`=(?) LIMIT 1";

            try (PreparedStatement preparedStatement = connection.prepareStatement(query)){
                preparedStatement.setInt(1, index);

                try(ResultSet resultSet = preparedStatement.executeQuery()) {
                    resultSet.next();
                    return resultSet.getInt("count");
                }
            }
        }
    }
}
