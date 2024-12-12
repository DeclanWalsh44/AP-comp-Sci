/* 
    Lecture note example - Arrays
*/

class LectureArray{
    public static void main(String args[]) {
        // Your Code Goes here!
        int [] arr = {5,5,8,8,8,2,4,4};
        for(int i = 0; i < arr.length ;i++){
            System.out.print(arr[i] + " "");
        }
        int dupeCheck = 8;
        for(int i = 0; i < arr.length ;i++){
            if(dupeCheck == arr[i]){
                System.out.println()
            }
        }
        for(int i = 0; i < arr.length -1;i++){
            if(arr[i] == arr[i+1]){
                System.out.println("Consect at " + i + " and " + (i + 1))
            }
        }
	}
}