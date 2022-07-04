package semonster2;

import java.util.List;

public class Player {
  public List<Monster> monsters;
  public String name;

  Player(String name) {
    this.name = name;
    this.monsters.add(new Monster(0, 0));
  }

  @Override
  public String toString() {
    return this.Name + ":レア度[" + this.Rare + "]¥n";
  }
}
