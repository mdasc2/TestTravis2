package logic;
import javafx.application.Application;
import javafx.event.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;


public class GUICalculator extends Application{

  String arg = "", operation = "";
  TextArea result = new TextArea();
  LogicCalculator ResCal = new LogicCalculator();
  
  Button button1, button2, button3, button4, button5, button6, button7, button8,
  button9, button0, buttondecimal, buttonplus, buttonminus, buttonmultiply, buttondivide, buttonequals, buttonclear;
  Double val1, val2;
  
  public static void main(String[] args) {
    launch(args);
  }
  
  @Override
  public void start(Stage stage) throws Exception{
    stage.setTitle("Calculator");
    

    VBox root = new VBox();
    HBox resultBox = new HBox();
    HBox operationBox = new HBox();
    VBox column1 = new VBox();
    VBox column2 = new VBox();
    VBox column3 = new VBox();
    VBox column4 = new VBox();
    VBox column5 = new VBox();
        
    Scene scene = new Scene(root, 180, 130);
    stage.setScene(scene);
    
    result.setPrefColumnCount(3);
    result.setPrefRowCount(1);
    result.setEditable(false);

    
    button1 = new Button("1");
    button2 = new Button("2");
    button3 = new Button("3");
    button4 = new Button("4");
    button5 = new Button("5");
    button6 = new Button("6");
    button7 = new Button("7");
    button8 = new Button("8");
    button9 = new Button("9");
    button0 = new Button("0");
    buttondecimal = new Button(" .");
    buttonplus = new Button("+");
    buttonminus = new Button("-");
    buttonmultiply = new Button("*");
    buttondivide = new Button("/");
    buttonequals = new Button("=");
    buttonclear = new Button("Clear");
    button1.setMinWidth(30);
    button2.setMinWidth(30);
    button3.setMinWidth(30);
    button4.setMinWidth(30);
    button5.setMinWidth(30);
    button6.setMinWidth(30);
    button7.setMinWidth(30);
    button8.setMinWidth(30);
    button9.setMinWidth(30);
    button0.setMinWidth(30);
    buttondecimal.setMinWidth(30);
    buttonplus.setMinWidth(30);
    buttonminus.setMinWidth(30);
    buttonmultiply.setMinWidth(30);
    buttondivide.setMinWidth(30);
    buttonequals.setMinWidth(30);
    

    
    button1.setOnAction(new EventHandler<ActionEvent>() {
      public void handle(ActionEvent event) {
        arg += "1";
        result.appendText("1");
      }
    });
    button2.setOnAction(new EventHandler<ActionEvent>() {
      public void handle(ActionEvent event) {
        arg += "2";
        result.appendText("2");
      }
    });
    button3.setOnAction(new EventHandler<ActionEvent>() {
      public void handle(ActionEvent event) {
        arg += "3";
        result.appendText("3");
      }
    });
    button4.setOnAction(new EventHandler<ActionEvent>() {
      public void handle(ActionEvent event) {
        arg += "4";
        result.appendText("4");
      }
    });
    button5.setOnAction(new EventHandler<ActionEvent>() {
      public void handle(ActionEvent event) {
        arg += "5";
        result.appendText("5");    
      }
    });
    button6.setOnAction(new EventHandler<ActionEvent>() {
      public void handle(ActionEvent event) {
        arg += "6";
        result.appendText("6");
      }
    });
    button7.setOnAction(new EventHandler<ActionEvent>() {
      public void handle(ActionEvent event) {
        arg += "7";
        result.appendText("7");
      }
    });
    button8.setOnAction(new EventHandler<ActionEvent>() {
      public void handle(ActionEvent event) {
        arg += "8";
        result.appendText("8");
      }
    });
    button9.setOnAction(new EventHandler<ActionEvent>() {
      public void handle(ActionEvent event) {
        arg += "9";
        result.appendText("9");
      }
    });
    button0.setOnAction(new EventHandler<ActionEvent>() {
      public void handle(ActionEvent event) {
        arg += "0";
        result.appendText("0");
      }
    });
    buttondecimal.setOnAction(new EventHandler<ActionEvent>() {
      public void handle(ActionEvent event) {
        arg += ".";
        result.appendText(".");
      }
    });
    buttonplus.setOnAction(new EventHandler<ActionEvent>() {
      public void handle(ActionEvent event) {
        val1 = Double.parseDouble(arg);
        arg = "";
        operation = "plus";
        result.clear();
      }
    });
    buttonminus.setOnAction(new EventHandler<ActionEvent>() {
      public void handle(ActionEvent event) {
        val1 = Double.parseDouble(arg);
        arg = "";
        operation = "minus";
        result.clear();
      }
    });
    buttonmultiply.setOnAction(new EventHandler<ActionEvent>() {
      public void handle(ActionEvent event) {
        val1 = Double.parseDouble(arg);
        arg = "";
        operation = "multiply";
        result.clear();
      }
    });
    buttondivide.setOnAction(new EventHandler<ActionEvent>() {
      public void handle(ActionEvent event) {
        val1 = Double.parseDouble(arg);
        arg = "";
        operation = "divide";
        result.clear();
      }
    });
    
    buttonequals.setOnAction(new EventHandler<ActionEvent>() {
      public void handle(ActionEvent event) {
        val2 = Double.parseDouble(arg);
        if (operation == "plus"){
          ResCal.sum(val1, val2);
        }else if (operation == "minus") {
        	ResCal.sub(val1, val2);
        }else if (operation == "multiply") {
        	ResCal.mul(val1, val2);
        }else {
        	ResCal.div(val1, val2);
        }
        result.clear();
        result.appendText(String.valueOf(ResCal.result));
  
        val1 =0.0;
        val2 =0.0;
        arg = "";
        operation = "";            
      }
    });
      
      buttonclear.setOnAction(new EventHandler<ActionEvent>() {
          public void handle(ActionEvent event) {
            result.clear();
            val1 =0.0;
            val2 =0.0;
            arg = "";
            operation = "";            
          }
      
      
    });
    
    
    
    column1.getChildren().addAll(button7, button4, button1, button0);
    column2.getChildren().addAll(button8, button5, button2, buttondecimal);
    column3.getChildren().addAll(button9, button6, button3);
    column4.getChildren().addAll(buttondivide, buttonmultiply, buttonminus, buttonplus);
    column5.getChildren().addAll(buttonequals, buttonclear);
    
    resultBox.getChildren().addAll(result);
    operationBox.getChildren().addAll(column1, column2, column3, column4,column5);
    
    root.getChildren().addAll(operationBox, resultBox);
    
    stage.show();
  }

}