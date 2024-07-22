public class main
{ 
    public static void main(String[] args) {
        System.out.println("apenas testes");

        for (String lista : args){
            System.out.println(lista);
        }
        
        for (int i=0; i < args.length; i++){
            System.out.println(args[i]);
        }
        
    }


    
}
