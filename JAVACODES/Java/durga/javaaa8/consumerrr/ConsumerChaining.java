package Java.durga.javaaa8.consumerrr;

import java.util.function.Consumer;

class Movie{
	String name;
	Movie(String name){
		this.name=name;
	}
}

class ConsumerChaining {

	public static void main(String[] args) {
		
		Consumer<Movie> c1 = m -> System.out.println(m.name+": Ready to relese");;
		Consumer<Movie> c2 = m -> System.out.println(m.name+": Release but it is bigger flop");;
		Consumer<Movie> c3 = m -> System.out.println(m.name+": Storing info is data");
		Consumer<Movie> cc = c1.andThen(c2).andThen(c3);
		Movie m = new Movie("Spider");
		cc.accept(m);
		
	}

}
