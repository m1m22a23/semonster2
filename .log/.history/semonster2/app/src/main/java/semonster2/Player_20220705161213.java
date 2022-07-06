package semonster2;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class Player {
  public List<Monster> monsters;
  public String name;
  LinkedList<Integer> randomNumberList;// randomな0~4の数値を必要な数保存しておく

  Player(String name) {
    this.name = name;
    this.monsters = new ArrayList<>();
    this.monsters.add(new Monster(0, 0));
  }

  @Override
  public String toString() {
    return this.monsters.get(0).toString();
  }
}
