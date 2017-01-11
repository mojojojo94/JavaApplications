
package bst;

/**
 * @author sheheryar
 */

class nonEmptyBST<D extends Comparable> implements Tree<D> {
    
    D data;
    Tree<D> left;
    Tree<D> right;
    
    public nonEmptyBST(D element){
        
        data = element;
        left = new emptyBST<D>();
        right = new emptyBST<D>();
    }
    
    public nonEmptyBST(D element, Tree<D> leftTree, Tree<D> rightTree){
        
        data = element;
        left = leftTree;
        right = rightTree;
    }
    
    public boolean isEmpty(){
        return false;
    }
    
    public int cardinality(){
        return 1 + left.cardinality() + right.cardinality();
    }
    
    public boolean memeber(D element){
        //data is root
        if (data == element){
            return true;
        }
        else{
            if (element.compareTo(data) < 0){
                return left.memeber(element);
            }
            else{
                return right.memeber(element);
            }
        }
    }
    
    public nonEmptyBST<D> add(D element){
        
        if(data == element){
            return this;
        }
        else{
            if (element.compareTo(data) < 0){
                return new nonEmptyBST(data, left.add(element), right);
            }
            else{
                return new nonEmptyBST(data, left, right.add(element));
            }
        }
    }

}
