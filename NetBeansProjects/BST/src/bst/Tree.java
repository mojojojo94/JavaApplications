
package bst;



public interface Tree<D extends Comparable> {
    
    public boolean isEmpty();
    public int cardinality();
    public boolean memeber(D element);
    public nonEmptyBST<D> add(D element);
}
