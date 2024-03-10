import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class index{
    public static void main(String a[]){
        Comparator<Integer> comparator = new Comparator<Integer>() {
            public int compare(Integer i, Integer j){
                if (i%10 > j%10) 
                    return 1;   
                else
                    return -1;
                
            }
            };
            List<Integer> ages = new ArrayList<Integer>();
            ages.add(80);
            ages.add(50);
            ages.add(45);
            ages.add(90);
            ages.add(30);
             
            Collections.sort(ages, comparator);
            System.out.println(ages);
        }
    }
