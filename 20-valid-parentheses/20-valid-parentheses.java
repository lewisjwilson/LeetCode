class Solution {
    public boolean isValid(String s) {
        // Creating list for when brackets are appended
        List<String> brackets = new ArrayList<>();
        
        String first = s.substring(0,1);
        String last = s.substring(s.length() - 1);
                
        if(last.equals("(") || last.equals("[") || last.equals("{") ||
          first.equals(")") || first.equals("]") || first.equals("}")){return false;}
        
        for(int c = 0; c<s.length() ; c++){
            String bracket = s.substring(c, c+1);
            if(bracket.equals("(")){brackets.add(")");} 
            if(bracket.equals("[")){brackets.add("]");} 
            if(bracket.equals("{")){brackets.add("}");}
                  
            if(bracket.equals(")") ||  bracket.equals("]") || bracket.equals("}")){
                if((bracket.equals(")") && !brackets.contains(")")) ||
                  (bracket.equals("]") && !brackets.contains("]")) ||
                  (bracket.equals("}") && !brackets.contains("}"))){return false;}

                if(brackets.size() > 0){
                   if(!bracket.equals(brackets.get(brackets.size()-1))){
                    return false;
                   }
                   brackets.remove(brackets.size()-1);
                }
                
            }
        }
        
        if(brackets.size()>0){return false;}
        
        return true;
    }
}