public class LimparTela{

public static void limparConsole() {
    try {
        if (System.getProperty("os.name").contains("Windows")) {
            // Executa o comando cls do Windows
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } else {
            // Executa o comando clear do Linux/Unix
            new ProcessBuilder("clear").inheritIO().start().waitFor();
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
}

}