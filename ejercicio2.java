public class Main{
    public static void main(String[] args) {


    int arr[] = new int[]{1,2,1,3,3,1,2,1,5,1}; 
    int n = arr.length; 


    boolean visited[] = new boolean[n]; 

    for (int i = 0; i < n; i++) { 

        if (visited[i] == true) 
            continue; 

        
        int count = 1; 
        for (int j = i + 1; j < n; j++) { 
            if (arr[i] == arr[j]) { 
                visited[j] = true; 
                count++; 

            } 
        } 
            System.out.print(arr[i] + " " ); 
             for (int k = 0; k < count; k++) { 
                  System.out.print('*');

             }
                  System.out.println();

        }
    }
}

