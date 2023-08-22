class swiggiExecouter3{
public static void main (String foodDilevery[]){
System.out.println("main started");

double price =swiggi.search("burger king");
System.out.println("the price for burger king"+price);

double pricewithquantity = swiggi.search("burger king",3);
System.out.println("the price of burger king with quantity 3 is");

System.out.println("main ended");
}
}