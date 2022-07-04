package semonster2;

import org.junit.Test;

public class MonsterTest {
  @Test
  public void appHasAGreeting() {
    App classUnderTest = new App();
    assertEquals("こんにちは SEMonster", classUnderTest.getGreeting());
  }
}
