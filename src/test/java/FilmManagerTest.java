import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {

    @Test
    public void testAddFilm() {
        FilmManager filmManager = new FilmManager();
        filmManager.addFilm("Film 1");
        filmManager.addFilm("Film 2");
        filmManager.addFilm("Film 3");

        String[] films = filmManager.findAll();
        Assertions.assertArrayEquals(new String[]{"Film 1", "Film 2", "Film 3"}, films);
    }
        @Test
        public void testFindLastWithDefaultLimit() {
            FilmManager filmManager = new FilmManager();
            filmManager.addFilm("Film 1");
            filmManager.addFilm("Film 2");
            filmManager.addFilm("Film 3");
            filmManager.addFilm("Film 4");
            filmManager.addFilm("Film 5");
            filmManager.addFilm("Film 6");
            filmManager.addFilm("Film 7");
            filmManager.addFilm("Film 8");
            filmManager.addFilm("Film 9");
            filmManager.addFilm("Film 10");
            filmManager.addFilm("Film 11");

            String[] lastFilms = filmManager.findLast();
            Assertions.assertArrayEquals(new String[]{"Film 11", "Film 10", "Film 9", "Film 8", "Film 7", "Film 6", "Film 5", "Film 4", "Film 3", "Film 2"}, lastFilms);
        }

        @Test
        public void testFindLastWithCustomLimit() {
            FilmManager filmManager = new FilmManager(5);
            filmManager.addFilm("Film 1");
            filmManager.addFilm("Film 2");
            filmManager.addFilm("Film 3");
            filmManager.addFilm("Film 4");
            filmManager.addFilm("Film 5");
            filmManager.addFilm("Film 6");
            filmManager.addFilm("Film 7");

            String[] lastFilms = filmManager.findLast();
            Assertions.assertArrayEquals(new String[]{"Film 7", "Film 6", "Film 5", "Film 4", "Film 3"}, lastFilms);
        }

        @Test
        public void testFindLastWithLimitGreaterThanFilms() {
            FilmManager filmManager = new FilmManager(10);
            filmManager.addFilm("Film 1");
            filmManager.addFilm("Film 2");
            filmManager.addFilm("Film 3");

            String[] lastFilms = filmManager.findLast();
            Assertions.assertArrayEquals(new String[]{"Film 3", "Film 2", "Film 1"}, lastFilms);
        }

        @Test
        public void testFindLastWithLimitEqualToFilms() {
            FilmManager filmManager = new FilmManager(3);
            filmManager.addFilm("Film 1");
            filmManager.addFilm("Film 2");
            filmManager.addFilm("Film 3");

            String[] lastFilms = filmManager.findLast();
            Assertions.assertArrayEquals(new String[]{"Film 3", "Film 2", "Film 1"}, lastFilms);
        }

        @Test
        public void testFindAllWithNoFilms() {
            FilmManager filmManager = new FilmManager();

            String[] films = filmManager.findAll();
            Assertions.assertArrayEquals(new String[0], films);
        }
    }