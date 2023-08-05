import java.util.Scanner;


class msort{
    int[] arr= new int[5];

    public void getArr(){
        Scanner sc01= new Scanner(System.in);
        System.out.println("Enter array values -");
        for(int i=0;i<5;i++){
            arr[i]=sc01.nextInt();
        }
    }

    public void disArr(){
        for (int i: arr) {
            System.out.print("\t "+i);
            
        }
    }

    public void sortingArr(){
        int size = arr.length;
        
        for (int i=1;i<size;i++){
            int k=i;
            int key = arr[i];
            while(i>=1 &&key<arr[i-1] ){
                arr[i]=arr[i-1];
                i--;
            }
            arr[i]=key;
            System.out.println("\n"+k+"st attempt");
            for (int j : arr) {
                System.out.print("\t"+j);
            }
        }
    }
    
}

public class App {
    public static void main(String[] args) throws Exception {
        msort st01= new msort();
        st01.getArr();
        st01.disArr();
        st01.sortingArr();
        

    }
}
