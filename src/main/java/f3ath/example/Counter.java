package f3ath.example;

class Counter {
    private int count;

    int incrementAndGet() {
        return ++count; // ++ is not atomic
    }
}
