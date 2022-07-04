package semonster2;

import org.junit.Test;

public class MonsterTest {
  @Test
  public void appHasAGreeting() {
    var monster = new Monster(0,0);
    assertEquals("こんにちは SEMonster", classUnderTest.getGreeting());
  }
}
