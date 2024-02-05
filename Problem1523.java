public class Problem1523 {

    public int countOdds(int low, int high) {

        int numberCount = high - low + 1;

        //both of them are odd
        if(low%2 != 0 && high%2 != 0)
            return (int)(numberCount/2) + 1;

        //both of them are even
        if(low%2 == 0 && high%2 == 0)
            return (int)(numberCount/2);

        //one of them is even
        return numberCount/2;
    }

}
