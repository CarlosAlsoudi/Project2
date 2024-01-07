package ProjectNumber2;

import java.util.ArrayList;

public class ProjectNumber2Homework10 {
    public static void main(String[] args) {
        /*
        How can you remove all duplicates from ArrayList?
         */
        ArrayList <Integer> i=new ArrayList<>();
        i.add(1);
        i.add(2);
        i.add(2);
        i.add(3);
        i.add(1);
        i.add(6);
        System.out.println("the list with duplicate numbers "+i);

        for (int j = 0; j < i.size(); j++) {
            boolean duplicates=true;
            int c=i.get(j);
            for (int k = 0; k < i.size(); k++) {
                int b=i.get(k);
                if(c==b){
                    duplicates=false;
                    i.remove(k);
                    k--;
                }
            }

        }

        //Set set=new LinkedHashSet(i);
        //you can also use -----<hashSet<------ but it will not give you the same order for example
        //if ( 1, 8 , 4 , 2)is the original order if you use HashSet by it self it we give you back ( 1 , 2 , 4 , 8 )
        //because it will automatically sort the numbers out but in this case we want them as they are s we used
        // -------->linkedHashSet<--------
        //System.out.println(set);
        // and if we want to add the new out come from set to the original Integer we should clear the old and add the new
        // therefor we should us clear method
        //i.clear();
        //i.addAll(set);

        System.out.println();
        System.out.println("*********************");
        System.out.println();
        System.out.println("the list without duplicate numbers "+i);
    }
}
