public class SearchStringEmp {
    public static void main(String[] args) {
        String strOrig = "Google Runoob Taobao";
        int intIndex = strOrig.indexOf("Runoob");
        if(intIndex == -1) {
            System.out.println("没有找到Runoob");
        } else {
            System.out.println("位置是:" + intIndex);
        }
    }
}
