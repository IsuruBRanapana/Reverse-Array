package reversearray;

public class ReverseArray {

    public static void main(String[] args) {
        int [] list={1,8,3,7,6,4,9,5,7};
       for(int i=0;i<list.length;i++)
           System.out.print(list[i]+" ");
       System.out.println("");
       System.out.println("Reverse list is ");
       
       int [] list1 = arr1(list);
       for(int i=0;i<list1.length;i++)
           System.out.print(list1[i]+" ");
    }
    
    //create reverse array method
    public static int [] arr1(int [] list){
        int []result= new int[list.length];
        for (int i=0,j=list.length-1;i<list.length;i++,j--){
            result[i]=list[j];
        }
        return result;
            
    }
}
