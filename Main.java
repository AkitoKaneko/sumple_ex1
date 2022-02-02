import java.util.Random;
public class Main {
    public static void main(String[] args) {
        int n=4;//休みの日数(重複あり)
        int [][]a=new int [4][4];
        String name[]={"President","Manager","Staff1","Staff2"};
        for(int i=0;i<n;i++){
            System.out.print(name[i]+" ");
            a[i]=data(n);
        }
        for(int i=1;i<=30;i++){
         if(judge(a,i))System.out.println("●"+i+"th can hold a meeting.");
          else System.out.println("✖︎"+i+"th can not hold a meeting.");
        }

    }
    public static int []data(int n){
        //休みはn日あり,1~30日の内ランダムで決まる.
        int []randomdata=new int [n];
        for(int i=0;i<n;i++){
            randomdata[i]=(int)(Math.random()*(30-1)) + 1;
            System.out.print(randomdata[i]+" ");
        }
        System.out.println();
        return randomdata;
    }

    public static boolean judge(int data[][],int n){
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(data[i][j]==n)return false;
            }
        }
        return true;
    }
}
