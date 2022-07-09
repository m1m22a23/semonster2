package semonster2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MonsterTest {
  // @Test
  // public void appHasAGreeting() {
  // Monster monster = new Monster(0, 0);
  // assertEquals("スライム:レア度[0]¥n", monster.toString());
  // }

  @Test
  public void appHasAGreeting() {
    Monster monster = new Monster(0, 0);
    assertEquals("スライム:レア度[0]¥n", monster.toString());
  }
}
