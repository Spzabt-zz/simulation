package renderer;

import map.Map;

import java.io.IOException;

public class RendererImpl implements Renderer {
    @Override
    public void render(Map map) {
        clearScreen(map);

        for (int i = 0; i < map.getField().length; i++) {
            for (int j = 0; j < map.getField()[i].length; j++) {
                System.out.print(map.getField()[i][j] + '\t');
            }
            System.out.println();
        }
    }

    public static void clearScreen(Map map) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
//        try {
//            if (System.getProperty("os.name").contains("Windows")) {
//                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
//            } else {
//                new ProcessBuilder("clear").inheritIO().start().waitFor();
//            }
//        } catch (IOException | InterruptedException e) {
//            e.printStackTrace();
//        }
    }
}
