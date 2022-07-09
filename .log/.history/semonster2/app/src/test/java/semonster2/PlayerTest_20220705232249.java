package semonster2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PlayerTest {
  // @Test
  // public void testPlayer() {
  //   Player player = new Player("りかさん");
  //   assertEquals("スライム:レア度[0]¥n", player.toString());
  // }

  @Test
  public void testPlayer2() {
    Player player = new Player("りかさん");
    assertEquals("Deck:user
デュラハン:レア度[0]
ドラゴン:レア度[4]
デュラハン:レア度[0]
デュラハン:レア度[3]
スライム:レア度[1]¥n", player.toString());
  }
}
