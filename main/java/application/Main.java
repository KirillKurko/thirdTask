package application;

import controllers.LoginController;
import controllers.PostingController;
import model.beans.Login;
import model.beans.Posting;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        LoginController loginController = new LoginController();
        List<Login> logins = loginController.getLoginsFromFile();

        loginController.saveLoginsToDatabase(logins);

        PostingController postingController = new PostingController();
        List<Posting> postings = postingController.getPostingsFromFile();

        for (Posting posting: postings) {
            if (postingController.checkAuthorized(posting, logins)) {
                posting.setAuthorized(true);
            }
        }

        postingController.savePostingsToDatabase(postings);
    }
}

