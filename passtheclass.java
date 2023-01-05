import java.util.Scanner;

public class passtheclass {


    public static void main(String[] args) {
        double math,turkish,biology,music,physical,average;
        Scanner input=new Scanner(System.in);
        System.out.print("enter to math point: ");
        math=input.nextDouble();

        System.out.print("enter to turkish point: ");
        turkish=input.nextDouble();

        System.out.print("enter to biology point: ");
        biology=input.nextDouble();

        System.out.print("enter to music point: ");
        music=input.nextDouble();

        System.out.print("enter to physical point: ");
        physical=input.nextDouble();

        if((math==0)||(math==100)){
            average=(turkish+physical+biology+music)/4;}

        else if ((turkish==0)||(turkish==100)){
            average=(math+physical+biology+music)/4;}

        else if((biology==0)||(biology==100)){
            average=(turkish+physical+math+music)/4;}

        else if((music==0)||(music==100)){
            average=(turkish+physical+biology+math)/4;}

        else if((physical==0)||(physical==100)){
            average=(turkish+math+biology+music)/4;}

        else{
            average=(math+turkish+music+physical+biology)/5;}

        if(average>=55){
            System.out.print("congratulations.passed the class");}
        else{
            System.out.println("sorry.you did not pass the class");}
        System.out.println("average: "+average);

        }
                }







