package exercises;
import java.util.ArrayList;

public class sumArrayLists {
    public static ArrayList<Integer> sumArrayLists(ArrayList<Integer> first, ArrayList<Integer> second) {
        //make an arrayList to hold the rsult
        ArrayList<Integer> result = new ArrayList<>();
        //check lengths of the arrayLists, figure out which is longer
        if(first.size() > second.size()) {
            //for each element in the longer arrayList
            for(int i=0; i < first.size(); i++) {
                //if I haven't run out of ints from the shorter list
                if(i < second.size()) {
                    //add the two ints together
                    Integer sum = first.get(i) + second.get(i);
                    result.add(sum);
                } else {
                    //keep value from longer list
                    result.add(first.get(i));
                }
            }
        } else { //second one is longer or they are equal size
            //for each element in the longer arrayList
            for (int i = 0; i < second.size(); i++) {
                //if I haven't run out of ints from the shorter list
                if (i < first.size()) {
                    //add the two ints together
                    Integer sum = first.get(i) + second.get(i);
                    result.add(sum);
                } else {
                    //keep value from longer list
                    result.add(second.get(i));
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> first = new ArrayList<>();
        ArrayList<Integer> second = new ArrayList<>();
        first.add(3);
        first.add(4);
        first.add(5);
        first.add(1);

        second.add(0);

    }
}
