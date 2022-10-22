public class LinkedListOneWay {
    Node head=null;
    Node tail=null;

    public void addToHead(int data){
        Node newNode=new Node();
        newNode.data=data;

        if(head==null){
            newNode.next=null;
            head=newNode;
            tail=newNode;
        }
        else{
            newNode.next=head;
            head=newNode;
        }
    }

    public void dltHead(){
        if(head==null)
            System.out.println("There is no item in the List...");
        else if(head.next==null){
            head=null;
            tail=null;
        }
        else{
            head=head.next;
        }
    }

    public void dltTail(){
        if(head==null)
            System.out.println("There is no item in the List...");
        else if(head.next==null) {
            head = null;
            tail = null;
        }
        else{
            Node temp=new Node();
            while(temp.next.next!=null){
                temp=temp.next;
            }
            temp.next=null;
            tail=temp;
        }
    }

    public void addToTail(int data){
        Node newNode=new Node();
        newNode.data=data;

        if(head==null){
            newNode.next=null;
            head=newNode;
            tail=newNode;
        }
        else{
            newNode.next=null;
            tail.next=newNode;
            tail=newNode;
        }
    }

    public void addBetween(int data,int index){
        Node newNode = new Node();
        newNode.data = data;

        if(head==null && index==0){
            newNode.next=null;
            head=newNode;
            tail=newNode;
        }
        else if(head!=null && index==0){
            newNode.next=head;
            head=newNode;
        }
        else{
            int i=0;
            Node temp=head;
            Node temp2=head;
            while(temp.next!=null){
                i++;
                temp=temp.next;
            }
            if(i==index){
                newNode.next=null;
                tail.next=newNode;
                tail=newNode;
            }
            else{
                int j=0;
                temp=head;
                temp2=head;
                while(j!=index){
                    temp2=temp;
                    temp=temp.next;
                    j++;
                }
                temp2.next=newNode;
                newNode.next=temp;
            }
        }
    }

    public void dltBetween(int index){
        if(head==null)
            System.out.println("There is no item in the List...");
        else if(head.next==null && index==0){
            head=null;
            tail=null;
        }
        else{
            int i=0;
            Node temp = head;
            Node temp2 = head;
            while(temp!=null){
                i++;
                temp2=temp;
                temp=temp.next;
            }
            if(i==index){
                temp2.next=null;
                tail=temp2;
            }
            else {
                int j=0;
                temp = head;
                temp2 = head;
                while (j!=index){
                    temp2=temp;
                    temp=temp.next;
                    j++;
                }
                temp2.next=temp.next;
            }
        }
    }

    public void print(){
        if(head==null)
            System.out.println("There is no item in the List...");
        else{
            Node temp = head;
            int b=0;
            while(temp!=null){
                System.out.println(b+". item: "+temp.data);
                temp=temp.next;
                b++;
            }
        }
    }
}
