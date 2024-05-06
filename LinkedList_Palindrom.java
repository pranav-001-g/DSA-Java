public class LinkedList_Palindrom {
    public class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            next=null;
        }
    }
    static node head=null;
    static node tail=null;
    
    //---------------------------------------------------------------------------------------------------------
    void add(int data){
        node newnode = new node(data);
        if(head==null){
            head=tail=newnode;
            return ;
            
        }
        newnode.next=head;
        head=newnode;
    }
    //---------------------------------------------------------------------------------------------------------
    void print(){
        if(head==null){
            System.out.println("The linked list is an empty ");
            return ;
        }
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    node reverse(node temp){
        node pre=null;
        node cur=temp;
        node next;
        while(cur!=null){
            next=cur.next;
            cur.next=pre;
            pre=cur;
            cur=next;
        }
        cur =pre;
        return cur;
    }
    //---------------------------------------------------------------------------------------------------------
    node findmid(){
        node slow=head;
        node fast=head;
        while(fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;        
    }

    boolean ispali(){
        if(head==null||head.next==null){
            return true;
        }
        node first=head;
        node mid= findmid();
        mid =reverse(mid);
        while(mid!=null){
            if(first.data!=mid.data){
                return false;
            }
            System.out.println(".");
            System.out.println(first.data+"-"+mid.data);
            System.out.println('.');
            first=first.next;
            mid=mid.next;
        }  
        
        return true;
    }
    //---------------------------------------------------------------------------------------------------------
    

    public static void main(String[] args) {
        LinkedList_Palindrom l1=new LinkedList_Palindrom();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(3);
        l1.add(2);
        l1.add(1);
        l1.print();
        // l1.reverse(head);
        System.out.println(l1.ispali());
        l1.print();
    }
}
