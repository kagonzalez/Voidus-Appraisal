/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voidus.appraisal;
import BasicClass.Archer.Ranger;
import BasicClass.Archer.Sharpshooter;
import BasicClass.Cleric.HolyKnight;
import BasicClass.Cleric.Guardian;
import BasicClass.Fighter.Knight;
import BasicClass.Fighter.Gladiator;
import BasicClass.Mage.Warlock;
import BasicClass.Mage.Wizard;
import BasicClass.Trickster.Reaper;
import BasicClass.Trickster.Spectre;
import BasicClass.BasicClass;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javax.imageio.ImageIO;
/**
 *
 * @author Kevin
 */
public class AppraisalMain extends Application {
    @Override
    public void start(Stage primaryStage) {
        mainMenu(primaryStage);
    }
    private void mainMenu(Stage primaryStage) {
//Grid
        GridPane root = new GridPane();
        root.setAlignment(Pos.TOP_CENTER);
        root.setVgap(10);
        root.setHgap(10);
        root.setPadding(new Insets(25, 25, 25, 25));
//Title
        Text title = new Text("Select an Option");
        title.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
//First Button
        Button btn = new Button();
        btn.setText("Select Class");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                classSelection(primaryStage);
            }
        });
        root.add(title, 0, 0, 2, 1);
        root.add(btn, 0, 1);
//Second button
        btn = new Button();
        btn.setText("Select Class");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                classSelection(primaryStage);
            }
        });
        Scene scene = new Scene(root, 720, 405);
        root.add(btn, 0, 2);
        primaryStage.setTitle("Appraisal");
        primaryStage.setScene(scene);
        scene.getStylesheets().add(AppraisalMain.class.getResource("AppraisalCss.css").toExternalForm());
        primaryStage.show();
    }
    /**
     * Class Selection Screen
     * @param primaryStage 
     */
    private void classSelection(Stage primaryStage) {
        //Grid
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setVgap(10);
        grid.setHgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        Text title = new Text("Select a class");
        title.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(title, 0, 0, 2, 1);
//Creates the Wizard button and puts it in a grid
        Button wizard = new Button("wizardBtn");
        wizard.setText("Wizard");
        wizard.setMinWidth(120);
        wizard.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                Wizard wizard = new Wizard();
                gearAppraisal(primaryStage, wizard);
            }
        });
        grid.add(wizard, 0, 1);
//Creates the Warlock button and puts it in a grid
        Button warlock = new Button("warlockBtn");
        warlock.setText("Warlock");
        warlock.setMinWidth(120);
        warlock.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                Warlock warlock = new Warlock();
                gearAppraisal(primaryStage, warlock);
            }
        });
        grid.add(warlock, 0, 2);
//Creates the Knight button and puts it in a grid
        Button knight = new Button("knightBtn");
        knight.setText("Knight");
        knight.setMinWidth(120);
        knight.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                Knight knight = new Knight();
                gearAppraisal(primaryStage, knight);
            }
        });
        grid.add(knight, 1, 1);
//Creates the Gladiator button and puts it in a grid
        Button glad = new Button("gladBtn");
        glad.setText("Gladiator");
        glad.setMinWidth(120);
        glad.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                Gladiator glad = new Gladiator();
                gearAppraisal(primaryStage, glad);
            }
        });
        grid.add(glad, 1, 2);
//Creates the SharpShooter button and puts it in a grid
        Button ss = new Button("ssBtn");
        ss.setText("SharpShooter");
        ss.setMinWidth(120);
        ss.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                Sharpshooter ss = new Sharpshooter();
                gearAppraisal(primaryStage, ss);
            }
        });
        grid.add(ss, 2, 1);
//Creates the Ranger button and puts it in a grid
        Button ranger = new Button("rangerBtn");
        ranger.setText("Ranger");
        ranger.setMinWidth(120);
        ranger.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                Ranger ranger = new Ranger();
                gearAppraisal(primaryStage, ranger);
            }
        });
        grid.add(ranger, 2, 2);
