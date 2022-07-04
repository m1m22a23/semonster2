package semonster2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PlayerTest {
  @Test
  public void appHasAGreeting() {
    Player player = new Player(0, 0);
    assertEquals("スライム:レア度[0]¥n", monster.toString());
  }
}
