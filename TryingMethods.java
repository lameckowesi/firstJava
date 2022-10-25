public class TryingMethods {
    
    //This class is to try methods

    public static void main(String[] args){
        printName();
        printInterest();
        TryingMethods Result = new TryingMethods();
        Result.DaysOfTheWeek(6);
        Result.Speed(80);

        System.out.println("Sum of even numbers between 12 and 103: "+SumOfEvenNumbers());
        System.out.println("Sum of numbers less than 1000 :"+sumNumBtnThousand());


    }
    public static void printName() {
        System.out.println("My name is Lameck");
    }

    public static void printInterest(){
        System.out.println("I like startups. I am learning programming");

    }
      
        
           
       
        public String DaysOfTheWeek(int daySpot) {
            String day= "";
            switch (daySpot) {
                case 1:
                    day="Monday";
                    break;
                case 2:
                    day="Tuesday";
                    break;
                case 3:
                    day="Wednesday";
                    break;
                case 4:
                    day="Thursday";
                    break;
                case 5:
                    day="Friday";
                    break;
                case 6:
                    day="Saturday";
                    break;
                case 7:
                    day="Sunday";
                    break;
                default:
                    day="A typical day";
                    break;
            }
            System.out.println(day);
            return day;
        }
        public void Speed (int kph){
            if (kph >= 150 ) {
                System.out.println("The speed is dangerous");
            }
            else if(kph <= 60){
                System.out.println("The speed is low");
            }
            else{
                System.out.println("The speed is reasonable");
            }
    
        }
    
        public static int SumOfEvenNumbers() {
            int sum = 0;
            for (int i = 12; i <= 103; i++) {
                if(i % 2 ==0){
                    sum +=i;
                    System.out.println(sum);
                }
            }
            System.out.println(sum);
            return sum;
        }
        public static int sumNumBtnThousand () {
            int sum = 0;
            int numCount = 0;
            while (numCount < 1001) {
            sum +=numCount;
            numCount +=1;
            }
            return sum;
        }
        

    
    
    
}
