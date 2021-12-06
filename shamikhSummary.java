
// Search in a Binary Search Tree
public TreeNode searchBST(TreeNode root, int val) {
if(root==null)return null;
        if(root.val==val)return root;
        if(root.val>val){
         return   searchBST(root.left,val);
        }else{
           return    searchBST(root.right,val);
        }
}





// Leaf-Similar Trees
public boolean leafSimilar(TreeNode root1, TreeNode root2) {
List<Integer> l1=new ArrayList<>();
List<Integer> l2=new ArrayList<>();
        helper(l1,root1);
        helper(l2,root2);
        return l1.equals(l2);
    }
    public List<Integer> helper(List<Integer> l,TreeNode root){
        if (root==null)return l;
        if(root.left==null && root.right==null){
            l.add(root.val);
        }
        helper(l,root.left);
        helper(l,root.right);
        return l;
    }





// Invert Binary Tree
public TreeNode temp;
    public TreeNode invertTree(TreeNode root) {
if (root==null)return null;
        temp=root.left;
        root.left=root.right;
        root.right=temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }






// Binary Tree Paths
public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if(root == null)
            return result;
        String path = "";
        Function(path,result,root);
        return result;
    }
  public void Function(String path, List<String> result, TreeNode root)
    {
   if(root.left==null&& root.right==null){
       result.add(path+root.val);
   }
      if(root.left!=null){
        Function(path+root.val+"->",result,root.left);
      }
      if(root.right!=null){
          Function(path+root.val+"->",result,root.right);
      }
    }






// Sum of Left Leaves
public int sumOfLeftLeaves(TreeNode root) {
   if (root==null){
       return 0;
   }
        if(root.left==null && root.right==null){
            return 0;
        }
        if(root.left!=null && root.left.left ==null && root.left.right==null){
            return root.left.val+sumOfLeftLeaves(root.right);
        }else{
            return sumOfLeftLeaves(root.left)+sumOfLeftLeaves(root.right);
        }
    }





 // Same Tree
public boolean isSameTree(TreeNode p, TreeNode q) {
if(p==null &&q==null)return true;
        if(p==null||q==null)return q==p;
        if(p.val!=q.val){return false;}else{
            return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
        }
    }





// Symmetric Tree
public boolean isSymmetric(TreeNode root) {
        if(root==null)return true;
        return helper(root.left,root.right);
    }
public boolean helper(TreeNode left,TreeNode right){
    if(left==null && right==null){
        return true;
    }
    if(left==null||right==null)return left==right;
    if(left.val!=right.val){
        return false;
    }else{
        return helper(left.left,right.right)&& helper(left.right,right.left);
    }
}





// Maximum Depth of Binary Tree
public int maxDepth(TreeNode root) {
if(root==null)return 0;
        int left=maxDepth(root.left);
        int right=maxDepth(root.right);
        return Math.max(left,right)+1;
    }





// Minimum Depth of Binary Tree
public int minDepth(TreeNode root) {
      if(root==null)return 0;
        int left=minDepth(root.left);
        int right=minDepth(root.right);
        return (left==0 || right==0)? right+left+1 :Math.min(left,right)+1;
    }






// Path Sum
public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root== null)return false;
        targetSum-=root.val;
        if (root.left==null && root.right==null){
            return 0==targetSum;
        }
        return hasPathSum(root.left,targetSum) || hasPathSum(root.right,targetSum) ;
    }






// Sum Root to Leaf Numbers
public int result;
    public int sumNumbers(TreeNode root) {
     if (root==null){
         return 0;
     }
        result=0;
        findSum(root,0);
        return result;
    }
    public void findSum(TreeNode root,int value){
        int cur=10*value+root.val;
        if(root.left==null && root.right==null){
            result+=cur;
        }
        if(root.left!= null){
            findSum(root.left,cur);
        }
        if(root.right!= null){
            findSum(root.right,cur);
        }
         return ;
    }







// Find Largest Value breadthFirst 
public List<Integer> largestValues(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        if (root == null) return list;
        q.add(root);
        while (!q.isEmpty()) {
            int max = Integer.MIN_VALUE;
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode cur = q.poll();
                max = Math.max(max, cur.val);
                if (cur.left != null) q.add(cur.left);
                if (cur.right != null) q.add(cur.right);
            }
            list.add(max);
        }
        return list;
    }










