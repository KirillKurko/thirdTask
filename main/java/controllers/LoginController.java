package controllers;

import au.com.bytecode.opencsv.CSVReader;
import model.DAOs.implementations.LoginDAOImplementation;
import model.DAOs.interfaces.LoginDAO;
import model.beans.Login;
import utilities.converters.Converter;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LoginController {

    private final String filename = "logins.csv";

    public List<Login> getLoginsFromFile()  {
       List<Login> logins = new ArrayList<>();
       try {
           CSVReader reader = new CSVReader(new FileReader(filename), ',', '"', 1);
           String[] data;
           while ((data = reader.readNext()) != null) {
               if (data.length != 0) {
                   Login login = Converter.convertToLogin(data);
                   logins.add(login);
               }
           }
       }
       catch (IOException exception) {
           exception.printStackTrace();
       }
       return logins;
    }

    public void saveLoginsToDatabase(List<Login> logins) {
        LoginDAO loginDAO = new LoginDAOImplementation();
        for (Login login: logins) {
            loginDAO.insertLogin(login);
        }
    }

}
