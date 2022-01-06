import java.io.*;

public class cleanstring {
    
    static class Reader {
        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer, bytesRead;
 
        public Reader(){
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        private void fillBuffer() throws IOException{
            bytesRead = din.read(buffer, bufferPointer = 0,
                                 BUFFER_SIZE);
            if (bytesRead == -1)
                buffer[0] = -1;
        }

        private byte read() throws IOException{
            if (bufferPointer == bytesRead)
                fillBuffer();
            return buffer[bufferPointer++];
        }
        
        public String readLine() throws IOException{
            byte[] buf = new byte[64]; 
            int cnt = 0, c;
            while ((c = read()) != -1) {
                if (c == '\n') {
                    if (cnt != 0) {
                        break;
                    }else {
                        continue;
                    }
                }
                buf[cnt++] = (byte)c;
            }
            return new String(buf, 0, cnt);
        }
    
    }    
    
    static String temp = "";

    static public void stringClean(String str) {
        int length = str.length();
        for(int i = 0; i<length; i++){
            if(str.charAt(i) != ' '){
                char curr_letter = str.charAt(i);
                temp += curr_letter;
                str = str.replace(str.charAt(i), ' ');
            }
        }
    }
    
    public static void main(String[] args) {
        Reader r = new Reader();
        String str="";
        try {
            str = r.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        } 
        stringClean(str);
        System.out.println(temp);
    }
}

