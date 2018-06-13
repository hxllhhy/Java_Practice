package MultiThreadDownCode;

import MultiThreadDownCode.DownUtil;

public class MultiThreadDown {
    public static void main(String[] args) throws Exception {
        final DownUtil downUtil = new DownUtil(
                "https://b-ssl.duitang.com/uploads/item/201501/12/20150112205737_RnUVu.png",
                "cat.png",2);
        downUtil.download();
        new Thread(()-> {
                while(downUtil.getCompleteRate() < 1) {
                    System.out.println("已完成：" + downUtil.getCompleteRate());
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {}
        }
    }).start();

    }
}
