package tuts.tut10.to_dos.adapter;

import tuts.tut10.to_dos.adapter.*;
import tuts.tut10.to_dos.adapter.adapter.SquarePegAdapter;
import tuts.tut10.to_dos.adapter.round.RoundHole;
import tuts.tut10.to_dos.adapter.round.RoundPeg;
import tuts.tut10.to_dos.adapter.square.SquarePeg;


/**
 * Somewhere in client code...
 */
public class Demo {
	public static void main(String[] args) {
		//TO-DO: Create 2 instances of RoundHole and RoundPeg with same radius
                    RoundHole rh = new RoundHole(10);
                    RoundPeg  rp = new RoundPeg(10);
		//TO-DO: If RoundHole instance can "fits" with RoundPeg instance => show a message
                    if(rh.fits(rp)) System.out.println("RoundHole fits RoundPeg");
		//TO-DO: Create 2 instances of SquarePeg with 2 different widths
                    RoundHole rh2 = new RoundHole(5);
                    RoundPeg  rp2 = new RoundPeg(15);
                    if(!rh2.fits(rp2)) System.out.println("RoundHole does not fit RoundPeg");
		//Note: You can't make RoundHole instance "fit" with SquarePeg instance
		//Therefore, we need to use Adapter for solving the problem.
                SquarePeg sp = new SquarePeg(5);    
                SquarePegAdapter spa = new SquarePegAdapter(sp);
                 RoundHole rh3 = new RoundHole(50);
		//TO-DO: Create 2 corresponding instances of SquarePegAdapter  
		 if(rh3.fits(spa)) System.out.println("Round Hole fits RoundPegAdapter");
		//TO-DO: If the RoundHole instance can "fits" with "small" RoundPegAdapter instance 
		//show a suitable message
	 
		//TO-DO: If the RoundHole instance can not "fits" with "big" RoundPegAdapter instance 
		//show a suitable message
                SquarePeg sp2 = new SquarePeg(10);    
                SquarePegAdapter spa2 = new SquarePegAdapter(sp2);
                 RoundHole rh4 = new RoundHole(10);
		//TO-DO: Create 2 corresponding instances of SquarePegAdapter  
		 if(!rh4.fits(spa2)) System.out.println("Round Hole does not fit RoundPegAdapter");
	}
}