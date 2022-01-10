import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'winningLotteryTicket' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts STRING_ARRAY tickets as parameter.
     */

    public static long winningLotteryTicket(List<String> tickets) {
        long result = 0;
        ArrayList<Integer> mylist = new ArrayList<>();
        String t = "01234", t2 = "56789";
        System.out.println((getBin(t)| getBin(t2)));
        
        for (String ticket : tickets) {
          mylist.add(getBin(ticket));
        }

        for (int i = 0; i < mylist.size()-1; i++) {
          for (int j = i; j < mylist.size(); j++) {
            if ((mylist.get(i) | mylist.get(j)) == 1024) {
              result++;
            } 
          }
        }
        return result;
    }

    public static int getBin(String ticket){
      StringBuilder binaryRepresentation = new StringBuilder();
          for (int i = 0; i < 10; i++) {
            if (ticket.contains(""+i)) {
              binaryRepresentation.append('1');
            } else {
              binaryRepresentation.append('0');
            }
          }
          return Integer.parseInt(binaryRepresentation.reverse().toString(), 2);
    }

}

public class WinningLottery {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> tickets = IntStream.range(0, n).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        long result = Result.winningLotteryTicket(tickets);

        System.out.println(result);

        bufferedReader.close();
    }
}