package semonster2;

import java.util.ArrayList;
import java.util.List;

public class Player {
  public List<Monster> monsters;
  public String name;

  Player(String name) {
    this.name = name;
    this.monsters = new ArrayList<>();
    for (i = 0; i <= 3;i++){
      this.monsters.add(new Monster(0, 0));
    }
  }

  @Override
  public String toString() {
    return this.monsters.get(0).toString();
  }
}
