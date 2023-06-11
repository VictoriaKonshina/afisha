import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class FilmManagerTest {

    @Test
    public void testAll() {

        FilmManager manager = new FilmManager();

        String[] actual = manager.findAll();
        String[] expected = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test

    public void testFindFilm1() {

        FilmManager manager = new FilmManager();

        String[] actual = {"Film 1"};
        String[] expected = {"Film 1"};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test

    public void testFindFilm2() {

        FilmManager manager = new FilmManager();

        String[] actual = {"Film 2"};
        String[] expected = {"Film 2"};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test

    public void testFindFilm3() {

        FilmManager manager = new FilmManager();

        String[] actual = {"Film 3"};
        String[] expected = {"Film 3"};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test

    public void testFindSomeFilms() {

        FilmManager manager = new FilmManager();

        String[] actual = {"Film 5", "Film 6"};
        String[] expected = {"Film 5", "Film 6"};

        Assertions.assertArrayEquals(expected, actual);


    }

    @Test

    public void testFindFilms10() {

        FilmManager manager = new FilmManager();

        String[] actual = {"Film 10"};
        String[] expected = {"Film 10"};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test

    public void testFindFilms9() {

        FilmManager manager = new FilmManager();

        String[] actual = {"Film 9"};
        String[] expected = {"Film 9"};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test

    public void testFindFilms8() {

        FilmManager manager = new FilmManager();

        String[] actual = {"Film 8"};
        String[] expected = {"Film 8"};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test

    public void testFindLast5() {

        FilmManager manager = new FilmManager(5);

        String[] actual = {"Film 10", "Film 9", "Film 8", "Film 7", "Film 6", "Film 5"};
        String[] expected = {"Film 10", "Film 9", "Film 8", "Film 7", "Film 6", "Film 5"};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test

    public void testFindLastAll() {

        FilmManager manager = new FilmManager();

        String[] actual = manager.findLast();
        String[] expected = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test

    public void testFindLast1() {

        FilmManager manager = new FilmManager();

        String[] actual = {"Film 10"};
        String[] expected = {"Film 10"};

        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void testFindLast2() {

        FilmManager manager = new FilmManager();

        String[] actual = {"Film 10", "Film 9"};
        String[] expected = {"Film 10", "Film 9"};


        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void testFindLast3() {

        FilmManager manager = new FilmManager();


        String[] actual = {"Film 10", "Film 9", "Film 8"};
        String[] expected = {"Film 10", "Film 9", "Film 8"};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testFindLast4() {

        FilmManager manager = new FilmManager(4);


        String[] actual = {"Film 10", "Film 9", "Film 8", "Film 7"};
        String[] expected = {"Film 10", "Film 9", "Film 8", "Film 7"};

        Assertions.assertArrayEquals(expected, actual);
        

    }

}
