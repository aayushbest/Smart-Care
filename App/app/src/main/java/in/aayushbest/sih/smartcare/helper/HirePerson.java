package in.aayushbest.sih.smartcare.helper;


public class HirePerson {
    private String mPersonName;
    private int mPersonImage;

    public HirePerson(){
    }
    public HirePerson(String personName,int personImage){
        setPersonName(personName);
        setPersonImage(personImage);
    }

    public String getPersonName() {
        return mPersonName;
    }

    public void setPersonName(String personName) {
        mPersonName = personName;
    }

    public int getPersonImage() {
        return mPersonImage;
    }

    public void setPersonImage(int personImage) {
        mPersonImage = personImage;
    }

}
