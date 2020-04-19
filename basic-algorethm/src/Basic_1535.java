import java.util.Scanner;
class Solution {
    int index;
    int arry[];

    Solution(int index) {
        this.arry = new int[index];
        this.index = 0;
    }

    void addArryNum(int num){
        this.arry[this.index++] = num;
    }

    int searchMostNumber() {
        int length = this.arry.length;
        int tmpArry[] = this.arry;
        int mostNumber = tmpArry[0];
        int mostNumberIndex = 0;

        for (int i = 1 ; i < length ; i++) {
            if (mostNumber < tmpArry[i]) {
                mostNumberIndex = i;
                mostNumber = tmpArry[i];
            }
        }
        return mostNumberIndex;
    }
}

public class Basic_1535 {
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        Solution solution = new Solution(scan.nextInt());

        for (int i = 0 ; i < solution.arry.length ; i++){
            solution.addArryNum(scan.nextInt());
        }
        System.out.println(" ");
        System.out.print(solution.searchMostNumber()+1);
}
}
