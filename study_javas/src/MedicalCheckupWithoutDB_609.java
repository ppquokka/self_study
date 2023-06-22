/* refer: Excel_MedicalCheckup/MedicalCheckup_오상훈 */
import java.util.ArrayList;
import java.util.HashMap;

public class MedicalCheckupWithoutDB_609 {
    public static void main(String[] args) {
        try {
            /* error를 잡기 위해 generic technic을 넣어준다 <변수 형식>
             * HashMap으로 column별로 묶은 후, ArrayList로 row묶음을 만들어준다
             * 시작 시 ArrayList를 instance(초기)화 하여 컴퓨터 메모리에 버킷을 만든다*/
            ArrayList<HashMap> PI_List = new ArrayList<HashMap>();
            HashMap<String,String> PatientInformation = new HashMap<String,String>();
            PatientInformation.put("Name","이름");
            PatientInformation.put("Gender","성별");
            PatientInformation.put("Age","나이");
            PatientInformation.put("Height","키(cm), 체중(kg)");
            PatientInformation.put("BloodPressure","혈압(mmHg), 혈당(㎎/dL)");
            PatientInformation.put("Result","검진 결과");
            PatientInformation.put("Recheck","재검진 항목");
            PatientInformation.put("MaintenancePlan","유지 방안");
            PI_List.add(PatientInformation);     // row 1 완료

            /* 위에서 array 선언 했으므로 작성안해도 됨.
             * HashMap은 row별로 새로 생성해서 컴퓨터 메모리에 버킷을
             * 새로 만들어야, 위의 버킷에 값이 덮어쓰지않음.
             * (안하면 프린트했을때 같은 값만 나옴) 
             */
            PatientInformation = new HashMap<String,String>();
            PatientInformation.put("Name","홍길동");
            PatientInformation.put("Gender","남");
            PatientInformation.put("Age","30");
            PatientInformation.put("Height","175, 75");
            PatientInformation.put("BloodPressure","120/80, 90");
            PatientInformation.put("Result","비정상");
            PatientInformation.put("Recheck","폐암, 갑상선 질환");
            PatientInformation.put("MaintenancePlan"," ");
            PI_List.add(PatientInformation);     // row 2 완료

            PatientInformation = new HashMap<String,String>();
            PatientInformation.put("Name","김영희");
            PatientInformation.put("Gender","여");
            PatientInformation.put("Age","25");
            PatientInformation.put("Height","160, 55");
            PatientInformation.put("BloodPressure","110/70, 85");
            PatientInformation.put("Result","비정상");
            PatientInformation.put("Recheck","간암, 뇌졸증");
            PatientInformation.put("MaintenancePlan"," ");
            PI_List.add(PatientInformation);     // row 3 완료

            PatientInformation = new HashMap<String,String>();
            PatientInformation.put("Name","박철수");
            PatientInformation.put("Gender","남");
            PatientInformation.put("Age","45");
            PatientInformation.put("Height","180, 85");
            PatientInformation.put("BloodPressure","130/85, 100");
            PatientInformation.put("Result","정상");
            PatientInformation.put("Recheck","심장질환");
            PatientInformation.put("MaintenancePlan","식습관 개선, 운동 계획");
            PI_List.add(PatientInformation);     // row 4 완료

            PatientInformation = new HashMap<String,String>();
            PatientInformation.put("Name","이지은");
            PatientInformation.put("Gender","여");
            PatientInformation.put("Age","35");
            PatientInformation.put("Height","165, 60");
            PatientInformation.put("BloodPressure","115/75, 95");
            PatientInformation.put("Result","비정상");
            PatientInformation.put("Recheck","간암, 알츠하이머병");
            PatientInformation.put("MaintenancePlan"," ");
            PI_List.add(PatientInformation);     // row 5 완료

            PatientInformation = new HashMap<String,String>();
            PatientInformation.put("Name","최민호");
            PatientInformation.put("Gender","남");
            PatientInformation.put("Age","28");
            PatientInformation.put("Height","170,70");
            PatientInformation.put("BloodPressure","125/80, 92");
            PatientInformation.put("Result","정상");
            PatientInformation.put("Recheck","간암");
            PatientInformation.put("MaintenancePlan"," ");
            PI_List.add(PatientInformation);     // row 6 완료
     
            /*ArrayList로 묶여있음. 그 안의 HashMap은 class이기 때문에 펑션으로 가져온다
             * for(:)  찾아볼 것
             * ArrayList안의 묶음을 for문으로 돌려준다.
            */
            for(HashMap<String,String> Result:PI_List){
            System.out.println(Result.get("Name")+" | "+Result.get("Gender")+" | "+Result.get("Age")+" | "+Result.get("Height")+
            " | "+Result.get("BloodPressure")+" | "+Result.get("Result")+" | "+Result.get("Recheck")+" | "+Result.get("MaintenancePlan"));
            }
            System.out.println();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    
}
