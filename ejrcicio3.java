public class Main {
	static int[] myArray = {1,3,4,2,7,0};
	public static void main(String[] args) {
	 
	 for(int i=0; i<myArray.length-1; i++){
   for(int j=1;j<myArray.length;j++){
      if(myArray[i]+myArray[j]==10){
         System.out.println(myArray[i]+" "+myArray[j]);
      }
   }
}
	}
}

