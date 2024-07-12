package lab2.qn1;

 class WithZoom extends WithOutZoom{

     private int zoomDeviceId;
     private int zoomAccountId;

     WithZoom(){
         super();
     }

     WithZoom(int id , int capacity , int floor){
         super(id,capacity,floor);
     }

     WithZoom(int id , int capacity , int floor , int zoomDeviceId , int zoomAccountId){
        super(id,capacity,floor);
        this.zoomAccountId = zoomAccountId;
        this.zoomDeviceId = zoomDeviceId;

    }


     public void setZoomAccountId(int zoomAccountId) {
         this.zoomAccountId = zoomAccountId;
     }

     public void setZoomDeviceId(int zoomDeviceId) {
         this.zoomDeviceId = zoomDeviceId;
     }

     public int getZoomAccountId() {
         return zoomAccountId;
     }

     public int getZoomDeviceId() {
         return zoomDeviceId;

     }


 }
