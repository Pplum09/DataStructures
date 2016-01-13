package UndirectedGraphs;
import java.util.List;
import java.util.ArrayList;

public class Node {

		private int value;
		private List connected;

		// default constructor
		public Node() {
			connected = new ArrayList();
		}
		
		// standard constructor
		public Node(int value) {
			this.value = value;
			connected = new ArrayList();
		}
		
		public void connect(Node node) {
			connected.add(node);
		}
}