//Creates the Spectre button and puts it in a grid
        Button spectre = new Button("spectreBtn");
        spectre.setText("Spectre");
        spectre.setMinWidth(120);
        spectre.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                Spectre spectre = new Spectre();
                gearAppraisal(primaryStage, spectre);
            }
        });
        grid.add(spectre, 3, 1);
//Creates the Reaper button and puts it in a grid
        Button reaper = new Button("reaperBtn");
        reaper.setText("Reaper");
        reaper.setMinWidth(120);
        reaper.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                Reaper reaper = new Reaper();
                gearAppraisal(primaryStage, reaper);
            }
        });
        grid.add(reaper, 3, 2);
//Creates the Guardian button and puts it in a grid
        Button guard = new Button("guardBtn");
        guard.setText("Guard");
        guard.setMinWidth(120);
        guard.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                Guardian guard = new Guardian();
                gearAppraisal(primaryStage, guard);
            }
        });
        grid.add(guard, 4, 1);
//Creates the Holy Knight button and puts it in a grid
        Button hk = new Button("hkBtn");
        hk.setText("Holy Knight");
        hk.setMinWidth(120);
        hk.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                HolyKnight hk = new HolyKnight();
                gearAppraisal(primaryStage, hk);
            }
        });
        grid.add(hk, 4, 2);
//Creates the Back button and puts it in a grid
        Button back = new Button("backBtn");
        back.setText("Back");
        back.setMinWidth(120);
        back.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                mainMenu(primaryStage);
            }
        });
        grid.add(back, 2, 3);
        Scene scene = new Scene(grid, 720, 405);
        primaryStage.setTitle("Class Selection");
        primaryStage.setScene(scene);
        scene.getStylesheets().add(AppraisalMain.class.getResource("AppraisalCss.css").toExternalForm());
        primaryStage.show();
    }
    /**
     * 
     * @param primaryStage
     * @param general The class of the item to be valued
     */
    private void gearAppraisal(Stage primaryStage, BasicClass general) {
//Creates the grid for the Scene
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setVgap(10);
        grid.setHgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
//Grid Title
        Text title = new Text("Input values");
        title.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(title, 0, 0, 2, 1);
//Creates the Strength Label and puts it in a grid
        Label strTitle = new Label("Strength:");
        grid.add(strTitle, 1, 1);
//Creates the Strength TextField and puts it in a grid
        TextField strTextField = new TextField();
        strTextField.setMaxWidth(100);
        grid.add(strTextField, 2, 1);
//Creates the Intelligence Label and puts it in a grid
        Label intTitle = new Label("Intelligence:");
        grid.add(intTitle, 1, 2);
//Creates the Intelligence TextField and puts it in a grid
        TextField intTextField = new TextField();
        intTextField.setMaxWidth(100);
        grid.add(intTextField, 2, 2);
//Creates the Endurance Label and puts it in a grid
        Label endTitle = new Label("Endurance:");
        grid.add(endTitle, 1, 3);
//Creates the Endurance TextField and puts it in a grid
        TextField endTextField = new TextField();
        endTextField.setMaxWidth(100);
        grid.add(endTextField, 2, 3);
//Creates the Dexterity Label and puts it in a grid
        Label dexTitle = new Label("Dexterity:");
        grid.add(dexTitle, 1, 4);
//Creates the Dexterity TextField and puts it in a grid
        TextField dexTextField = new TextField();
        dexTextField.setMaxWidth(100);
        grid.add(dexTextField, 2, 4);
//Creates the Spirit Label and puts it in a grid
        Label sprTitle = new Label("Spirit:");
        grid.add(sprTitle, 1, 5);
//Creates the Spirit TextField and puts it in a grid
        TextField sprTextField = new TextField();
        sprTextField.setMaxWidth(100);
        grid.add(sprTextField, 2, 5);
//Creates the Helmet button and puts it in a grid
        Button helmet = new Button("helmetBtn");
        helmet.setText("Helmet");
        helmet.setMinWidth(100);
        helmet.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                int[] stats = {Integer.parseInt(strTextField.getText()), 
                               Integer.parseInt(intTextField.getText()),
                               Integer.parseInt(endTextField.getText()),
                               Integer.parseInt(dexTextField.getText()),
                               Integer.parseInt(sprTextField.getText())};
                appraised("Helmet", stats, general);
            }
        });
        grid.add(helmet, 1, 6);
