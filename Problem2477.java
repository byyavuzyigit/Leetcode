import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem2477 {
    public static void main(String[] args) {

        int[][] roads = {{3, 1}, {3, 2}, {1, 0}, {0, 4}, {0, 5}, {4, 6}};
        int seats = 2;
        minimumFuelCost(roads,seats);
        //roads length == 6
        System.out.println(Arrays.toString(roadMap2));

    }

    public  static List<Integer>[] roadMap2;
    public static ArrayList<ArrayList<Integer>> tumYollar= new ArrayList<ArrayList<Integer>>();
    public static void minimumFuelCost(int[][] roads, int seats) {

        List<Integer>[] roadMap = new List[roads.length +1];

         roadMap2 = roadMap;

//       // for(int i=0;i<roadMap.length;i++){
//            roadMap2[i] = roadMap[i];
//        }

        for(int i = 0; i< roadMap.length; i++) {
            roadMap[i] = new ArrayList<>();
        }

        for (int[] road : roads ) {
            int bir = road[0];
            int ikinci  = road[1];

            roadMap[bir].add(ikinci);
            roadMap[ikinci].add(bir);
        }

        ArrayList<Integer> outerCities= new ArrayList<>();

        for (int a=0; a<4; a++) {



                if(roadMap[a].size() ==1){
                System.out.println(roadMap[a].size());
                System.out.println(roadMap[a]);
                outerCities.add(a);
                ArrayList<Integer> anaYollar = new ArrayList<Integer>();
                int ilkgidileceksehir = roadMap[a].get(0);
                List<Integer> sonraki = roadMap[ilkgidileceksehir];
                tumYollar.add(recursive(anaYollar,sonraki,a,ilkgidileceksehir));

            }


        }

        System.out.println(tumYollar);
        // [[1, 4, 5], [3, 0], [3], [1, 2], [0, 6], [0], [4]]

    }

    public static ArrayList<Integer> recursive(ArrayList<Integer> anaYollar, List<Integer> sonraki, int geldigi,int suanki) {

        anaYollar.add(geldigi);
        if(sonraki.contains(0) ) {
            anaYollar.add(suanki);
            anaYollar.add(0);
            System.out.println("ana: "+anaYollar);
            return anaYollar;
        }

        List<Integer> sonrakiCopy = new ArrayList<>(sonraki);
        sonrakiCopy.remove(Integer.valueOf(geldigi));

        System.out.println("ilk "+anaYollar+" "+sonrakiCopy+" "+geldigi);
        int ilksonraki = sonrakiCopy.size();
        for (int b=0; b<ilksonraki; b++) {

            geldigi = sonrakiCopy.get(b);
            sonraki = roadMap2[sonraki.get(b)];
            System.out.println(anaYollar+" "+sonrakiCopy+" "+geldigi);
            recursive(anaYollar,sonrakiCopy,geldigi,sonrakiCopy.get(b));
        }


    return null;
    }

}
