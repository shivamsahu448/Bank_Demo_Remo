public class Customer {

    private  int id;
    private String userName;
    private String name;
    private String password ;
    private String number ;
    private double balance ;
    private String AccountType;
    private  static int userid =0;
    // counstroter 
    Customer(  String name,String string, String password , String number, double balance , String AccountType){

       this.id = userid;
        userid++;
        this.userName = string;
        this.name = name;
        this.password = password;
        this.number = number;
        this.balance = balance;
        this.AccountType = AccountType;

    }

    // gatter and setter  id 
    public int getId(){
        return id;
    }
    public void setId(int id ){
        this.id = id ;
    }
//gatter and setter  Username 
     public String getuserName(){
        return userName;
    }
    public void setuserName(String userName ){
        this.userName = userName ;
    }


  //gatter and setter  name
    public String getName(){
        return name;
    }
    public void  setName(String name){
        this.name = name;
    }


     //--gatter and setter  password
    public String getPassword(){
        return password;
    }
    public void  setPassword(String password){
        this.password = password;
    }
    

     //--gatter and setter  number
    public String getNumber(){
        return number;
    }
    public void  setNumber(String number){
        this.number = number;
    }

// gatter and setter balance 
    public double getBalance(){
        return balance;
    }
    public void  setBalance(double balance){
        this.balance = balance;
    }

        //gatter and setter  AccountType 
     public String getAccountType(){
        return AccountType;
    }
    public void  setAccountType(String AccountType){
        this.AccountType = AccountType;
    }


    @Override
    public String toString() {

        System.out.println("-----------Customer  Details--------------");
        String str = " id          :- " + id + "\n" +           
                     " userName    :- " + userName + "\n" +
                     " name        :- " + name + "\n" +
                     " password    :- " + password + "\n" +
                     " number      :- " + number + "\n" +
                     " balance     :- " + balance + "\n" +
                     " AccountType :- " + AccountType + "\n" ;
      

        return str;

    }


}
