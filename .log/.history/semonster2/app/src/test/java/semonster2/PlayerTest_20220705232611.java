package semonster2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PlayerTest {
  // @Test
  // public void testPlayer() {
  // Player player = new Player("りかさん");
  // assertEquals("スライム:レア度[0]¥n", player.toString());
  // }

  @Test
  public void testPlayer2() {
    Player player = new Player("りかさん");
    assertEquals("Deck:りかさん\nスライム:レア度[0]¥nスライム:レア度[0]¥nスライム:レア度[0]¥nスライム:レア度[0]¥n", player.toString());
  }
}
