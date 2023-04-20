
import org.junit.jupiter.api.Test;


public class FilmManagerTest {

    @Test

    public void testAll() {

        FilmManager manager = new FilmManager();

        manager.addFilm("Film 1");
        manager.addFilm("Film 2");
        manager.addFilm("Film 3");

        String[] actual = manager.findAll();
        String[] expected = {"Film 1", "Film 2", "Film 3"};


    }

    @Test

    public void testFilm1() {

        FilmManager manager = new FilmManager();

        manager.addFilm("Film 1");
        manager.addFilm("Film 2");
        manager.addFilm("Film 3");

        String[] actual = manager.findAll();
        String[] expected = {"Film 1"};


    }

    @Test

    public void testFilm2() {

        FilmManager manager = new FilmManager();

        manager.addFilm("Film 1");
        manager.addFilm("Film 2");
        manager.addFilm("Film 3");

        String[] actual = manager.findAll();
        String[] expected = {"Film 2"};

    }

    @Test

    public void testFilm3() {

        FilmManager manager = new FilmManager();

        manager.addFilm("Film 1");
        manager.addFilm("Film 2");
        manager.addFilm("Film 3");

        String[] actual = manager.findAll();
        String[] expected = {"Film 3"};

    }

    @Test

    public void testFindSomeFilms() {

        FilmManager manager = new FilmManager();

        manager.addFilm("Film 1");
        manager.addFilm("Film 2");
        manager.addFilm("Film 3");

        String[] actual = manager.findAll();
        String[] expected = {"Film 3", "Film 2"};


    }

    @Test

    public void testNull() {

        FilmManager manager = new FilmManager();

        String[] actual = manager.findAll();
        String[] expected = null;

    }

    @Test

    public void testFindLast5() {

        FilmManager manager = new FilmManager(10);

        manager.addFilm("Film 1");
        manager.addFilm("Film 2");
        manager.addFilm("Film 3");
        manager.addFilm("Film 4");
        manager.addFilm("Film 5");
        manager.addFilm("Film 6");
        manager.addFilm("Film 7");
        manager.addFilm("Film 8");
        manager.addFilm("Film 9");
        manager.addFilm("Film 10");

        String[] actual = manager.findLast();
        String[] expected = {"Film 10", "Film 9", "Film 8", "Film 7", "Film 6", "Film 5"};

    }

    @Test

    public void testFindLastAll() {

        FilmManager manager = new FilmManager();

        manager.addFilm("Film 1");
        manager.addFilm("Film 2");
        manager.addFilm("Film 3");
        manager.addFilm("Film 4");
        manager.addFilm("Film 5");
        manager.addFilm("Film 6");
        manager.addFilm("Film 7");
        manager.addFilm("Film 8");
        manager.addFilm("Film 9");
        manager.addFilm("Film 10");

        String[] actual = manager.findLast();
        String[] expected = manager.findLast();

    }

    @Test

    public void testFindLast1() {

        FilmManager manager = new FilmManager(10);
        manager.addFilm("Film 1");
        manager.addFilm("Film 2");
        manager.addFilm("Film 3");
        manager.addFilm("Film 4");
        manager.addFilm("Film 5");
        manager.addFilm("Film 6");
        manager.addFilm("Film 7");
        manager.addFilm("Film 8");
        manager.addFilm("Film 9");
        manager.addFilm("Film 10");

        String[] actual = manager.findLast();
        String[] expected = {"Film 10"};


    }

    @Test
    public void testFindLast2() {

        FilmManager manager = new FilmManager(10);

        manager.addFilm("Film 1");
        manager.addFilm("Film 2");
        manager.addFilm("Film 3");
        manager.addFilm("Film 4");
        manager.addFilm("Film 5");
        manager.addFilm("Film 6");
        manager.addFilm("Film 7");
        manager.addFilm("Film 8");
        manager.addFilm("Film 9");
        manager.addFilm("Film 10");

        String[] actual = manager.findLast();
        String[] expected = {"Film 10", "Film 9"};


    }

    @Test
    public void testFindLast3() {

        FilmManager manager = new FilmManager();

        manager.addFilm("Film 1");
        manager.addFilm("Film 2");
        manager.addFilm("Film 3");
        manager.addFilm("Film 4");
        manager.addFilm("Film 5");
        manager.addFilm("Film 6");
        manager.addFilm("Film 7");
        manager.addFilm("Film 8");
        manager.addFilm("Film 9");
        manager.addFilm("Film 10");

        String[] actual = manager.findLast();
        String[] expected = {"Film 10", "Film 9", "Film 8"};

    }

}
