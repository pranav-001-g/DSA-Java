import java.util.*;
public class Array {
 
    /**
     
     */
    public static void main(String argu[]){
        char ch;
        int n=0,pos,val,m=0,flag=0,size,flag1=0;
        int array[]=new int[10001];
        int array1[]=new int[100];
        Scanner obj=new Scanner(System.in);
       
        System.out.println("Hello here we do the operation on the array ");
        do{
            System.out.println("=======================MANU=========================");
            System.out.println("1. Create an array ");
            System.out.println("2. Insert an element in array ");
            System.out.println("3. delete an element form its position ");
            System.out.println("4. Searching the element in array ");
            System.out.println("5. display element ");
            System.out.println("6. exit the program");
            System.out.println("=======================================================");
            System.out.println("enter your choice ");
            ch=obj.next().charAt(0);
            switch (ch) {
                case '1':
                System.out.println("-----------------------------------------------------------------");
                    System.out.println("Enter the size of array ");
                    n=obj.nextInt();
                    m=n;
                    System.out.println("enter the "+n+" elements ");
                    for(int i=0;i<n;i++){
                        array[i]=obj.nextInt();
                      
                    }
                     System.out.println("-----------------------------------------------------------------");
                    System.out.println();
                    System.out.println("Your array is ");
                    for(int i=0;i<n;i++){
                        System.out.print(array[i]+" ");
                        
                    }
                    for(int i=0;i<n;i++){
                        array1[i]=array[i];
                    }
                    System.out.println();
                    

                    break;
                    case '2':
                    System.out.println("-----------------------------------------------------------------");
                    System.out.println("Enter the position where the element should be inserted ");
                    pos=obj.nextInt();
                    System.out.println("Enter the value which you wan't to insert ");
                    val=obj.nextInt();
                    for(int i=n;i>=pos-1;i--){
                        array[i+1]=array[i];
                    }
                    array[pos-1]=val;
                    n=n+1;
                    System.out.println("-----------------------------------------------------------------");
                    break;
                    case '3':
                    System.out.println("-----------------------------------------------------------------");
                    int c;
                    System.out.println("Deletion can be done by two types ");
                    System.out.println("1. Delete by position ");
                    System.out.println("2. Delete by value ");
                    System.out.println("Enter your choice ");
                    c=obj.nextInt();
                    switch (c){
                        case 1:
                         System.out.println("Enter the position from which element shoud be deleted ");
                    pos=obj.nextInt();
                    for(int i=pos;i<n;i++){
                        array[i-1]=array[i];
                    }
                    n=n-1;
                    System.out.println("-----------------------------------------------------------------");
                        break;
                        case 2:
                        System.out.println("Enter the element which wan'ts to delete ");
                        val=obj.nextInt();
                       System.out.println(" sorry Updation is not done yet  use methode one only 1");
                        break;
                    }
                   
                    break;
                    case '4':
                    System.out.println("-----------------------------------------------------------------");
                    System.out.println("Searching can be done by two tyeps \n 1. linner \n 2. binnery (must need sorted array.)");
                    System.out.println("enter the way in which searching want's to be done ");
                    c=obj.nextInt();
                    switch (c){
                        case 1:
                        System.out.println("enter the number to search ");
                        int key=obj.nextInt();
                        for(int i=0;i<n;i++){
                            if(array[i]==key){
                                System.out.println("the element is found at "+(i+1)+" th position ");
                                flag=1;
                                break;
                            }
                        }
        
                        if(flag==0){
                            System.out.println("the element is not found ");
                        }
                        break;
                        case 2:
                        size=array.length;
                        int low=0;
                        int upper=size;
                        int mid;
                        System.out.println("Enter the element to search ");
                         key=obj.nextInt();
      
                        while(low<=upper){
                             mid=(upper+low)/2;
                            if(array[mid]==key){
                                System.out.println("The element is present in the array");
                                flag1 =1;
                                break;
                              }
                             else if(array[mid]<key){
                                  low=mid+1;
                              }
                            else{
                                     upper=mid-1;
                            }
                             }
                            if(flag1==0){
                                  System.out.println("The number is not found ");
                             }
                                   break;
                             }
                            break;
                    case '5':

                    System.out.println("-----------------------------------------------------------------");
                    System.out.println("Created array is = ");
                        for(int i=0;i<m;i++){
                            System.out.print(array1[i]+" ");
                        }
                        System.out.println();
                  System.out.println("-----------------------------------------------------------------");
                    System.out.println("Your array after change is =");
                    for(int i=0;i<n;i++){
                        System.out.print(array[i]+" ");
                        
                    }
                    System.out.println();
                    break;
                    case '6':
                    System.exit(0);
                default:
                    break;
            }

        }
        while (ch != 5);
        obj.close();
    }
    
}
