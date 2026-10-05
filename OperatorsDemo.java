public class OperatorsDemo {
    void add (int a, int b) {
        int sum = a+b;
        System.out.println("Addtion:"+sum);

    }
    int multiply(int a, int b){
        return a * b;
    }
    public static void main (String args []){
        byte a= 10, b =20;
        int result = a+b ;
        System.out.println("Arithmatic opration result:"+ result);
        int x = 10, y=3;
        System.out.println("x + y ="+(x + y));
        System.out.println("x - y ="+(x - y));
        System.out.println("x * y ="+(x * y));
        System.out.println("x / y ="+(x / y));
        System.out.println("x % y ="+(x % y));

        OperatorsDemo obj = new OperatorsDemo();
        obj.add(4,5);
        int no = obj.multiply(6,4);
        System.out.println ("multiplicarion="+no);

    }
} 
