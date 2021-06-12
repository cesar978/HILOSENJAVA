package edu.ieu.hilosjava;

public class MainThreat {

	public static void main(String[]args) {
		Cliente cliente1 = new Cliente("Cliente Michell",
				new  int [] {2,2,1,5,2}
		);
		Cliente cliente2 = new Cliente("Cliente Eduardo",
				new  int [] {1,3,5,1,1}
		);
		Cliente cliente3 = new Cliente("Cliente Cesar",
				new  int []  {9,7,8,1,9}
		);
		
		long initialTime = System.currentTimeMillis();
		
		CajeraThreat cajero1 = new CajeraThreat("Cliente Cesar"
				,cliente1,initialTime);
		CajeraThreat cajero2 = new CajeraThreat("Cliente Isidro"
				,cliente2,initialTime);
		CajeraThreat cajero3 = new CajeraThreat("Cliente Ramon"
				,cliente3,initialTime);
		
		cajero1.start();
		cajero2.start();
		cajero3.start();
		
						
	}
}
