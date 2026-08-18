class Mother{
    Child[] c = new Child[5];
    void show(){
    for(int i=0;i<c.length;i++){
        System.out.println(c[i].getName());
    }
    }
}