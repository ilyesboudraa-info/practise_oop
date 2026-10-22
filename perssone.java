class perssone{
    String nom;
    String prenom;
    int age;   

    perssone(String nom,String prenom) {
        this.nom=nom;
        this.prenom=prenom;


    }
        perssone(String nom,String prenom,int age) {
        this.nom=nom;
        this.prenom=prenom;
        this.age=age;

    }
    void anniver(){
        
        age++;
    }
    void setage(int a){
        age=a;

    }
    void setnom(String n){
        nom=n;

    }
    void setprenom(String y){
        prenom=y;

    }
    void affich(){
                System.out.println("le prenom  "+prenom);
        System.out.println("le nom "+nom);
        System.out.println("le age "+age);
    }

                             
    public static void main(String[] args){
        perssone s=new perssone("ilyes","bdr");
        System.out.println("le prenom  "+s.prenom);
        System.out.println("le nom "+s.nom);
        perssone r=new perssone("","bdr",27);
        System.out.println("le prenom  "+r.prenom);
        System.out.println("le nom "+r.nom);
        System.out.println("le age "+r.age);
        r.anniver();
        System.out.println("le age "+r.age);



        r.setprenom("ibrahim");
        System.out.println("le prenom  "+r.prenom);
        r.setnom("him");
        System.out.println("le nom "+r.nom);
        r.setage(188);
        System.out.println("le age "+r.age);

        s.affich();
        
    
    
    
    }}