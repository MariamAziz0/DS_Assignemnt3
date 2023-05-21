package perfect_hashing;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class Tests {

    // empty
    @Test
    void file0_insert () {
        QuadraticSpace<String> myHashDataStructure = new QuadraticSpace<>(10, false);
        int temp = myHashDataStructure.batch_insert("file0");
        assertEquals(temp , 0);
        assertTrue(myHashDataStructure.getRehashCounter() < 3);

        assertTrue(myHashDataStructure.insert("kkkkkkkkkkkkkkkkkkkkkkk"));
        assertFalse(myHashDataStructure.insert("kkkkkkkkkkkkkkkkkkkkkkk"));
        assertTrue(myHashDataStructure.insert("bx"));
        assertFalse(myHashDataStructure.insert("bx"));
        assertTrue(myHashDataStructure.insert("zvBQpaa"));
        assertFalse(myHashDataStructure.insert("zvBQpaa"));
    }
    @Test
    void file0_delete () {
        QuadraticSpace<String> myHashDataStructure = new QuadraticSpace<>(10, false);
        int temp = myHashDataStructure.batch_insert("file0");
        assertEquals(temp , 0);
        assertTrue(myHashDataStructure.getRehashCounter() < 3);

        assertFalse(myHashDataStructure.delete("kz"));
        assertFalse(myHashDataStructure.delete("ax"));
        assertFalse(myHashDataStructure.delete("ascxzczsfasz"));
        assertFalse(myHashDataStructure.delete("aaaaaaaaxxxxxxxxxxxxxfffffffffffffa"));
        assertFalse(myHashDataStructure.delete("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"));
    }
    @Test
    void file0_search () {
        QuadraticSpace<String> myHashDataStructure = new QuadraticSpace<>(10, false);
        int temp = myHashDataStructure.batch_insert("file0");
        assertEquals(temp , 0);
        assertTrue(myHashDataStructure.getRehashCounter() < 3);

        assertFalse(myHashDataStructure.search("kz"));
        assertFalse(myHashDataStructure.search("ax"));
        assertFalse(myHashDataStructure.search("ascxzczsfasz"));
        assertFalse(myHashDataStructure.search("aaaaaaaaxxxxxxxxxxxxxfffffffffffffa"));
        assertFalse(myHashDataStructure.search("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"));
    }
    @Test
    void file0_combination () {
        QuadraticSpace<String> myHashDataStructure = new QuadraticSpace<>(10, false);
        int temp = myHashDataStructure.batch_insert("file0");
        assertEquals(temp , 0);
        assertTrue(myHashDataStructure.getRehashCounter() < 3);

        // search + insert
        assertFalse(myHashDataStructure.search("bx"));
        assertFalse(myHashDataStructure.search("zvBQpaa"));
        assertTrue(myHashDataStructure.insert("bx"));
        assertTrue(myHashDataStructure.insert("zvBQpaa"));
        assertTrue(myHashDataStructure.search("bx"));
        assertTrue(myHashDataStructure.search("zvBQpaa"));

        // search + delete
        assertFalse(myHashDataStructure.search("kz"));
        assertFalse(myHashDataStructure.search("ax"));
        assertFalse(myHashDataStructure.delete("kz"));
        assertFalse(myHashDataStructure.delete("ax"));
        assertTrue(myHashDataStructure.delete("bx"));
        assertTrue(myHashDataStructure.delete("zvBQpaa"));
        assertFalse(myHashDataStructure.search("bx"));
        assertFalse(myHashDataStructure.search("zvBQpaa"));
    }

    // 1 element
    @Test
    void file1_insert () {
        QuadraticSpace<String> myHashDataStructure = new QuadraticSpace<>(10, false);
        int temp = myHashDataStructure.batch_insert("file1");
        assertEquals(temp , 1);
        assertTrue(myHashDataStructure.getRehashCounter() < 3);

        assertFalse(myHashDataStructure.insert("hello"));
        assertTrue(myHashDataStructure.insert("kkkkkkkkkkkkkkkkkkkkkkk"));
        assertFalse(myHashDataStructure.insert("kkkkkkkkkkkkkkkkkkkkkkk"));
        assertTrue(myHashDataStructure.insert("bx"));
        assertFalse(myHashDataStructure.insert("bx"));
        assertTrue(myHashDataStructure.insert("zvBQpaa"));
        assertFalse(myHashDataStructure.insert("zvBQpaa"));
    }
    @Test
    void file1_delete () {
        QuadraticSpace<String> myHashDataStructure = new QuadraticSpace<>(10, false);
        int temp = myHashDataStructure.batch_insert("file1");
        assertEquals(temp , 1);
        assertTrue(myHashDataStructure.getRehashCounter() < 3);


        assertTrue(myHashDataStructure.delete("hello"));
        assertFalse(myHashDataStructure.delete("hello"));
        assertFalse(myHashDataStructure.delete("kz"));
        assertFalse(myHashDataStructure.delete("ax"));
        assertFalse(myHashDataStructure.delete("ascxzczsfasz"));
        assertFalse(myHashDataStructure.delete("aaaaaaaaxxxxxxxxxxxxxfffffffffffffa"));
        assertFalse(myHashDataStructure.delete("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"));
    }
    @Test
    void file1_search () {
        QuadraticSpace<String> myHashDataStructure = new QuadraticSpace<>(10, false);
        int temp = myHashDataStructure.batch_insert("file1");
        assertEquals(temp , 1);
        assertTrue(myHashDataStructure.getRehashCounter() < 3);

        assertTrue(myHashDataStructure.search("hello"));
        assertFalse(myHashDataStructure.search("kz"));
        assertFalse(myHashDataStructure.search("ax"));
        assertFalse(myHashDataStructure.search("ascxzczsfasz"));
        assertFalse(myHashDataStructure.search("aaaaaaaaxxxxxxxxxxxxxfffffffffffffa"));
        assertFalse(myHashDataStructure.search("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"));
    }
    @Test
    void file1_combination () {
        QuadraticSpace<String> myHashDataStructure = new QuadraticSpace<>(10, false);
        int temp = myHashDataStructure.batch_insert("file1");
        assertEquals(temp , 1);
        assertTrue(myHashDataStructure.getRehashCounter() < 3);

        // already exist
        assertTrue(myHashDataStructure.search("hello"));
        assertFalse(myHashDataStructure.insert("hello"));
        assertTrue(myHashDataStructure.search("hello"));

        // search + insert
        assertFalse(myHashDataStructure.search("bx"));
        assertFalse(myHashDataStructure.search("zvBQpaa"));
        assertTrue(myHashDataStructure.insert("bx"));
        assertTrue(myHashDataStructure.insert("zvBQpaa"));
        assertTrue(myHashDataStructure.search("bx"));
        assertTrue(myHashDataStructure.search("zvBQpaa"));

        // search + delete
        assertFalse(myHashDataStructure.search("kz"));
        assertFalse(myHashDataStructure.search("ax"));
        assertFalse(myHashDataStructure.delete("kz"));
        assertFalse(myHashDataStructure.delete("ax"));
        assertTrue(myHashDataStructure.delete("bx"));
        assertTrue(myHashDataStructure.delete("zvBQpaa"));
        assertFalse(myHashDataStructure.search("bx"));
        assertFalse(myHashDataStructure.search("zvBQpaa"));
    }

    // wierd chars
    @Test
    void file2_insert () {
        QuadraticSpace<String> myHashDataStructure = new QuadraticSpace<>(10, false);
        int temp = myHashDataStructure.batch_insert("file2");
        assertEquals(temp , 3);
        assertTrue(myHashDataStructure.getRehashCounter() < 3);

        assertFalse(myHashDataStructure.insert("@hello!"));
        assertFalse(myHashDataStructure.insert("$world?"));
        assertFalse(myHashDataStructure.insert("#testing."));

        assertTrue(myHashDataStructure.insert("kkkkkkkkkkkkkkkkkkkkkkk"));
        assertFalse(myHashDataStructure.insert("kkkkkkkkkkkkkkkkkkkkkkk"));
        assertTrue(myHashDataStructure.insert("bx"));
        assertFalse(myHashDataStructure.insert("bx"));
        assertTrue(myHashDataStructure.insert("zvBQpaa"));
        assertFalse(myHashDataStructure.insert("zvBQpaa"));
    }
    @Test
    void file2_delete () {
        QuadraticSpace<String> myHashDataStructure = new QuadraticSpace<>(10, false);
        int temp = myHashDataStructure.batch_insert("file2");
        assertEquals(temp , 3);
        assertTrue(myHashDataStructure.getRehashCounter() < 3);

        assertTrue(myHashDataStructure.delete("@hello!"));
        assertTrue(myHashDataStructure.delete("$world?"));
        assertTrue(myHashDataStructure.delete("#testing."));
        assertFalse(myHashDataStructure.delete("@hello!"));
        assertFalse(myHashDataStructure.delete("$world?"));
        assertFalse(myHashDataStructure.delete("#testing."));

        assertFalse(myHashDataStructure.delete("kz"));
        assertFalse(myHashDataStructure.delete("ax"));
        assertFalse(myHashDataStructure.delete("ascxzczsfasz"));
        assertFalse(myHashDataStructure.delete("aaaaaaaaxxxxxxxxxxxxxfffffffffffffa"));
        assertFalse(myHashDataStructure.delete("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"));
    }
    @Test
    void file2_search () {
        QuadraticSpace<String> myHashDataStructure = new QuadraticSpace<>(10, false);
        int temp = myHashDataStructure.batch_insert("file2");
        assertEquals(temp , 3);
        assertTrue(myHashDataStructure.getRehashCounter() < 3);

        assertTrue(myHashDataStructure.search("@hello!"));
        assertTrue(myHashDataStructure.search("$world?"));
        assertTrue(myHashDataStructure.search("#testing."));

        assertFalse(myHashDataStructure.search("kz"));
        assertFalse(myHashDataStructure.search("ax"));
        assertFalse(myHashDataStructure.search("ascxzczsfasz"));
        assertFalse(myHashDataStructure.search("aaaaaaaaxxxxxxxxxxxxxfffffffffffffa"));
        assertFalse(myHashDataStructure.search("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"));
    }
    @Test
    void file2_combination () {
        QuadraticSpace<String> myHashDataStructure = new QuadraticSpace<>(10, false);
        int temp = myHashDataStructure.batch_insert("file2");
        assertEquals(temp , 3);
        assertTrue(myHashDataStructure.getRehashCounter() < 3);

        // already exist
        assertTrue(myHashDataStructure.search("@hello!"));
        assertTrue(myHashDataStructure.search("$world?"));
        assertTrue(myHashDataStructure.search("#testing."));
        assertFalse(myHashDataStructure.insert("@hello!"));
        assertFalse(myHashDataStructure.insert("$world?"));
        assertFalse(myHashDataStructure.insert("#testing."));
        assertTrue(myHashDataStructure.search("@hello!"));
        assertTrue(myHashDataStructure.search("$world?"));
        assertTrue(myHashDataStructure.search("#testing."));

        // search + insert
        assertFalse(myHashDataStructure.search("bx"));
        assertFalse(myHashDataStructure.search("zvBQpaa"));
        assertTrue(myHashDataStructure.insert("bx"));
        assertTrue(myHashDataStructure.insert("zvBQpaa"));
        assertTrue(myHashDataStructure.search("bx"));
        assertTrue(myHashDataStructure.search("zvBQpaa"));

        // search + delete
        assertTrue(myHashDataStructure.search("@hello!"));
        assertTrue(myHashDataStructure.search("$world?"));
        assertTrue(myHashDataStructure.search("#testing."));
        assertTrue(myHashDataStructure.delete("@hello!"));
        assertTrue(myHashDataStructure.delete("$world?"));
        assertTrue(myHashDataStructure.delete("#testing."));
        assertFalse(myHashDataStructure.search("@hello!"));
        assertFalse(myHashDataStructure.search("$world?"));
        assertFalse(myHashDataStructure.search("#testing."));
        assertFalse(myHashDataStructure.search("kz"));
        assertFalse(myHashDataStructure.search("ax"));
        assertFalse(myHashDataStructure.delete("kz"));
        assertFalse(myHashDataStructure.delete("ax"));
        assertTrue(myHashDataStructure.delete("bx"));
        assertTrue(myHashDataStructure.delete("zvBQpaa"));
        assertFalse(myHashDataStructure.search("bx"));
        assertFalse(myHashDataStructure.search("zvBQpaa"));
    }

    // spaces
    @Test
    void file3_insert () {
        QuadraticSpace<String> myHashDataStructure = new QuadraticSpace<>(10, false);
        int temp = myHashDataStructure.batch_insert("file3");
        assertEquals(temp , 3);
        assertTrue(myHashDataStructure.getRehashCounter() < 3);

        assertFalse(myHashDataStructure.insert("   apple"));
        assertFalse(myHashDataStructure.insert("banana"));
        assertFalse(myHashDataStructure.insert("    orange"));

        assertTrue(myHashDataStructure.insert("kkkkkkkkkkkkkkkkkkkkkkk"));
        assertFalse(myHashDataStructure.insert("kkkkkkkkkkkkkkkkkkkkkkk"));
        assertTrue(myHashDataStructure.insert("bx"));
        assertFalse(myHashDataStructure.insert("bx"));
        assertTrue(myHashDataStructure.insert("zvBQpaa"));
        assertFalse(myHashDataStructure.insert("zvBQpaa"));
    }
    @Test
    void file3_delete () {
        QuadraticSpace<String> myHashDataStructure = new QuadraticSpace<>(10, false);
        int temp = myHashDataStructure.batch_insert("file3");
        assertEquals(temp , 3);
        assertTrue(myHashDataStructure.getRehashCounter() < 3);

        assertTrue(myHashDataStructure.delete("   apple"));
        assertTrue(myHashDataStructure.delete("banana"));
        assertTrue(myHashDataStructure.delete("    orange"));
        assertFalse(myHashDataStructure.delete("   apple"));
        assertFalse(myHashDataStructure.delete("banana"));
        assertFalse(myHashDataStructure.delete("    orange"));

        assertFalse(myHashDataStructure.delete("kz"));
        assertFalse(myHashDataStructure.delete("ax"));
        assertFalse(myHashDataStructure.delete("ascxzczsfasz"));
        assertFalse(myHashDataStructure.delete("aaaaaaaaxxxxxxxxxxxxxfffffffffffffa"));
        assertFalse(myHashDataStructure.delete("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"));
    }
    @Test
    void file3_search () {
        QuadraticSpace<String> myHashDataStructure = new QuadraticSpace<>(10, false);
        int temp = myHashDataStructure.batch_insert("file3");
        assertEquals(temp , 3);
        assertTrue(myHashDataStructure.getRehashCounter() < 3);

        assertTrue(myHashDataStructure.search("   apple"));
        assertTrue(myHashDataStructure.search("banana"));
        assertTrue(myHashDataStructure.search("    orange"));

        assertFalse(myHashDataStructure.search("kz"));
        assertFalse(myHashDataStructure.search("ax"));
        assertFalse(myHashDataStructure.search("ascxzczsfasz"));
        assertFalse(myHashDataStructure.search("aaaaaaaaxxxxxxxxxxxxxfffffffffffffa"));
        assertFalse(myHashDataStructure.search("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"));
    }
    @Test
    void file3_combination () {
        QuadraticSpace<String> myHashDataStructure = new QuadraticSpace<>(10, false);
        int temp = myHashDataStructure.batch_insert("file3");
        assertEquals(temp , 3);
        assertTrue(myHashDataStructure.getRehashCounter() < 3);

        // already exist
        assertTrue(myHashDataStructure.search("   apple"));
        assertTrue(myHashDataStructure.search("banana"));
        assertTrue(myHashDataStructure.search("    orange"));
        assertFalse(myHashDataStructure.insert("   apple"));
        assertFalse(myHashDataStructure.insert("banana"));
        assertFalse(myHashDataStructure.insert("    orange"));
        assertTrue(myHashDataStructure.search("   apple"));
        assertTrue(myHashDataStructure.search("banana"));
        assertTrue(myHashDataStructure.search("    orange"));

        // search + insert
        assertFalse(myHashDataStructure.search("bx"));
        assertFalse(myHashDataStructure.search("zvBQpaa"));
        assertTrue(myHashDataStructure.insert("bx"));
        assertTrue(myHashDataStructure.insert("zvBQpaa"));
        assertTrue(myHashDataStructure.search("bx"));
        assertTrue(myHashDataStructure.search("zvBQpaa"));

        // search + delete
        assertTrue(myHashDataStructure.search("   apple"));
        assertTrue(myHashDataStructure.search("banana"));
        assertTrue(myHashDataStructure.search("    orange"));
        assertTrue(myHashDataStructure.delete("   apple"));
        assertTrue(myHashDataStructure.delete("banana"));
        assertTrue(myHashDataStructure.delete("    orange"));
        assertFalse(myHashDataStructure.search("   apple"));
        assertFalse(myHashDataStructure.search("banana"));
        assertFalse(myHashDataStructure.search("    orange"));
        assertFalse(myHashDataStructure.search("kz"));
        assertFalse(myHashDataStructure.search("ax"));
        assertFalse(myHashDataStructure.delete("kz"));
        assertFalse(myHashDataStructure.delete("ax"));
        assertTrue(myHashDataStructure.delete("bx"));
        assertTrue(myHashDataStructure.delete("zvBQpaa"));
        assertFalse(myHashDataStructure.search("bx"));
        assertFalse(myHashDataStructure.search("zvBQpaa"));
    }

    // dups
    @Test
    void file4_insert () {
        QuadraticSpace<String> myHashDataStructure = new QuadraticSpace<>(20, false);
        int temp = myHashDataStructure.batch_insert("file4");
        assertEquals(temp , 3);
        assertTrue(myHashDataStructure.getRehashCounter() < 3);

        assertFalse(myHashDataStructure.insert("apple"));
        assertFalse(myHashDataStructure.insert("banana"));
        assertFalse(myHashDataStructure.insert("orange"));

        assertTrue(myHashDataStructure.insert("kkkkkkkkkkkkkkkkkkkkkkk"));
        assertFalse(myHashDataStructure.insert("kkkkkkkkkkkkkkkkkkkkkkk"));
        assertTrue(myHashDataStructure.insert("bx"));
        assertFalse(myHashDataStructure.insert("bx"));
        assertTrue(myHashDataStructure.insert("zvBQpaa"));
        assertFalse(myHashDataStructure.insert("zvBQpaa"));
    }
    @Test
    void file4_delete () {
        QuadraticSpace<String> myHashDataStructure = new QuadraticSpace<>(20, false);
        int temp = myHashDataStructure.batch_insert("file4");
        assertEquals(temp , 3);
        assertTrue(myHashDataStructure.getRehashCounter() < 3);

        assertTrue(myHashDataStructure.delete("apple"));
        assertTrue(myHashDataStructure.delete("banana"));
        assertTrue(myHashDataStructure.delete("orange"));
        assertFalse(myHashDataStructure.delete("apple"));
        assertFalse(myHashDataStructure.delete("banana"));
        assertFalse(myHashDataStructure.delete("orange"));

        assertFalse(myHashDataStructure.delete("kz"));
        assertFalse(myHashDataStructure.delete("ax"));
        assertFalse(myHashDataStructure.delete("ascxzczsfasz"));
        assertFalse(myHashDataStructure.delete("aaaaaaaaxxxxxxxxxxxxxfffffffffffffa"));
        assertFalse(myHashDataStructure.delete("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"));
    }
    @Test
    void file4_search () {
        QuadraticSpace<String> myHashDataStructure = new QuadraticSpace<>(20, false);
        int temp = myHashDataStructure.batch_insert("file4");
        assertEquals(temp , 3);
        assertTrue(myHashDataStructure.getRehashCounter() < 3);

        assertTrue(myHashDataStructure.search("apple"));
        assertTrue(myHashDataStructure.search("banana"));
        assertTrue(myHashDataStructure.search("orange"));

        assertFalse(myHashDataStructure.search("kz"));
        assertFalse(myHashDataStructure.search("ax"));
        assertFalse(myHashDataStructure.search("ascxzczsfasz"));
        assertFalse(myHashDataStructure.search("aaaaaaaaxxxxxxxxxxxxxfffffffffffffa"));
        assertFalse(myHashDataStructure.search("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"));
    }
    @Test
    void file4_combination () {
        QuadraticSpace<String> myHashDataStructure = new QuadraticSpace<>(20, false);
        int temp = myHashDataStructure.batch_insert("file4");
        assertEquals(temp , 3);
        assertTrue(myHashDataStructure.getRehashCounter() < 3);

        // already exist
        assertTrue(myHashDataStructure.search("apple"));
        assertTrue(myHashDataStructure.search("banana"));
        assertTrue(myHashDataStructure.search("orange"));
        assertFalse(myHashDataStructure.insert("apple"));
        assertFalse(myHashDataStructure.insert("banana"));
        assertFalse(myHashDataStructure.insert("orange"));
        assertTrue(myHashDataStructure.search("apple"));
        assertTrue(myHashDataStructure.search("banana"));
        assertTrue(myHashDataStructure.search("orange"));

        // search + insert
        assertFalse(myHashDataStructure.search("bx"));
        assertFalse(myHashDataStructure.search("zvBQpaa"));
        assertTrue(myHashDataStructure.insert("bx"));
        assertTrue(myHashDataStructure.insert("zvBQpaa"));
        assertTrue(myHashDataStructure.search("bx"));
        assertTrue(myHashDataStructure.search("zvBQpaa"));

        // search + delete
        assertTrue(myHashDataStructure.search("apple"));
        assertTrue(myHashDataStructure.search("banana"));
        assertTrue(myHashDataStructure.search("orange"));
        assertTrue(myHashDataStructure.delete("apple"));
        assertTrue(myHashDataStructure.delete("banana"));
        assertTrue(myHashDataStructure.delete("orange"));
        assertFalse(myHashDataStructure.search("apple"));
        assertFalse(myHashDataStructure.search("banana"));
        assertFalse(myHashDataStructure.search("orange"));
        assertFalse(myHashDataStructure.search("kz"));
        assertFalse(myHashDataStructure.search("ax"));
        assertFalse(myHashDataStructure.delete("kz"));
        assertFalse(myHashDataStructure.delete("ax"));
        assertTrue(myHashDataStructure.delete("bx"));
        assertTrue(myHashDataStructure.delete("zvBQpaa"));
        assertFalse(myHashDataStructure.search("bx"));
        assertFalse(myHashDataStructure.search("zvBQpaa"));
    }

    // C & s
    @Test
    void file5_insert () {
        QuadraticSpace<String> myHashDataStructure = new QuadraticSpace<>(20, false);
        int temp = myHashDataStructure.batch_insert("file5");
        assertEquals(temp , 3);
        assertTrue(myHashDataStructure.getRehashCounter() < 3);

        assertFalse(myHashDataStructure.insert("ApPle"));
        assertFalse(myHashDataStructure.insert("BanAna"));
        assertFalse(myHashDataStructure.insert("orangE"));

        assertTrue(myHashDataStructure.insert("kkkkkkkkkkkkkkkkkkkkkkk"));
        assertFalse(myHashDataStructure.insert("kkkkkkkkkkkkkkkkkkkkkkk"));
        assertTrue(myHashDataStructure.insert("bx"));
        assertFalse(myHashDataStructure.insert("bx"));
        assertTrue(myHashDataStructure.insert("zvBQpaa"));
        assertFalse(myHashDataStructure.insert("zvBQpaa"));
    }
    @Test
    void file5_delete () {
        QuadraticSpace<String> myHashDataStructure = new QuadraticSpace<>(20, false);
        int temp = myHashDataStructure.batch_insert("file5");
        assertEquals(temp , 3);
        assertTrue(myHashDataStructure.getRehashCounter() < 3);

        assertTrue(myHashDataStructure.delete("ApPle"));
        assertTrue(myHashDataStructure.delete("BanAna"));
        assertTrue(myHashDataStructure.delete("orangE"));
        assertFalse(myHashDataStructure.delete("ApPle"));
        assertFalse(myHashDataStructure.delete("BanAna"));
        assertFalse(myHashDataStructure.delete("orangE"));

        assertFalse(myHashDataStructure.delete("kz"));
        assertFalse(myHashDataStructure.delete("ax"));
        assertFalse(myHashDataStructure.delete("ascxzczsfasz"));
        assertFalse(myHashDataStructure.delete("aaaaaaaaxxxxxxxxxxxxxfffffffffffffa"));
        assertFalse(myHashDataStructure.delete("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"));
    }
    @Test
    void file5_search () {
        QuadraticSpace<String> myHashDataStructure = new QuadraticSpace<>(20, false);
        int temp = myHashDataStructure.batch_insert("file5");
        assertEquals(temp , 3);
        assertTrue(myHashDataStructure.getRehashCounter() < 3);

        assertTrue(myHashDataStructure.search("ApPle"));
        assertTrue(myHashDataStructure.search("BanAna"));
        assertTrue(myHashDataStructure.search("orangE"));

        assertFalse(myHashDataStructure.search("kz"));
        assertFalse(myHashDataStructure.search("ax"));
        assertFalse(myHashDataStructure.search("ascxzczsfasz"));
        assertFalse(myHashDataStructure.search("aaaaaaaaxxxxxxxxxxxxxfffffffffffffa"));
        assertFalse(myHashDataStructure.search("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"));
    }
    @Test
    void file5_combination () {
        QuadraticSpace<String> myHashDataStructure = new QuadraticSpace<>(20, false);
        int temp = myHashDataStructure.batch_insert("file5");
        assertEquals(temp , 3);
        assertTrue(myHashDataStructure.getRehashCounter() < 3);

        // already exist
        assertTrue(myHashDataStructure.search("ApPle"));
        assertTrue(myHashDataStructure.search("BanAna"));
        assertTrue(myHashDataStructure.search("orangE"));
        assertFalse(myHashDataStructure.insert("ApPle"));
        assertFalse(myHashDataStructure.insert("BanAna"));
        assertFalse(myHashDataStructure.insert("orangE"));
        assertTrue(myHashDataStructure.search("ApPle"));
        assertTrue(myHashDataStructure.search("BanAna"));
        assertTrue(myHashDataStructure.search("orangE"));

        // search + insert
        assertFalse(myHashDataStructure.search("bx"));
        assertFalse(myHashDataStructure.search("zvBQpaa"));
        assertTrue(myHashDataStructure.insert("bx"));
        assertTrue(myHashDataStructure.insert("zvBQpaa"));
        assertTrue(myHashDataStructure.search("bx"));
        assertTrue(myHashDataStructure.search("zvBQpaa"));

        // search + delete
        assertTrue(myHashDataStructure.search("ApPle"));
        assertTrue(myHashDataStructure.search("BanAna"));
        assertTrue(myHashDataStructure.search("orangE"));
        assertTrue(myHashDataStructure.delete("ApPle"));
        assertTrue(myHashDataStructure.delete("BanAna"));
        assertTrue(myHashDataStructure.delete("orangE"));
        assertFalse(myHashDataStructure.search("ApPle"));
        assertFalse(myHashDataStructure.search("BanAna"));
        assertFalse(myHashDataStructure.search("orangE"));
        assertFalse(myHashDataStructure.search("kz"));
        assertFalse(myHashDataStructure.search("ax"));
        assertFalse(myHashDataStructure.delete("kz"));
        assertFalse(myHashDataStructure.delete("ax"));
        assertTrue(myHashDataStructure.delete("bx"));
        assertTrue(myHashDataStructure.delete("zvBQpaa"));
        assertFalse(myHashDataStructure.search("bx"));
        assertFalse(myHashDataStructure.search("zvBQpaa"));
    }

    // empty lines
    @Test
    void file6_insert () {
        QuadraticSpace<String> myHashDataStructure = new QuadraticSpace<>(10, false);
        int temp = myHashDataStructure.batch_insert("file6");
        assertEquals(temp , 4);
        assertTrue(myHashDataStructure.getRehashCounter() < 3);

        assertFalse(myHashDataStructure.insert("apple"));
        assertFalse(myHashDataStructure.insert("banana"));
        assertFalse(myHashDataStructure.insert("orange"));

        assertTrue(myHashDataStructure.insert("kkkkkkkkkkkkkkkkkkkkkkk"));
        assertFalse(myHashDataStructure.insert("kkkkkkkkkkkkkkkkkkkkkkk"));
        assertTrue(myHashDataStructure.insert("bx"));
        assertFalse(myHashDataStructure.insert("bx"));
        assertTrue(myHashDataStructure.insert("zvBQpaa"));
        assertFalse(myHashDataStructure.insert("zvBQpaa"));
    }
    @Test
    void file6_delete () {
        QuadraticSpace<String> myHashDataStructure = new QuadraticSpace<>(10, false);
        int temp = myHashDataStructure.batch_insert("file6");
        assertEquals(temp , 4);
        assertTrue(myHashDataStructure.getRehashCounter() < 3);

        assertTrue(myHashDataStructure.delete("apple"));
        assertTrue(myHashDataStructure.delete("banana"));
        assertTrue(myHashDataStructure.delete("orange"));
        assertFalse(myHashDataStructure.delete("apple"));
        assertFalse(myHashDataStructure.delete("banana"));
        assertFalse(myHashDataStructure.delete("orange"));

        assertFalse(myHashDataStructure.delete("kz"));
        assertFalse(myHashDataStructure.delete("ax"));
        assertFalse(myHashDataStructure.delete("ascxzczsfasz"));
        assertFalse(myHashDataStructure.delete("aaaaaaaaxxxxxxxxxxxxxfffffffffffffa"));
        assertFalse(myHashDataStructure.delete("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"));
    }
    @Test
    void file6_search () {
        QuadraticSpace<String> myHashDataStructure = new QuadraticSpace<>(10, false);
        int temp = myHashDataStructure.batch_insert("file6");
        assertEquals(temp , 4);
        assertTrue(myHashDataStructure.getRehashCounter() < 3);

        assertTrue(myHashDataStructure.search("apple"));
        assertTrue(myHashDataStructure.search("banana"));
        assertTrue(myHashDataStructure.search("orange"));

        assertFalse(myHashDataStructure.search("kz"));
        assertFalse(myHashDataStructure.search("ax"));
        assertFalse(myHashDataStructure.search("ascxzczsfasz"));
        assertFalse(myHashDataStructure.search("aaaaaaaaxxxxxxxxxxxxxfffffffffffffa"));
        assertFalse(myHashDataStructure.search("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"));
    }
    @Test
    void file6_combination () {
        QuadraticSpace<String> myHashDataStructure = new QuadraticSpace<>(10, false);
        int temp = myHashDataStructure.batch_insert("file6");
        assertEquals(temp , 4);
        assertTrue(myHashDataStructure.getRehashCounter() < 3);

        // already exist
        assertTrue(myHashDataStructure.search("apple"));
        assertTrue(myHashDataStructure.search("banana"));
        assertTrue(myHashDataStructure.search("orange"));
        assertFalse(myHashDataStructure.insert("apple"));
        assertFalse(myHashDataStructure.insert("banana"));
        assertFalse(myHashDataStructure.insert("orange"));
        assertTrue(myHashDataStructure.search("apple"));
        assertTrue(myHashDataStructure.search("banana"));
        assertTrue(myHashDataStructure.search("orange"));

        // search + insert
        assertFalse(myHashDataStructure.search("bx"));
        assertFalse(myHashDataStructure.search("zvBQpaa"));
        assertTrue(myHashDataStructure.insert("bx"));
        assertTrue(myHashDataStructure.insert("zvBQpaa"));
        assertTrue(myHashDataStructure.search("bx"));
        assertTrue(myHashDataStructure.search("zvBQpaa"));

        // search + delete
        assertTrue(myHashDataStructure.search("apple"));
        assertTrue(myHashDataStructure.search("banana"));
        assertTrue(myHashDataStructure.search("orange"));
        assertTrue(myHashDataStructure.delete("apple"));
        assertTrue(myHashDataStructure.delete("banana"));
        assertTrue(myHashDataStructure.delete("orange"));
        assertFalse(myHashDataStructure.search("apple"));
        assertFalse(myHashDataStructure.search("banana"));
        assertFalse(myHashDataStructure.search("orange"));
        assertFalse(myHashDataStructure.search("kz"));
        assertFalse(myHashDataStructure.search("ax"));
        assertFalse(myHashDataStructure.delete("kz"));
        assertFalse(myHashDataStructure.delete("ax"));
        assertTrue(myHashDataStructure.delete("bx"));
        assertTrue(myHashDataStructure.delete("zvBQpaa"));
        assertFalse(myHashDataStructure.search("bx"));
        assertFalse(myHashDataStructure.search("zvBQpaa"));
    }

    // non ascii chars
    @Test
    void file7_insert () {
        QuadraticSpace<String> myHashDataStructure = new QuadraticSpace<>(10, false);
        int temp = myHashDataStructure.batch_insert("file7");
        assertEquals(temp , 3);
        assertTrue(myHashDataStructure.getRehashCounter() < 3);

        assertFalse(myHashDataStructure.insert("café"));
        assertFalse(myHashDataStructure.insert("résumé"));
        assertFalse(myHashDataStructure.insert("über"));

        assertTrue(myHashDataStructure.insert("kkkkkkkkkkkkkkkkkkkkkkk"));
        assertFalse(myHashDataStructure.insert("kkkkkkkkkkkkkkkkkkkkkkk"));
        assertTrue(myHashDataStructure.insert("bx"));
        assertFalse(myHashDataStructure.insert("bx"));
        assertTrue(myHashDataStructure.insert("zvBQpaa"));
        assertFalse(myHashDataStructure.insert("zvBQpaa"));
    }
    @Test
    void file7_delete () {
        QuadraticSpace<String> myHashDataStructure = new QuadraticSpace<>(10, false);
        int temp = myHashDataStructure.batch_insert("file7");
        assertEquals(temp , 3);
        assertTrue(myHashDataStructure.getRehashCounter() < 3);

        assertTrue(myHashDataStructure.delete("café"));
        assertTrue(myHashDataStructure.delete("résumé"));
        assertTrue(myHashDataStructure.delete("über"));
        assertFalse(myHashDataStructure.delete("café"));
        assertFalse(myHashDataStructure.delete("résumé"));
        assertFalse(myHashDataStructure.delete("über"));

        assertFalse(myHashDataStructure.delete("kz"));
        assertFalse(myHashDataStructure.delete("ax"));
        assertFalse(myHashDataStructure.delete("ascxzczsfasz"));
        assertFalse(myHashDataStructure.delete("aaaaaaaaxxxxxxxxxxxxxfffffffffffffa"));
        assertFalse(myHashDataStructure.delete("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"));
    }
    @Test
    void file7_search () {
        QuadraticSpace<String> myHashDataStructure = new QuadraticSpace<>(10, false);
        int temp = myHashDataStructure.batch_insert("file7");
        assertEquals(temp , 3);
        assertTrue(myHashDataStructure.getRehashCounter() < 3);

        assertTrue(myHashDataStructure.search("café"));
        assertTrue(myHashDataStructure.search("résumé"));
        assertTrue(myHashDataStructure.search("über"));

        assertFalse(myHashDataStructure.search("kz"));
        assertFalse(myHashDataStructure.search("ax"));
        assertFalse(myHashDataStructure.search("ascxzczsfasz"));
        assertFalse(myHashDataStructure.search("aaaaaaaaxxxxxxxxxxxxxfffffffffffffa"));
        assertFalse(myHashDataStructure.search("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"));
    }
    @Test
    void file7_combination () {
        QuadraticSpace<String> myHashDataStructure = new QuadraticSpace<>(10, false);
        int temp = myHashDataStructure.batch_insert("file7");
        assertEquals(temp , 3);
        assertTrue(myHashDataStructure.getRehashCounter() < 3);

        // already exist
        assertTrue(myHashDataStructure.search("café"));
        assertTrue(myHashDataStructure.search("résumé"));
        assertTrue(myHashDataStructure.search("über"));
        assertFalse(myHashDataStructure.insert("café"));
        assertFalse(myHashDataStructure.insert("résumé"));
        assertFalse(myHashDataStructure.insert("über"));
        assertTrue(myHashDataStructure.search("café"));
        assertTrue(myHashDataStructure.search("résumé"));
        assertTrue(myHashDataStructure.search("über"));

        // search + insert
        assertFalse(myHashDataStructure.search("bx"));
        assertFalse(myHashDataStructure.search("zvBQpaa"));
        assertTrue(myHashDataStructure.insert("bx"));
        assertTrue(myHashDataStructure.insert("zvBQpaa"));
        assertTrue(myHashDataStructure.search("bx"));
        assertTrue(myHashDataStructure.search("zvBQpaa"));

        // search + delete
        assertTrue(myHashDataStructure.search("café"));
        assertTrue(myHashDataStructure.search("résumé"));
        assertTrue(myHashDataStructure.search("über"));
        assertTrue(myHashDataStructure.delete("café"));
        assertTrue(myHashDataStructure.delete("résumé"));
        assertTrue(myHashDataStructure.delete("über"));
        assertFalse(myHashDataStructure.search("café"));
        assertFalse(myHashDataStructure.search("résumé"));
        assertFalse(myHashDataStructure.search("über"));
        assertFalse(myHashDataStructure.search("kz"));
        assertFalse(myHashDataStructure.search("ax"));
        assertFalse(myHashDataStructure.delete("kz"));
        assertFalse(myHashDataStructure.delete("ax"));
        assertTrue(myHashDataStructure.delete("bx"));
        assertTrue(myHashDataStructure.delete("zvBQpaa"));
        assertFalse(myHashDataStructure.search("bx"));
        assertFalse(myHashDataStructure.search("zvBQpaa"));
    }

    // random
    @Test
    void file8_insert () {
        QuadraticSpace<String> myHashDataStructure = new QuadraticSpace<>(1500, false);
        int temp = myHashDataStructure.batch_insert("file8");
        assertEquals(temp , 1000);
        assertTrue(myHashDataStructure.getRehashCounter() < 3);

        assertFalse(myHashDataStructure.insert("z"));
        assertFalse(myHashDataStructure.insert("b"));
        assertFalse(myHashDataStructure.insert("CEMgIVDuqc"));
        assertFalse(myHashDataStructure.insert("zvBQp"));
        assertFalse(myHashDataStructure.insert("HVnsvXqAy"));

        assertTrue(myHashDataStructure.insert("kkkkkkkkkkkkkkkkkkkkkkk"));
        assertFalse(myHashDataStructure.insert("kkkkkkkkkkkkkkkkkkkkkkk"));
        assertTrue(myHashDataStructure.insert("bx"));
        assertFalse(myHashDataStructure.insert("bx"));
        assertTrue(myHashDataStructure.insert("zvBQpaa"));
        assertFalse(myHashDataStructure.insert("zvBQpaa"));
    }
    @Test
    void file8_delete () {
        QuadraticSpace<String> myHashDataStructure = new QuadraticSpace<>(1500, false);
        int temp = myHashDataStructure.batch_insert("file8");
        assertEquals(temp , 1000);
        assertTrue(myHashDataStructure.getRehashCounter() < 3);

        assertFalse(myHashDataStructure.delete("kz"));
        assertFalse(myHashDataStructure.delete("ax"));
        assertFalse(myHashDataStructure.delete("ascxzczsfasz"));
        assertFalse(myHashDataStructure.delete("aaaaaaaaxxxxxxxxxxxxxfffffffffffffa"));
        assertFalse(myHashDataStructure.delete("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"));

        assertTrue(myHashDataStructure.delete("CEMgIVDuqc"));
        assertFalse(myHashDataStructure.delete("CEMgIVDuqc"));
        assertTrue(myHashDataStructure.delete("b"));
        assertFalse(myHashDataStructure.delete("b"));
        assertTrue(myHashDataStructure.delete("zvBQp"));
        assertFalse(myHashDataStructure.delete("zvBQp"));
    }
    @Test
    void file8_search () {
        QuadraticSpace<String> myHashDataStructure = new QuadraticSpace<>(1500, false);
        int temp = myHashDataStructure.batch_insert("file8");
        assertEquals(temp , 1000);
        assertTrue(myHashDataStructure.getRehashCounter() < 3);

        assertFalse(myHashDataStructure.search("kz"));
        assertFalse(myHashDataStructure.search("ax"));
        assertFalse(myHashDataStructure.search("ascxzczsfasz"));
        assertFalse(myHashDataStructure.search("aaaaaaaaxxxxxxxxxxxxxfffffffffffffa"));
        assertFalse(myHashDataStructure.search("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"));

        assertTrue(myHashDataStructure.search("CEMgIVDuqc"));
        assertTrue(myHashDataStructure.search("b"));
        assertTrue(myHashDataStructure.search("zvBQp"));
        assertTrue(myHashDataStructure.search("z"));
        assertTrue(myHashDataStructure.search("zvBQp"));
    }
    @Test
    void file8_combination () {
        QuadraticSpace<String> myHashDataStructure = new QuadraticSpace<>(1500, false);
        int temp = myHashDataStructure.batch_insert("file8");
        assertEquals(temp , 1000);
        assertTrue(myHashDataStructure.getRehashCounter() < 3);

        // already exist
        assertTrue(myHashDataStructure.search("CEMgIVDuqc"));
        assertTrue(myHashDataStructure.search("zvBQp"));
        assertFalse(myHashDataStructure.insert("CEMgIVDuqc"));
        assertFalse(myHashDataStructure.insert("zvBQp"));
        assertTrue(myHashDataStructure.search("CEMgIVDuqc"));
        assertTrue(myHashDataStructure.search("zvBQp"));

        // search + insert
        assertFalse(myHashDataStructure.search("bx"));
        assertFalse(myHashDataStructure.search("zvBQpaa"));
        assertTrue(myHashDataStructure.insert("bx"));
        assertTrue(myHashDataStructure.insert("zvBQpaa"));
        assertTrue(myHashDataStructure.search("bx"));
        assertTrue(myHashDataStructure.search("zvBQpaa"));

        // search + delete
        assertFalse(myHashDataStructure.search("kz"));
        assertFalse(myHashDataStructure.search("ax"));
        assertFalse(myHashDataStructure.delete("kz"));
        assertFalse(myHashDataStructure.delete("ax"));
        assertTrue(myHashDataStructure.delete("CEMgIVDuqc"));
        assertTrue(myHashDataStructure.delete("zvBQp"));
        assertFalse(myHashDataStructure.search("CEMgIVDuqc"));
        assertFalse(myHashDataStructure.search("zvBQp"));
    }

    // random
    @Test
    void file9_insert () {
        QuadraticSpace<String> myHashDataStructure = new QuadraticSpace<>(100, false);
        int temp = myHashDataStructure.batch_insert("file9");
        assertEquals(temp , 20);
        assertTrue(myHashDataStructure.getRehashCounter() < 3);

        assertFalse(myHashDataStructure.insert("Km"));
        assertFalse(myHashDataStructure.insert("b"));
        assertFalse(myHashDataStructure.insert("uD"));
        assertFalse(myHashDataStructure.insert("vlaab"));
        assertFalse(myHashDataStructure.insert("DiPa"));

        assertTrue(myHashDataStructure.insert("kkkkkkkkkkkkkkkkkkkkkkk"));
        assertFalse(myHashDataStructure.insert("kkkkkkkkkkkkkkkkkkkkkkk"));
        assertTrue(myHashDataStructure.insert("bx"));
        assertFalse(myHashDataStructure.insert("bx"));
        assertTrue(myHashDataStructure.insert("vlaabaa"));
        assertFalse(myHashDataStructure.insert("vlaabaa"));
    }
    @Test
    void file9_delete () {
        QuadraticSpace<String> myHashDataStructure = new QuadraticSpace<>(100, false);
        int temp = myHashDataStructure.batch_insert("file9");
        assertEquals(temp , 20);
        assertTrue(myHashDataStructure.getRehashCounter() < 3);

        assertFalse(myHashDataStructure.delete("kz"));
        assertFalse(myHashDataStructure.delete("ax"));
        assertFalse(myHashDataStructure.delete("ascxzczsfasz"));
        assertFalse(myHashDataStructure.delete("aaaaaaaaxxxxxxxxxxxxxfffffffffffffa"));
        assertFalse(myHashDataStructure.delete("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"));

        assertTrue(myHashDataStructure.delete("uD"));
        assertFalse(myHashDataStructure.delete("uD"));
        assertTrue(myHashDataStructure.delete("b"));
        assertFalse(myHashDataStructure.delete("b"));
        assertTrue(myHashDataStructure.delete("vlaab"));
        assertFalse(myHashDataStructure.delete("vlaab"));
    }
    @Test
    void file9_search () {
        QuadraticSpace<String> myHashDataStructure = new QuadraticSpace<>(100, false);
        int temp = myHashDataStructure.batch_insert("file9");
        assertEquals(temp , 20);
        assertTrue(myHashDataStructure.getRehashCounter() < 3);

        assertFalse(myHashDataStructure.search("kz"));
        assertFalse(myHashDataStructure.search("ax"));
        assertFalse(myHashDataStructure.search("ascxzczsfasz"));
        assertFalse(myHashDataStructure.search("aaaaaaaaxxxxxxxxxxxxxfffffffffffffa"));
        assertFalse(myHashDataStructure.search("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"));

        assertTrue(myHashDataStructure.search("uD"));
        assertTrue(myHashDataStructure.search("b"));
        assertTrue(myHashDataStructure.search("vlaab"));
        assertTrue(myHashDataStructure.search("DiPa"));
        assertTrue(myHashDataStructure.search("vlaab"));
    }
    @Test
    void file9_combination () {
        QuadraticSpace<String> myHashDataStructure = new QuadraticSpace<>(100, false);
        int temp = myHashDataStructure.batch_insert("file9");
        assertEquals(temp , 20);
        assertTrue(myHashDataStructure.getRehashCounter() < 3);

        // already exist
        assertTrue(myHashDataStructure.search("uD"));
        assertTrue(myHashDataStructure.search("vlaab"));
        assertFalse(myHashDataStructure.insert("uD"));
        assertFalse(myHashDataStructure.insert("vlaab"));
        assertTrue(myHashDataStructure.search("uD"));
        assertTrue(myHashDataStructure.search("vlaab"));

        // search + insert
        assertFalse(myHashDataStructure.search("bx"));
        assertFalse(myHashDataStructure.search("vlaabaa"));
        assertTrue(myHashDataStructure.insert("bx"));
        assertTrue(myHashDataStructure.insert("vlaabaa"));
        assertTrue(myHashDataStructure.search("bx"));
        assertTrue(myHashDataStructure.search("vlaabaa"));

        // search + delete
        assertFalse(myHashDataStructure.search("kz"));
        assertFalse(myHashDataStructure.search("ax"));
        assertFalse(myHashDataStructure.delete("kz"));
        assertFalse(myHashDataStructure.delete("ax"));
        assertTrue(myHashDataStructure.delete("uD"));
        assertTrue(myHashDataStructure.delete("vlaab"));
        assertFalse(myHashDataStructure.search("uD"));
        assertFalse(myHashDataStructure.search("vlaab"));
    }

    // Integers
    // empty
    @Test
    void file10_insert () {
        QuadraticSpace<Integer> myHashDataStructure = new QuadraticSpace<>(10, false);
        int temp = myHashDataStructure.batch_insert("file10");
        assertEquals(temp , 0);
        assertTrue(myHashDataStructure.getRehashCounter() < 3);

        assertTrue(myHashDataStructure.insert(0));
        assertFalse(myHashDataStructure.insert(0));
        assertTrue(myHashDataStructure.insert(1));
        assertFalse(myHashDataStructure.insert(1));
        assertTrue(myHashDataStructure.insert(2));
        assertFalse(myHashDataStructure.insert(2));
    }
    @Test
    void file10_delete () {
        QuadraticSpace<Integer> myHashDataStructure = new QuadraticSpace<>(10, false);
        int temp = myHashDataStructure.batch_insert("file10");
        assertEquals(temp , 0);
        assertTrue(myHashDataStructure.getRehashCounter() < 3);

        assertFalse(myHashDataStructure.delete(4));
        assertFalse(myHashDataStructure.delete(5));
        assertFalse(myHashDataStructure.delete(10));
        assertFalse(myHashDataStructure.delete(100));
        assertFalse(myHashDataStructure.delete(104));
    }
    @Test
    void file10_search () {
        QuadraticSpace<Integer> myHashDataStructure = new QuadraticSpace<>(10, false);
        int temp = myHashDataStructure.batch_insert("file10");
        assertEquals(temp , 0);
        assertTrue(myHashDataStructure.getRehashCounter() < 3);

        assertFalse(myHashDataStructure.search(4));
        assertFalse(myHashDataStructure.search(5));
        assertFalse(myHashDataStructure.search(10));
        assertFalse(myHashDataStructure.search(100));
        assertFalse(myHashDataStructure.search(104));
    }
    @Test
    void file10_combination () {
        QuadraticSpace<Integer> myHashDataStructure = new QuadraticSpace<>(10, false);
        int temp = myHashDataStructure.batch_insert("file10");
        assertEquals(temp , 0);
        assertTrue(myHashDataStructure.getRehashCounter() < 3);

        // search + insert
        assertFalse(myHashDataStructure.search(1));
        assertFalse(myHashDataStructure.search(2));
        assertTrue(myHashDataStructure.insert(1));
        assertTrue(myHashDataStructure.insert(2));
        assertTrue(myHashDataStructure.search(1));
        assertTrue(myHashDataStructure.search(2));

        // search + delete
        assertFalse(myHashDataStructure.search(4));
        assertFalse(myHashDataStructure.search(5));
        assertFalse(myHashDataStructure.delete(4));
        assertFalse(myHashDataStructure.delete(5));
        assertTrue(myHashDataStructure.delete(1));
        assertTrue(myHashDataStructure.delete(2));
        assertFalse(myHashDataStructure.search(1));
        assertFalse(myHashDataStructure.search(2));
    }

    // one element
    @Test
    void file11_insert () {
        QuadraticSpace<String> myHashDataStructure = new QuadraticSpace<>(10, false);
        int temp = myHashDataStructure.batch_insert("file11");
        assertEquals(temp , 1);
        assertTrue(myHashDataStructure.getRehashCounter() < 3);

        assertFalse(myHashDataStructure.insert("4510"));
        assertTrue(myHashDataStructure.insert("0"));
        assertFalse(myHashDataStructure.insert("0"));
        assertTrue(myHashDataStructure.insert("1"));
        assertFalse(myHashDataStructure.insert("1"));
        assertTrue(myHashDataStructure.insert("2"));
        assertFalse(myHashDataStructure.insert("2"));
    }
    @Test
    void file11_delete () {
        QuadraticSpace<String> myHashDataStructure = new QuadraticSpace<>(10, false);
        int temp = myHashDataStructure.batch_insert("file11");
        assertEquals(temp , 1);
        assertTrue(myHashDataStructure.getRehashCounter() < 3);

        assertTrue(myHashDataStructure.delete("4510"));
        assertFalse(myHashDataStructure.delete("4510"));
        assertFalse(myHashDataStructure.delete("4"));
        assertFalse(myHashDataStructure.delete("5"));
        assertFalse(myHashDataStructure.delete("10"));
        assertFalse(myHashDataStructure.delete("100"));
        assertFalse(myHashDataStructure.delete("104"));
    }
    @Test
    void file11_search () {
        QuadraticSpace<String> myHashDataStructure = new QuadraticSpace<>(10, false);
        int temp = myHashDataStructure.batch_insert("file11");
        assertEquals(temp , 1);
        assertTrue(myHashDataStructure.getRehashCounter() < 3);

        assertTrue(myHashDataStructure.search("4510"));
        assertFalse(myHashDataStructure.search("4"));
        assertFalse(myHashDataStructure.search("5"));
        assertFalse(myHashDataStructure.search("10"));
        assertFalse(myHashDataStructure.search("100"));
        assertFalse(myHashDataStructure.search("104"));
    }
    @Test
    void file11_combination () {
        QuadraticSpace<String> myHashDataStructure = new QuadraticSpace<>(10, false);
        int temp = myHashDataStructure.batch_insert("file11");
        assertEquals(temp , 1);
        assertTrue(myHashDataStructure.getRehashCounter() < 3);

        // already exist
        assertTrue(myHashDataStructure.search("4510"));
        assertFalse(myHashDataStructure.insert("4510"));
        assertTrue(myHashDataStructure.search("4510"));

        // search + insert
        assertFalse(myHashDataStructure.search("1"));
        assertFalse(myHashDataStructure.search("2"));
        assertTrue(myHashDataStructure.insert("1"));
        assertTrue(myHashDataStructure.insert("2"));
        assertTrue(myHashDataStructure.search("1"));
        assertTrue(myHashDataStructure.search("2"));

        // search + delete
        assertFalse(myHashDataStructure.search("4"));
        assertFalse(myHashDataStructure.search("5"));
        assertFalse(myHashDataStructure.delete("4"));
        assertFalse(myHashDataStructure.delete("5"));
        assertTrue(myHashDataStructure.delete("1"));
        assertTrue(myHashDataStructure.delete("2"));
        assertFalse(myHashDataStructure.search("1"));
        assertFalse(myHashDataStructure.search("2"));
    }

    ////
    // alpha-numeric
    @Test
    void file12_insert () {
        QuadraticSpace<String> myHashDataStructure = new QuadraticSpace<>(10, false);
        int temp = myHashDataStructure.batch_insert("file12");
        assertEquals(temp , 3);
        assertTrue(myHashDataStructure.getRehashCounter() < 3);

        assertFalse(myHashDataStructure.insert("abc123"));
        assertFalse(myHashDataStructure.insert("hello456"));
        assertFalse(myHashDataStructure.insert("789world"));

        assertTrue(myHashDataStructure.insert("kkkkkkkkkkkkkkkkkkkkkkk"));
        assertFalse(myHashDataStructure.insert("kkkkkkkkkkkkkkkkkkkkkkk"));
        assertTrue(myHashDataStructure.insert("bx"));
        assertFalse(myHashDataStructure.insert("bx"));
        assertTrue(myHashDataStructure.insert("zvBQpaa"));
        assertFalse(myHashDataStructure.insert("zvBQpaa"));
    }
    @Test
    void file12_delete () {
        QuadraticSpace<String> myHashDataStructure = new QuadraticSpace<>(10, false);
        int temp = myHashDataStructure.batch_insert("file12");
        assertEquals(temp , 3);
        assertTrue(myHashDataStructure.getRehashCounter() < 3);

        assertTrue(myHashDataStructure.delete("abc123"));
        assertTrue(myHashDataStructure.delete("hello456"));
        assertTrue(myHashDataStructure.delete("789world"));
        assertFalse(myHashDataStructure.delete("abc123"));
        assertFalse(myHashDataStructure.delete("hello456"));
        assertFalse(myHashDataStructure.delete("789world"));

        assertFalse(myHashDataStructure.delete("kz"));
        assertFalse(myHashDataStructure.delete("ax"));
        assertFalse(myHashDataStructure.delete("ascxzczsfasz"));
        assertFalse(myHashDataStructure.delete("aaaaaaaaxxxxxxxxxxxxxfffffffffffffa"));
        assertFalse(myHashDataStructure.delete("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"));
    }
    @Test
    void file12_search () {
        QuadraticSpace<String> myHashDataStructure = new QuadraticSpace<>(10, false);
        int temp = myHashDataStructure.batch_insert("file12");
        assertEquals(temp , 3);
        assertTrue(myHashDataStructure.getRehashCounter() < 3);

        assertTrue(myHashDataStructure.search("abc123"));
        assertTrue(myHashDataStructure.search("hello456"));
        assertTrue(myHashDataStructure.search("789world"));

        assertFalse(myHashDataStructure.search("kz"));
        assertFalse(myHashDataStructure.search("ax"));
        assertFalse(myHashDataStructure.search("ascxzczsfasz"));
        assertFalse(myHashDataStructure.search("aaaaaaaaxxxxxxxxxxxxxfffffffffffffa"));
        assertFalse(myHashDataStructure.search("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"));
    }
    @Test
    void file12_combination () {
        QuadraticSpace<String> myHashDataStructure = new QuadraticSpace<>(10, false);
        int temp = myHashDataStructure.batch_insert("file12");
        assertEquals(temp , 3);
        assertTrue(myHashDataStructure.getRehashCounter() < 3);

        // already exist
        assertTrue(myHashDataStructure.search("abc123"));
        assertTrue(myHashDataStructure.search("hello456"));
        assertTrue(myHashDataStructure.search("789world"));
        assertFalse(myHashDataStructure.insert("abc123"));
        assertFalse(myHashDataStructure.insert("hello456"));
        assertFalse(myHashDataStructure.insert("789world"));
        assertTrue(myHashDataStructure.search("abc123"));
        assertTrue(myHashDataStructure.search("hello456"));
        assertTrue(myHashDataStructure.search("789world"));

        // search + insert
        assertFalse(myHashDataStructure.search("bx"));
        assertFalse(myHashDataStructure.search("zvBQpaa"));
        assertTrue(myHashDataStructure.insert("bx"));
        assertTrue(myHashDataStructure.insert("zvBQpaa"));
        assertTrue(myHashDataStructure.search("bx"));
        assertTrue(myHashDataStructure.search("zvBQpaa"));

        // search + delete
        assertTrue(myHashDataStructure.search("abc123"));
        assertTrue(myHashDataStructure.search("hello456"));
        assertTrue(myHashDataStructure.search("789world"));
        assertTrue(myHashDataStructure.delete("abc123"));
        assertTrue(myHashDataStructure.delete("hello456"));
        assertTrue(myHashDataStructure.delete("789world"));
        assertFalse(myHashDataStructure.search("abc123"));
        assertFalse(myHashDataStructure.search("hello456"));
        assertFalse(myHashDataStructure.search("789world"));
        assertFalse(myHashDataStructure.search("kz"));
        assertFalse(myHashDataStructure.search("ax"));
        assertFalse(myHashDataStructure.delete("kz"));
        assertFalse(myHashDataStructure.delete("ax"));
        assertTrue(myHashDataStructure.delete("bx"));
        assertTrue(myHashDataStructure.delete("zvBQpaa"));
        assertFalse(myHashDataStructure.search("bx"));
        assertFalse(myHashDataStructure.search("zvBQpaa"));
    }

    // palindrome
    @Test
    void file13_insert () {
        QuadraticSpace<String> myHashDataStructure = new QuadraticSpace<>(10, false);
        int temp = myHashDataStructure.batch_insert("file13");
        assertEquals(temp , 3);
        assertTrue(myHashDataStructure.getRehashCounter() < 3);

        assertFalse(myHashDataStructure.insert("level"));
        assertFalse(myHashDataStructure.insert("radar"));
        assertFalse(myHashDataStructure.insert("deified"));

        assertTrue(myHashDataStructure.insert("kkkkkkkkkkkkkkkkkkkkkkk"));
        assertFalse(myHashDataStructure.insert("kkkkkkkkkkkkkkkkkkkkkkk"));
        assertTrue(myHashDataStructure.insert("bx"));
        assertFalse(myHashDataStructure.insert("bx"));
        assertTrue(myHashDataStructure.insert("zvBQpaa"));
        assertFalse(myHashDataStructure.insert("zvBQpaa"));
    }
    @Test
    void file13_delete () {
        QuadraticSpace<String> myHashDataStructure = new QuadraticSpace<>(10, false);
        int temp = myHashDataStructure.batch_insert("file13");
        assertEquals(temp , 3);
        assertTrue(myHashDataStructure.getRehashCounter() < 3);

        assertTrue(myHashDataStructure.delete("level"));
        assertTrue(myHashDataStructure.delete("radar"));
        assertTrue(myHashDataStructure.delete("deified"));
        assertFalse(myHashDataStructure.delete("level"));
        assertFalse(myHashDataStructure.delete("radar"));
        assertFalse(myHashDataStructure.delete("deified"));

        assertFalse(myHashDataStructure.delete("kz"));
        assertFalse(myHashDataStructure.delete("ax"));
        assertFalse(myHashDataStructure.delete("ascxzczsfasz"));
        assertFalse(myHashDataStructure.delete("aaaaaaaaxxxxxxxxxxxxxfffffffffffffa"));
        assertFalse(myHashDataStructure.delete("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"));
    }
    @Test
    void file13_search () {
        QuadraticSpace<String> myHashDataStructure = new QuadraticSpace<>(10, false);
        int temp = myHashDataStructure.batch_insert("file13");
        assertEquals(temp , 3);
        assertTrue(myHashDataStructure.getRehashCounter() < 3);

        assertTrue(myHashDataStructure.search("level"));
        assertTrue(myHashDataStructure.search("radar"));
        assertTrue(myHashDataStructure.search("deified"));

        assertFalse(myHashDataStructure.search("kz"));
        assertFalse(myHashDataStructure.search("ax"));
        assertFalse(myHashDataStructure.search("ascxzczsfasz"));
        assertFalse(myHashDataStructure.search("aaaaaaaaxxxxxxxxxxxxxfffffffffffffa"));
        assertFalse(myHashDataStructure.search("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"));
    }
    @Test
    void file13_combination () {
        QuadraticSpace<String> myHashDataStructure = new QuadraticSpace<>(10, false);
        int temp = myHashDataStructure.batch_insert("file13");
        assertEquals(temp , 3);
        assertTrue(myHashDataStructure.getRehashCounter() < 3);

        // already exist
        assertTrue(myHashDataStructure.search("level"));
        assertTrue(myHashDataStructure.search("radar"));
        assertTrue(myHashDataStructure.search("deified"));
        assertFalse(myHashDataStructure.insert("level"));
        assertFalse(myHashDataStructure.insert("radar"));
        assertFalse(myHashDataStructure.insert("deified"));
        assertTrue(myHashDataStructure.search("level"));
        assertTrue(myHashDataStructure.search("radar"));
        assertTrue(myHashDataStructure.search("deified"));

        // search + insert
        assertFalse(myHashDataStructure.search("bx"));
        assertFalse(myHashDataStructure.search("zvBQpaa"));
        assertTrue(myHashDataStructure.insert("bx"));
        assertTrue(myHashDataStructure.insert("zvBQpaa"));
        assertTrue(myHashDataStructure.search("bx"));
        assertTrue(myHashDataStructure.search("zvBQpaa"));

        // search + delete
        assertTrue(myHashDataStructure.search("level"));
        assertTrue(myHashDataStructure.search("radar"));
        assertTrue(myHashDataStructure.search("deified"));
        assertTrue(myHashDataStructure.delete("level"));
        assertTrue(myHashDataStructure.delete("radar"));
        assertTrue(myHashDataStructure.delete("deified"));
        assertFalse(myHashDataStructure.search("level"));
        assertFalse(myHashDataStructure.search("radar"));
        assertFalse(myHashDataStructure.search("deified"));
        assertFalse(myHashDataStructure.search("kz"));
        assertFalse(myHashDataStructure.search("ax"));
        assertFalse(myHashDataStructure.delete("kz"));
        assertFalse(myHashDataStructure.delete("ax"));
        assertTrue(myHashDataStructure.delete("bx"));
        assertTrue(myHashDataStructure.delete("zvBQpaa"));
        assertFalse(myHashDataStructure.search("bx"));
        assertFalse(myHashDataStructure.search("zvBQpaa"));
    }

    // mix kbiiiiir
    @Test
    void file14_insert () {
        QuadraticSpace<String> myHashDataStructure = new QuadraticSpace<>(10, false);
        int temp = myHashDataStructure.batch_insert("file14");
        assertEquals(temp , 3);
        assertTrue(myHashDataStructure.getRehashCounter() < 3);

        assertFalse(myHashDataStructure.insert("?apple123"));
        assertFalse(myHashDataStructure.insert("!banana456?"));
        assertFalse(myHashDataStructure.insert("!!orange!789"));

        assertTrue(myHashDataStructure.insert("kkkkkkkkkkkkkkkkkkkkkkk"));
        assertFalse(myHashDataStructure.insert("kkkkkkkkkkkkkkkkkkkkkkk"));
        assertTrue(myHashDataStructure.insert("bx"));
        assertFalse(myHashDataStructure.insert("bx"));
        assertTrue(myHashDataStructure.insert("zvBQpaa"));
        assertFalse(myHashDataStructure.insert("zvBQpaa"));
    }
    @Test
    void file14_delete () {
        QuadraticSpace<String> myHashDataStructure = new QuadraticSpace<>(10, false);
        int temp = myHashDataStructure.batch_insert("file14");
        assertEquals(temp , 3);
        assertTrue(myHashDataStructure.getRehashCounter() < 3);

        assertTrue(myHashDataStructure.delete("?apple123"));
        assertTrue(myHashDataStructure.delete("!banana456?"));
        assertTrue(myHashDataStructure.delete("!!orange!789"));
        assertFalse(myHashDataStructure.delete("?apple123"));
        assertFalse(myHashDataStructure.delete("!banana456?"));
        assertFalse(myHashDataStructure.delete("!!orange!789"));

        assertFalse(myHashDataStructure.delete("kz"));
        assertFalse(myHashDataStructure.delete("ax"));
        assertFalse(myHashDataStructure.delete("ascxzczsfasz"));
        assertFalse(myHashDataStructure.delete("aaaaaaaaxxxxxxxxxxxxxfffffffffffffa"));
        assertFalse(myHashDataStructure.delete("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"));
    }
    @Test
    void file14_search () {
        QuadraticSpace<String> myHashDataStructure = new QuadraticSpace<>(10, false);
        int temp = myHashDataStructure.batch_insert("file14");
        assertEquals(temp , 3);
        assertTrue(myHashDataStructure.getRehashCounter() < 3);

        assertTrue(myHashDataStructure.search("?apple123"));
        assertTrue(myHashDataStructure.search("!banana456?"));
        assertTrue(myHashDataStructure.search("!!orange!789"));

        assertFalse(myHashDataStructure.search("kz"));
        assertFalse(myHashDataStructure.search("ax"));
        assertFalse(myHashDataStructure.search("ascxzczsfasz"));
        assertFalse(myHashDataStructure.search("aaaaaaaaxxxxxxxxxxxxxfffffffffffffa"));
        assertFalse(myHashDataStructure.search("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"));
    }
    @Test
    void file14_combination () {
        QuadraticSpace<String> myHashDataStructure = new QuadraticSpace<>(10, false);
        int temp = myHashDataStructure.batch_insert("file14");
        assertEquals(temp , 3);
        assertTrue(myHashDataStructure.getRehashCounter() < 3);

        // already exist
        assertTrue(myHashDataStructure.search("?apple123"));
        assertTrue(myHashDataStructure.search("!banana456?"));
        assertTrue(myHashDataStructure.search("!!orange!789"));
        assertFalse(myHashDataStructure.insert("?apple123"));
        assertFalse(myHashDataStructure.insert("!banana456?"));
        assertFalse(myHashDataStructure.insert("!!orange!789"));
        assertTrue(myHashDataStructure.search("?apple123"));
        assertTrue(myHashDataStructure.search("!banana456?"));
        assertTrue(myHashDataStructure.search("!!orange!789"));

        // search + insert
        assertFalse(myHashDataStructure.search("bx"));
        assertFalse(myHashDataStructure.search("zvBQpaa"));
        assertTrue(myHashDataStructure.insert("bx"));
        assertTrue(myHashDataStructure.insert("zvBQpaa"));
        assertTrue(myHashDataStructure.search("bx"));
        assertTrue(myHashDataStructure.search("zvBQpaa"));

        // search + delete
        assertTrue(myHashDataStructure.search("?apple123"));
        assertTrue(myHashDataStructure.search("!banana456?"));
        assertTrue(myHashDataStructure.search("!!orange!789"));
        assertTrue(myHashDataStructure.delete("?apple123"));
        assertTrue(myHashDataStructure.delete("!banana456?"));
        assertTrue(myHashDataStructure.delete("!!orange!789"));
        assertFalse(myHashDataStructure.search("?apple123"));
        assertFalse(myHashDataStructure.search("!banana456?"));
        assertFalse(myHashDataStructure.search("!!orange!789"));
        assertFalse(myHashDataStructure.search("kz"));
        assertFalse(myHashDataStructure.search("ax"));
        assertFalse(myHashDataStructure.delete("kz"));
        assertFalse(myHashDataStructure.delete("ax"));
        assertTrue(myHashDataStructure.delete("bx"));
        assertTrue(myHashDataStructure.delete("zvBQpaa"));
        assertFalse(myHashDataStructure.search("bx"));
        assertFalse(myHashDataStructure.search("zvBQpaa"));
    }

    // 2 sylllabols
    @Test
    void file15_insert () {
        QuadraticSpace<String> myHashDataStructure = new QuadraticSpace<>(10, false);
        int temp = myHashDataStructure.batch_insert("file15");
        assertEquals(temp , 3);
        assertTrue(myHashDataStructure.getRehashCounter() < 3);

        assertFalse(myHashDataStructure.insert("new work"));
        assertFalse(myHashDataStructure.insert("los angeles"));
        assertFalse(myHashDataStructure.insert("danny collins"));

        assertTrue(myHashDataStructure.insert("kkkkkkkkkkkkkkkkkkkkkkk"));
        assertFalse(myHashDataStructure.insert("kkkkkkkkkkkkkkkkkkkkkkk"));
        assertTrue(myHashDataStructure.insert("bx"));
        assertFalse(myHashDataStructure.insert("bx"));
        assertTrue(myHashDataStructure.insert("zvBQpaa"));
        assertFalse(myHashDataStructure.insert("zvBQpaa"));
    }
    @Test
    void file15_delete () {
        QuadraticSpace<String> myHashDataStructure = new QuadraticSpace<>(10, false);
        int temp = myHashDataStructure.batch_insert("file15");
        assertEquals(temp , 3);
        assertTrue(myHashDataStructure.getRehashCounter() < 3);

        assertTrue(myHashDataStructure.delete("new work"));
        assertTrue(myHashDataStructure.delete("los angeles"));
        assertTrue(myHashDataStructure.delete("danny collins"));
        assertFalse(myHashDataStructure.delete("new work"));
        assertFalse(myHashDataStructure.delete("los angeles"));
        assertFalse(myHashDataStructure.delete("danny collins"));

        assertFalse(myHashDataStructure.delete("kz"));
        assertFalse(myHashDataStructure.delete("ax"));
        assertFalse(myHashDataStructure.delete("ascxzczsfasz"));
        assertFalse(myHashDataStructure.delete("aaaaaaaaxxxxxxxxxxxxxfffffffffffffa"));
        assertFalse(myHashDataStructure.delete("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"));
    }
    @Test
    void file15_search () {
        QuadraticSpace<String> myHashDataStructure = new QuadraticSpace<>(10, false);
        int temp = myHashDataStructure.batch_insert("file15");
        assertEquals(temp , 3);
        assertTrue(myHashDataStructure.getRehashCounter() < 3);

        assertTrue(myHashDataStructure.search("new work"));
        assertTrue(myHashDataStructure.search("los angeles"));
        assertTrue(myHashDataStructure.search("danny collins"));

        assertFalse(myHashDataStructure.search("kz"));
        assertFalse(myHashDataStructure.search("ax"));
        assertFalse(myHashDataStructure.search("ascxzczsfasz"));
        assertFalse(myHashDataStructure.search("aaaaaaaaxxxxxxxxxxxxxfffffffffffffa"));
        assertFalse(myHashDataStructure.search("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"));
    }
    @Test
    void file15_combination () {
        QuadraticSpace<String> myHashDataStructure = new QuadraticSpace<>(10, false);
        int temp = myHashDataStructure.batch_insert("file15");
        assertEquals(temp , 3);
        assertTrue(myHashDataStructure.getRehashCounter() < 3);

        // already exist
        assertTrue(myHashDataStructure.search("new work"));
        assertTrue(myHashDataStructure.search("los angeles"));
        assertTrue(myHashDataStructure.search("danny collins"));
        assertFalse(myHashDataStructure.insert("new work"));
        assertFalse(myHashDataStructure.insert("los angeles"));
        assertFalse(myHashDataStructure.insert("danny collins"));
        assertTrue(myHashDataStructure.search("new work"));
        assertTrue(myHashDataStructure.search("los angeles"));
        assertTrue(myHashDataStructure.search("danny collins"));

        // search + insert
        assertFalse(myHashDataStructure.search("bx"));
        assertFalse(myHashDataStructure.search("zvBQpaa"));
        assertTrue(myHashDataStructure.insert("bx"));
        assertTrue(myHashDataStructure.insert("zvBQpaa"));
        assertTrue(myHashDataStructure.search("bx"));
        assertTrue(myHashDataStructure.search("zvBQpaa"));

        // search + delete
        assertTrue(myHashDataStructure.search("new work"));
        assertTrue(myHashDataStructure.search("los angeles"));
        assertTrue(myHashDataStructure.search("danny collins"));
        assertTrue(myHashDataStructure.delete("new work"));
        assertTrue(myHashDataStructure.delete("los angeles"));
        assertTrue(myHashDataStructure.delete("danny collins"));
        assertFalse(myHashDataStructure.search("new work"));
        assertFalse(myHashDataStructure.search("los angeles"));
        assertFalse(myHashDataStructure.search("danny collins"));
        assertFalse(myHashDataStructure.search("kz"));
        assertFalse(myHashDataStructure.search("ax"));
        assertFalse(myHashDataStructure.delete("kz"));
        assertFalse(myHashDataStructure.delete("ax"));
        assertTrue(myHashDataStructure.delete("bx"));
        assertTrue(myHashDataStructure.delete("zvBQpaa"));
        assertFalse(myHashDataStructure.search("bx"));
        assertFalse(myHashDataStructure.search("zvBQpaa"));
    }

    ////////////////////////////// Linear///////////////////////////

    // empty
    @Test
    void file0N_insert () {
        LinearSpace<String> myHashDataStructure = new LinearSpace<>(10);
        int temp = myHashDataStructure.batch_insert("file0");
        assertEquals(temp , 0);

        assertTrue(myHashDataStructure.insert("kkkkkkkkkkkkkkkkkkkkkkk"));
        assertFalse(myHashDataStructure.insert("kkkkkkkkkkkkkkkkkkkkkkk"));
        assertTrue(myHashDataStructure.insert("bx"));
        assertFalse(myHashDataStructure.insert("bx"));
        assertTrue(myHashDataStructure.insert("zvBQpaa"));
        assertFalse(myHashDataStructure.insert("zvBQpaa"));
    }
    @Test
    void file0N_delete () {
        LinearSpace<String> myHashDataStructure = new LinearSpace<>(10);
        int temp = myHashDataStructure.batch_insert("file0");
        assertEquals(temp , 0);

        assertFalse(myHashDataStructure.delete("kz"));
        assertFalse(myHashDataStructure.delete("ax"));
        assertFalse(myHashDataStructure.delete("ascxzczsfasz"));
        assertFalse(myHashDataStructure.delete("aaaaaaaaxxxxxxxxxxxxxfffffffffffffa"));
        assertFalse(myHashDataStructure.delete("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"));
    }
    @Test
    void file0N_search () {
        LinearSpace<String> myHashDataStructure = new LinearSpace<>(10);
        int temp = myHashDataStructure.batch_insert("file0");
        assertEquals(temp , 0);

        assertFalse(myHashDataStructure.search("kz"));
        assertFalse(myHashDataStructure.search("ax"));
        assertFalse(myHashDataStructure.search("ascxzczsfasz"));
        assertFalse(myHashDataStructure.search("aaaaaaaaxxxxxxxxxxxxxfffffffffffffa"));
        assertFalse(myHashDataStructure.search("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"));
    }
    @Test
    void file0N_combination () {
        LinearSpace<String> myHashDataStructure = new LinearSpace<>(10);
        int temp = myHashDataStructure.batch_insert("file0");
        assertEquals(temp , 0);

        // search + insert
        assertFalse(myHashDataStructure.search("bx"));
        assertFalse(myHashDataStructure.search("zvBQpaa"));
        assertTrue(myHashDataStructure.insert("bx"));
        assertTrue(myHashDataStructure.insert("zvBQpaa"));
        assertTrue(myHashDataStructure.search("bx"));
        assertTrue(myHashDataStructure.search("zvBQpaa"));

        // search + delete
        assertFalse(myHashDataStructure.search("kz"));
        assertFalse(myHashDataStructure.search("ax"));
        assertFalse(myHashDataStructure.delete("kz"));
        assertFalse(myHashDataStructure.delete("ax"));
        assertTrue(myHashDataStructure.delete("bx"));
        assertTrue(myHashDataStructure.delete("zvBQpaa"));
        assertFalse(myHashDataStructure.search("bx"));
        assertFalse(myHashDataStructure.search("zvBQpaa"));
    }

    // 1 element
    @Test
    void file1N_insert () {
        LinearSpace<String> myHashDataStructure = new LinearSpace<>(10);
        int temp = myHashDataStructure.batch_insert("file1");
        assertEquals(temp , 1);

        assertFalse(myHashDataStructure.insert("hello"));
        assertTrue(myHashDataStructure.insert("kkkkkkkkkkkkkkkkkkkkkkk"));
        assertFalse(myHashDataStructure.insert("kkkkkkkkkkkkkkkkkkkkkkk"));
        assertTrue(myHashDataStructure.insert("bx"));
        assertFalse(myHashDataStructure.insert("bx"));
        assertTrue(myHashDataStructure.insert("zvBQpaa"));
        assertFalse(myHashDataStructure.insert("zvBQpaa"));
    }
    @Test
    void file1N_delete () {
        LinearSpace<String> myHashDataStructure = new LinearSpace<>(10);
        int temp = myHashDataStructure.batch_insert("file1");
        assertEquals(temp , 1);


        assertTrue(myHashDataStructure.delete("hello"));
        assertFalse(myHashDataStructure.delete("hello"));
        assertFalse(myHashDataStructure.delete("kz"));
        assertFalse(myHashDataStructure.delete("ax"));
        assertFalse(myHashDataStructure.delete("ascxzczsfasz"));
        assertFalse(myHashDataStructure.delete("aaaaaaaaxxxxxxxxxxxxxfffffffffffffa"));
        assertFalse(myHashDataStructure.delete("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"));
    }
    @Test
    void file1N_search () {
        LinearSpace<String> myHashDataStructure = new LinearSpace<>(10);
        int temp = myHashDataStructure.batch_insert("file1");
        assertEquals(temp , 1);

        assertTrue(myHashDataStructure.search("hello"));
        assertFalse(myHashDataStructure.search("kz"));
        assertFalse(myHashDataStructure.search("ax"));
        assertFalse(myHashDataStructure.search("ascxzczsfasz"));
        assertFalse(myHashDataStructure.search("aaaaaaaaxxxxxxxxxxxxxfffffffffffffa"));
        assertFalse(myHashDataStructure.search("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"));
    }
    @Test
    void file1N_combination () {
        LinearSpace<String> myHashDataStructure = new LinearSpace<>(10);
        int temp = myHashDataStructure.batch_insert("file1");
        assertEquals(temp , 1);

        // already exist
        assertTrue(myHashDataStructure.search("hello"));
        assertFalse(myHashDataStructure.insert("hello"));
        assertTrue(myHashDataStructure.search("hello"));

        // search + insert
        assertFalse(myHashDataStructure.search("bx"));
        assertFalse(myHashDataStructure.search("zvBQpaa"));
        assertTrue(myHashDataStructure.insert("bx"));
        assertTrue(myHashDataStructure.insert("zvBQpaa"));
        assertTrue(myHashDataStructure.search("bx"));
        assertTrue(myHashDataStructure.search("zvBQpaa"));

        // search + delete
        assertFalse(myHashDataStructure.search("kz"));
        assertFalse(myHashDataStructure.search("ax"));
        assertFalse(myHashDataStructure.delete("kz"));
        assertFalse(myHashDataStructure.delete("ax"));
        assertTrue(myHashDataStructure.delete("bx"));
        assertTrue(myHashDataStructure.delete("zvBQpaa"));
        assertFalse(myHashDataStructure.search("bx"));
        assertFalse(myHashDataStructure.search("zvBQpaa"));
    }

    // wierd chars
    @Test
    void file2N_insert () {
        LinearSpace<String> myHashDataStructure = new LinearSpace<>(10);
        int temp = myHashDataStructure.batch_insert("file2");
        assertEquals(temp , 3);

        assertFalse(myHashDataStructure.insert("@hello!"));
        assertFalse(myHashDataStructure.insert("$world?"));
        assertFalse(myHashDataStructure.insert("#testing."));

        assertTrue(myHashDataStructure.insert("kkkkkkkkkkkkkkkkkkkkkkk"));
        assertFalse(myHashDataStructure.insert("kkkkkkkkkkkkkkkkkkkkkkk"));
        assertTrue(myHashDataStructure.insert("bx"));
        assertFalse(myHashDataStructure.insert("bx"));
        assertTrue(myHashDataStructure.insert("zvBQpaa"));
        assertFalse(myHashDataStructure.insert("zvBQpaa"));
    }
    @Test
    void file2N_delete () {
        LinearSpace<String> myHashDataStructure = new LinearSpace<>(10);
        int temp = myHashDataStructure.batch_insert("file2");
        assertEquals(temp , 3);

        assertTrue(myHashDataStructure.delete("@hello!"));
        assertTrue(myHashDataStructure.delete("$world?"));
        assertTrue(myHashDataStructure.delete("#testing."));
        assertFalse(myHashDataStructure.delete("@hello!"));
        assertFalse(myHashDataStructure.delete("$world?"));
        assertFalse(myHashDataStructure.delete("#testing."));

        assertFalse(myHashDataStructure.delete("kz"));
        assertFalse(myHashDataStructure.delete("ax"));
        assertFalse(myHashDataStructure.delete("ascxzczsfasz"));
        assertFalse(myHashDataStructure.delete("aaaaaaaaxxxxxxxxxxxxxfffffffffffffa"));
        assertFalse(myHashDataStructure.delete("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"));
    }
    @Test
    void file2N_search () {
        LinearSpace<String> myHashDataStructure = new LinearSpace<>(10);
        int temp = myHashDataStructure.batch_insert("file2");
        assertEquals(temp , 3);

        assertTrue(myHashDataStructure.search("@hello!"));
        assertTrue(myHashDataStructure.search("$world?"));
        assertTrue(myHashDataStructure.search("#testing."));

        assertFalse(myHashDataStructure.search("kz"));
        assertFalse(myHashDataStructure.search("ax"));
        assertFalse(myHashDataStructure.search("ascxzczsfasz"));
        assertFalse(myHashDataStructure.search("aaaaaaaaxxxxxxxxxxxxxfffffffffffffa"));
        assertFalse(myHashDataStructure.search("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"));
    }
    @Test
    void file2N_combination () {
        LinearSpace<String> myHashDataStructure = new LinearSpace<>(10);
        int temp = myHashDataStructure.batch_insert("file2");
        assertEquals(temp , 3);

        // already exist
        assertTrue(myHashDataStructure.search("@hello!"));
        assertTrue(myHashDataStructure.search("$world?"));
        assertTrue(myHashDataStructure.search("#testing."));
        assertFalse(myHashDataStructure.insert("@hello!"));
        assertFalse(myHashDataStructure.insert("$world?"));
        assertFalse(myHashDataStructure.insert("#testing."));
        assertTrue(myHashDataStructure.search("@hello!"));
        assertTrue(myHashDataStructure.search("$world?"));
        assertTrue(myHashDataStructure.search("#testing."));

        // search + insert
        assertFalse(myHashDataStructure.search("bx"));
        assertFalse(myHashDataStructure.search("zvBQpaa"));
        assertTrue(myHashDataStructure.insert("bx"));
        assertTrue(myHashDataStructure.insert("zvBQpaa"));
        assertTrue(myHashDataStructure.search("bx"));
        assertTrue(myHashDataStructure.search("zvBQpaa"));

        // search + delete
        assertTrue(myHashDataStructure.search("@hello!"));
        assertTrue(myHashDataStructure.search("$world?"));
        assertTrue(myHashDataStructure.search("#testing."));
        assertTrue(myHashDataStructure.delete("@hello!"));
        assertTrue(myHashDataStructure.delete("$world?"));
        assertTrue(myHashDataStructure.delete("#testing."));
        assertFalse(myHashDataStructure.search("@hello!"));
        assertFalse(myHashDataStructure.search("$world?"));
        assertFalse(myHashDataStructure.search("#testing."));
        assertFalse(myHashDataStructure.search("kz"));
        assertFalse(myHashDataStructure.search("ax"));
        assertFalse(myHashDataStructure.delete("kz"));
        assertFalse(myHashDataStructure.delete("ax"));
        assertTrue(myHashDataStructure.delete("bx"));
        assertTrue(myHashDataStructure.delete("zvBQpaa"));
        assertFalse(myHashDataStructure.search("bx"));
        assertFalse(myHashDataStructure.search("zvBQpaa"));
    }

    // spaces
    @Test
    void file3N_insert () {
        LinearSpace<String> myHashDataStructure = new LinearSpace<>(10);
        int temp = myHashDataStructure.batch_insert("file3");
        assertEquals(temp , 3);

        assertFalse(myHashDataStructure.insert("   apple"));
        assertFalse(myHashDataStructure.insert("banana"));
        assertFalse(myHashDataStructure.insert("    orange"));

        assertTrue(myHashDataStructure.insert("kkkkkkkkkkkkkkkkkkkkkkk"));
        assertFalse(myHashDataStructure.insert("kkkkkkkkkkkkkkkkkkkkkkk"));
        assertTrue(myHashDataStructure.insert("bx"));
        assertFalse(myHashDataStructure.insert("bx"));
        assertTrue(myHashDataStructure.insert("zvBQpaa"));
        assertFalse(myHashDataStructure.insert("zvBQpaa"));
    }
    @Test
    void file3N_delete () {
        LinearSpace<String> myHashDataStructure = new LinearSpace<>(10);
        int temp = myHashDataStructure.batch_insert("file3");
        assertEquals(temp , 3);

        assertTrue(myHashDataStructure.delete("   apple"));
        assertTrue(myHashDataStructure.delete("banana"));
        assertTrue(myHashDataStructure.delete("    orange"));
        assertFalse(myHashDataStructure.delete("   apple"));
        assertFalse(myHashDataStructure.delete("banana"));
        assertFalse(myHashDataStructure.delete("    orange"));

        assertFalse(myHashDataStructure.delete("kz"));
        assertFalse(myHashDataStructure.delete("ax"));
        assertFalse(myHashDataStructure.delete("ascxzczsfasz"));
        assertFalse(myHashDataStructure.delete("aaaaaaaaxxxxxxxxxxxxxfffffffffffffa"));
        assertFalse(myHashDataStructure.delete("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"));
    }
    @Test
    void file3N_search () {
        LinearSpace<String> myHashDataStructure = new LinearSpace<>(10);
        int temp = myHashDataStructure.batch_insert("file3");
        assertEquals(temp , 3);

        assertTrue(myHashDataStructure.search("   apple"));
        assertTrue(myHashDataStructure.search("banana"));
        assertTrue(myHashDataStructure.search("    orange"));

        assertFalse(myHashDataStructure.search("kz"));
        assertFalse(myHashDataStructure.search("ax"));
        assertFalse(myHashDataStructure.search("ascxzczsfasz"));
        assertFalse(myHashDataStructure.search("aaaaaaaaxxxxxxxxxxxxxfffffffffffffa"));
        assertFalse(myHashDataStructure.search("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"));
    }
    @Test
    void file3N_combination () {
        LinearSpace<String> myHashDataStructure = new LinearSpace<>(10);
        int temp = myHashDataStructure.batch_insert("file3");
        assertEquals(temp , 3);

        // already exist
        assertTrue(myHashDataStructure.search("   apple"));
        assertTrue(myHashDataStructure.search("banana"));
        assertTrue(myHashDataStructure.search("    orange"));
        assertFalse(myHashDataStructure.insert("   apple"));
        assertFalse(myHashDataStructure.insert("banana"));
        assertFalse(myHashDataStructure.insert("    orange"));
        assertTrue(myHashDataStructure.search("   apple"));
        assertTrue(myHashDataStructure.search("banana"));
        assertTrue(myHashDataStructure.search("    orange"));

        // search + insert
        assertFalse(myHashDataStructure.search("bx"));
        assertFalse(myHashDataStructure.search("zvBQpaa"));
        assertTrue(myHashDataStructure.insert("bx"));
        assertTrue(myHashDataStructure.insert("zvBQpaa"));
        assertTrue(myHashDataStructure.search("bx"));
        assertTrue(myHashDataStructure.search("zvBQpaa"));

        // search + delete
        assertTrue(myHashDataStructure.search("   apple"));
        assertTrue(myHashDataStructure.search("banana"));
        assertTrue(myHashDataStructure.search("    orange"));
        assertTrue(myHashDataStructure.delete("   apple"));
        assertTrue(myHashDataStructure.delete("banana"));
        assertTrue(myHashDataStructure.delete("    orange"));
        assertFalse(myHashDataStructure.search("   apple"));
        assertFalse(myHashDataStructure.search("banana"));
        assertFalse(myHashDataStructure.search("    orange"));
        assertFalse(myHashDataStructure.search("kz"));
        assertFalse(myHashDataStructure.search("ax"));
        assertFalse(myHashDataStructure.delete("kz"));
        assertFalse(myHashDataStructure.delete("ax"));
        assertTrue(myHashDataStructure.delete("bx"));
        assertTrue(myHashDataStructure.delete("zvBQpaa"));
        assertFalse(myHashDataStructure.search("bx"));
        assertFalse(myHashDataStructure.search("zvBQpaa"));
    }

    // dups
    @Test
    void file4N_insert () {
        LinearSpace<String> myHashDataStructure = new LinearSpace<>(10);
        int temp = myHashDataStructure.batch_insert("file4");
        assertEquals(temp , 3);

        assertFalse(myHashDataStructure.insert("apple"));
        assertFalse(myHashDataStructure.insert("banana"));
        assertFalse(myHashDataStructure.insert("orange"));

        assertTrue(myHashDataStructure.insert("kkkkkkkkkkkkkkkkkkkkkkk"));
        assertFalse(myHashDataStructure.insert("kkkkkkkkkkkkkkkkkkkkkkk"));
        assertTrue(myHashDataStructure.insert("bx"));
        assertFalse(myHashDataStructure.insert("bx"));
        assertTrue(myHashDataStructure.insert("zvBQpaa"));
        assertFalse(myHashDataStructure.insert("zvBQpaa"));
    }
    @Test
    void file4N_delete () {
        LinearSpace<String> myHashDataStructure = new LinearSpace<>(10);
        int temp = myHashDataStructure.batch_insert("file4");
        assertEquals(temp , 3);

        assertTrue(myHashDataStructure.delete("apple"));
        assertTrue(myHashDataStructure.delete("banana"));
        assertTrue(myHashDataStructure.delete("orange"));
        assertFalse(myHashDataStructure.delete("apple"));
        assertFalse(myHashDataStructure.delete("banana"));
        assertFalse(myHashDataStructure.delete("orange"));

        assertFalse(myHashDataStructure.delete("kz"));
        assertFalse(myHashDataStructure.delete("ax"));
        assertFalse(myHashDataStructure.delete("ascxzczsfasz"));
        assertFalse(myHashDataStructure.delete("aaaaaaaaxxxxxxxxxxxxxfffffffffffffa"));
        assertFalse(myHashDataStructure.delete("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"));
    }
    @Test
    void file4N_search () {
        LinearSpace<String> myHashDataStructure = new LinearSpace<>(10);
        int temp = myHashDataStructure.batch_insert("file4");
        assertEquals(temp , 3);

        assertTrue(myHashDataStructure.search("apple"));
        assertTrue(myHashDataStructure.search("banana"));
        assertTrue(myHashDataStructure.search("orange"));

        assertFalse(myHashDataStructure.search("kz"));
        assertFalse(myHashDataStructure.search("ax"));
        assertFalse(myHashDataStructure.search("ascxzczsfasz"));
        assertFalse(myHashDataStructure.search("aaaaaaaaxxxxxxxxxxxxxfffffffffffffa"));
        assertFalse(myHashDataStructure.search("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"));
    }
    @Test
    void file4N_combination () {
        LinearSpace<String> myHashDataStructure = new LinearSpace<>(10);
        int temp = myHashDataStructure.batch_insert("file4");
        assertEquals(temp , 3);

        // already exist
        assertTrue(myHashDataStructure.search("apple"));
        assertTrue(myHashDataStructure.search("banana"));
        assertTrue(myHashDataStructure.search("orange"));
        assertFalse(myHashDataStructure.insert("apple"));
        assertFalse(myHashDataStructure.insert("banana"));
        assertFalse(myHashDataStructure.insert("orange"));
        assertTrue(myHashDataStructure.search("apple"));
        assertTrue(myHashDataStructure.search("banana"));
        assertTrue(myHashDataStructure.search("orange"));

        // search + insert
        assertFalse(myHashDataStructure.search("bx"));
        assertFalse(myHashDataStructure.search("zvBQpaa"));
        assertTrue(myHashDataStructure.insert("bx"));
        assertTrue(myHashDataStructure.insert("zvBQpaa"));
        assertTrue(myHashDataStructure.search("bx"));
        assertTrue(myHashDataStructure.search("zvBQpaa"));

        // search + delete
        assertTrue(myHashDataStructure.search("apple"));
        assertTrue(myHashDataStructure.search("banana"));
        assertTrue(myHashDataStructure.search("orange"));
        assertTrue(myHashDataStructure.delete("apple"));
        assertTrue(myHashDataStructure.delete("banana"));
        assertTrue(myHashDataStructure.delete("orange"));
        assertFalse(myHashDataStructure.search("apple"));
        assertFalse(myHashDataStructure.search("banana"));
        assertFalse(myHashDataStructure.search("orange"));
        assertFalse(myHashDataStructure.search("kz"));
        assertFalse(myHashDataStructure.search("ax"));
        assertFalse(myHashDataStructure.delete("kz"));
        assertFalse(myHashDataStructure.delete("ax"));
        assertTrue(myHashDataStructure.delete("bx"));
        assertTrue(myHashDataStructure.delete("zvBQpaa"));
        assertFalse(myHashDataStructure.search("bx"));
        assertFalse(myHashDataStructure.search("zvBQpaa"));
    }

    // C & s
    @Test
    void file5N_insert () {
        LinearSpace<String> myHashDataStructure = new LinearSpace<>(10);
        int temp = myHashDataStructure.batch_insert("file5");
        assertEquals(temp , 3);

        assertFalse(myHashDataStructure.insert("ApPle"));
        assertFalse(myHashDataStructure.insert("BanAna"));
        assertFalse(myHashDataStructure.insert("orangE"));

        assertTrue(myHashDataStructure.insert("kkkkkkkkkkkkkkkkkkkkkkk"));
        assertFalse(myHashDataStructure.insert("kkkkkkkkkkkkkkkkkkkkkkk"));
        assertTrue(myHashDataStructure.insert("bx"));
        assertFalse(myHashDataStructure.insert("bx"));
        assertTrue(myHashDataStructure.insert("zvBQpaa"));
        assertFalse(myHashDataStructure.insert("zvBQpaa"));
    }
    @Test
    void file5N_delete () {
        LinearSpace<String> myHashDataStructure = new LinearSpace<>(10);
        int temp = myHashDataStructure.batch_insert("file5");
        assertEquals(temp , 3);

        assertTrue(myHashDataStructure.delete("ApPle"));
        assertTrue(myHashDataStructure.delete("BanAna"));
        assertTrue(myHashDataStructure.delete("orangE"));
        assertFalse(myHashDataStructure.delete("ApPle"));
        assertFalse(myHashDataStructure.delete("BanAna"));
        assertFalse(myHashDataStructure.delete("orangE"));

        assertFalse(myHashDataStructure.delete("kz"));
        assertFalse(myHashDataStructure.delete("ax"));
        assertFalse(myHashDataStructure.delete("ascxzczsfasz"));
        assertFalse(myHashDataStructure.delete("aaaaaaaaxxxxxxxxxxxxxfffffffffffffa"));
        assertFalse(myHashDataStructure.delete("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"));
    }
    @Test
    void file5N_search () {
        LinearSpace<String> myHashDataStructure = new LinearSpace<>(10);
        int temp = myHashDataStructure.batch_insert("file5");
        assertEquals(temp , 3);

        assertTrue(myHashDataStructure.search("ApPle"));
        assertTrue(myHashDataStructure.search("BanAna"));
        assertTrue(myHashDataStructure.search("orangE"));

        assertFalse(myHashDataStructure.search("kz"));
        assertFalse(myHashDataStructure.search("ax"));
        assertFalse(myHashDataStructure.search("ascxzczsfasz"));
        assertFalse(myHashDataStructure.search("aaaaaaaaxxxxxxxxxxxxxfffffffffffffa"));
        assertFalse(myHashDataStructure.search("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"));
    }
    @Test
    void file5N_combination () {
        LinearSpace<String> myHashDataStructure = new LinearSpace<>(10);
        int temp = myHashDataStructure.batch_insert("file5");
        assertEquals(temp , 3);

        // already exist
        assertTrue(myHashDataStructure.search("ApPle"));
        assertTrue(myHashDataStructure.search("BanAna"));
        assertTrue(myHashDataStructure.search("orangE"));
        assertFalse(myHashDataStructure.insert("ApPle"));
        assertFalse(myHashDataStructure.insert("BanAna"));
        assertFalse(myHashDataStructure.insert("orangE"));
        assertTrue(myHashDataStructure.search("ApPle"));
        assertTrue(myHashDataStructure.search("BanAna"));
        assertTrue(myHashDataStructure.search("orangE"));

        // search + insert
        assertFalse(myHashDataStructure.search("bx"));
        assertFalse(myHashDataStructure.search("zvBQpaa"));
        assertTrue(myHashDataStructure.insert("bx"));
        assertTrue(myHashDataStructure.insert("zvBQpaa"));
        assertTrue(myHashDataStructure.search("bx"));
        assertTrue(myHashDataStructure.search("zvBQpaa"));

        // search + delete
        assertTrue(myHashDataStructure.search("ApPle"));
        assertTrue(myHashDataStructure.search("BanAna"));
        assertTrue(myHashDataStructure.search("orangE"));
        assertTrue(myHashDataStructure.delete("ApPle"));
        assertTrue(myHashDataStructure.delete("BanAna"));
        assertTrue(myHashDataStructure.delete("orangE"));
        assertFalse(myHashDataStructure.search("ApPle"));
        assertFalse(myHashDataStructure.search("BanAna"));
        assertFalse(myHashDataStructure.search("orangE"));
        assertFalse(myHashDataStructure.search("kz"));
        assertFalse(myHashDataStructure.search("ax"));
        assertFalse(myHashDataStructure.delete("kz"));
        assertFalse(myHashDataStructure.delete("ax"));
        assertTrue(myHashDataStructure.delete("bx"));
        assertTrue(myHashDataStructure.delete("zvBQpaa"));
        assertFalse(myHashDataStructure.search("bx"));
        assertFalse(myHashDataStructure.search("zvBQpaa"));
    }

    // empty lines
    @Test
    void file6N_insert () {
        LinearSpace<String> myHashDataStructure = new LinearSpace<>(10);
        int temp = myHashDataStructure.batch_insert("file6");
        assertEquals(temp , 4);

        assertFalse(myHashDataStructure.insert("apple"));
        assertFalse(myHashDataStructure.insert("banana"));
        assertFalse(myHashDataStructure.insert("orange"));

        assertTrue(myHashDataStructure.insert("kkkkkkkkkkkkkkkkkkkkkkk"));
        assertFalse(myHashDataStructure.insert("kkkkkkkkkkkkkkkkkkkkkkk"));
        assertTrue(myHashDataStructure.insert("bx"));
        assertFalse(myHashDataStructure.insert("bx"));
        assertTrue(myHashDataStructure.insert("zvBQpaa"));
        assertFalse(myHashDataStructure.insert("zvBQpaa"));
    }
    @Test
    void file6N_delete () {
        LinearSpace<String> myHashDataStructure = new LinearSpace<>(10);
        int temp = myHashDataStructure.batch_insert("file6");
        assertEquals(temp , 4);

        assertTrue(myHashDataStructure.delete("apple"));
        assertTrue(myHashDataStructure.delete("banana"));
        assertTrue(myHashDataStructure.delete("orange"));
        assertFalse(myHashDataStructure.delete("apple"));
        assertFalse(myHashDataStructure.delete("banana"));
        assertFalse(myHashDataStructure.delete("orange"));

        assertFalse(myHashDataStructure.delete("kz"));
        assertFalse(myHashDataStructure.delete("ax"));
        assertFalse(myHashDataStructure.delete("ascxzczsfasz"));
        assertFalse(myHashDataStructure.delete("aaaaaaaaxxxxxxxxxxxxxfffffffffffffa"));
        assertFalse(myHashDataStructure.delete("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"));
    }
    @Test
    void file6N_search () {
        LinearSpace<String> myHashDataStructure = new LinearSpace<>(10);
        int temp = myHashDataStructure.batch_insert("file6");
        assertEquals(temp , 4);

        assertTrue(myHashDataStructure.search("apple"));
        assertTrue(myHashDataStructure.search("banana"));
        assertTrue(myHashDataStructure.search("orange"));

        assertFalse(myHashDataStructure.search("kz"));
        assertFalse(myHashDataStructure.search("ax"));
        assertFalse(myHashDataStructure.search("ascxzczsfasz"));
        assertFalse(myHashDataStructure.search("aaaaaaaaxxxxxxxxxxxxxfffffffffffffa"));
        assertFalse(myHashDataStructure.search("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"));
    }
    @Test
    void file6N_combination () {
        LinearSpace<String> myHashDataStructure = new LinearSpace<>(10);
        int temp = myHashDataStructure.batch_insert("file6");
        assertEquals(temp , 4);

        // already exist
        assertTrue(myHashDataStructure.search("apple"));
        assertTrue(myHashDataStructure.search("banana"));
        assertTrue(myHashDataStructure.search("orange"));
        assertFalse(myHashDataStructure.insert("apple"));
        assertFalse(myHashDataStructure.insert("banana"));
        assertFalse(myHashDataStructure.insert("orange"));
        assertTrue(myHashDataStructure.search("apple"));
        assertTrue(myHashDataStructure.search("banana"));
        assertTrue(myHashDataStructure.search("orange"));

        // search + insert
        assertFalse(myHashDataStructure.search("bx"));
        assertFalse(myHashDataStructure.search("zvBQpaa"));
        assertTrue(myHashDataStructure.insert("bx"));
        assertTrue(myHashDataStructure.insert("zvBQpaa"));
        assertTrue(myHashDataStructure.search("bx"));
        assertTrue(myHashDataStructure.search("zvBQpaa"));

        // search + delete
        assertTrue(myHashDataStructure.search("apple"));
        assertTrue(myHashDataStructure.search("banana"));
        assertTrue(myHashDataStructure.search("orange"));
        assertTrue(myHashDataStructure.delete("apple"));
        assertTrue(myHashDataStructure.delete("banana"));
        assertTrue(myHashDataStructure.delete("orange"));
        assertFalse(myHashDataStructure.search("apple"));
        assertFalse(myHashDataStructure.search("banana"));
        assertFalse(myHashDataStructure.search("orange"));
        assertFalse(myHashDataStructure.search("kz"));
        assertFalse(myHashDataStructure.search("ax"));
        assertFalse(myHashDataStructure.delete("kz"));
        assertFalse(myHashDataStructure.delete("ax"));
        assertTrue(myHashDataStructure.delete("bx"));
        assertTrue(myHashDataStructure.delete("zvBQpaa"));
        assertFalse(myHashDataStructure.search("bx"));
        assertFalse(myHashDataStructure.search("zvBQpaa"));
    }

    // non ascii chars
    @Test
    void file7N_insert () {
        LinearSpace<String> myHashDataStructure = new LinearSpace<>(10);
        int temp = myHashDataStructure.batch_insert("file7");
        assertEquals(temp , 3);

        assertFalse(myHashDataStructure.insert("café"));
        assertFalse(myHashDataStructure.insert("résumé"));
        assertFalse(myHashDataStructure.insert("über"));

        assertTrue(myHashDataStructure.insert("kkkkkkkkkkkkkkkkkkkkkkk"));
        assertFalse(myHashDataStructure.insert("kkkkkkkkkkkkkkkkkkkkkkk"));
        assertTrue(myHashDataStructure.insert("bx"));
        assertFalse(myHashDataStructure.insert("bx"));
        assertTrue(myHashDataStructure.insert("zvBQpaa"));
        assertFalse(myHashDataStructure.insert("zvBQpaa"));
    }
    @Test
    void file7N_delete () {
        LinearSpace<String> myHashDataStructure = new LinearSpace<>(10);
        int temp = myHashDataStructure.batch_insert("file7");
        assertEquals(temp , 3);

        assertTrue(myHashDataStructure.delete("café"));
        assertTrue(myHashDataStructure.delete("résumé"));
        assertTrue(myHashDataStructure.delete("über"));
        assertFalse(myHashDataStructure.delete("café"));
        assertFalse(myHashDataStructure.delete("résumé"));
        assertFalse(myHashDataStructure.delete("über"));

        assertFalse(myHashDataStructure.delete("kz"));
        assertFalse(myHashDataStructure.delete("ax"));
        assertFalse(myHashDataStructure.delete("ascxzczsfasz"));
        assertFalse(myHashDataStructure.delete("aaaaaaaaxxxxxxxxxxxxxfffffffffffffa"));
        assertFalse(myHashDataStructure.delete("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"));
    }
    @Test
    void file7N_search () {
        LinearSpace<String> myHashDataStructure = new LinearSpace<>(10);
        int temp = myHashDataStructure.batch_insert("file7");
        assertEquals(temp , 3);

        assertTrue(myHashDataStructure.search("café"));
        assertTrue(myHashDataStructure.search("résumé"));
        assertTrue(myHashDataStructure.search("über"));

        assertFalse(myHashDataStructure.search("kz"));
        assertFalse(myHashDataStructure.search("ax"));
        assertFalse(myHashDataStructure.search("ascxzczsfasz"));
        assertFalse(myHashDataStructure.search("aaaaaaaaxxxxxxxxxxxxxfffffffffffffa"));
        assertFalse(myHashDataStructure.search("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"));
    }
    @Test
    void file7N_combination () {
        LinearSpace<String> myHashDataStructure = new LinearSpace<>(10);
        int temp = myHashDataStructure.batch_insert("file7");
        assertEquals(temp , 3);

        // already exist
        assertTrue(myHashDataStructure.search("café"));
        assertTrue(myHashDataStructure.search("résumé"));
        assertTrue(myHashDataStructure.search("über"));
        assertFalse(myHashDataStructure.insert("café"));
        assertFalse(myHashDataStructure.insert("résumé"));
        assertFalse(myHashDataStructure.insert("über"));
        assertTrue(myHashDataStructure.search("café"));
        assertTrue(myHashDataStructure.search("résumé"));
        assertTrue(myHashDataStructure.search("über"));

        // search + insert
        assertFalse(myHashDataStructure.search("bx"));
        assertFalse(myHashDataStructure.search("zvBQpaa"));
        assertTrue(myHashDataStructure.insert("bx"));
        assertTrue(myHashDataStructure.insert("zvBQpaa"));
        assertTrue(myHashDataStructure.search("bx"));
        assertTrue(myHashDataStructure.search("zvBQpaa"));

        // search + delete
        assertTrue(myHashDataStructure.search("café"));
        assertTrue(myHashDataStructure.search("résumé"));
        assertTrue(myHashDataStructure.search("über"));
        assertTrue(myHashDataStructure.delete("café"));
        assertTrue(myHashDataStructure.delete("résumé"));
        assertTrue(myHashDataStructure.delete("über"));
        assertFalse(myHashDataStructure.search("café"));
        assertFalse(myHashDataStructure.search("résumé"));
        assertFalse(myHashDataStructure.search("über"));
        assertFalse(myHashDataStructure.search("kz"));
        assertFalse(myHashDataStructure.search("ax"));
        assertFalse(myHashDataStructure.delete("kz"));
        assertFalse(myHashDataStructure.delete("ax"));
        assertTrue(myHashDataStructure.delete("bx"));
        assertTrue(myHashDataStructure.delete("zvBQpaa"));
        assertFalse(myHashDataStructure.search("bx"));
        assertFalse(myHashDataStructure.search("zvBQpaa"));
    }

    // random
    @Test
    void file8N_insert () {
        LinearSpace<String> myHashDataStructure = new LinearSpace<>(1500);
        int temp = myHashDataStructure.batch_insert("file8");
        assertEquals(temp , 1000);

        assertFalse(myHashDataStructure.insert("z"));
        assertFalse(myHashDataStructure.insert("b"));
        assertFalse(myHashDataStructure.insert("CEMgIVDuqc"));
        assertFalse(myHashDataStructure.insert("zvBQp"));
        assertFalse(myHashDataStructure.insert("HVnsvXqAy"));

        assertTrue(myHashDataStructure.insert("kkkkkkkkkkkkkkkkkkkkkkk"));
        assertFalse(myHashDataStructure.insert("kkkkkkkkkkkkkkkkkkkkkkk"));
        assertTrue(myHashDataStructure.insert("bx"));
        assertFalse(myHashDataStructure.insert("bx"));
        assertTrue(myHashDataStructure.insert("zvBQpaa"));
        assertFalse(myHashDataStructure.insert("zvBQpaa"));
    }
    @Test
    void file8N_delete () {
        LinearSpace<String> myHashDataStructure = new LinearSpace<>(1500);
        int temp = myHashDataStructure.batch_insert("file8");
        assertEquals(temp , 1000);

        assertFalse(myHashDataStructure.delete("kz"));
        assertFalse(myHashDataStructure.delete("ax"));
        assertFalse(myHashDataStructure.delete("ascxzczsfasz"));
        assertFalse(myHashDataStructure.delete("aaaaaaaaxxxxxxxxxxxxxfffffffffffffa"));
        assertFalse(myHashDataStructure.delete("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"));

        assertTrue(myHashDataStructure.delete("CEMgIVDuqc"));
        assertFalse(myHashDataStructure.delete("CEMgIVDuqc"));
        assertTrue(myHashDataStructure.delete("b"));
        assertFalse(myHashDataStructure.delete("b"));
        assertTrue(myHashDataStructure.delete("zvBQp"));
        assertFalse(myHashDataStructure.delete("zvBQp"));
    }
    @Test
    void file8N_search () {
        LinearSpace<String> myHashDataStructure = new LinearSpace<>(1500);
        int temp = myHashDataStructure.batch_insert("file8");
        assertEquals(temp , 1000);

        assertFalse(myHashDataStructure.search("kz"));
        assertFalse(myHashDataStructure.search("ax"));
        assertFalse(myHashDataStructure.search("ascxzczsfasz"));
        assertFalse(myHashDataStructure.search("aaaaaaaaxxxxxxxxxxxxxfffffffffffffa"));
        assertFalse(myHashDataStructure.search("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"));

        assertTrue(myHashDataStructure.search("CEMgIVDuqc"));
        assertTrue(myHashDataStructure.search("b"));
        assertTrue(myHashDataStructure.search("zvBQp"));
        assertTrue(myHashDataStructure.search("z"));
        assertTrue(myHashDataStructure.search("zvBQp"));
    }
    @Test
    void file8N_combination () {
        LinearSpace<String> myHashDataStructure = new LinearSpace<>(1500);
        int temp = myHashDataStructure.batch_insert("file8");
        assertEquals(temp , 1000);

        // already exist
        assertTrue(myHashDataStructure.search("CEMgIVDuqc"));
        assertTrue(myHashDataStructure.search("zvBQp"));
        assertFalse(myHashDataStructure.insert("CEMgIVDuqc"));
        assertFalse(myHashDataStructure.insert("zvBQp"));
        assertTrue(myHashDataStructure.search("CEMgIVDuqc"));
        assertTrue(myHashDataStructure.search("zvBQp"));

        // search + insert
        assertFalse(myHashDataStructure.search("bx"));
        assertFalse(myHashDataStructure.search("zvBQpaa"));
        assertTrue(myHashDataStructure.insert("bx"));
        assertTrue(myHashDataStructure.insert("zvBQpaa"));
        assertTrue(myHashDataStructure.search("bx"));
        assertTrue(myHashDataStructure.search("zvBQpaa"));

        // search + delete
        assertFalse(myHashDataStructure.search("kz"));
        assertFalse(myHashDataStructure.search("ax"));
        assertFalse(myHashDataStructure.delete("kz"));
        assertFalse(myHashDataStructure.delete("ax"));
        assertTrue(myHashDataStructure.delete("CEMgIVDuqc"));
        assertTrue(myHashDataStructure.delete("zvBQp"));
        assertFalse(myHashDataStructure.search("CEMgIVDuqc"));
        assertFalse(myHashDataStructure.search("zvBQp"));
    }

    // random
    @Test
    void file9N_insert () {
        LinearSpace<String> myHashDataStructure = new LinearSpace<>(100);
        int temp = myHashDataStructure.batch_insert("file9");
        assertEquals(temp , 20);

        assertFalse(myHashDataStructure.insert("Km"));
        assertFalse(myHashDataStructure.insert("b"));
        assertFalse(myHashDataStructure.insert("uD"));
        assertFalse(myHashDataStructure.insert("vlaab"));
        assertFalse(myHashDataStructure.insert("DiPa"));

        assertTrue(myHashDataStructure.insert("kkkkkkkkkkkkkkkkkkkkkkk"));
        assertFalse(myHashDataStructure.insert("kkkkkkkkkkkkkkkkkkkkkkk"));
        assertTrue(myHashDataStructure.insert("bx"));
        assertFalse(myHashDataStructure.insert("bx"));
        assertTrue(myHashDataStructure.insert("vlaabaa"));
        assertFalse(myHashDataStructure.insert("vlaabaa"));
    }
    @Test
    void file9N_delete () {
        LinearSpace<String> myHashDataStructure = new LinearSpace<>(100);
        int temp = myHashDataStructure.batch_insert("file9");
        assertEquals(temp , 20);

        assertFalse(myHashDataStructure.delete("kz"));
        assertFalse(myHashDataStructure.delete("ax"));
        assertFalse(myHashDataStructure.delete("ascxzczsfasz"));
        assertFalse(myHashDataStructure.delete("aaaaaaaaxxxxxxxxxxxxxfffffffffffffa"));
        assertFalse(myHashDataStructure.delete("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"));

        assertTrue(myHashDataStructure.delete("uD"));
        assertFalse(myHashDataStructure.delete("uD"));
        assertTrue(myHashDataStructure.delete("b"));
        assertFalse(myHashDataStructure.delete("b"));
        assertTrue(myHashDataStructure.delete("vlaab"));
        assertFalse(myHashDataStructure.delete("vlaab"));
    }
    @Test
    void file9N_search () {
        LinearSpace<String> myHashDataStructure = new LinearSpace<>(100);
        int temp = myHashDataStructure.batch_insert("file9");
        assertEquals(temp , 20);

        assertFalse(myHashDataStructure.search("kz"));
        assertFalse(myHashDataStructure.search("ax"));
        assertFalse(myHashDataStructure.search("ascxzczsfasz"));
        assertFalse(myHashDataStructure.search("aaaaaaaaxxxxxxxxxxxxxfffffffffffffa"));
        assertFalse(myHashDataStructure.search("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"));

        assertTrue(myHashDataStructure.search("uD"));
        assertTrue(myHashDataStructure.search("b"));
        assertTrue(myHashDataStructure.search("vlaab"));
        assertTrue(myHashDataStructure.search("DiPa"));
        assertTrue(myHashDataStructure.search("vlaab"));
    }
    @Test
    void file9N_combination () {
        LinearSpace<String> myHashDataStructure = new LinearSpace<>(100);
        int temp = myHashDataStructure.batch_insert("file9");
        assertEquals(temp , 20);

        // already exist
        assertTrue(myHashDataStructure.search("uD"));
        assertTrue(myHashDataStructure.search("vlaab"));
        assertFalse(myHashDataStructure.insert("uD"));
        assertFalse(myHashDataStructure.insert("vlaab"));
        assertTrue(myHashDataStructure.search("uD"));
        assertTrue(myHashDataStructure.search("vlaab"));

        // search + insert
        assertFalse(myHashDataStructure.search("bx"));
        assertFalse(myHashDataStructure.search("vlaabaa"));
        assertTrue(myHashDataStructure.insert("bx"));
        assertTrue(myHashDataStructure.insert("vlaabaa"));
        assertTrue(myHashDataStructure.search("bx"));
        assertTrue(myHashDataStructure.search("vlaabaa"));

        // search + delete
        assertFalse(myHashDataStructure.search("kz"));
        assertFalse(myHashDataStructure.search("ax"));
        assertFalse(myHashDataStructure.delete("kz"));
        assertFalse(myHashDataStructure.delete("ax"));
        assertTrue(myHashDataStructure.delete("uD"));
        assertTrue(myHashDataStructure.delete("vlaab"));
        assertFalse(myHashDataStructure.search("uD"));
        assertFalse(myHashDataStructure.search("vlaab"));
    }

    // Integers
    // empty
    @Test
    void file10N_insert () {
        LinearSpace<Integer> myHashDataStructure = new LinearSpace<>(10);
        int temp = myHashDataStructure.batch_insert("file10");
        assertEquals(temp , 0);

        assertTrue(myHashDataStructure.insert(0));
        assertFalse(myHashDataStructure.insert(0));
        assertTrue(myHashDataStructure.insert(1));
        assertFalse(myHashDataStructure.insert(1));
        assertTrue(myHashDataStructure.insert(2));
        assertFalse(myHashDataStructure.insert(2));
    }
    @Test
    void file10N_delete () {
        LinearSpace<Integer> myHashDataStructure = new LinearSpace<>(10);
        int temp = myHashDataStructure.batch_insert("file10");
        assertEquals(temp , 0);

        assertFalse(myHashDataStructure.delete(4));
        assertFalse(myHashDataStructure.delete(5));
        assertFalse(myHashDataStructure.delete(10));
        assertFalse(myHashDataStructure.delete(100));
        assertFalse(myHashDataStructure.delete(104));
    }
    @Test
    void file10N_search () {
        LinearSpace<Integer> myHashDataStructure = new LinearSpace<>(10);
        int temp = myHashDataStructure.batch_insert("file10");
        assertEquals(temp , 0);

        assertFalse(myHashDataStructure.search(4));
        assertFalse(myHashDataStructure.search(5));
        assertFalse(myHashDataStructure.search(10));
        assertFalse(myHashDataStructure.search(100));
        assertFalse(myHashDataStructure.search(104));
    }
    @Test
    void file10N_combination () {
        LinearSpace<Integer> myHashDataStructure = new LinearSpace<>(10);
        int temp = myHashDataStructure.batch_insert("file10");
        assertEquals(temp , 0);

        // search + insert
        assertFalse(myHashDataStructure.search(1));
        assertFalse(myHashDataStructure.search(2));
        assertTrue(myHashDataStructure.insert(1));
        assertTrue(myHashDataStructure.insert(2));
        assertTrue(myHashDataStructure.search(1));
        assertTrue(myHashDataStructure.search(2));

        // search + delete
        assertFalse(myHashDataStructure.search(4));
        assertFalse(myHashDataStructure.search(5));
        assertFalse(myHashDataStructure.delete(4));
        assertFalse(myHashDataStructure.delete(5));
        assertTrue(myHashDataStructure.delete(1));
        assertTrue(myHashDataStructure.delete(2));
        assertFalse(myHashDataStructure.search(1));
        assertFalse(myHashDataStructure.search(2));
    }

    // one element
    @Test
    void file11N_insert () {
        LinearSpace<String> myHashDataStructure = new LinearSpace<>(10);
        int temp = myHashDataStructure.batch_insert("file11");
        assertEquals(temp , 1);

        assertFalse(myHashDataStructure.insert("4510"));
        assertTrue(myHashDataStructure.insert("0"));
        assertFalse(myHashDataStructure.insert("0"));
        assertTrue(myHashDataStructure.insert("1"));
        assertFalse(myHashDataStructure.insert("1"));
        assertTrue(myHashDataStructure.insert("2"));
        assertFalse(myHashDataStructure.insert("2"));
    }
    @Test
    void file11N_delete () {
        LinearSpace<String> myHashDataStructure = new LinearSpace<>(10);
        int temp = myHashDataStructure.batch_insert("file11");
        assertEquals(temp , 1);

        assertTrue(myHashDataStructure.delete("4510"));
        assertFalse(myHashDataStructure.delete("4510"));
        assertFalse(myHashDataStructure.delete("4"));
        assertFalse(myHashDataStructure.delete("5"));
        assertFalse(myHashDataStructure.delete("10"));
        assertFalse(myHashDataStructure.delete("100"));
        assertFalse(myHashDataStructure.delete("104"));
    }
    @Test
    void file11N_search () {
        LinearSpace<String> myHashDataStructure = new LinearSpace<>(10);
        int temp = myHashDataStructure.batch_insert("file11");
        assertEquals(temp , 1);

        assertTrue(myHashDataStructure.search("4510"));
        assertFalse(myHashDataStructure.search("4"));
        assertFalse(myHashDataStructure.search("5"));
        assertFalse(myHashDataStructure.search("10"));
        assertFalse(myHashDataStructure.search("100"));
        assertFalse(myHashDataStructure.search("104"));
    }
    @Test
    void file11N_combination () {
        LinearSpace<String> myHashDataStructure = new LinearSpace<>(10);
        int temp = myHashDataStructure.batch_insert("file11");
        assertEquals(temp , 1);

        // already exist
        assertTrue(myHashDataStructure.search("4510"));
        assertFalse(myHashDataStructure.insert("4510"));
        assertTrue(myHashDataStructure.search("4510"));

        // search + insert
        assertFalse(myHashDataStructure.search("1"));
        assertFalse(myHashDataStructure.search("2"));
        assertTrue(myHashDataStructure.insert("1"));
        assertTrue(myHashDataStructure.insert("2"));
        assertTrue(myHashDataStructure.search("1"));
        assertTrue(myHashDataStructure.search("2"));

        // search + delete
        assertFalse(myHashDataStructure.search("4"));
        assertFalse(myHashDataStructure.search("5"));
        assertFalse(myHashDataStructure.delete("4"));
        assertFalse(myHashDataStructure.delete("5"));
        assertTrue(myHashDataStructure.delete("1"));
        assertTrue(myHashDataStructure.delete("2"));
        assertFalse(myHashDataStructure.search("1"));
        assertFalse(myHashDataStructure.search("2"));
    }

    ////
    // alpha-numeric
    @Test
    void file12N_insert () {
        LinearSpace<String> myHashDataStructure = new LinearSpace<>(10);
        int temp = myHashDataStructure.batch_insert("file12");
        assertEquals(temp , 3);

        assertFalse(myHashDataStructure.insert("abc123"));
        assertFalse(myHashDataStructure.insert("hello456"));
        assertFalse(myHashDataStructure.insert("789world"));

        assertTrue(myHashDataStructure.insert("kkkkkkkkkkkkkkkkkkkkkkk"));
        assertFalse(myHashDataStructure.insert("kkkkkkkkkkkkkkkkkkkkkkk"));
        assertTrue(myHashDataStructure.insert("bx"));
        assertFalse(myHashDataStructure.insert("bx"));
        assertTrue(myHashDataStructure.insert("zvBQpaa"));
        assertFalse(myHashDataStructure.insert("zvBQpaa"));
    }
    @Test
    void file12N_delete () {
        LinearSpace<String> myHashDataStructure = new LinearSpace<>(10);
        int temp = myHashDataStructure.batch_insert("file12");
        assertEquals(temp , 3);

        assertTrue(myHashDataStructure.delete("abc123"));
        assertTrue(myHashDataStructure.delete("hello456"));
        assertTrue(myHashDataStructure.delete("789world"));
        assertFalse(myHashDataStructure.delete("abc123"));
        assertFalse(myHashDataStructure.delete("hello456"));
        assertFalse(myHashDataStructure.delete("789world"));

        assertFalse(myHashDataStructure.delete("kz"));
        assertFalse(myHashDataStructure.delete("ax"));
        assertFalse(myHashDataStructure.delete("ascxzczsfasz"));
        assertFalse(myHashDataStructure.delete("aaaaaaaaxxxxxxxxxxxxxfffffffffffffa"));
        assertFalse(myHashDataStructure.delete("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"));
    }
    @Test
    void file12N_search () {
        LinearSpace<String> myHashDataStructure = new LinearSpace<>(10);
        int temp = myHashDataStructure.batch_insert("file12");
        assertEquals(temp , 3);

        assertTrue(myHashDataStructure.search("abc123"));
        assertTrue(myHashDataStructure.search("hello456"));
        assertTrue(myHashDataStructure.search("789world"));

        assertFalse(myHashDataStructure.search("kz"));
        assertFalse(myHashDataStructure.search("ax"));
        assertFalse(myHashDataStructure.search("ascxzczsfasz"));
        assertFalse(myHashDataStructure.search("aaaaaaaaxxxxxxxxxxxxxfffffffffffffa"));
        assertFalse(myHashDataStructure.search("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"));
    }
    @Test
    void file12N_combination () {
        LinearSpace<String> myHashDataStructure = new LinearSpace<>(10);
        int temp = myHashDataStructure.batch_insert("file12");
        assertEquals(temp , 3);

        // already exist
        assertTrue(myHashDataStructure.search("abc123"));
        assertTrue(myHashDataStructure.search("hello456"));
        assertTrue(myHashDataStructure.search("789world"));
        assertFalse(myHashDataStructure.insert("abc123"));
        assertFalse(myHashDataStructure.insert("hello456"));
        assertFalse(myHashDataStructure.insert("789world"));
        assertTrue(myHashDataStructure.search("abc123"));
        assertTrue(myHashDataStructure.search("hello456"));
        assertTrue(myHashDataStructure.search("789world"));

        // search + insert
        assertFalse(myHashDataStructure.search("bx"));
        assertFalse(myHashDataStructure.search("zvBQpaa"));
        assertTrue(myHashDataStructure.insert("bx"));
        assertTrue(myHashDataStructure.insert("zvBQpaa"));
        assertTrue(myHashDataStructure.search("bx"));
        assertTrue(myHashDataStructure.search("zvBQpaa"));

        // search + delete
        assertTrue(myHashDataStructure.search("abc123"));
        assertTrue(myHashDataStructure.search("hello456"));
        assertTrue(myHashDataStructure.search("789world"));
        assertTrue(myHashDataStructure.delete("abc123"));
        assertTrue(myHashDataStructure.delete("hello456"));
        assertTrue(myHashDataStructure.delete("789world"));
        assertFalse(myHashDataStructure.search("abc123"));
        assertFalse(myHashDataStructure.search("hello456"));
        assertFalse(myHashDataStructure.search("789world"));
        assertFalse(myHashDataStructure.search("kz"));
        assertFalse(myHashDataStructure.search("ax"));
        assertFalse(myHashDataStructure.delete("kz"));
        assertFalse(myHashDataStructure.delete("ax"));
        assertTrue(myHashDataStructure.delete("bx"));
        assertTrue(myHashDataStructure.delete("zvBQpaa"));
        assertFalse(myHashDataStructure.search("bx"));
        assertFalse(myHashDataStructure.search("zvBQpaa"));
    }

    // palindrome
    @Test
    void file13N_insert () {
        LinearSpace<String> myHashDataStructure = new LinearSpace<>(10);
        int temp = myHashDataStructure.batch_insert("file13");
        assertEquals(temp , 3);

        assertFalse(myHashDataStructure.insert("level"));
        assertFalse(myHashDataStructure.insert("radar"));
        assertFalse(myHashDataStructure.insert("deified"));

        assertTrue(myHashDataStructure.insert("kkkkkkkkkkkkkkkkkkkkkkk"));
        assertFalse(myHashDataStructure.insert("kkkkkkkkkkkkkkkkkkkkkkk"));
        assertTrue(myHashDataStructure.insert("bx"));
        assertFalse(myHashDataStructure.insert("bx"));
        assertTrue(myHashDataStructure.insert("zvBQpaa"));
        assertFalse(myHashDataStructure.insert("zvBQpaa"));
    }
    @Test
    void file13N_delete () {
        LinearSpace<String> myHashDataStructure = new LinearSpace<>(10);
        int temp = myHashDataStructure.batch_insert("file13");
        assertEquals(temp , 3);

        assertTrue(myHashDataStructure.delete("level"));
        assertTrue(myHashDataStructure.delete("radar"));
        assertTrue(myHashDataStructure.delete("deified"));
        assertFalse(myHashDataStructure.delete("level"));
        assertFalse(myHashDataStructure.delete("radar"));
        assertFalse(myHashDataStructure.delete("deified"));

        assertFalse(myHashDataStructure.delete("kz"));
        assertFalse(myHashDataStructure.delete("ax"));
        assertFalse(myHashDataStructure.delete("ascxzczsfasz"));
        assertFalse(myHashDataStructure.delete("aaaaaaaaxxxxxxxxxxxxxfffffffffffffa"));
        assertFalse(myHashDataStructure.delete("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"));
    }
    @Test
    void file13N_search () {
        LinearSpace<String> myHashDataStructure = new LinearSpace<>(10);
        int temp = myHashDataStructure.batch_insert("file13");
        assertEquals(temp , 3);

        assertTrue(myHashDataStructure.search("level"));
        assertTrue(myHashDataStructure.search("radar"));
        assertTrue(myHashDataStructure.search("deified"));

        assertFalse(myHashDataStructure.search("kz"));
        assertFalse(myHashDataStructure.search("ax"));
        assertFalse(myHashDataStructure.search("ascxzczsfasz"));
        assertFalse(myHashDataStructure.search("aaaaaaaaxxxxxxxxxxxxxfffffffffffffa"));
        assertFalse(myHashDataStructure.search("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"));
    }
    @Test
    void file13N_combination () {
        LinearSpace<String> myHashDataStructure = new LinearSpace<>(10);
        int temp = myHashDataStructure.batch_insert("file13");
        assertEquals(temp , 3);

        // already exist
        assertTrue(myHashDataStructure.search("level"));
        assertTrue(myHashDataStructure.search("radar"));
        assertTrue(myHashDataStructure.search("deified"));
        assertFalse(myHashDataStructure.insert("level"));
        assertFalse(myHashDataStructure.insert("radar"));
        assertFalse(myHashDataStructure.insert("deified"));
        assertTrue(myHashDataStructure.search("level"));
        assertTrue(myHashDataStructure.search("radar"));
        assertTrue(myHashDataStructure.search("deified"));

        // search + insert
        assertFalse(myHashDataStructure.search("bx"));
        assertFalse(myHashDataStructure.search("zvBQpaa"));
        assertTrue(myHashDataStructure.insert("bx"));
        assertTrue(myHashDataStructure.insert("zvBQpaa"));
        assertTrue(myHashDataStructure.search("bx"));
        assertTrue(myHashDataStructure.search("zvBQpaa"));

        // search + delete
        assertTrue(myHashDataStructure.search("level"));
        assertTrue(myHashDataStructure.search("radar"));
        assertTrue(myHashDataStructure.search("deified"));
        assertTrue(myHashDataStructure.delete("level"));
        assertTrue(myHashDataStructure.delete("radar"));
        assertTrue(myHashDataStructure.delete("deified"));
        assertFalse(myHashDataStructure.search("level"));
        assertFalse(myHashDataStructure.search("radar"));
        assertFalse(myHashDataStructure.search("deified"));
        assertFalse(myHashDataStructure.search("kz"));
        assertFalse(myHashDataStructure.search("ax"));
        assertFalse(myHashDataStructure.delete("kz"));
        assertFalse(myHashDataStructure.delete("ax"));
        assertTrue(myHashDataStructure.delete("bx"));
        assertTrue(myHashDataStructure.delete("zvBQpaa"));
        assertFalse(myHashDataStructure.search("bx"));
        assertFalse(myHashDataStructure.search("zvBQpaa"));
    }

    // mix kbiiiiir
    @Test
    void file14N_insert () {
        LinearSpace<String> myHashDataStructure = new LinearSpace<>(10);
        int temp = myHashDataStructure.batch_insert("file14");
        assertEquals(temp , 3);

        assertFalse(myHashDataStructure.insert("?apple123"));
        assertFalse(myHashDataStructure.insert("!banana456?"));
        assertFalse(myHashDataStructure.insert("!!orange!789"));

        assertTrue(myHashDataStructure.insert("kkkkkkkkkkkkkkkkkkkkkkk"));
        assertFalse(myHashDataStructure.insert("kkkkkkkkkkkkkkkkkkkkkkk"));
        assertTrue(myHashDataStructure.insert("bx"));
        assertFalse(myHashDataStructure.insert("bx"));
        assertTrue(myHashDataStructure.insert("zvBQpaa"));
        assertFalse(myHashDataStructure.insert("zvBQpaa"));
    }
    @Test
    void file14N_delete () {
        LinearSpace<String> myHashDataStructure = new LinearSpace<>(10);
        int temp = myHashDataStructure.batch_insert("file14");
        assertEquals(temp , 3);

        assertTrue(myHashDataStructure.delete("?apple123"));
        assertTrue(myHashDataStructure.delete("!banana456?"));
        assertTrue(myHashDataStructure.delete("!!orange!789"));
        assertFalse(myHashDataStructure.delete("?apple123"));
        assertFalse(myHashDataStructure.delete("!banana456?"));
        assertFalse(myHashDataStructure.delete("!!orange!789"));

        assertFalse(myHashDataStructure.delete("kz"));
        assertFalse(myHashDataStructure.delete("ax"));
        assertFalse(myHashDataStructure.delete("ascxzczsfasz"));
        assertFalse(myHashDataStructure.delete("aaaaaaaaxxxxxxxxxxxxxfffffffffffffa"));
        assertFalse(myHashDataStructure.delete("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"));
    }
    @Test
    void file14N_search () {
        LinearSpace<String> myHashDataStructure = new LinearSpace<>(10);
        int temp = myHashDataStructure.batch_insert("file14");
        assertEquals(temp , 3);

        assertTrue(myHashDataStructure.search("?apple123"));
        assertTrue(myHashDataStructure.search("!banana456?"));
        assertTrue(myHashDataStructure.search("!!orange!789"));

        assertFalse(myHashDataStructure.search("kz"));
        assertFalse(myHashDataStructure.search("ax"));
        assertFalse(myHashDataStructure.search("ascxzczsfasz"));
        assertFalse(myHashDataStructure.search("aaaaaaaaxxxxxxxxxxxxxfffffffffffffa"));
        assertFalse(myHashDataStructure.search("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"));
    }
    @Test
    void file14N_combination () {
        LinearSpace<String> myHashDataStructure = new LinearSpace<>(10);
        int temp = myHashDataStructure.batch_insert("file14");
        assertEquals(temp , 3);

        // already exist
        assertTrue(myHashDataStructure.search("?apple123"));
        assertTrue(myHashDataStructure.search("!banana456?"));
        assertTrue(myHashDataStructure.search("!!orange!789"));
        assertFalse(myHashDataStructure.insert("?apple123"));
        assertFalse(myHashDataStructure.insert("!banana456?"));
        assertFalse(myHashDataStructure.insert("!!orange!789"));
        assertTrue(myHashDataStructure.search("?apple123"));
        assertTrue(myHashDataStructure.search("!banana456?"));
        assertTrue(myHashDataStructure.search("!!orange!789"));

        // search + insert
        assertFalse(myHashDataStructure.search("bx"));
        assertFalse(myHashDataStructure.search("zvBQpaa"));
        assertTrue(myHashDataStructure.insert("bx"));
        assertTrue(myHashDataStructure.insert("zvBQpaa"));
        assertTrue(myHashDataStructure.search("bx"));
        assertTrue(myHashDataStructure.search("zvBQpaa"));

        // search + delete
        assertTrue(myHashDataStructure.search("?apple123"));
        assertTrue(myHashDataStructure.search("!banana456?"));
        assertTrue(myHashDataStructure.search("!!orange!789"));
        assertTrue(myHashDataStructure.delete("?apple123"));
        assertTrue(myHashDataStructure.delete("!banana456?"));
        assertTrue(myHashDataStructure.delete("!!orange!789"));
        assertFalse(myHashDataStructure.search("?apple123"));
        assertFalse(myHashDataStructure.search("!banana456?"));
        assertFalse(myHashDataStructure.search("!!orange!789"));
        assertFalse(myHashDataStructure.search("kz"));
        assertFalse(myHashDataStructure.search("ax"));
        assertFalse(myHashDataStructure.delete("kz"));
        assertFalse(myHashDataStructure.delete("ax"));
        assertTrue(myHashDataStructure.delete("bx"));
        assertTrue(myHashDataStructure.delete("zvBQpaa"));
        assertFalse(myHashDataStructure.search("bx"));
        assertFalse(myHashDataStructure.search("zvBQpaa"));
    }

    // 2 sylllabols
    @Test
    void file15N_insert () {
        LinearSpace<String> myHashDataStructure = new LinearSpace<>(10);
        int temp = myHashDataStructure.batch_insert("file15");
        assertEquals(temp , 3);

        assertFalse(myHashDataStructure.insert("new work"));
        assertFalse(myHashDataStructure.insert("los angeles"));
        assertFalse(myHashDataStructure.insert("danny collins"));

        assertTrue(myHashDataStructure.insert("kkkkkkkkkkkkkkkkkkkkkkk"));
        assertFalse(myHashDataStructure.insert("kkkkkkkkkkkkkkkkkkkkkkk"));
        assertTrue(myHashDataStructure.insert("bx"));
        assertFalse(myHashDataStructure.insert("bx"));
        assertTrue(myHashDataStructure.insert("zvBQpaa"));
        assertFalse(myHashDataStructure.insert("zvBQpaa"));
    }
    @Test
    void file15N_delete () {
        LinearSpace<String> myHashDataStructure = new LinearSpace<>(10);
        int temp = myHashDataStructure.batch_insert("file15");
        assertEquals(temp , 3);

        assertTrue(myHashDataStructure.delete("new work"));
        assertTrue(myHashDataStructure.delete("los angeles"));
        assertTrue(myHashDataStructure.delete("danny collins"));
        assertFalse(myHashDataStructure.delete("new work"));
        assertFalse(myHashDataStructure.delete("los angeles"));
        assertFalse(myHashDataStructure.delete("danny collins"));

        assertFalse(myHashDataStructure.delete("kz"));
        assertFalse(myHashDataStructure.delete("ax"));
        assertFalse(myHashDataStructure.delete("ascxzczsfasz"));
        assertFalse(myHashDataStructure.delete("aaaaaaaaxxxxxxxxxxxxxfffffffffffffa"));
        assertFalse(myHashDataStructure.delete("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"));
    }
    @Test
    void file15N_search () {
        LinearSpace<String> myHashDataStructure = new LinearSpace<>(10);
        int temp = myHashDataStructure.batch_insert("file15");
        assertEquals(temp , 3);

        assertTrue(myHashDataStructure.search("new work"));
        assertTrue(myHashDataStructure.search("los angeles"));
        assertTrue(myHashDataStructure.search("danny collins"));

        assertFalse(myHashDataStructure.search("kz"));
        assertFalse(myHashDataStructure.search("ax"));
        assertFalse(myHashDataStructure.search("ascxzczsfasz"));
        assertFalse(myHashDataStructure.search("aaaaaaaaxxxxxxxxxxxxxfffffffffffffa"));
        assertFalse(myHashDataStructure.search("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"));
    }
    @Test
    void file15N_combination () {
        LinearSpace<String> myHashDataStructure = new LinearSpace<>(10);
        int temp = myHashDataStructure.batch_insert("file15");
        assertEquals(temp , 3);

        // already exist
        assertTrue(myHashDataStructure.search("new work"));
        assertTrue(myHashDataStructure.search("los angeles"));
        assertTrue(myHashDataStructure.search("danny collins"));
        assertFalse(myHashDataStructure.insert("new work"));
        assertFalse(myHashDataStructure.insert("los angeles"));
        assertFalse(myHashDataStructure.insert("danny collins"));
        assertTrue(myHashDataStructure.search("new work"));
        assertTrue(myHashDataStructure.search("los angeles"));
        assertTrue(myHashDataStructure.search("danny collins"));

        // search + insert
        assertFalse(myHashDataStructure.search("bx"));
        assertFalse(myHashDataStructure.search("zvBQpaa"));
        assertTrue(myHashDataStructure.insert("bx"));
        assertTrue(myHashDataStructure.insert("zvBQpaa"));
        assertTrue(myHashDataStructure.search("bx"));
        assertTrue(myHashDataStructure.search("zvBQpaa"));

        // search + delete
        assertTrue(myHashDataStructure.search("new work"));
        assertTrue(myHashDataStructure.search("los angeles"));
        assertTrue(myHashDataStructure.search("danny collins"));
        assertTrue(myHashDataStructure.delete("new work"));
        assertTrue(myHashDataStructure.delete("los angeles"));
        assertTrue(myHashDataStructure.delete("danny collins"));
        assertFalse(myHashDataStructure.search("new work"));
        assertFalse(myHashDataStructure.search("los angeles"));
        assertFalse(myHashDataStructure.search("danny collins"));
        assertFalse(myHashDataStructure.search("kz"));
        assertFalse(myHashDataStructure.search("ax"));
        assertFalse(myHashDataStructure.delete("kz"));
        assertFalse(myHashDataStructure.delete("ax"));
        assertTrue(myHashDataStructure.delete("bx"));
        assertTrue(myHashDataStructure.delete("zvBQpaa"));
        assertFalse(myHashDataStructure.search("bx"));
        assertFalse(myHashDataStructure.search("zvBQpaa"));
    }
}
