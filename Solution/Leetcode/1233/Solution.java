class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);
        List<String> result= new ArrayList<>();
        result.add(folder[0]);

        for(int i=1;i<folder.length;i++){
            String input= result.get(result.size()-1);
            input= input+'/';   

            if(!folder[i].startsWith(input)){
                result.add(folder[i]);
            }
        
        }
        return result;
    
    
    }
        
}
