package sample;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<String> startt;

    @FXML
    private MenuItem hist;

    @FXML
    private MenuItem exit;

    @FXML
    private MenuItem abb;

    @FXML
    private MenuItem abb_dri;

    @FXML
    private MenuItem abb_raz;

    @FXML
    private ComboBox<String> endd;

    @FXML
    private ComboBox<String> driver;

    @FXML
    private ComboBox<String> typee;

    @FXML
    private TextField prim_time;

    @FXML
    private Button dooo;

    @FXML
    private TextField prim_rust;

    @FXML
    private TextField prim_time2;

    public double voditeli, gruz, obchDr;
    double  ot, doo, obchPut, obchPut1, chena;
    String timee;

    @FXML
    void initialize() {
        settdr();
        box1();
        abb_dri.setOnAction(event -> {
            Drinf();
        });

        abb.setOnAction(event -> {
            CompInf();
        });

        abb_raz.setOnAction(event -> {
            RazrabInf();
        });

        dooo.setOnAction(event -> {
            chose();
            chose2(typee);
            chose3(startt);
            chose4(endd);
            funk();
        });

        exit.setOnAction(event -> {
            Platform.exit();
        });


    }

    public class drivers{   // Водители
        String firstname;
        String secondname;
        String middlename;
        float stag;
        public void drivers(String firstname, String secondname, String middlename, float stag){
            this.firstname = firstname;
            this.secondname = secondname;
            this.middlename = middlename;
            this.stag = stag;
        }
        public String getFirstname(){
            return firstname;
        }
        public String getSecondname(){
            return secondname;
        }
        public String getMiddlename(){
            return middlename;
        }
        public float getStage(){
            return stag;
        }
    }

    public drivers[] settdr(){
        drivers driver1 = new drivers();
        driver1.drivers("Иван", "Иванов", "Иванович", 12);
        drivers driver2 = new drivers();
        driver2.drivers("Петр", "Петров", "Петрович", 5);
        drivers driver3 = new drivers();
        driver3.drivers("Сергей", "Сидоров", "Сергеевич", 3);
        drivers driver4 = new drivers();
        driver4.drivers("Остап", "Бендер", "Ибрагимович", 20);
        drivers arr[] = new drivers[4];
        arr[0] = driver1;
        arr[1] = driver2;
        arr[2] = driver3;
        arr[3] = driver4;
        return arr;
    }

    public void box1(){
        String[] list = new String[]{"Иванов Иван Иванович", "Петров Петр Петрович", "Сидоров Сергей Сергеевич", "Бендер Остап Ибрагимович"};
        driver.getItems().addAll(list);


        String[] list1 = new String[]{"Москва", "Санкт-Петербург", "Белгород", "Иркутск"};
        startt.getItems().addAll(list1);


        String[] list2 = new String[]{"Москва", "Санкт-Петербург", "Белгород", "Иркутск"};
        endd.getItems().addAll(list2);


        String[] list3 = new String[]{"Опысные", "Скоропортящиеся", "Нелегальные", "Жидкие"};
        typee.getItems().addAll(list3);
    }

    public void Drinf(){
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("aboutDr.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scene scene = new Scene(root);

        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    public void CompInf(){
        Parent roots = null;
        try {
            roots = FXMLLoader.load(getClass().getResource("aboutComp.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scene scene1 = new Scene(roots);

        Stage stage = new Stage();
        stage.setScene(scene1);
        stage.show();
    }

    public void RazrabInf(){
        Parent roots = null;
        try {
            roots = FXMLLoader.load(getClass().getResource("aboutrazrab.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scene scene1 = new Scene(roots);

        Stage stage = new Stage();
        stage.setScene(scene1);
        stage.show();
    }

    public void chose(){
                switch (driver.getValue()){
                    case "Иванов Иван Иванович":
                        voditeli = 5;
                        System.out.println("Работает " + voditeli);
                        break;

                    case "Петров Петр Петрович":
                        voditeli = 4;
                        System.out.println("Работает " + voditeli);
                        break;

                    case "Сидоров Сергей Сергеевич":
                        voditeli = 3;
                        System.out.println("Работает " + voditeli);
                        break;

                    case "Бендер Остап Ибрагимович":
                        voditeli = 10;
                        System.out.println("Работает " + voditeli);
                        break;
                }

            }

    public void chose2(ComboBox<String> box){
                switch (box.getValue()){
                    case "Опысные":
                        gruz = 3;
                        break;

                    case "Скоропортящиеся":
                        gruz = 1.5;
                        break;

                    case "Нелегальные":
                        gruz = 5;
                        break;

                    case "Жидкие":
                        gruz = 1;
                        break;
                }
    }

    public void chose3(ComboBox<String> box){

                switch (box.getValue()){
                    case "Москва":
                        ot = 1;
                        break;

                    case "Санкт-Петербург":
                        ot = 2.1;
                        break;

                    case "Белгород":
                        ot = 3;
                        break;

                    case "Иркутск":
                        ot = 4;
                        break;
                }
    }

    public void chose4(ComboBox<String> box){

                if (box.getValue() == "Москва") {
                    doo = 1;
                }if (box.getValue() == "Санкт-Петербург") {
                    doo = 2.1;
                }if (box.getValue() == "Белгород") {
                    doo = 3;
                }if (box.getValue() == "Иркутск") {
                    doo = 4;
                }
    }

    public void funk(){
        obchPut1 = doo + ot;
        if (obchPut1 == 3.1){
            obchPut = 712;
        }
        if (obchPut1 == 4){
            obchPut = 665;
        }
        if (obchPut1 == 5){
            obchPut = 5227;
        }
        if (obchPut1 == 5.1){
            obchPut = 1377;
        }
        if (obchPut1 == 6.1){
            obchPut = 5733;
        }
        if (obchPut1 == 7){
            obchPut = 5411;
        }
        chena = (obchPut * voditeli) * gruz;
        System.out.println(obchPut);
        prim_time.setText(String.valueOf(chena) + " рублей");
        prim_rust.setText(String.valueOf(obchPut) + " км");

        if (obchPut == 712){
            timee = "примерно 10 часов";
        }
        if (obchPut == 665){
            timee = "примерно 9.5 часов";
        }
        if (obchPut == 5227){
            timee = "примерно 3 - 4 дня";
        }
        if (obchPut == 1377){
            timee = "примерно 1.5 дня";
        }
        if (obchPut == 5733){
            timee = "примерно 4.5 дня";
        }
        if (obchPut == 5411){
            timee = "примерно 3.5 - 4 дня";
        }
        prim_time2.setText(timee);
    }
}