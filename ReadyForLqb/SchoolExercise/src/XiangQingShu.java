
public class XiangQingShu {
    public static void main(String[] args) {
        run(100,1000);
    }

    //求因数之和
    public static int  getNum(int num){
        int sum=1;
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        return sum;
    }

    //判断两个数是不是相亲数
    public static void run(int fromm,int to){
        int count=0;
        for(int sum=fromm;sum<=to;sum++){
            int sum1=getNum(sum);//求sum的因数和sum1
            if(sum1>sum){//缩小范围
                int sum2=getNum(sum1);//求sum1的因数和sum2
                if(sum2==sum){//如果sum==sum2则为相亲数
                    System.out.println(sum1+"和"+sum2+"是一对相亲数。");
                    count++;
                }
            }
        }
        System.out.println("共有"+count+"对相亲数。");
    }
}

