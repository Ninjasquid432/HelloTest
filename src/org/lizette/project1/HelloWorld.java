package org.lizette.project1;

/**
 * 
 */
class HelloWorld {
	
	public static void main(String[] args) {
	  
        System.out.println("Thankyou, Kurt!");
        Lizette lizette = new Lizette();
        lizette.print("HIIIII", 4);
        Lizette lizette1 = lizette;
        
        Lizette lizette2 = new Lizette();
        lizette2.print("Lisette is hot", 1);
        
        System.out.println(lizette.equals(lizette1));
        
        String leonard = lizette.echo("ECHO!!!!!");
        System.out.println( leonard );
    }
	

}
