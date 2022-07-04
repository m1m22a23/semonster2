package semonster2;

public class Monster {
  public String Name;
  public int Rare;

  Monster(int nameNum, int RareNum) {
    this.Name = "Monster" + nameNum;
    this.Rare = RareNum;
  }

  String summonMonster(int mNumber) {
    String monsters[] = {"スライム","ゴーレム","ドラゴンボール",""};
  }

  @Override
  public String toString() {
    return this.Name + ":レア度[" + this.Rare + "]¥n";
  }
}
