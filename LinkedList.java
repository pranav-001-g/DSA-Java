// import java.util.*; 
public class LinkedList{
    public static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
        }
   }
//---------------------------------------------------------------------------------------------------------------------------------
   public static node head;
   public static node tail;
   public static int size;
//---------------------------------------------------------------------------------------------------------------------------------
   void addfirst(int data){
    node newnode = new node(data);
    size++;
    if(head==null){
        head=tail=newnode;
        return;
    }
    newnode.next=head;
    head=newnode;

}
//---------------------------------------------------------------------------------------------------------------------------------
    void addlast(int data){
        node newnode = new node(data);
        size++;
        if(head==null){
            head=tail=newnode;
            return;
        }
        tail.next=newnode;
        tail=newnode;
    }
//---------------------------------------------------------------------------------------------------------------------------------
    void addmid(int data,int index){
        if(index==0){
            addfirst(data);
            return;
        }
        node newnode =new node(data);
        size++;
        node temp=head;
        int i=0;
        while (i<index-1){
            temp=temp.next;
            i++;
        }
        newnode.next=temp.next;
        temp.next=newnode;
    }

//---------------------------------------------------------------------------------------------------------------------------------
    int removefirst(){
        if(size==0){
            System.out.println("Linked list is empty");
            return Integer.MAX_VALUE;

        }
        else if(size==1){
            System.out.println("After removing this element linklist become empty ");
            head=tail=null;
            size--;
            return head.data;
        }
        head=head.next;
        size--;
        return head.data;
    }
//---------------------------------------------------------------------------------------------------------------------------------
    int removelast(){
        if(size==0){
            System.out.println("Linked list is empty");
            return Integer.MAX_VALUE;
        }
        else if(size==1){
            System.out.println("After removing this element linklist become empty ");
            head=tail=null;
            size--;
            return head.data;
        }
        node temp=head;
        int i=1;
        while(i<size-1){
            i++;
            temp=temp.next;
        }
        size--;
        int ele=temp.next.data;
        tail=temp;
        tail.next=null;
        return ele;
    }
//---------------------------------------------------------------------------------------------------------------------------------
    void print(){
        node temp=head;
        if(temp==null){
            System.out.println("LinkList is empty ");
           return;
        }
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
        
    }
//---------------------------------------------------------------------------------------------------------------------------------
int search(int key){
    int index=0;
    node temp=head;
    while(temp!=null){
        if(temp.data==key){
            System.out.print("Element found at index = ");
            return index;
        }
        temp=temp.next;
        index++;
    }
    System.out.print("Element is not found ");
    return -1;

}
//---------------------------------------------------------------------------------------------------------------------------------
int friend(int key, node head){
    if(head==null){
        return -1;
    }
    else if(head.data==key){
        return 0;
    }
    int index=friend(key,head.next);
    if(index==-1){
        return -1;
    }
    return index+1;

}
int searchrec(int key){
    int index=friend(key, head);
    return index;
}
//---------------------------------------------------------------------------------------------------------------------------------
void reverse(){
    node pre=null;
    node cur=tail=head;
    node after;

    while(cur!=null){
        after=cur.next;
        cur.next=pre;
        pre=cur;
        cur=after;

    }
    head=pre;
}
//---------------------------------------------------------------------------------------------------------------------------------
    void removefromlast(int n){
        int sz=0;
        node temp=head;
        while(temp!=null){
            sz++;
            temp=temp.next;
        }
        // System.out.println(sz);
        if(n==sz){
            head=head.next;
            return;
        }
        node p=head;
         int i=1;
         while(i<sz-n){
            p=p.next;
            i++;
         }
         p.next=p.next.next;
    }
//---------------------------------------------------------------------------------------------------------------------------------
    node getmid(node head){
        node slow=head;
        node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    node mergesort(node head){
        if(head==null || head.next==null){
            return head;
        }
        node mid=getmid(head);
        node righthead=mid.next;
        mid.next=null;

       node left= mergesort(head);
       node right= mergesort(righthead);

        return merge(left ,right);
    }

    node merge(node head1,node head2){
        node newll=new node(-1);
        node temp =newll;
        while (head1!=null && head2!=null) {
            if(head1.data<head2.data){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }
            else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }
        while(head1!=null){
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        }
        while(head2!=null){
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }
        return newll.next;
    }
//---------------------------------------------------------------------------------------------------------------------------------
    void ZicZac(){
        node slow=head;
        node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        node mid= slow;

        node pre=null;
        node cur=mid;
        node nex;
        while (cur!=null) {
            nex=cur.next;
            cur.next=pre;
            pre=cur;
            cur=nex;
        }
        node left=head;
        node right=pre;

        node nleft,nright;

        while(left!=null && right!=null){
            nleft=left.next;
            left.next=right;
            nright=right.next;
            right.next=nleft;

            left=nleft;
            right=nright;
        }



    }
//---------------------------------------------------------------------------------------------------------------------------------
    public static void main(String arg[]){
        LinkedList l1=new LinkedList();
        // l1.addfirst(9);
        // l1.addfirst(8);
        // l1.addfirst(6);
        // l1.addlast(5);
        // l1.addlast(4);
        // l1.addfirst(6);
        // l1.print();
        // l1.addmid(0,2);
        // l1.print();
        // l1.addmid(0, 2);
        // l1.addmid(0, 2);;
        
        // l1.print();
        // System.out.println("Size of the linkedlist is = "+size);
        // System.out.println("Removed first element is "+l1.removefirst());
        // l1.print();
        // System.out.println("Size of the linkedlist is = "+size);
        // System.out.println("Remove the last element "+l1.removelast());
        // System.out.println("Size of the linkedlist is = "+size);
        // l1.print();

        // System.out.println(l1.search(0));
        // System.out.println(l1.search(5));
        // System.out.println(l1.search(90));

        // l1.print();
        // System.out.println(l1.searchrec(90));
        // System.out.println(l1.searchrec(8));

        l1.addlast(1);
        l1.addlast(2);
        l1.addlast(3);
        l1.addlast(4);
        l1.addlast(5);
        l1.addlast(6);
        l1.addlast(0);
        l1.print();
        // l1.reverse();
        // LinkedList.head=l1.mergesort(head);
        l1.ZicZac();
        l1.print();
        // l1.removefromlast(2);
        // l1.print();

        
       
        
    }
}