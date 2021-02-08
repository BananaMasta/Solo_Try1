package com.company;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ConnectionUtil {
    public static List<User> getUsersFromDB() {
        List<User> list = new ArrayList<>();
        Connection connection = null;
        {
            try {
                Class.forName("org.postgresql.Driver");
                connection = DriverManager.getConnection("jdbc:postgresql://localhost/users", "postgres", "admin");
                Statement statement = connection.createStatement();
                ResultSet rs = statement.executeQuery("SELECT * FROM users");
                while (rs.next()) {
                    User user = new User();
                    user.setId(rs.getLong("userid"));
                    user.setUserName(rs.getString("username"));
                    user.setFirstName(rs.getString("firstname"));
                    user.setSecondName(rs.getString("secondname"));
                    user.setLastName(rs.getString("lastname"));
                    user.setUserMail(rs.getString("usermail"));
                    user.setUserPassword(rs.getString("userpassword"));
                    list.add(user);

                }
                connection.close();
            } catch (SQLException | ClassNotFoundException throwables) {
                throwables.printStackTrace();
            } finally {

            }
        }
        return list;
    }
}
