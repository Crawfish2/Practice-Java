public class Practice {
    // public static void main(String args[]){

    //     System.out.println("Good Evening");

    //     System.out.println("Good Afternoon");

    //     System.out.println("Good Morning");
    // }
    // public static void main(String[] args){
    //     //一次元配列
    //     // int[] var;
    //     // var = new int[2];
    //     // var[0] = 0;
    //     // var[1] = 1;
    //     // int[] var ={1,2,3};
    //     // var[1] = 10;
    //     // System.out.println(var[1]);
    //     //二次元配列
    //     String[] [] arr = {{"a","b"},{"c","d"}};
    //     System.out.println(arr[0][0]);
    // }
    // public static void main(String[] args){
    //     int a = 1;
    //     if(a == 1){
    //         System.out.println("A");
    //     }else if(a == 2){
    //         System.out.println("B");
    //     }else{
    //         System.out.println("C");
    //     }
    // }
    public static void main(String[] args){
        int arr[] = {2,4,6,8,10};
        for(int i=0;i<=4;i++){
            // if(i==3){
            //     break;
            // }
            // if(i==3){
            //     continue;
            // }
            // System.out.println(i);
            System.out.println(arr[i]);
        }
    }
}
class Student {
    String name;

    public double calculateAVG(double[] data){
        double sum = 0;
        for(int i=0; i < data.length;i++){
            sum += data[i];
        }
        double AVG = sum/data.length;
        return AVG;
    }

    public String judge(double AVG){
        String result;
        if(AVG >= 60){
            result = "passed";
        } else{
            result = "failed";
        }
        return result;
    }
    
    public static void main(String[] args){
        Student a001 = new Student();
        a001.name = "sato";
        double[] data = {70,60,60,90,30};

        double avg = a001.calculateAVG(data);
        String result = a001.judge(avg);

        System.out.println(avg);
        System.out.println(a001.name + " " + result);
    }
}