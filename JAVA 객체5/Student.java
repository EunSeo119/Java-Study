public class Student {

    public String name;
    private int score;

    public Student(String n, int s){
        this.name = n;
        this.score = s;
    }

    public void getInfo(){
        System.out.println("-- getInfo --");
        System.out.println("name : "+name);
        System.out.println("score : "+score);
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
        /*
        if(score>50){   //50점이 넘을 때만 바꿔 주게 제약을 걸 수 도 있다!
            this.score = score;
        }
        */
    }
}
