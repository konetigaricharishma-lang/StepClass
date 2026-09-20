public class S5Q2 {
     static  String findDuplicateTeam(String[] teamNames){
        for(int i=0;i<teamNames.length;i++){
            for(int j=1+1;j<teamNames.length;j++){
                if(teamNames[i]==teamNames[j]){
                    return "Duplicate Found: " + teamNames[i];
                }
            }
        }
        return "No Duplicate Found";
     }
    public static void main(String[] args){
        String[] teamNames1={"ByteForce", "CodeCrafters", "ByteForce"};
        String[] teamNames2={"ByteForce", "CodeCrafters", "NullPointers"};
        System.out.println(findDuplicateTeam(teamNames1));
        System.out.println(findDuplicateTeam(teamNames2));

    }
    
}
