import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import java.io.File;


/**
 * This is a gui application meant to test and show the reseume
 * application I created and stylized
 */
public class Main extends Application {

    @Override
    public void start(Stage primaryStage){

        Image  i = new Image(getClass().getResourceAsStream("edu.jpg"));
        Image t = new Image(getClass().getResourceAsStream("tech.jpg"));
        Image w = new Image(getClass().getResourceAsStream(("work.jpg")));
        Image p = new Image(getClass().getResourceAsStream(("proj.jpg")));
        Image icon = new Image(getClass().getResourceAsStream(("icon.png")));

        Image me =new Image(getClass().getResourceAsStream(("Me.jpg")));

        File myFile = new File("resume1");

        ResumeReader myInfo = new ResumeReader();
        BorderPane bPane = new BorderPane();

        StackPane tab1 = new StackPane();
        StackPane tab2 = new StackPane();
        StackPane tab3 = new StackPane();
        StackPane tab4 = new StackPane();

        Text e = new Text("E" + "\n" + "d" + "\n" + "u" + "\n" + "c" + "\n" +"a" +"\n" + "t" + "\n" + "i"+ "\n" +"o" +"\n" +"n");
        Text tech = new Text("S"+"\n"+"k"+"\n"+"i"+"\n"+"l"+"\n"+"l"+"\n"+"s");
        Text pro = new Text(("P"+"\n"+"r"+"\n"+"o"+"\n"+"j"+"\n"+"e"+"\n"+"c"+"\n"+"t"+"\n"+"s"));
        Text work = new Text("W" + "\n" + "o" + "\n" + "r" + "\n" + "k" + "\t" +"E"+"\n"
                + "\t"  + "x" + "\n" + "\t" + "p" + "\n" + "\t" + "e" + "\n" + "\t" + "r" + "\n" + "\t"
                + "e" + "\n" + "\t" + "n" + "\n" + "\t" + "c" + "\n" + "\t" + "e");

        e.setFont(Font.font("Helvetica",25));
        e.setFill(Color.WHITE);

        tech.setFont(Font.font("Helvetica",25));
        tech.setFill(Color.WHITE);

        pro.setFont(Font.font("Helvetica",25));
        pro.setFill(Color.WHITE);

        work.setFont(Font.font("Helvetica",25));
        work.setFill(Color.WHITE);

        GridPane left = new GridPane();
        GridPane right = new GridPane();
        GridPane center = new GridPane();
        right.setAlignment(Pos.CENTER);
        Text aboutMe = new Text(myInfo.getAboutMe());
        Text contactInfo = new Text("Contact"+ "\n" + "Information");
        Text title = new Text("Joshua Shilts");

        Button back = new Button("Back");
        Button edu = new Button();
        Button skills = new Button();
        Button projects = new Button();
        Button workXp = new Button();

        aboutMe.setFont(Font.font("Helvetica",2));
        skills.setFont(Font.font("Helvetica",25));
        projects.setFont(Font.font("Helvetica",25));
        workXp.setFont(Font.font("Helvetica",25));
        contactInfo.setFont(Font.font("Arial",12));
        contactInfo.setTextAlignment(TextAlignment.CENTER);
        title.setFont(Font.font("Helvetica", 28));
        aboutMe.setFont(Font.font("Helvetica",20));
        back.setFont(Font.font("Helvetica",20));

        edu.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
        skills.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
        projects.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
        workXp.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
        back.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);

        ImageView leftImage = new ImageView(me);
        ImageView rightImage = new ImageView(icon);
        contactInfo.setText(myInfo.getContactInfo());

        contactInfo.setCaretBias(true);


        right.add(rightImage,0,0);
        right.add(contactInfo,0,1);

        right.setHalignment(rightImage, HPos.CENTER); // To align horizontally in the cell
       right.setValignment(rightImage, VPos.TOP);

        left.add(leftImage,0,0);
        left.add(aboutMe,0,1);

        left.setHalignment(leftImage, HPos.CENTER); // To align horizontally in the cell
        left.setValignment(leftImage, VPos.TOP);

       ImageView iv = new ImageView(i);
       ImageView iv1 = new ImageView(t);
       ImageView iv2 = new ImageView(p);
      ImageView iv3 = new ImageView(w);

       edu.setStyle("-fx-background-color: #2C3E8D;-fx-border-color: #000000; -fx-border-width: 5px;");
       skills.setStyle("-fx-background-color: #2C3E8D;-fx-border-color: #000000; -fx-border-width: 5px;");
       workXp.setStyle("-fx-background-color: #2C3E8D;-fx-border-color: #000000; -fx-border-width: 5px;");
       projects.setStyle("-fx-background-color: #2C3E8D;-fx-border-color: #000000; -fx-border-width: 5px;");

       left.setStyle("-fx-background-color: #9DABC6;-fx-border-color: #000000; -fx-border-width: 5px;");
       right.setStyle("-fx-background-color: #9DABC6;-fx-border-color: #000000; -fx-border-width: 5px;");

       edu.setGraphic(iv);
       skills.setGraphic(iv1);
       projects.setGraphic(iv2);
       workXp.setGraphic(iv3);

      tab1.getChildren().addAll(edu,e);
      tab2.getChildren().addAll(skills,tech);
      tab3.getChildren().addAll(projects,pro);
      tab4.getChildren().addAll(workXp,work);


      //For Center
        RowConstraints rc = new RowConstraints();
        rc.setVgrow(Priority.ALWAYS);
        rc.setFillHeight(true);
        center.getRowConstraints().add(rc);

        //For Center
        ColumnConstraints col1 = new ColumnConstraints();
        col1.setPercentWidth(25);
        ColumnConstraints col2 = new ColumnConstraints();
        col2.setPercentWidth(25);
        ColumnConstraints col3 = new ColumnConstraints();
        col3.setPercentWidth(25);
        ColumnConstraints col4 = new ColumnConstraints();
        col4.setPercentWidth(25);

        Text l = new Text();
        StackPane contain= new StackPane();
        contain.getChildren().add(l);


        edu.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                l.setText(myInfo.getEdu());
                l.setFont(Font.font("Helvetica",25));
                bPane.setCenter(contain);
                back.setDisable(false);
            }
        });

        skills.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                l.setText(myInfo.getS());
                l.setFont(Font.font("Helvetica",25));
                bPane.setCenter(contain);
                back.setDisable(false);
            }
        });

        projects.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                l.setText(myInfo.getProjects());
                l.setFont(Font.font("Helvetica",25));
                bPane.setCenter(contain);
                back.setDisable(false);
            }
        });

        workXp.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                l.setText(myInfo.getWorkXp());
                l.setFont(Font.font("Helvetica",25));
                bPane.setCenter(contain);
                back.setDisable(false);
            }
        });

        back.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                bPane.setCenter(center);
                back.setDisable(true);

            }
        });

        //Adding everything to borderpane here
        center.getColumnConstraints().addAll(col1,col2,col3,col4);

        center.add(tab1,0,0);
        center.add(tab2,1,0);
        center.add(tab3,2,0);
        center.add(tab4,3,0);

        BorderPane.setAlignment(center, Pos.CENTER);
        BorderPane.setAlignment(title,Pos.CENTER);
        BorderPane.setAlignment(left,Pos.CENTER);

        bPane.setTop(title);
        bPane.setCenter(center);
        bPane.setLeft(left);
        bPane.setBottom(back);

        bPane.setRight(right);

        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(bPane));
        primaryStage.isResizable();
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
