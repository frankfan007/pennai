import org.epistasis.emergent.TinyGP;

public class loadTest extends TestCase  {
	public static void main(String[] args) {
		TinyGP gp = new TinyGP(oneDfname,s);
	    //jocl.evolve();
		System.out.println("fugazi Function index:");
	    gp.evolve();

	}
}
