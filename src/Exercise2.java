public class Exercise2 {
    public static void main(String[] args) {
        System.out.println(checkPropriety("0502132933"));
    }

    public static String checkPropriety(String phoneNumber) {
        String digits = "0123456789";
        String char1;
        String newPhoneNumber;
        if (phoneNumber.length()>13||phoneNumber.length()<10){
            newPhoneNumber="";
        }
        else {
            if (phoneNumber.length()==10){
                newPhoneNumber=phoneNumber.substring(0,2);
                if (!newPhoneNumber.equals("05")){
                    newPhoneNumber="";
                }
                else {
                    for (int i=0;i<phoneNumber.length();i++){
                        char1 = phoneNumber.charAt(i) + "";
                        if (!digits.contains(char1)){
                            newPhoneNumber="";
                            break;

                        }}
                    if (!newPhoneNumber.equals("")){
                        newPhoneNumber=phoneNumber.substring(0,3);
                        newPhoneNumber+='-'+phoneNumber.substring(3,10);
                    }

                } }else if (phoneNumber.length()==11) {
                newPhoneNumber=phoneNumber.substring(0,2);
                if (!newPhoneNumber.equals("05")){
                    newPhoneNumber="";
                }else {
                    char1 = phoneNumber.charAt(3) + "";
                    if (char1.equals("-")){
                        for (int i=2;i<phoneNumber.length();i++){
                            if (i==3){
                                continue;
                            }
                            char1=phoneNumber.charAt(i)+ "";
                            if (!digits.contains(char1)){
                                newPhoneNumber="";
                                break;
                            }
                        }
                        if (!newPhoneNumber.equals("")) {
                            newPhoneNumber=phoneNumber;
                        }

                    }
                    else {
                        newPhoneNumber="";
                    }

                }}
            else {
                newPhoneNumber=phoneNumber.substring(0,4);
                if (!newPhoneNumber.equals("9725")){
                    newPhoneNumber="";
                }
                else {
                    for (int i=4;i<phoneNumber.length();i++){
                        char1 = phoneNumber.charAt(i) + "";
                        if (!digits.contains(char1)){
                            newPhoneNumber="";
                            break;

                        }}
                    if (!newPhoneNumber.equals("")){
                        newPhoneNumber="05"+phoneNumber.charAt(4)+"-"+phoneNumber.substring(5);
                    }
                }

            }
        }


        return newPhoneNumber;
    }
}