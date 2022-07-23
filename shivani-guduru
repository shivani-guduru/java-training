import java.util.*;
public class stsudentmarks {
    public static void main(String[] args){
        String[][] students=new String[11][6];
        Scanner scan=new Scanner(System.in);
        int sum=0,max=0,min=0,minint=0,maxint=0;
        double percentage=0;
        students[0][0]="Name";
        students[0][1]="maths";
        students[0][2]="science";
        students[0][3]="english";
        students[0][4]="total";
        students[0][5]="percentage";
        for(int i=1;i<11;i++){
            System.out.println("Enter the student name");
            students[i][0]=scan.next();
            for(int j=1;j<4;j++){
                if(j==1){
                    System.out.printf("enter maths marks of %s :",students[i][0]);
                    students[i][j]=scan.next();
                }
                if(j==2){
                    System.out.printf("enter science marks of %s :",students[i][0]);
                    students[i][j]=scan.next();
                }
                if(j==3){
                    System.out.printf("enter science marks of %s :",students[i][0]);
                    students[i][j]=scan.next();
                }
            }
        }
        for(int i=1;i<11;i++){
            for(int j=4;j<6;j++){
            if(j==4){
                sum=Integer.parseInt(students[i][1])+Integer.parseInt(students[i][2])+Integer.parseInt(students[i][3]);
                students[i][j]=Integer.toString(sum);
            }
            if(j==5){
                percentage=(Double.parseDouble(students[i][4])/150)*100;
                students[i][j]=Double.toString(percentage);
            }
            }
        }
        System.out.println("Students details :\n");
        for(int i=0;i<11;i++){
            for(int j=0;j<6;j++){
                System.out.print(students[i][j]+"           ");
            }
            System.out.printf("\n");
        }
        max=Integer.parseInt(students[1][4]);
        min=Integer.parseInt(students[1][4]);
        for(int i=1;i<11;i++){
            if(max<Integer.parseInt(students[i][4])){
             max=Integer.parseInt(students[i][4]);
             maxint=i;
            }
           if(min>Integer.parseInt(students[i][4])){
           min=Integer.parseInt(students[i][4]);
           minint=i;
           }
        } 
        if(minint==0)
        minint=1;
        System.out.println("Details of high scorer:\n");
            System.out.println("name :"+students[maxint][0]+" maths :"+students[maxint][1]+" science :"
            +students[maxint][2]+" english :"+students[maxint][3]+" total :"+students[maxint][4]
            +" percentage :"+students[maxint][5]);
            System.out.println("Details of low scorer:\n");
            System.out.println("name :"+students[minint][0]+" maths :"+students[minint][1]+" science :"
            +students[minint][2]+" english :"+students[minint][3]+" total :"+students[minint][4]
            +" percentage :"+students[minint][5]);
            scan.close();
    }
}
