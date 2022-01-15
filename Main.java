public class Main{
    public static void main (String[]args)
    {
        //q1
        System.out.println("Hello i am patrick");
        //q2
        String currency = "CSC1009";

                switch(currency)
                {
                    case "AUD":
                        System.out.println("Australian dollar");
                        break;
                    case "MYR":
                        System.out.println("Malaysian ringgit");
                        break;
                    case "IDR":
                        System.out.println("Indonesian rupiah");
                        break;
                    case "CSC1009":
                        System.out.println("Object-Oriented Programming");
                        break;
                    default:
                        System.out.println("Unknown Currency");
                        break;
                }
                System.out.println("After switch");
         //q3
        for (int x= 102;x>=66;x--)
        {
            if (x%2!=0)
                System.out.println(x);
        }


    }
}