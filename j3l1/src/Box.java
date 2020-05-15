import java.util.ArrayList;

public class Box {
    static ArrayList<Float> appleBox = new ArrayList<>();
    static ArrayList<Float> orangeBox = new ArrayList<>();
    static float appleWeight = 0;
    static float orangeWeight = 0;

    public static void main(String[] args) {

        addToBox(15, 1);
        getWeight();
        System.out.println("Is boxes equal in weight : " + compare());
    }

    static public void addToBox(int appleCount, int orangeCount){
        for (int i = 0; i < appleCount; i++) {
            appleBox.add(Apple.weight);
        }
        for (int i = 0; i < orangeCount; i++) {
            orangeBox.add(Orange.weight);
        }
    }

    public static void getWeight(){
        for (int i = 0; i < appleBox.size(); i++) {
            appleWeight += appleBox.get(i);
        }
        for (int i = 0; i < orangeBox.size(); i++) {
            orangeWeight += orangeBox.get(i);
        }
        System.out.println("Apple box weight = " + appleWeight);
        System.out.println("Orange box weight = " + orangeWeight);
    }



    public static boolean compare(){
        if (appleWeight==orangeWeight){
            return true;
        } else
            return false;
    }

    public static void addToNewBoxApples() {
        System.out.println();
        ArrayList<Float> newAppleBox = new ArrayList<>(appleBox);
        appleBox.clear();
    }

    public static void addToNewBoxOranges(){
        ArrayList<Float> newOrangeBox = new ArrayList<>(orangeBox);
        orangeBox.clear();
    }
}

