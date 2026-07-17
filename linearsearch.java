public class linearsearch{
    public static  void main (String[] args){
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int target = 5;
        LinearSearch(arr, target);
    }
 
public static void LinearSearch(int arr[], int target){
    int ans = -1;
    for (int i = 0; i<arr.length; i++){
        if(arr[i] == target){
            ans = i;
            break;
        }
    }
    if(ans == -1){
        System.out.println("Element not found");
    }
    else{
        System.out.println("Element found at index: " + ans);
    }
}

}

// search multiple elements
public class linearsearch{
    public static  void main (String[] args){
        int arr[] = {1,2,5,4,5,6,5,8,9};
        int target = 5;
        LinearSearchMultiple(arr, target);
    }
 
public static void LinearSearchMultiple(int arr[], int target){
  
   int ans[] = new int[arr.length];
   int k = 0;
    for (int i = 0; i<arr.length; i++){
        if(arr[i] == target){
      
            ans[k] = i;
            k++;
           
        }
    }
    if(k == 0){
        System.out.println("Element not found");
    }
    else{
        for(int i=0; i<k;i++)
            System.out.println("Element found at index: " + ans[i]);
    }
}

}
