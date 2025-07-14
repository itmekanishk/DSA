class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List <List<Integer>> result = new LinkedList<>();

        if(root==null){
            return result;
        }
        queue.offer(root);
        
        while(!queue.isEmpty()){
            int LevelNum=queue.size();
            List <Integer> sublist = new LinkedList<>();

            for(int i=0;i<LevelNum;i++){
                TreeNode current=queue.poll();
                sublist.add(current.val);

                if(current.left!=null){
                    queue.offer(current.left);
                }
                if(current.right !=null){
                    queue.offer(current.right);
                    
                }
            }
            result.add(sublist);
        }
        return result;
    } 
    
