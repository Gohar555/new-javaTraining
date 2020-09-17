package homework2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PrintMessage {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        for (int i = 0; i < N; i++) {
            System.out.println("I love learn JAVA");
        }
    }
}
