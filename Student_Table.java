package sample;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.swing.*;

public class Main extends Application {


    Label messageLbl = new Label("Choose your Gender : ");
    Label messageLb2 = new Label("Choose your BSSE Batch : ");
    Label messageLb3 = new Label();
    Label messageLb4 = new Label("About Yourself :");
    Label messageLb5 = new Label("Press any Button to see the message");
    Label selectionMsg = new Label();

    public static void main(String[] args)
    {
        Application.launch(args);
    }
    @Override
    public void start(Stage stage)
    {
// Create the Text Fields
        TextField firstNameFld = new TextField();
        TextField lastNameFld = new TextField();

// Create the Labels
        Label firstNameLbl = new Label("_Name:");
        Label lastNameLbl = new Label("_Email");

// Bind the Label to the according Field
        firstNameLbl.setLabelFor(firstNameFld);
// Set mnemonic parsing to the Label
        firstNameLbl.setMnemonicParsing(true);
// Bind the Label to the according Field
        lastNameLbl.setLabelFor(lastNameFld);
// Set mnemonic parsing to the Label
        lastNameLbl.setMnemonicParsing(true);

        GridPane root = new GridPane();
// Add the Labels and Fields to the GridPane
        root.addRow(0, firstNameLbl, firstNameFld);
        root.addRow(1, lastNameLbl, lastNameFld);

// Set the Size of the GridPane
        root.setMinSize(550, 50);



        //  Scene scene = new Scene(root);
// Add the scene to the Stage
        //stage.setScene(scene);

        CheckBox maleCB = new CheckBox("Male");
        CheckBox femaleCB = new CheckBox("Female");

        maleCB.setAllowIndeterminate(true);
        maleCB.selectedProperty().addListener(new ChangeListener<Boolean>() {
            public void changed(ObservableValue<? extends Boolean> ov, final Boolean value, final Boolean newValue) {
                if(newValue != null && newValue) {
                    printCheck("Your Selection: Male"); } } });
        femaleCB.selectedProperty().addListener(new ChangeListener<Boolean>() {
            public void changed(ObservableValue<? extends Boolean> ov, final Boolean value, final Boolean newValue) {
                if(newValue != null && newValue) {
                    printCheck("Your Selection: Female"); } } });


        maleCB.indeterminateProperty().addListener(new ChangeListener<Boolean>() { public void changed(ObservableValue<? extends Boolean> ov,
                                                                                                       final Boolean value, final Boolean newValue)
        { if(newValue != null && newValue) { printMessage("Your indeterminate Selection: Male"); } }
        });

        VBox vBox2 = new VBox();
        vBox2.getChildren().addAll(messageLbl,maleCB,femaleCB,messageLb3);

        MenuItem bsse01 = new MenuItem("BSSE 01");
        bsse01.setOnAction(new EventHandler<ActionEvent>() { @Override public void handle(ActionEvent e) { printMessage("Welcome to BSSE 01"); } });
        MenuItem bsse02 = new MenuItem("BSSE 02");
        bsse02.setOnAction(new EventHandler<ActionEvent>() { @Override public void handle(ActionEvent e) { printMessage("Welcome to BSSE 02"); }
        });

        MenuItem bsse03 = new MenuItem("BSSE 03");
        bsse03.setOnAction(new EventHandler<ActionEvent>() { @Override public void handle(ActionEvent e) { printMessage("Welcome to BSSE 03"); }
        });
        MenuItem bsse04 = new MenuItem("BSSE 04");
        bsse04.setOnAction(new EventHandler<ActionEvent>() { @Override public void handle(ActionEvent e) { printMessage("Welcome to BSSE 04"); }
        });


        MenuItem bsse05 = new MenuItem("BSSE 05");
        bsse05.setOnAction(new EventHandler<ActionEvent>() { @Override public void handle(ActionEvent e) { printMessage("Welcome to BSSE 05"); } });

        MenuItem bsse06 = new MenuItem("BSSE 06");
        bsse06.setOnAction(new EventHandler<ActionEvent>() { @Override public void handle(ActionEvent e) { printMessage("Welcome to BSSE 06"); }
        });

        MenuItem bsse07 = new MenuItem("BSSE 07");
        bsse07.setOnAction(new EventHandler<ActionEvent>() { @Override public void handle(ActionEvent e) { printMessage("Welcome to BSSE 07"); }
        });


        MenuItem bsse08 = new MenuItem("BSSE 08");
        bsse08.setOnAction(new EventHandler<ActionEvent>() { @Override public void handle(ActionEvent e) { printMessage("Welcome to BSSE 08"); } });
        MenuItem bsse09 = new MenuItem("BSSE 09");
        bsse09.setOnAction(new EventHandler<ActionEvent>() { @Override public void handle(ActionEvent e) { printMessage("Welcome to BSSE 09"); }
        });

        MenuItem bsse10 = new MenuItem("BSSE 10");
        bsse10.setOnAction(new EventHandler<ActionEvent>() { @Override public void handle(ActionEvent e) { printMessage("Welcome to BSSE 10"); }
        });
        MenuItem bsse11 = new MenuItem("BSSE 11");
        bsse11.setOnAction(new EventHandler<ActionEvent>() { @Override public void handle(ActionEvent e) { printMessage("Welcome to BSSE 11"); }
        });
        MenuItem bsse12 = new MenuItem("BSSE 12");
        bsse12.setOnAction(new EventHandler<ActionEvent>() { @Override public void handle(ActionEvent e) { printMessage("Welcome to BSSE 12"); }
        });
        MenuButton bsse = new MenuButton("Select");
        bsse.getItems().addAll( bsse01, bsse02, bsse03, bsse04, bsse05, bsse06, bsse07, bsse08,bsse09, bsse10, bsse11,bsse12);

        TextArea textArea = new TextArea();

        Button save = new Button("Save");
        save.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                printInfo("You have pressed the Save Button");
            }
        });

        Button ok = new Button("Ok");
        ok.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                printInfo("You have pressed the Ok Button");
            }
        });

        Button cancel = new Button("Cancel");
        cancel.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                printInfo("You have pressed the Cancel Button");
            }
        });

        Button reset = new Button("Reset");

        reset.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                printInfo("You have pressed the Reset Button");
            }
        });




        HBox hBox = new HBox();
        hBox.getChildren().addAll(save,ok,cancel,reset);
        hBox.setSpacing(80);



        VBox root1 = new VBox();
        root1.getChildren().addAll(root, vBox2,messageLb2,bsse,selectionMsg,messageLb4,textArea,hBox,messageLb5);



        root1.setMinSize(550, 650);
        root1.setSpacing(15);

        root1.setStyle("-fx-padding: 10;" +
                "-fx-border-style: solid inside;" +
                "-fx-border-width: 7;" +
                "-fx-border-insets: 5;" +
                "-fx-border-radius: 5;" +
                "-fx-border-color: aqua;");

        // Create the Scene

        // Create the Scene
        Scene scene1 = new Scene(root1);
// Add the scene to the Stage
        stage.setScene(scene1);
// Set the title of the Stage
        stage.setTitle("Students Information");
// Display the Stage
        stage.show();


    }
    public void printMessage(String message)
    {
// Set the Text of the Label
        selectionMsg.setText(message);
    }

    public void printInfo(String message)
    {
// Set the Text of the Label
        messageLb5.setText(message);
    }
    public void printCheck(String message)
    {
// Set the Text of the Label
        messageLb3.setText(message);
    }

}
