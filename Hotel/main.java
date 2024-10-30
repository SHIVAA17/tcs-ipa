

/*
HOTEL MANAGEMENT QUESTION

CREATE A CLASS HOTEL WITH BELOW ATTRIBUTE

HOTEL-ID - INT
HOTEL-NAME - STRING
HOTEL-CABFACILITY - STRING
HOTEL-RATING - INT
HOTEL-FEES - INT 

WRITE GETTER , SETTER AND PARAMETERISED CONSTRUTOR AS REQUIRED .


CREATE A CLASS SOLUTION AND WRITE MAIN METHOD IN IT INSIDE MAIN MAIN METHOD WRITE 1. STATIC METHOD-- { hotelByHighestRating }

1. hotelByHighestRating  -- in this method two input are taken one is array of HOTEL objects and second is string input which is cabficility of HOTEL
if rating is greater than 5 and cabfacuility is availble then output the highest rating if it is not greater than 5 then it should return 0 ;

condition 1 --> if hotel rating below 5 then it should be zero so print ----> "NO HOTEL WITH GIVEN FACILITY"
condition 2 --> if hoteL rating greater than 5 and CABFACILITY is yes then print hotel rating 

Take 4 HOTEL objects as input and one String cabfacility 


INPUT 1.

101
TAJ
YES
7
70000
102
RAJ
NO
5
30000
103
J&J
NO
6
40000
104
ITC
YES 
5
50000
YES

OUTPUT 1 .

7


INPUT 2.

101
TAJ
YES
5
70000
102
RAJ
NO
5
30000
103
J&J
NO
6
40000
104
ITC
YES 
5
50000
YES

OUTPUT 2.

NO HOTEL WITH GIVEN FACILITY*/






**************************************************************************************************************                                             S-O-L-U-T-I-O-N                                                     
***************************************************************************************************************

import java.util.*;

public class Main{
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Hotel[] arr = new Hotel[4];
        for(int i =0;i<arr.length;i++){
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();sc.nextLine();
            int e = sc.nextInt();sc.nextLine();
            
            arr[i] = new Hotel(a,b,c,d,e);
        }
        String cab1 = sc.nextLine();
        
        int result = hotelByHighestRating(arr,cab1);
        if(result == 0){
            System.out.println("No Hotel WITH GIVEN FACILITY");
        }
        else{
            System.out.println(result);
        }
    }
    
    
    public static int hotelByHighestRating(Hotel[] arr,String cabfacility){
      for(int i = 0;i<arr.length;i++){
        if(arr[i].gethotelrating() < 5) {
            return 0;
        }
        else if(arr[i].gethotelrating() > 5 && arr[i].getcabfacility().equalsIgnoreCase(cabfacility)){
            return arr[i].gethotelrating();
        }
        
      }
      return 0;
        
    }
    
    
}

class Hotel{
    int hotelid;
    String hotelname;
    String cabfacility;
    int hotelrating;
    int hotelfees;
    
    
    public Hotel(int hotelid,String hotelname,String cabfacility,int hotelrating,int hotelfees){
        this.hotelid = hotelid;
        this.hotelname = hotelname;
        this.cabfacility = cabfacility;
        this.hotelrating = hotelrating;
        this.hotelfees = hotelfees;
    }
    
    //getter function
    
    public int gethotelid(){
        return hotelid;
    }
    
    public String gethotelname(){
        return hotelname;
    }
    
    public String getcabfacility(){
        return cabfacility;
    }
    
    public int gethotelrating(){
        return hotelrating;
    }
    
    public int gethotelfees(){
        return hotelfees;
    }
    
    //
    
}
