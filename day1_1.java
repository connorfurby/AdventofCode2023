import java.util.Scanner;
import java.io.*;

class day1_1 {
public static void main(String[] args) throws FileNotFoundException {
    boolean firstline = true;
    int sum = 0;
    Scanner scan = new Scanner(new File("day1_1.txt"));
    while (scan.hasNextLine()) {
        int firstnum = -1;
        int secondnum = -1;
        String currLine = scan.nextLine();
        for (int i = 0; i < currLine.length(); i++)
        {
            try {
                if (firstnum == -1) {
                    firstnum = Integer.parseInt("" + currLine.charAt(i));
                }
                else
                    secondnum = Integer.parseInt("" + currLine.charAt(i));
            }
            catch (Exception e) {
                System.out.println();
            }
        }
        int currNum = Integer.parseInt(firstnum + "" + secondnum);

        if (firstline) {
            System.out.println(firstnum);
            System.out.println(secondnum);
            System.out.println(currNum);
            firstline = false;
        }

        sum += currNum;
        firstnum = -1;
        secondnum = -1;
    }
    scan.close();
    System.out.println(sum);
}

}