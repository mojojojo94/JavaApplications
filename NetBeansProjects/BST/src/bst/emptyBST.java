
package bst;

/**
 * @author sheheryar
 */

public class emptyBST<D extends Comparable> implements Tree<D> {

    public emptyBST(){
        
    }
    
    public boolean isEmpty(){
        return true;
    }
    
    public int cardinality(){
        return 0;
    }
    
    public boolean member(D element){
        return false;
    }
    
    public nonEmptyBST<D> add(D element){
        return new nonEmptyBST<D>(element);
    }

    @Override
    public boolean memeber(D element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
