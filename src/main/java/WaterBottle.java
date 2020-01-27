public class WaterBottle {

    public int volume;

    public WaterBottle(int volume) {
        this.volume = 100;
    }

    public int getVolume() {
        return volume;
    }

    public int drink() {
        volume -= 10;
        return volume;
    }

    public int empty() {
        volume -= volume;
        return volume;
    }

    public int fill() {
        volume -= volume;
        volume += 100;
        return volume;
    }
}
