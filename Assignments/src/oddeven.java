
class oddeven{  
    int id;  
    String name;  
      
    oddeven(int i){  
    id = i;  
    if(id % 2 == 0){
    	name = "even";
    }else{
    	name = "odd";
    }
    	
    }  
    void display(){System.out.println(name);}  
   
    public static void main(String args[]){  
    oddeven s1 = new oddeven(111);  
    oddeven s2 = new oddeven(222);  
    s1.display();  
    s2.display();  
   }  
}  