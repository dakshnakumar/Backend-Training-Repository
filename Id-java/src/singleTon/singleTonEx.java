package singleTon;

class singleTonEx {

    private singleTonEx(){


    }

    static singleTonEx instance;

    static singleTonEx  getInstance(){
        if (instance == null){
            instance = new singleTonEx();
            return instance;
        }
        else
            return instance;
    }

}
