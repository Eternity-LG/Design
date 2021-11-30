package cn.com.agree.abs.design.media;

public class User {

   private int status;

   public int getStatus() {
      return status;
   }

   public void setStatus(int status) {
      this.status = status;
   }

   private String name;

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public User(String name,int status){
      this.name  = name;
      this.status = status;
   }

   public void sendMessage(String message){
      if (this.status==1){
         ChatRoom.showMessage(this,message);
      }else {
         System.out.println("请登陆后再发送");
      }
   }
}