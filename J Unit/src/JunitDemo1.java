import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class JunitDemo1 {
@Test
	public void disp() {
	System.out.println("This is disp method");
}


@ParameterizedTest
@ValueSource(strings={"Sakshi","Roshni","Nitika","Sneha"}) \

void display(String word) {
	System.out.println(word);
}

@ParameterizedTest
@ValueSource(ints= {100,200,300,400})
void display(int   word) {
	System.out.println(word);
}


}
