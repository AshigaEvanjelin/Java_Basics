//checking odd or even by using function

class function{
    int evenorodd(int num){
        if(num%2==0){
            System.out.println("The number " + num + " is even");
        }
        else{
            System.out.println("The number " + num + " is odd");
        }
        return num ;
    }
    public static void main(String args[]){
       
        function obj = new function();
        int result =obj.evenorodd(4);
        System.out.println(result);


    }
}