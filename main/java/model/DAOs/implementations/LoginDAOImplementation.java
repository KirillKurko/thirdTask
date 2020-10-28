package model.DAOs.implementations;

import model.DAOs.interfaces.LoginDAO;
import model.beans.Login;
import utilities.DatabaseUtility;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LoginDAOImplementation implements LoginDAO {

    private static final String INSERT_LOGIN = "INSERT INTO Login(application, appAccountName, isActive, jobTitle, department) VALUES (?, ?, ?, ?, ?);";

    @Override
    public void insertLogin(Login login) {
        try (Connection connection = DatabaseUtility.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_LOGIN))   {
            preparedStatement.setString(1, login.getApplication());
            preparedStatement.setString(2, login.getAppAccountName());
            preparedStatement.setBoolean(3, login.isActive());
            preparedStatement.setString(4, login.getJobTitle());
            preparedStatement.setString(5, login.getDepartment());
            preparedStatement.executeUpdate();
        }
        catch (SQLException exception) {
            exception.printStackTrace();
        }
    }
}
