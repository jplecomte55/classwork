/** A specialized node for use in huffman encoding
  *
  * <p> Nodes contain the value, priority, next, and the complete subtree.
  *     of this section of the huffman tree.
  * </p>
  *
  * @author Justin Ely
  * @version 0.0.1
  * @license BSD 3-clause
  */
public class QueueNode {
  public String value = null;
  public int priority = 0;
  public QueueNode next = null;
  public Tree tree = null;

  /**Default constructor
    */
  public QueueNode(){
  }

  /**Constructor with value and priority.
    *
    *<p>tree and next will be set to null </p>
    */
  public QueueNode(String value, Integer priority){
      this.value = value;
      this.priority = priority;
  }

  /**Full Constructor without parent
    *
    *<p>Parent defaults to null, other values are specified on call.
    *</p>
    *@param String value
    *@param Integer priority
    *@param Tree tree
    */
  public QueueNode(String value, Integer priority, Tree tree) {
    this.value = value;
    this.priority = priority;
    this.tree = tree;
  }

  /**Check if is the end of the queue
    *
    *<p> A node is the end of the queue if the next element is null</p>
    *@returns boolean true/false
    */
  public boolean isEnd() {
    if (this.next == null) {
      return true;
    }
    return false;
  }

}
