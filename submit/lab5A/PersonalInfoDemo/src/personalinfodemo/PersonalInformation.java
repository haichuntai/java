/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalinfodemo;

/**
 *
 * @author 19219
 */
class PersonalInformation {
    private String name;
    private int age;
    private String adress;
    private String phone;
    
    public void setName(String n){
        name = n;
    }
    public void setAge(int a){
        age = a;
    }
    public void setAddress(String a){
        adress = a;
    }
    public void setPhone(String p){
        phone = p;
    }
    
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getAddress(){
        return adress;
    }
    public String getPhone(){
        return phone;
    }
    
}
