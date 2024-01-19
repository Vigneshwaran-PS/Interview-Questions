package ComlianceCow_Interview_Questions;

public class longestSubArray {
    public static void main(String[] args) {
        longestSubArray(new int[]{1,2,4,5,6,7,9});
        longestSubArray(new int[]{1,2,4,5,6,7,9,10,11,12,13,14,15,16});
    }

    public static void longestSubArray(int[] arr){

        int maxCount = 0;
        int count = 1;
        int start = 0;
        int end = 0;
        for(int i=0;i<arr.length;i++){

            if((i+1) < arr.length && arr[i] == arr[i+1]-1){
                count++;
            }else{
                if(count>maxCount){
                    maxCount = count;
                    start = i - maxCount + 1;
                    end = i;
                }
                count=1;
            }
        }
        System.out.println(maxCount);
        System.out.println("start : "+start);
        System.out.println("end : "+end);

        for(int i=start;i<=end;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println("\n-------------------------------------");
    }
}
