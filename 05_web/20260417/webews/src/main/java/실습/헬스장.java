package 실습;

import java.sql.Date;

public class 헬스장 {

    private String workout_id;
    private String member_id;
    private String trainer_id;
    private String exercise_id;
    private int sets;
    private int reps;
    private int weight;
    private Date exercise_date;

    public 헬스장() {}

    public 헬스장(String workout_id, String member_id, String trainer_id,
                 String exercise_id, int sets, int reps, int weight, Date exercise_date) {
        this.workout_id = workout_id;
        this.member_id = member_id;
        this.trainer_id = trainer_id;
        this.exercise_id = exercise_id;
        this.sets = sets;
        this.reps = reps;
        this.weight = weight;
        this.exercise_date = exercise_date;
    }

    public String getWorkout_id() { return workout_id; }
    public void setWorkout_id(String workout_id) { this.workout_id = workout_id; }

    public String getMember_id() { return member_id; }
    public void setMember_id(String member_id) { this.member_id = member_id; }

    public String getTrainer_id() { return trainer_id; }
    public void setTrainer_id(String trainer_id) { this.trainer_id = trainer_id; }

    public String getExercise_id() { return exercise_id; }
    public void setExercise_id(String exercise_id) { this.exercise_id = exercise_id; }

    public int getSets() { return sets; }
    public void setSets(int sets) { this.sets = sets; }

    public int getReps() { return reps; }
    public void setReps(int reps) { this.reps = reps; }

    public int getWeight() { return weight; }
    public void setWeight(int weight) { this.weight = weight; }

    public Date getExercise_date() { return exercise_date; }
    public void setExercise_date(Date exercise_date) { this.exercise_date = exercise_date; }

    @Override
    public String toString() {
        return "헬스장 [workout_id=" + workout_id + ", member_id=" + member_id +
                ", trainer_id=" + trainer_id + ", exercise_id=" + exercise_id +
                ", sets=" + sets + ", reps=" + reps + ", weight=" + weight +
                ", exercise_date=" + exercise_date + "]";
    }
}