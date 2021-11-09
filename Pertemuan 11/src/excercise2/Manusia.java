package excercise2;
public class Manusia {
    public void nyalakanPerangkat(Elektronik pkt){
        String info1="Nyalakan televisi ";
        String info2=" dengan Input: ";
        String info3="\nVoltase televisi: ";
        if(pkt instanceof TelevisiJadul){
            info1+="jadul";
            info2+=((TelevisiJadul)pkt).getModelInput();
            info3+=((TelevisiJadul)pkt).getVoltase();
        }else if(pkt instanceof TelevisiModern){
            info1+="modern";
            info2+=((TelevisiModern)pkt).getModelInput();
            info3+=((TelevisiModern)pkt).getVoltase();
        }
        System.out.println(info1+info2+info3);
    }
}
