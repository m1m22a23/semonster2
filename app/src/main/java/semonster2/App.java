/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package semonster2;

public class App {
    public String getGreeting() {
        return "こんにちは SEMonster";
  static String getPlayerName(Scanner scanner) {
    return scanner.next();
  }
  static LinkedList<Integer> getRandomList(int count) {
    LinkedList<Integer> randNumList = new LinkedList<>();
    for (int i = 0; i < count; i++) {
      randNumList.add(random.nextInt(maxRandomNumber + 1));
    }

    return randNumList;
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}
