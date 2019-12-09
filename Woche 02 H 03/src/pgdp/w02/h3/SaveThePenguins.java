package pgdp.w02.h3;

public class SaveThePenguins extends MiniJava {
  public static void main(String[] args) {
	  
	  int gn, t, r1;
	  int[] g;
	  g = new int [6];
	  t = readInt("Bitte Geben Sie die Anzahl an Zeitschritten ein (>= 1):");
	  
	  if (t < 1) write("Zeitschritte >= 1 erforderlich");
	  else {
		  
		  g[1] = readInt("Startpopulation Jungtiere");
		  g[2] = readInt("Startpopulation Junge Erwachsene");
		  g[3] = readInt("Startpopulation Erwachsene");
		  g[4] = readInt("Startpopulation Alte Erwachsene");
		  g[5] = readInt("Startpopulation Weise");
		  
		  int i = 0;
		  while(i < t) {
			  
			  r1 = (g[2]*3)+(g[3]*2);
			  
			  int l = 1;
			  while(l < 6) {
				  r1 = r1 - g[l];
				  if (r1 < 0) {
					  g[l] = g[l] + r1;
					  r1 = 0;
				  }
				  l = l+1;
			  }
			  
			  gn = (g[2]/4);
			  gn = gn + (g[3]/2);
			  gn = gn + (g[4]/3);
			  
			  g[5] = g[4];
			  g[4] = g[3];
			  g[3] = g[2];
			  g[2] = g[1];
			  g[1] = gn;
					 
			  
			  i = i+1;
		  }
		  
		  write("Anzahl Jungtiere:");
		  write(g[1]);
		  write("Anzahl Junge Erwachsene:");
		  write(g[2]);
		  write("Anzahl Erwachsene:");
		  write(g[3]);
		  write("Anzahl Alte Erwachsene:");
		  write(g[4]);
		  write("Anzahl Weise:");
		  write(g[5]);
		  
	  }
	  
	  
	  
	  
	  
	  
	  
	  
  }
}