// Second Minimum Node In a Binary Tree
public int findSecondMinimumValue(TreeNode root) {
        if(root==null)return -1;
        if(root.left==null&& root.right==null){
            return -1;
        }
        int left=root.left.val;
        int right=root.right.val;
        if(left==root.val){
            left=findSecondMinimumValue(root.left);
        }
        if(right==root.val){
            right=findSecondMinimumValue(root.right);
        }
        if(left!=-1&&right!=-1){
            return Math.min(left,right);
        }
        if(left!=-1){
            return left;
        }else{
            return right;
        }
    }







  //preOrder
  public List<Integer> preOrder(Node node) {
      List<Integer> list = new ArrayList<>();
      if (node != null) {
          list.add((Integer) node.value);
          if (node.left != null)
              list.addAll(preOrder(node.left));
          if (node.right != null)
              list.addAll(preOrder(node.right));
      }
      return list;
  }



  //inOrder 
  public List<Integer> inOrder(Node node) {
      List<Integer> list = new ArrayList<>();
      if (node != null) {
          if (node.left != null)
              list.addAll(preOrder(node.left));
          list.add((Integer) node.value);
          if (node.right != null)
              list.addAll(preOrder(node.right));
      }
      return list;
  }


  //post
  public List<Integer> postOrder(Node node) {
      List<Integer> list = new ArrayList<>();
      if (node != null) {
          if (node.left != null)
              list.addAll(preOrder(node.left));
          if (node.right != null)
              list.addAll(preOrder(node.right));
          list.add((Integer) node.value);
      }
      return list;
  }

  private int findMax(Node node)
  {
      if (node == null) {
          return 0;
      }
      int res = (int) node.value;
      int lres = findMax(node.left);
      int rres = findMax(node.right);
      if (lres > res)
          res = lres;
      if (rres > res)
          res = rres;
      return res;
  }



  public static  Queue<Integer> breadthFirst(BinaryTree tree) {
      Queue<Node> queue = new LinkedList<>() ;
      Queue<Integer> list = new LinkedList<>() ;
      if (tree.root == null)
          return null;
      queue.clear();
      queue.add(tree.root);
      list.add((Integer) tree.root.value);
      while(!queue.isEmpty()){
          Node node = queue.remove();

          if(node.left != null){
              queue.add(node.left);
              list.add((Integer) node.left.value);
          }
          if(node.right != null) {
              queue.add(node.right);
              list.add((Integer) node.right.value);
          }
      }
      return list;
  }







 //Add ToBinarySearchTree
    private Node addToTree(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }
        if ( value < (int)current.value ) {
            current.left = addToTree(current.left, value);
        } else if (value > (int) current.value) {
            current.right = addToTree(current.right, value);
        } else {
            return current;
        }
        return current;
    }





    // Insert TO BinarySearchTree
    public void insert(int value) {
        root = addToTree(root, value);
    }
    private boolean containsNode(Node current, int value) {
        if (current == null) {
            return false;
        }
        if (value ==(int) current.value) {
            return true;
        }
        return value <(int) current.value
                ? containsNode(current.left, value)
                : containsNode(current.right, value);
    }
    public boolean contain(int value) {
        return containsNode(root, value);
    }






     // find sec minimum in BinaryTree 
    static int min1;
    static int min2;
    public static int findSecond(BinaryTree tree){
      min1 = (int) tree.getRoot().getValue();
      min2 = (int) tree.getRoot().getValue();
        dfs(tree.getRoot());
        return min2;
    public static void dfs(Node root) {
        if (root != null) {
            if (min1 > (int) root.getValue()) {
                min1 = (int) root.getValue();
            }
            dfs(root.getLeft());
            if(min2 > (int) root.getValue() && (int) root.getValue() >min1 ) {
                min2 = (int) root.getValue();
            }
            dfs(root.getRight());
            if(min2 > (int) root.getValue() && (int) root.getValue() >min1 ) {
                min2 = (int) root.getValue();
            }
        }
    }







//  Given the root of a binary tree, return an array of the largest value in each row of the tree
class Solution {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> ans = new ArrayList<Integer>();
        if(root == null) return ans;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        int max = Integer.MIN_VALUE;
        while(!queue.isEmpty()){
            int size = queue.size();
            max = Integer.MIN_VALUE;
            for(int i = 0; i < size; i++){
                TreeNode cur = queue.poll();
                max = Math.max(max, cur.val);
                if(cur.left != null) queue.add(cur.left);
                if(cur.right != null) queue.add(cur.right);
            }
            ans.add(max);
        }
        return ans;
    }
}