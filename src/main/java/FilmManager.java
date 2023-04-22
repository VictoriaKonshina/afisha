public class FilmManager {
    private String[] films = new String[0];
    int i;
    private int limit;

    public FilmManager() {
        this.limit = 10;

    }

    public FilmManager(int limit) {

        this.limit = limit;

    }


    public void addFilm(String film) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[films.length - 1] = film;
        films = tmp;

    }

    public String[] findAll() {
        return films;

    }


    public String[] findLast() {
        int resultLength;

        if (films.length < limit) {
            resultLength = films.length;
        } else {
            resultLength = limit;
        }
        String[] tmp = new String[resultLength];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[films.length - 1 - i];
        }
        return tmp;

    }
}