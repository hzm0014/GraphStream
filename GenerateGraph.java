import org.graphstream.graph.*;
import org.graphstream.graph.implementations.*;

public class GenerateGraph extends Thread {
	public static void main(String args[]) {
		Graph graph = new SingleGraph("Graph");

    graph.setStrict(false);
    graph.setAutoCreate( true );
		graph.display();

    graph.addNode("A");
    for (int i = 1; i < 100; i++) {
      try {
        graph.addEdge(
          "A" + i,
          "A",
          i + ""
        );
        Thread.sleep(100);
      } catch (InterruptedException e) {
          e.printStackTrace();
      }
    }
  }
}
