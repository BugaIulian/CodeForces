package OOPExample1;

public class Utils {
    String authorFirstName;
    String authorSecondName;
    String genre;

    public Utils(String authorFirstName, String authorSecondName, String genre) {
        this.authorFirstName = authorFirstName;
        this.authorSecondName = authorSecondName;
        this.genre = genre;
    }

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public void setAuthorFirstName(String authorFirstName) {
        this.authorFirstName = authorFirstName;
    }

    public String getAuthorSecondName() {
        return authorSecondName;
    }

    public void setAuthorSecondName(String authorSecondName) {
        this.authorSecondName = authorSecondName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
