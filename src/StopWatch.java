public class StopWatch {
    long startTime, endTime;

    public StopWatch() {
        this.startTime = System.currentTimeMillis();
        this.endTime = System.currentTimeMillis();
    }
    public void start() {
        this.startTime = System.currentTimeMillis() / 1000;
    }
    public void stop() {
        this.endTime = System.currentTimeMillis() / 1000;
    }
    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }
}
