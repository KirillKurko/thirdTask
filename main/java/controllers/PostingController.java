package controllers;

import au.com.bytecode.opencsv.CSVReader;
import model.DAOs.implementations.PostingDAOImplementation;
import model.DAOs.interfaces.PostingDAO;
import model.beans.Login;
import model.beans.Posting;
import utilities.converters.Converter;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PostingController {

    private final String filename = "postings.csv";

    public List<Posting> getPostingsFromFile() {
        List<Posting> postings = new ArrayList<>();
        try {
            CSVReader reader = new CSVReader(new FileReader(filename), ';', '"', 1);
            String[] data;
            while ((data = reader.readNext()) != null) {
                if (data.length == 10) {
                    Posting posting = Converter.convertToPosting(data);
                    postings.add(posting);
                }
            }
        }
        catch (IOException exception) {
            exception.printStackTrace();
        }
        return postings;
    }

    public void savePostingsToDatabase(List<Posting> postings) {
        PostingDAO postingDAO = new PostingDAOImplementation();
        for (Posting posting: postings) {
            postingDAO.insertPosting(posting);
        }
    }

    public boolean checkAuthorized(Posting posting, List<Login> logins) {
        String userName = posting.getUserName();
        for (Login login: logins) {
            if (login.getAppAccountName().equals(userName) && login.isActive()) {
                return true;
            }
        }
        return false;
    }
}
