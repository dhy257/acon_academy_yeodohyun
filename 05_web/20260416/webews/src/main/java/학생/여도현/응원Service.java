package 학생.여도현;
public class 응원Service {

    private String[] msg = {
            "화이팅1",
            "화이팅2",
            "화이팅3",
            "화이팅4",
            "화이팅5"
    };

    private String[] imgs = {
            "/0415/imgs/cute.jpg",
            "/0415/imgs/cute2.png",
            "/0415/imgs/cute3.jpg"
    };

    // 랜덤 메시지
    public String get랜덤메시지() {
        int idx = (int)(Math.random() * msg.length);
        return msg[idx];
    }

    // 랜덤 이미지
    public String get랜덤이미지() {
        int idx = (int)(Math.random() * imgs.length);
        return imgs[idx];
    }
}
