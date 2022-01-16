package Interface;

interface Member{
    public void callback();
}

class shop{
    Member member[] = new Member[10];
    int count =0;

    void resister(Member m){
        member[count++] =m ;
    }
    void inviteSale(){
        for (int i = 0; i <count ; i++) {
            member[i].callback();
        }
    }
}
class customer implements Member{
    String name;
    customer(String n){
        name = n;
    }
    @Override
    public void callback() {
        System.out.println("Ok, I will visit "+name);
    }
}

public class ScInterface {
    public static void main(String[] args) {
        shop s= new shop() ;
        customer c1 = new customer("adi");
        customer c2 = new customer("jhonson");
        s.resister(c1);
        s.resister(c2);
        s.inviteSale();
    }
}
