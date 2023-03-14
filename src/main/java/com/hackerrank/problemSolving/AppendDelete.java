package com.hackerrank.problemSolving;

import java.io.*;

public class AppendDelete {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("OUTPUT_PATH"));

        String s = bufferedReader.readLine();

        String t = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = appendAndDelete(s, t, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

    private static String appendAndDelete(String s, String t, int k) {
        String result = "No";
        if (s.equals(t)) {
            result = "Yes";
            System.out.println(result);
            return result;
        } else {
            if (s.length() > t.length()) {
                for (int i = 0; i < t.length(); i++) {
                    if (String.valueOf(s.charAt(i)).equals(String.valueOf(t.charAt(i)))) {
                        s = s.replaceFirst(String.valueOf(s.charAt(i)), "");
                        t = t.replaceFirst(String.valueOf(t.charAt(i)), "");
                        i--;
                    } else break;
                }
            } else if (t.length() > s.length()) {
                for (int i = 0; i < s.length(); i++) {
                    if (String.valueOf(s.charAt(i)).equals(String.valueOf(t.charAt(i)))) {
                        s = s.replaceFirst(String.valueOf(s.charAt(i)), "");
                        t = t.replaceFirst(String.valueOf(t.charAt(i)), "");
                        i--;
                    } else break;
                }
            }


            k = k - s.length() - t.length();
            if (k >= 0) {
                result = "Yes";
                System.out.println(result);
                return result;
            }
        }
        System.out.println(result);
        return result;
    }
}
//zzzzz
//zzzzzzz
//4
//ashley
//ash
//2