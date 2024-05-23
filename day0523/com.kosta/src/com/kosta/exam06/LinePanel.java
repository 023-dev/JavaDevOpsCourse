package com.kosta.exam06;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
//Pannel은 복잡한 화면구성을 위한 서브 컨테이너 역할ㅇ이나
//그래픽을 표현하기 위하여 사용하는 화면 구성요소 입니다.
//GraphicInfo아래의 ㅇ라인파넨ㄹ은 그래픽을 표현하기 위하여 파넬의 클래슬초 부터 상속 받고
//마우스 움직임에 대한 이벤트 처리를 위하여 MouseLIstener 인터페이스를 구현하도록 합니다.
public class LinePanel extends Panel implements MouseListener{
    //선을 그리면 이전에 그려진 선은 사라집니다.
    //그려진 모든 선을 그리려면
    // 선을 그릴때마다 리스트에 담아두고 페인트 메소드에서 리스트에 담긴 요소만큼 모두 다시 그려주도록 해야합니다.

    private int x1, y1, x2, y2;
    //현재의 그래픽의 시작점과 끝점을 저장하기 위한 멤버변수를 선언
    ArrayList<GraphicInfo> graphicInfos = new ArrayList<GraphicInfo>();
    //화면에 그려진 모든 그래픽 선을 담기 위하여 리스트를 선언해요
    // 리스트에는 그래픽의 정보를 표현하기 위한 그래픽인포만 담도록 한정합니다.

    public LinePanel() {//라인 패널의 생성자이면 객체 생성시에 자동 동작합니다.
        System.out.println("e");
        addMouseListener(this);
        //현재 패널인 라인패널에 마우스 이벤트 처리 담당자가 자신임을 등록한다.
    }
//윈도프로그래밍엥서는 화면을 다시 그려줘야 할 필요가 있으면
//다음의 페인트 메소드가 자동ㅇ으로 동작합니다.
// 처음라인 패널을 생성하면 프레임에 담으면 이 페인트 메소드가 자동ㅇ으로 동작하고
// 또 프레임의 크기를 조절하면 그 속에 있는 패널의 크기도 변경되기 때문에
// 그떄도 페인트가 자동으로 동작합니다.
// 무언가 다시그려줘야 할 필요가 있을때에 페인트가 자동ㅇ으로 동작합니다.
// 그러나 원래 윈도는 모르는 사항에 대해서 다시 그려줄 것을 요청하려면
// 우리가 페인트를 직접 호출할 수는 없고 리페인트메소드를 호출하여 페인트를 요청할 수 있어요.

    @Override
    public void paint(Graphics g) {
        //super.paint(g);
        //사용자가 그려진 그래픽의 모든 정보는
        //리스트에 담겨 있기 때문에
        // 리스트에 담긴 요소만큼 반복 실행하여
        // 모든 그래픽 즉 선을 그려줍니다.
        for (GraphicInfo graphicInfo : graphicInfos) {
            g.drawLine(graphicInfo.getX1(), graphicInfo.getY1(), graphicInfo.getX2(), graphicInfo.getY2());
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        /*
        마우스가 눌려졌을때에 동작하는 메소드이며.
        눌러진 마우스의 위치정보를 매개변수 마우스이벤트의 e가 받아옵니다.
        이를 통해서 마우스가 눌러진 x,y를 그래픽(선)의 시작점인 x1, y1에
        저장합니다.
         */
        x1 = e.getX();
        y1 = e.getY();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        /*
        마우스를 뗴었을 때 동작하는 메소드이며
        그때의 x,y 를 그래픽(선)의 끝점을 위한 x2, y2에 저장하고,
         */
        x2 = e.getX();
        y2 = e.getY();
        //현재 그려진 그래픽(선)의 시작점 x1, y1 끝점 x2, y2를 갖고
        //그래픽 인포 객체를 생성하여 리스트에 담아요.
        graphicInfos.add(new GraphicInfo(x1,y1,x2,y2));
        //리스트에 담긴 그래픽의 정보만큼 다시 그려줄 것을 요청합니다.
        repaint();
    }


    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}
