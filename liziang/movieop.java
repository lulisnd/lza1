package liziang;

public class movieop {
    private movie[] movies;
    public movieop(movie[] movies){
        this.movies = movies;
    }
    public void printmovies(){
        System.out.println("系统全部电影信息如下");
        for (int i = 0; i < movies.length; i++) {
            movie m = movies[i];
            System.out.println("编号:"+ m.getId());
            System.out.println("名称:"+ m.getName());
            System.out.println("价格:"+ m.getPrice());
            System.out.println("-----------------------");
        }
    }
    public void searchmovie(int id){
        for (int i = 0; i < movies.length; i++) {
            movie m = movies[i];
            if (m.getId() == id){
                System.out.println("电影详情如下");
                System.out.println("编号:"+ m.getId());
                System.out.println("名称:"+ m.getName());
                System.out.println("价格:"+ m.getPrice());
                System.out.println("得分:"+ m.getScore());
                System.out.println("演员:"+ m.getActor());
            }
        }
    }
}
