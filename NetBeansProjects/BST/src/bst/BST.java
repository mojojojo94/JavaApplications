
package bst;



public class BST {

    
    
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        emptyBST e = new emptyBST();
        nonEmptyBST n = new nonEmptyBST(5);
        UnitTests.checkIsEmpty(e);
        UnitTests.checkIsEmpty(n);
        
        
    }

}
