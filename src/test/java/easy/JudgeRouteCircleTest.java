package easy;

import static org.junit.Assert.*;
import org.junit.Test;

public class JudgeRouteCircleTest {

  @Test
  public void test() {
    JudgeRouteCircle jrc = new JudgeRouteCircle();
    assertTrue(jrc.judgeCircle("UD"));
  }

}
