import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareTheTriplets {
    public static void main(String[] args) throws Exception {
       // Fix: Use Arrays.asList() to create lists
        List<Integer> a = Arrays.asList(1, 2, 3, 5, 6, 23, 12);
        List<Integer> b = Arrays.asList(5, 0, 3, 5, 53, 123, 4);
        // Call function and store result
        List<Integer> result = compareTriplets(a, b);
        // Print the result
        System.out.println(result);

    }


    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int pointCounterAlice=0;
        int pointCounterBob=0;
        List<Integer> counterArray= new ArrayList<>();

        for (int i=0; i < a.size(); i++){
            if (a.get(i)>b.get(i)){
                pointCounterAlice++;
            }else if(a.get(i)<b.get(i)){
                pointCounterBob++;
            } 
        } counterArray.add(pointCounterAlice);
        counterArray.add(pointCounterBob);
        return counterArray;     
    }
}

