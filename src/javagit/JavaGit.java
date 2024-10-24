package javagit;


public class JavaGit {


    public static void main(String[] args) {
        /* 10 fok alatt van hideg 
        ha hideg van, akkor
         viszek kabátot
        egyébként
         nem viszek kabátot
        */
        final int hideg_hatar = 10;
        int homerseklet = 9;
        boolean hideg = homerseklet < hideg_hatar;
        String viszek = "viszek kabátot";
        String nemViszek = "Nem viszek kabátot";
        /* ternális operátor */
        String eredmeny = hideg ? viszek : nemViszek;
        
        System.out.println(eredmeny);
    }
    
}
