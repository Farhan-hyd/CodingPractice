import java.io.*;
import java.net.*;
import java.util.*;

public class UDP {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);

    DatagramSocket ds = new DatagramSocket();

    InetAddress ip = InetAddress.getLocalHost();
    byte[] buf = null;

    while (true) {
      String inp = sc.nextLine();

      buf = inp.getBytes();

      DatagramPacket DpSend = new DatagramPacket(buf, buf.length, ip, 1234);

      ds.send(DpSend);

      if (inp.equals("stop"))
        break;
    }

    sc.close();
    ds.close();
  }
}
