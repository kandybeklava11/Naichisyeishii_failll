public class MyClass {
    String name;
    String SurName;
    int Age;
    String[] Lessons;
    String FavoriteFood;



    public MyClass(String BestName, String BestSurname, int Age1, String[] Lessons1, String  BestFavoriteFood){
        this.name=BestName;
        this.SurName=BestSurname;
        this.Age=Age1;
        this.Lessons=Lessons1;
        this.FavoriteFood=BestFavoriteFood;



    }
    public MyClass(){
        this.name="Muktarbek";
        this.SurName="Nurpazyl uulu";
        this.Age=17;
        this.Lessons=new String[]{"Tecnical Lesson"};
        this.FavoriteFood="Manty";

    }
    public void Demokrat(){
        System.out.println("Name:    "+name);
        System.out.println("Surname: "+SurName);
        System.out.println("Age:     "+Age);
        for (String SASA:Lessons) {
            System.out.println("Favorite lesson: "+SASA);
        }


        System.out.println("Favorite food:   "+FavoriteFood);
    }

    }



