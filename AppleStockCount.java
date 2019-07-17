public class AppleStockCount {
  
  public static void main(String[] args) {
    if (args.length == 0) {
        System.out.println("Please give me a qty!");
        return;
    }

    int qty = Integer.parseInt(args[0]);
    double cost = 4.50;
    double total;


    if((qty % 12) == 0){
  
         total = qty * cost;
  
         int dozenCount = qty/12 ;
        
         StringBuilder message = new StringBuilder();
         message.append("You have bought ");
         message.append(dozenCount);
         message.append(" dozen of");
         message.append(" apple");
         if (dozenCount > 1) {
             message.append("s");
         }

        message.append(" for a total cost of R");
        message.append(total);
        message.append(".");
        System.out.println(message.toString());
}
        if((qty % 12) != 0){
        total = qty * cost;

         StringBuilder message = new StringBuilder();
         message.append("You have bought ");
         message.append(qty);
         message.append(" apple");
         if (qty > 1) {
             message.append("s");
         }

        message.append(" for a total cost of R");
        message.append(total);
        message.append(".");
        System.out.println(message.toString());
        } 
  }
}