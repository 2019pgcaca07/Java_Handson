public class Q1 {
    public static int countSubstr(String[] arr){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].contains("22"))
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        String [] batchId = {"ACD22XD","BFC22KO","LMN20AB","KLC21BA","ABC22FE"};
        System.out.println("Count in which 22 appears : "+countSubstr(batchId));
    }
}
