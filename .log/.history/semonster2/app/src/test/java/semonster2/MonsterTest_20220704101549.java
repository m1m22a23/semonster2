package semonster2;

import org.junit.Test;

public class MonsterTest {
  @Test
  public void appHasAGreeting() {
    Monster monster = new Monster(0,0);
    assertEquals("スライム:レア度[0]", monster.toString());
  }
}
