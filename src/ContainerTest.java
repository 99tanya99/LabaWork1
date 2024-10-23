import static org.junit.jupiter.api.Assertions.*;

class ContainerTest {

    @org.junit.jupiter.api.Test
    void test_add_get() {
        Container container = new Container();
        container.add(10);
        container.add(33);

        assertEquals(10, container.get(0));
        assertEquals(33, container.get(1));
    }

    @org.junit.jupiter.api.Test
    void test_remove() {
        Container container = new Container();
        container.add(4);
        container.add(6);
        container.remove(0);

        assertEquals(6, container.get(0));
        assertEquals(1, container.size());
    }

    @org.junit.jupiter.api.Test
    void test_size() {
        Container container = new Container();
        assertEquals(0, container.size());

        container.add(6);
        assertEquals(1, container.size());

        container.add(8);
        assertEquals(2, container.size());

        container.remove(0);
        assertEquals(1, container.size());
    }
}