import org.assertj.core.api.Assertions;
import org.junit.Test;

public class AnitaTest {


    @Test
    public void AnitaSePuedeInstansear(){
        Anita her = new Anita(47);
        Assertions.assertThat(her).isNotNull();
    }
    @Test
    public void LeanSePuedeInstansear(){
        Lean her = new Lean(47);
        Assertions.assertThat(her).isNotNull();
    }
}
