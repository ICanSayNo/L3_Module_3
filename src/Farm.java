import java.util.ArrayList;
import java.util.Iterator;

import abstract_classes.cities.City;

public class Farm {
public static void main(String[] args) {
	ArrayList<Animal> aminals = new ArrayList<Animal>();
	Animal pig = new Pig(12);
	Animal sheep = new Sheep(26);
	Animal snake = new Snake(3);
	Animal otherPig = new Pig(23);
	Animal bingo = new Dog(15);
	Animal pinkShep = new Sheep(14);
	
	aminals.add(pig);
	aminals.add(sheep);
	aminals.add(snake);
	aminals.add(otherPig);
	aminals.add(bingo);
	aminals.add(pinkShep);
	
	for (Animal a:aminals) {
		a.makeNoise();
	}
	
}
}
