class Main {
    public static void main(String[] args) {
       int [] arr ={3, 6, 8, 1, 4};int sum=0;
        for(int i=0;i>=arr.length-1;i++)
        {
            if(arr[i]%2==0){
                sum=sum+arr[i];
                
            }
        }
System.out.print(sum);
    }
}