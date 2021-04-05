package Backend;
/*
import javafx.application.Application;
import javafx.scene.control.ListCell;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;


public class GameMain extends Application{
DeckOfCards deckOfCards = new DeckOfCards();

    @Override
    public void start(Stage primaryStage){

        BorderPane rootNode = new BorderPane();
        GridPane bottomInformationPane = new GridPane();
        GridPane rightPane = new GridPane();
        GridPane dealHandPane = new GridPane();


        //TODO: make this more visible and make sure that each box is fitted according to the plan.
      //  bottomInformationPane.add(new Button("Highest card"), 1, 1);
        bottomInformationPane.add(new Button("Sum of all cards"), 1, 1);
        //get hearts in hand. If no hearts, then show "no Hearts".
        bottomInformationPane.add(new Button("Hearts in hand?++"), 2, 1);
        bottomInformationPane.add(new Button("Got queen of spades?"),1 , 2);
        bottomInformationPane.add(new Button("Got flush?"), 2, 2);


        //TODO: remember to fix inspiration.
        bottomInformationPane.add(new Button("Quote of the day: 'we've been tricked, " +
                "we've been backstabbed and we've been quite possibly, bamboozled' "), 3, 3);

      //  bottomInformationPane.addEventHandler(deckOfCards.dealHand(5),dealHandPane);


        rightPane.add(new Button("Deal hand"), 1, 1);
        rightPane.add(new Button("Check hand"), 1, 2);

        //rootNode.setLayoutX(500);
        //rootNode.setLayoutY(500);

      //  rootNode.setBottom(new Button("Button TestBot"));
        // NOTE! Can change where centerPane shows from here.
        rootNode.setBottom(bottomInformationPane);
        rootNode.setRight(rightPane);



        //TODO: check
       // rootNode.addEventHandler();





        Scene scene = new Scene(rootNode, 1250, 750);





        // what should it show
      //  Scene scene2 = new Scene(centerPane, 300, 250);




        primaryStage.setTitle("CardsAgainstIQ - Test");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
    @Override
    public void stop()
    {
        System.exit(0);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
*/