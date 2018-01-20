package easy;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class JudgeRouteCircleTest {
  JudgeRouteCircle jrc;
  
  @Before
  public void setUp() throws Exception {
    jrc = new JudgeRouteCircle();
  }
  
  @Test
  public void testOriginalPlace() {
    assertTrue(jrc.judgeCircle("UD"));
    assertTrue(jrc.judgeCircle("LR"));
    assertTrue(jrc.judgeCircle("URLD"));
    assertTrue(jrc.judgeCircle("ULRD"));
  }
  
  @Test
  public void testNotOriginalPlace() {
    assertFalse(jrc.judgeCircle("UDD"));
    assertFalse(jrc.judgeCircle("ULL"));
    assertFalse(jrc.judgeCircle("ULDRR"));
  }

}
