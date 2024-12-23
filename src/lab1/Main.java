package lab1;

public class Main {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception{
        Food[] breakfast = new Food[20];
        int counter = 0;
        for (String arg : args){
            String[] parts = arg.split("/");
            if(parts[0].equals("Cheese")){
                breakfast[counter] = new Cheese();
            }
            else if (parts[0].equals("Tea")){
                breakfast[counter] = new Tea();
            }
            else if(parts[0].equals("Pie")){
                breakfast[counter] = new Pie(parts[1]);
            }
            counter++;
        }
        int Pies = 0;
        for (Food item : breakfast){
            if (item != null){
                if(item.equals(new Pie(""))){
                    Pies++;
                }
                item.consume();
            }
            else break;
        }
        System.out.println(Pies + " Пирогов было съедено");
        System.out.println("Всего хорошего!");
    }
}