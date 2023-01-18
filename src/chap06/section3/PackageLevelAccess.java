package chap06.section3;

public class PackageLevelAccess {

    //PackageLevelFunction.packageLevelFunc();
    public static void main(String[] args) {
        PKLevel.packageLevelFunc(); // 변경된 이름으로 접근 가능
    }
}
