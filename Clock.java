
// Use Singleton and Monostate pattern
// to ensure proper behavior.


class Clock {
    //Monostate implementation
    private static int ticks = 0;
    public Clock() {}

    public int ticks() { return ticks; }
    public void tick() { ticks++; }
    public void tock() { ticks+=10; }
    public String toString() {
	return "Clock reads " + ticks;
    }
}

