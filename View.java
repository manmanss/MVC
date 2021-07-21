import java.util.Scanner;

public class View {
    controller c = new controller();
    Model m = new Model();
    String code;

    public View() {
          
            Scanner ac = new Scanner(System.in);
            boolean isRunning = true;
            while(isRunning == true){
            System.out.println("\nChakungrao\n1.insert\n2.Extraction rate\n3.Countries in the box \n4. Exit Program");
            int y = ac.nextInt();
            switch (y) {
            case 1:
            Scanner sc = new Scanner(System.in);
            System.out.print("\nEnter Code = ");
             code = sc.nextLine();
             if(code.length()==6){
                 if(code.charAt(0)=='A' || code.charAt(0)=='B' || code.charAt(0)=='C' || code.charAt(0)=='D' || code.charAt(0)=='E' || code.charAt(0)=='F' || code.charAt(0)=='G' || code.charAt(0)=='H' || code.charAt(0)=='I' || code.charAt(0)=='J' || code.charAt(0)=='K' || code.charAt(0)=='L' || code.charAt(0)=='M' || code.charAt(0)=='N' || code.charAt(0)=='O' ||code.charAt(0)=='P' || code.charAt(0)=='Q' || code.charAt(0)=='R' || code.charAt(0)=='S' || code.charAt(0)=='T' || code.charAt(0)=='U' || code.charAt(0)=='V' || code.charAt(0)=='W' || code.charAt(0)=='X' || code.charAt(0)=='Y' || code.charAt(0)=='z'  )
                 {  
                    if(code.charAt(1)=='A' || code.charAt(1)=='B' || code.charAt(1)=='C' || code.charAt(1)=='D' || code.charAt(1)=='E' || code.charAt(1)=='F' || code.charAt(1)=='G' || code.charAt(1)=='H' || code.charAt(1)=='I' || code.charAt(1)=='J' || code.charAt(1)=='K' || code.charAt(1)=='L' || code.charAt(1)=='M' || code.charAt(1)=='N' || code.charAt(1)=='O' ||code.charAt(1)=='P' || code.charAt(1)=='Q' || code.charAt(1)=='R' || code.charAt(1)=='S' || code.charAt(1)=='T' || code.charAt(1)=='U' || code.charAt(1)=='V' || code.charAt(1)=='W' || code.charAt(1)=='X' || code.charAt(1)=='Y' || code.charAt(1)=='z'  )
                    { 
                        if(code.charAt(2)=='0' || code.charAt(2)=='1' || code.charAt(2)=='2' || code.charAt(2)=='3' || code.charAt(2)=='4' || code.charAt(2)=='5' || code.charAt(2)=='6' || code.charAt(2)=='7' || code.charAt(2)=='8' || code.charAt(2)=='9')
                        { 
                            if(code.charAt(3)=='0' || code.charAt(3)=='1' || code.charAt(3)=='2' || code.charAt(3)=='3' || code.charAt(3)=='4' || code.charAt(3)=='5' || code.charAt(3)=='6' || code.charAt(3)=='7' || code.charAt(3)=='8' || code.charAt(3)=='9')
                            {
                                if(code.charAt(4)=='0' || code.charAt(4)=='1' || code.charAt(4)=='2' || code.charAt(4)=='3' || code.charAt(4)=='4' || code.charAt(4)=='5' || code.charAt(4)=='6' || code.charAt(4)=='7' || code.charAt(4)=='8' || code.charAt(4)=='9')
                                {
                                    if(code.charAt(5)=='0' || code.charAt(5)=='1' || code.charAt(5)=='2' || code.charAt(5)=='3' || code.charAt(5)=='4' || code.charAt(5)=='5' || code.charAt(5)=='6' || code.charAt(5)=='7' || code.charAt(5)=='8' || code.charAt(5)=='9')
                                    {m.insert();}
                                } else { System.out.print("Code Incorrect!!!!!! ");}
                            } else { System.out.print("Code Incorrect!!!!!! ");}

                        } else { System.out.print("Code Incorrect!!!!!! ");}
                        } else { System.out.print("Code Incorrect!!!!!! ");}
                 } else { System.out.print("Code Incorrect!!!!!! ");}
                } 
             else { System.out.print("Code Incorrect!!!!!! ");
                 break;}
                break;
            
                
            case 2:

            System.out.print("Extraction rate of grass jelly = "+c.rate);
                break;
            case 3:
            System.out.print("Countries that are still in the warehouse after the last box is imported = "+c.room[0]+" "+c.room[1]+" "+c.room[2]+" "+c.room[3]+" "+c.room[4]+" "+c.room[5]+" "+c.room[6]+" "+c.room[7]+" "+c.room[8]+" "+c.room[9]+" "+c.room[10]+" "+c.room[11]+" "+c.room[12]+" "+c.room[13]+" "+c.room[14]+" "+c.room[15]);
            
                break;
            case 4 :
            System.out.print("\nExtraction rate of grass jelly = "+c.rate);
            System.out.print("Countries that are still in the warehouse after the last box is imported = "+c.room[0]+" "+c.room[1]+" "+c.room[2]+" "+c.room[3]+" "+c.room[4]+" "+c.room[5]+" "+c.room[6]+" "+c.room[7]+" "+c.room[8]+" "+c.room[9]+" "+c.room[10]+" "+c.room[11]+" "+c.room[12]+" "+c.room[13]+" "+c.room[14]+" "+c.room[15]);
            isRunning = false;
            break;
            }
        }
            
        
        
    }

    public controller getC() {
        return c;
    }

    public void setC(controller c) {
        this.c = c;
    }

    public Model getM() {
        return m;
    }

    public void setM(Model m) {
        this.m = m;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void View() {
    }
        
}
