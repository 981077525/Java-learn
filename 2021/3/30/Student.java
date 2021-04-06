public class Student implements Comparable<Student>{
    String name;
    int height;
    String gender;
    int score;



    @Override
    public int compareTo(Student o) {
        int thisGender;
        int oGender;
        if(this.gender.equals("男")){
            thisGender = 1;
        }else{
            thisGender = 0;
        }

        if(o.gender.equals("男")){
            oGender = 1;
        }else{
            oGender = 0;
        }

        // 先按照性别进行判断
        if(thisGender < oGender){
            return 1;
        }else if(thisGender > oGender) {
            return -1;
        }else{
            // 再按照身高判断
            if(this.height > o.height){
                return 1;
            }else if(this.height < o.height){
                return -1;
            }else{
                return this.score - o.score;
            }

        }
    }
}
