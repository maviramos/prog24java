public class MyClass {
	public static void main(String args[]) {
    	int x[] = {1,2,3};
    	int xy[][]  = {{1,2,3},{4,5,6},{7,8,9}};

    	System.out.println(x.length);
    	System.out.println(xy.length);
    	System.out.println(xy[0].length);

    	System.out.println("-------------------------");

    	int[] a = {1,2};
    	String b = "str";
    	String[] c = {"aa", "bb", "cc", "dd", "ee"};
    	System.out.println(a.length);
    	System.out.println(b.length());
    	System.out.println(c.length);    
    	System.out.println(c[1].length());    
   	 
    	System.out.println("-------------------------");


    	int[][] m = new int[20][30];
    	int tam1 = m.length;
    	int tam2 = m[0].length;
    	int tam3 = m[0][0].length;
    	System.out.println(tam1);    
    	System.out.println(tam2);    
    	System.out.println(tam3);    
   	 
    	String[][] n = new String[2][3];
    	n[0][0] = "Aluno IFC";
    	int tam4 = n.length;
    	int tam5 = n[0].length;
    	int tam6 = n[0][0].length();
    	System.out.println(tam4);    
    	System.out.println(tam5);    
    	System.out.println(tam6);    
   	 
    	System.out.println("-------------------------");
   	 
    	String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    	for (int i = 0; i < cars.length; i++) {
      	System.out.println(cars1[i]);
    	}
   	 
    	for (String i : cars) {
      	System.out.println(i);
    	}
	}
}
 //Vetores Java (22/07/2024 - 22/07/2024)



















// comentários da aula: 

// 
//
//
//
//
//
//
//
//
//
//
//
//
