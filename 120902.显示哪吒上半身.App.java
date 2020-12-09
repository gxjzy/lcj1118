import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class App {
    JPanel myPanel=new JPanel();
//    创建list方法
    List<JLabel> label_list=new ArrayList<>();
//    创建二维数组
    int array2d[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9},
            {10,11,0}
    };
    //赋值变量cnt为0
    int cnt=0;
    //赋值变量cell为128
    int cell=128;
    //构造方法
    public App() {
        for (int i = 0; i <=11; i++) {
            label_list.add(new JLabel());
            java.net.URL imgURL = App.class.getResource("img/nezha_"+String.valueOf(i)+".png");
            label_list.get(i).setIcon(new ImageIcon(imgURL));
        }
//          双重for循环，可以设置x，y坐标，还可以添加mypanel元素。
        for (int row = 0; row < array2d.length; row++) {
            for (int column = 0; column < array2d[0].length; column++) {
                label_list.get(cnt).setBounds(column*cell,row*cell,cell,cell);
                myPanel.add(label_list.get(cnt));
                cnt++;
            }
        }



    }
    //显示窗体方法
    void go(){
        myPanel.setLayout(null);
        JFrame frame = new JFrame("哪吒");
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,384,512);
        //frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new App().go();
    }
}
