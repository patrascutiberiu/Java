package fr.tib.anne_bissextille_boite;


import javax.swing.JOptionPane;

public class Anne_bissextille_boite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int saisieUt=0;
		boolean test=false;
		
		
		do {
			try {
				//integer.parseInt = parse int to string
				saisieUt = Integer.parseInt(JOptionPane.showInputDialog(null,
						"Veuillez saisir l'ann�e :","Ann�e bissextile",
						JOptionPane.INFORMATION_MESSAGE));
				test=true;
			}
			catch(Exception e){
				
				JOptionPane.showMessageDialog(null, 
						"Veuillez saisir un nombre SVP !","Ann�e bissextile", JOptionPane.WARNING_MESSAGE);
			}	
		}   
		while(!test);
		
	    
	    if(saisieUt % 4 != 0) {
	    	JOptionPane.showMessageDialog(null, 
					"L'ann�e est non bissextile .");
	    }
	    else {
	    	if(saisieUt % 100 != 0) {
	    		JOptionPane.showMessageDialog(null, 
						"L'ann�e est bissextile .");

	    	}
	    	else {
	    		if(saisieUt %400==0) {
	    			JOptionPane.showMessageDialog(null, 
	    					"L'ann�e est non bissextile .");
	    
	    		}
	    		else {
	    			JOptionPane.showMessageDialog(null, 
	    					"L'ann�e est bissextile .");

	    		}
	    	}
	    }
		
	}

}
