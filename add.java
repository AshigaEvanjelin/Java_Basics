class Addition{
    int sum(int a,int b){
        System.out.println(a + b);
        return a + b;
    }
    int square(int num)
{
    System.out.println(num * num);
    return num * num;
}   
 public static void main(String args[]){
        Addition add= new Addition();
        add.sum(10,10);
        add.square(5);
    }
}