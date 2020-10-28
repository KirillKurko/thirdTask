package model.DAOs.implementations;

import model.DAOs.interfaces.PostingDAO;
import model.beans.Posting;
import utilities.DatabaseUtility;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PostingDAOImplementation implements PostingDAO {

    private static final String INSERT_POSTING = "INSERT INTO Posting(matDoc, item, docDate, pstngDate, materialDescription, " +
            "quantity, bun, amountLC, crcy, userName, isAuthorized) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";

    @Override
    public void insertPosting(Posting posting) {
        try (Connection connection = DatabaseUtility.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_POSTING)) {
            preparedStatement.setString(1, posting.getMatDoc());
            preparedStatement.setInt(2, posting.getItem());
            preparedStatement.setDate(3, new Date(posting.getDocDate().getTimeInMillis()));
            preparedStatement.setDate(4, new Date(posting.getPstngDate().getTimeInMillis()));
            preparedStatement.setString(5, posting.getMaterialDescription());
            preparedStatement.setInt(6, posting.getQuantity());
            preparedStatement.setString(7, posting.getBun());
            preparedStatement.setDouble(8, posting.getAmountLC());
            preparedStatement.setString(9, posting.getCrcy());
            preparedStatement.setString(10, posting.getUserName());
            preparedStatement.setBoolean(11, posting.isAuthorized());
            preparedStatement.executeUpdate();
        }
        catch (SQLException exception) {
            exception.printStackTrace();
        }
    }
}
