public class VinylHouse extends House {

	@Override
	public void prepFoundation() {
		System.out.println("Foundation: Adding a crawlspace, and a strong backbone.");
	}

	@Override
	public void createFrame() {
		System.out.println("Framing: Adding the vinyl walls.");
	}

	@Override
	public void installDrywall() {
		System.out.println("Drywall: Creating the interior walls.");
	}

	@Override
	public void addWindows() {
		System.out.println("Windows: Putting in the glass for the windows.");
	}

	@Override
	public void addElectrical() {
		System.out.println("Electrical: Running all the wires and hooking up the power.");
	}

	@Override
	public void addPlumbing() {
		System.out.println("Plumbing: Letting water run throug the house.");
	}
}