//Creates the Armor button and puts it in a grid
        Button armor = new Button("armorBtn");
        armor.setText("Armor");
        armor.setMinWidth(100);
        armor.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                int[] stats = {Integer.parseInt(strTextField.getText()), 
                               Integer.parseInt(intTextField.getText()),
                               Integer.parseInt(endTextField.getText()),
                               Integer.parseInt(dexTextField.getText()),
                               Integer.parseInt(sprTextField.getText())};
                appraised("Armor", stats, general);
            }
        });
        grid.add(armor, 2, 6);
//Creates the Pants button and puts it in a grid
        Button pants = new Button("pantsBtn");
        pants.setText("Pants");
        pants.setMinWidth(100);
        pants.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                int[] stats = {Integer.parseInt(strTextField.getText()), 
                               Integer.parseInt(intTextField.getText()),
                               Integer.parseInt(endTextField.getText()),
                               Integer.parseInt(dexTextField.getText()),
                               Integer.parseInt(sprTextField.getText())};
                appraised("Pants", stats, general);
            }
        });
        grid.add(pants, 3, 6);
//Creates the Boots button and puts it in a grid
        Button boots = new Button("bootsBtn");
        boots.setText("Boots");
        boots.setMinWidth(100);
        boots.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                int[] stats = {Integer.parseInt(strTextField.getText()), 
                               Integer.parseInt(intTextField.getText()),
                               Integer.parseInt(endTextField.getText()),
                               Integer.parseInt(dexTextField.getText()),
                               Integer.parseInt(sprTextField.getText())};
                appraised("Boots", stats, general);
            }
        });
        grid.add(boots, 4, 6);
//Creates the Weapon button and puts it in a grid
        Button weapon = new Button("weaponBtn");
        weapon.setText("Weapon");
        weapon.setMinWidth(100);
        weapon.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                int[] stats = {Integer.parseInt(strTextField.getText()), 
                               Integer.parseInt(intTextField.getText()),
                               Integer.parseInt(endTextField.getText()),
                               Integer.parseInt(dexTextField.getText()),
                               Integer.parseInt(sprTextField.getText())};
                appraised("Weapon", stats, general);
            }
        });
        grid.add(weapon, 1, 7);
//Creates the Ring button and puts it in a grid
        Button ring = new Button("ringBtn");
        ring.setText("Ring");
        ring.setMinWidth(100);
        ring.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                int[] stats = {Integer.parseInt(strTextField.getText()), 
                               Integer.parseInt(intTextField.getText()),
                               Integer.parseInt(endTextField.getText()),
                               Integer.parseInt(dexTextField.getText()),
                               Integer.parseInt(sprTextField.getText())};
                appraised("Ring", stats, general);
            }
        });
        grid.add(ring, 2, 7);
//Creates the Necklace button and puts it in a grid
        Button necklace = new Button("necklaceBtn");
        necklace.setText("Necklace");
        necklace.setMinWidth(100);
        necklace.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                int[] stats = {Integer.parseInt(strTextField.getText()), 
                               Integer.parseInt(intTextField.getText()),
                               Integer.parseInt(endTextField.getText()),
                               Integer.parseInt(dexTextField.getText()),
                               Integer.parseInt(sprTextField.getText())};
                appraised("Necklace", stats, general);
            }
        });
        grid.add(necklace, 3, 7);
//Creates the Back button and puts it in a grid
        Button back = new Button("backBtn");
        back.setText("Back");
        back.setMinWidth(100);
        back.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                classSelection(primaryStage);
            }
        });
        grid.add(back, 4, 7);
