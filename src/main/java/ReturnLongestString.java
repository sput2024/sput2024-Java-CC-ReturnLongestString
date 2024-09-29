
public class ReturnLongestString {
    /**
     * Return the longest String out of arr.
     * Remember that you can get the length of String with str.length().
     *
     * @param arr an array of Strings.
     * @return the longest String within arr. You can assume that there are no ties for the longest string.
     */
    public static void main(String[] args){
        
    }
    public String longest(String[] arr){
        int max = 0;
        String max1="test";

        for (int i = 0; i<arr.length;i++){
            if (max < arr[i].length()){
            max=arr[i].length();
            max1=arr[i];
            }
           
        }
        return max1;
    }
}
