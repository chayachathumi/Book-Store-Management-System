package datastructures;

public class CategoryManager {
    private String[] categories;
    private int count;

    public CategoryManager(){
        this.categories = new String[5];
        this.count = 0;
    }
    public void addCategory(String categoryName) {
        if (count < categories.length) {
            categories[count] = categoryName;
            count++;
            System.out.println("Category added: " + categoryName);
        } else {
            System.out.println("Error: Array id]s full cannot add more categories.");
        }

    }


            public void displayCategories() {
            System.out.println("\n--- Book Categories---");
            for (int i = 0; i < count; i++){
                System.out.println((i + 1) + ". " + categories[i]);
            }
            System.out.println("----------------------------");

    }
}
