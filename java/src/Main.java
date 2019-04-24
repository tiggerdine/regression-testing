
public class Main {

	public static void main(String[] args) {
		GeneticAlgorithm g = new GeneticAlgorithm();
		Chromosome winner = g.run();
		System.out.println("winner " + winner.getFitness());

		// Chromosome c = new Chromosome();
		// System.out.println(c.getFitness());

		// Chromosome c = new Chromosome(new String[] { "t215", "t150", "t175",
		// "t147", "t20", "t4" });
		// System.out.println(c.getFitness());

		// int[] ints = FaultMatrix.FAULT_MATRIX[150];
		// for (int i : ints) {
		// System.out.println(i);
		// }

		// GeneticAlgorithm g = new GeneticAlgorithm();
		// Chromosome c = g.selectChromosome();

		// Chromosome c = new Chromosome();
		//
		// c.printTuple();
		// Chromosome c2 = new Chromosome();
		// double fitnessBefore = c.getFitness() + c2.getFitness();
		// c2.printTuple();
		// Chromosome[] cs = c.crossover(c2);
		// double FitnessAfter = cs[0].getFitness() + cs[1].getFitness();
		// cs[0].printTuple();
		// cs[1].printTuple();

		/*
		 * Experiment to determine the maximum fitness.
		 */
		// Chromosome fittestC;
		// double fittestF = 0;
		// while (true) {
		// Chromosome c = new Chromosome();
		// if (c.getFitness() > fittestF) {
		// fittestC = c;
		// fittestF = c.getFitness();
		// fittestC.printTuple();
		// System.out.println("f = " + fittestF);
		// }
		// }
	}

}