//Establishes the Scene
        Scene scene = new Scene(grid, 720,405);
        primaryStage.setTitle(general.getName() + "Appraisal");
        primaryStage.setScene(scene);
        scene.getStylesheets().add(AppraisalMain.class.getResource("AppraisalCss.css").toExternalForm());
    }
    /**
     * Converts the non-denominated sum of coppers into it's maximized 
     * denominated equivalence.
     * @param coppers non-denominated value of the equipment
     */
    private int[] findDenominatedValue(int coppers) {
        int gem = 0;
        int gold = 0;
        int silver = 0;
        final int SILVER = 1000;
        final int GOLD = 1000000;
        final int GEM = 100000000;
        int[] denominatedValues = new int[4];
        for (int i = 0; i < denominatedValues.length; i++) {
            if(coppers > GEM) {
                gem = (int) Math.floor(coppers/GEM);
                denominatedValues[0] = gem;
                coppers = coppers - (gem * GEM);
            }
            else if(coppers > GOLD) {
                gold = (int) Math.floor(coppers/GOLD);
                denominatedValues[1] = gold;
                coppers = coppers - (gold * GOLD);
            }
            else if(coppers > SILVER) {
                silver = (int) Math.floor(coppers/SILVER);
                denominatedValues[2] = silver;
                coppers = coppers - (silver * SILVER);
            }
            else if(coppers < SILVER) {
                denominatedValues[3] = coppers; 
            }
        }
        return denominatedValues;
    }
    /**
     * A method to perform the functions that occur when a gear button is pressed.
     * @param itemType A String with with the general name of the item
     * @param textFields An array that contains the values inputed by the user
     * @param general The class of the item being valued
     */
    private void appraised(String itemType, int[] textFields, BasicClass general) {
        Stage secondaryStage = new Stage();
        BufferedImage copper = null;
        BufferedImage silver = null;
        BufferedImage gold = null;
        BufferedImage gem = null;
        try {
            copper = ImageIO.read(new File("voidus/appraisal/Coin-Copper.png"));
            silver = ImageIO.read(new File("voidus/appraisal/Coin-Silver.png"));
            gold = ImageIO.read(new File("voidus/appraisal/Coin-Gold.png"));
            gem = ImageIO.read(new File("voidus/appraisal/Coin-Gem.png"));
        } 
        catch (IOException e) {
            System.out.println("FILE NOT FOUND");
        }
//Creates the grid for the Scene
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setVgap(5);
        grid.setHgap(5);
        grid.setPadding(new Insets(25, 25, 25, 25));
        Text title = new Text(general.getName() + " " + itemType + " Value: ");
        title.setFont(Font.font("Tahoma", FontWeight.NORMAL, 10));
        grid.add(title, 1, 1, 3, 1);
        int[] denominatedValues = findDenominatedValue(general.newItem(itemType,
                textFields[0], 
                textFields[1], 
                textFields[2], 
                textFields[3], 
                textFields[4]));
        Text denominatedTextGem = new Text(
                denominatedValues[0] + "G"
                );
        grid.add(denominatedTextGem, 2, 2);
        Text denominatedTextGold = new Text(
                denominatedValues[1] + "g");
        grid.add(denominatedTextGold, 2, 3);
        
        Text denominatedTextSilver = new Text(
                denominatedValues[2] + "s");
        grid.add(denominatedTextSilver, 2, 4);
        Text denominatedTextCopper = new Text(
                denominatedValues[3] + "s");
        grid.add(denominatedTextCopper, 2, 5);
        Label strTitle = new Label("STR:" + textFields[0]);
        grid.add(strTitle, 1, 2);
        Label intTitle = new Label("INT:" + textFields[1]);
        grid.add(intTitle, 1, 3);
        Label endTitle = new Label("END:" + textFields[2]);
        grid.add(endTitle, 1, 4);
        Label dexTitle = new Label("DEX:" + textFields[3]);
        grid.add(dexTitle, 1, 5);
        Label sprTitle = new Label("SPR:" + textFields[4]);
        grid.add(sprTitle, 1, 6);
        Scene scene = new Scene(grid, 200, 180);
        secondaryStage.setTitle("Appraisal");
        secondaryStage.setScene(scene);
        scene.getStylesheets().add(AppraisalMain.class.getResource("AppraisalCss.css").toExternalForm());
        secondaryStage.show();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}