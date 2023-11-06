public class Problem1845 {
    class SeatManager {

        int[] seats;
        int available;

        public SeatManager(int n) {
            seats = new int[n];
            available = 1;
        }

        public int reserve() {
            seats[available-1] = 1;
            int result = available;
            if(available == seats.length-1){
                available++;
            }
            for(int i=available;i<seats.length;i++){
                if(seats[i] == 0){
                    available = i+1;
                    break;
                }
            }
            return result;
        }

        public void unreserve(int seatNumber) {
            seats[seatNumber-1] = 0;
            if(seatNumber < available){
                available = seatNumber;
            }
        }
    }

/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */
}
