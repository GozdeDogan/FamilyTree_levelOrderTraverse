/**
 * Created by GozdeDogan on 19.04.2017.
 */
public class q3_hw6_131044019 {
    public static void main(String[] args){
        String file = new String("test.txt");
        FamilyTree<String> family = new FamilyTree<String>();
        family.fill(file);
        System.out.println("Family Tree:");
        System.out.println(family.toString());
    }
}
