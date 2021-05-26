package dz6;

public final class Randomizer {

    public static double randomValue(double min, double max) {
        max -= min;
        return (double) (Math.random() * ++max) + min;

    }


}
