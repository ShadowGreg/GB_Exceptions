public class Foo implements AutoCloseable {
    private Integer counter;

    public Foo() {
        counter = 0;
    }

    public Integer GetCounter() {
        return counter;
    }

    public void add() {
        if (counter != null)
            counter++;
    }

    @Override
    public void close() throws Exception {
        counter = null;
        System.gc();
    }
}
