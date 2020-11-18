public class Max {
    public static int sequence(int[] arr) {
        if(arr == null)
            return 0;
        int max = 0;
        for(int i = 0; i < arr.length; i++)
        {
            int once = arr[i];
            int temp = arr[i];
            for(int j = i+1; j < arr.length; j++)
            {
                temp += arr[j];
                once = Math.max(once,temp);
            }
            max = Math.max(once,max);
        }
        return max;
    }
}