package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Driver extends Application {

	public static void main(String[] args) {
		Application.launch(args);

	}
	 static LinkedListSingle Gaza =new LinkedListSingle();
	public static void readfileGaza() throws FileNotFoundException {
		File gaza = new File("Gaza.txt");
		if (gaza != null) {

		if (gaza.exists()) {
			Scanner in = null;
			try {
				in = new Scanner(gaza);
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			}
			int count = 0;
			while (in.hasNext()) {
				String line = in.nextLine();
				System.out.println(line);
				String[] splittedList = line.split(",");
				Gaza.insertSorted(count, new Node(splittedList[0], splittedList[1], splittedList[2]));
				count++;
			}
			in.close();
		} else
			System.out.println("Error: File Gaza not found!!!");
	}
	}
	 static LinkedListSingle WestBank =new LinkedListSingle();
	 

	public static void readfileWestBank() throws FileNotFoundException {
		File westBank = new File("WestBank.txt");
		if (westBank != null) {

		if (westBank.exists()) {
			Scanner in = null;
			try {
				in = new Scanner(westBank);
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			}
			int count = 0;
			while (in.hasNext()) {
				String line = in.nextLine();
				System.out.println(line);
				String[] splittedList = line.split(",");
				WestBank.insertSorted(count, new Node(splittedList[0], splittedList[1], splittedList[2]));
				count++;
				//System.out.println(WestBank);
			}
			in.close();
		} else
			System.out.println("Error: File WestBank not found!!!");
	}
	}
	static LinkedListSingle literary=new LinkedListSingle();
	 static LinkedListSingle science=new LinkedListSingle();
	public static void SL(LinkedListSingle WestBank) {
		Node current=WestBank.header;
		int i=0;
		int j=0;
		if(current == null) {
			System.out.println("List is empty");
		}
		else if(current != null ) {
			while (current != null ) {
				if(current.getBranch() == "Literary") {
					literary.insertSorted(i, current);
					current = current.next;
					i++;
				}else {
					science.insertSorted(j, current);
					current = current.next;
					j++;
				}
			}
			
		}
	}
	public static void SLG(LinkedListSingle Gaza) {
		Node current=Gaza.header;
		int i=0;
		int j=0;
		if(current == null) {
			System.out.println("List is empty");
		}
		else if(current != null ) {
			while (current != null ) {
				if(current.getBranch() == "Literary") {
					literary.insertSorted(i, current);
					current = current.next;
					i++;
				}else {
					science.insertSorted(j, current);
					current = current.next;
					j++;
				}
			}
			
		}
	}

	@Override
	public void start(Stage stage) throws Exception {
		BorderPane bp = new BorderPane();
		VBox vb = new VBox();
		Label label1 = new Label("High school results (Tawjihi 2022)");
		label1.setFont(new Font(" High school results (Tawjihi 2022)", 30));
		label1.setPrefWidth(500);
		label1.setTranslateY(120);
		label1.setTranslateX(255);
		// label1.setStyle("-fx-background-color:violate; -fx-padding: 20px;");

		ImageView West_BankIm = new ImageView("https://img.icons8.com/cute-clipart/344/enter-2.png");
		West_BankIm.setFitWidth(30);
		West_BankIm.setFitHeight(30);
		Button West_Bank = new Button("West Bank", West_BankIm);
		West_Bank.setTranslateX(550);
		West_Bank.setTranslateY(150);
		West_Bank.setPrefSize(150, 50);
		West_Bank.setStyle("-fx-border-color:purple");

		ImageView GazaIm = new ImageView("https://img.icons8.com/cute-clipart/344/enter-2.png");
		GazaIm.setFitWidth(30);
		GazaIm.setFitHeight(30);
		Button Gaza = new Button("Gaza", GazaIm);
		Gaza.setTranslateX(250);
		Gaza.setTranslateY(60);
		Gaza.setPrefSize(150, 50);
		Gaza.setStyle("-fx-border-color:purple");

		Image image = new Image("C:\\Users\\Admin\\Desktop\\Data Strctur\\project_1\\Capture.PNG");
		ImageView imageView = new ImageView();
		imageView.setImage(image);
		imageView.setFitWidth(1000);
		imageView.setFitHeight(250);
		imageView.setTranslateY(80);

		vb.getChildren().addAll(label1, West_Bank, Gaza, imageView);
		vb.setSpacing(40);

		bp.setCenter(vb);

		West_Bank.setOnAction(e -> {
			try {
				WBLS(stage);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});

		Gaza.setOnAction(e -> {
			try {
				GLS(stage);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});
		// bp.setStyle("-fx-background-color: white;");
		Scene scene = new Scene(bp, 1000, 600);
		stage.setScene(scene);
		stage.show();

	}

	public void WBLS(Stage stage) throws Exception {
		BorderPane bp = new BorderPane();
		VBox vb = new VBox();
		Label label1 = new Label("High school results (Tawjihi 2022)");
		label1.setFont(new Font(" High school results (Tawjihi 2022)", 30));
		label1.setPrefWidth(500);
		label1.setTranslateY(60);
		label1.setTranslateX(255);
		// label1.setStyle("-fx-background-color:violate; -fx-padding: 20px;");
		Label label2 = new Label("In The West Bank");
		label2.setFont(new Font("In The West Bank", 20));
		label2.setPrefWidth(500);
		label2.setTranslateY(80);
		label2.setTranslateX(370);

		ImageView LiteraryIm = new ImageView("https://cdn-icons-png.flaticon.com/512/5526/5526395.png");
		LiteraryIm.setFitWidth(30);
		LiteraryIm.setFitHeight(30);
		Button Literary = new Button("Literary ", LiteraryIm);
		Literary.setTranslateX(550);
		Literary.setTranslateY(90);
		Literary.setPrefSize(150, 50);
		Literary.setStyle("-fx-border-color:purple");

		ImageView ScienceIm = new ImageView("https://cdn-icons-png.flaticon.com/512/2821/2821637.png");
		ScienceIm.setFitWidth(30);
		ScienceIm.setFitHeight(30);
		Button Science = new Button("Science", ScienceIm);
		Science.setTranslateX(250);
		Science.setTranslateY(20);
		Science.setPrefSize(150, 50);
		Science.setStyle("-fx-border-color:purple");

		ImageView BackIm = new ImageView("https://cdn-icons-png.flaticon.com/512/8482/8482632.png");
		BackIm.setFitWidth(30);
		BackIm.setFitHeight(30);
		Button Back = new Button("Back", BackIm);
		Back.setTranslateX(405);
		Back.setTranslateY(20);
		Back.setPrefSize(150, 50);
		Back.setStyle("-fx-border-color:purple");

		Image image = new Image("C:\\Users\\Admin\\Desktop\\Data Strctur\\project_1\\Capture.PNG");
		ImageView imageView = new ImageView();
		imageView.setImage(image);
		imageView.setFitWidth(1000);
		imageView.setFitHeight(250);
		imageView.setTranslateY(45);

		vb.getChildren().addAll(label1, label2, Literary, Science, Back, imageView);
		vb.setSpacing(20);

		bp.setCenter(vb);

		Literary.setOnAction(e -> {
			try {
				listWBL(stage);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});

		Science.setOnAction(e -> {
			try {
				listWBS(stage);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});

		Back.setOnAction(e -> {
			try {
				start(stage);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});
		// bp.setStyle("-fx-background-color: white;");
		Scene scene = new Scene(bp, 1000, 600);
		stage.setScene(scene);
		stage.show();

	}

	public void GLS(Stage stage) throws Exception {
		BorderPane bp = new BorderPane();
		VBox vb = new VBox();
		Label label1 = new Label("High school results (Tawjihi 2022)");
		label1.setFont(new Font(" High school results (Tawjihi 2022)", 30));
		label1.setPrefWidth(500);
		label1.setTranslateY(60);
		label1.setTranslateX(255);
		// label1.setStyle("-fx-background-color:violate; -fx-padding: 20px;");
		Label label2 = new Label("In The Gaza");
		label2.setFont(new Font("In The Gaza", 20));
		label2.setPrefWidth(500);
		label2.setTranslateY(80);
		label2.setTranslateX(420);

		ImageView LiteraryIm = new ImageView("https://cdn-icons-png.flaticon.com/512/5526/5526395.png");
		LiteraryIm.setFitWidth(30);
		LiteraryIm.setFitHeight(30);
		Button Literary = new Button("Literary ", LiteraryIm);
		Literary.setTranslateX(550);
		Literary.setTranslateY(90);
		Literary.setPrefSize(150, 50);
		Literary.setStyle("-fx-border-color:purple");

		ImageView ScienceIm = new ImageView("https://cdn-icons-png.flaticon.com/512/2821/2821637.png");
		ScienceIm.setFitWidth(30);
		ScienceIm.setFitHeight(30);
		Button Science = new Button("Science", ScienceIm);
		Science.setTranslateX(250);
		Science.setTranslateY(20);
		Science.setPrefSize(150, 50);
		Science.setStyle("-fx-border-color:purple");

		ImageView BackIm = new ImageView("https://cdn-icons-png.flaticon.com/512/8482/8482632.png");
		BackIm.setFitWidth(30);
		BackIm.setFitHeight(30);
		Button Back = new Button("Back", BackIm);
		Back.setTranslateX(405);
		Back.setTranslateY(20);
		Back.setPrefSize(150, 50);
		Back.setStyle("-fx-border-color:purple");

		Image image = new Image("C:\\Users\\Admin\\Desktop\\Data Strctur\\project_1\\Capture.PNG");
		ImageView imageView = new ImageView();
		imageView.setImage(image);
		imageView.setFitWidth(1000);
		imageView.setFitHeight(250);
		imageView.setTranslateY(45);

		vb.getChildren().addAll(label1, label2, Literary, Science, Back, imageView);
		vb.setSpacing(20);

		bp.setCenter(vb);

		Literary.setOnAction(e -> {
			try {
				listGL(stage);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});

		Science.setOnAction(e -> {
			try {
				listGS(stage);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});

		Back.setOnAction(e -> {
			try {
				start(stage);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});
		// bp.setStyle("-fx-background-color: white;");
		Scene scene = new Scene(bp, 1000, 600);
		stage.setScene(scene);
		stage.show();

	}

	public void listWBL(Stage stage) throws Exception {
		BorderPane bp = new BorderPane();
		VBox vb1 = new VBox();
		Label label1 = new Label("High school results (Tawjihi 2022)");
		label1.setFont(new Font(" High school results (Tawjihi 2022)", 30));
		label1.setPrefWidth(500);
		label1.setTranslateY(60);
		label1.setTranslateX(255);
		// label1.setStyle("-fx-background-color:violate; -fx-padding: 20px;");
		Label label2 = new Label("In The West Bank ( Literary )");
		label2.setFont(new Font("In The West Bank ( Literary )", 20));
		label2.setPrefWidth(500);
		label2.setTranslateY(80);
		label2.setTranslateX(370);

		Button Insert = new Button(" Insert new Student ");
		Insert.setTranslateX(100);
		Insert.setTranslateY(90);
		Insert.setPrefSize(230, 20);
		Insert.setStyle("-fx-border-color:purple");

		Button delete = new Button(" Delete Student ");
		delete.setTranslateX(100);
		delete.setTranslateY(90);
		delete.setPrefSize(230, 20);
		delete.setStyle("-fx-border-color:purple");

		Button search = new Button(" Search ");
		search.setTranslateX(100);
		search.setTranslateY(90);
		search.setPrefSize(230, 20);
		search.setStyle("-fx-border-color:purple");

		Button DTopS = new Button(" Display The Top 10 Students ");
		DTopS.setTranslateX(100);
		DTopS.setTranslateY(90);
		DTopS.setPrefSize(230, 20);
		DTopS.setStyle("-fx-border-color:purple");

		Button mean = new Button(" Display the mean ");
		mean.setTranslateX(450);
		mean.setTranslateY(-60);
		mean.setPrefSize(230, 20);
		mean.setStyle("-fx-border-color:purple");

		Button modA = new Button(" display the mode average  ");
		modA.setTranslateX(450);
		modA.setTranslateY(-60);
		modA.setPrefSize(230, 20);
		modA.setStyle("-fx-border-color:purple");

		Button numOfS = new Button(" Number And Percentage Of Students   ");
		numOfS.setTranslateX(450);
		numOfS.setTranslateY(-60);
		numOfS.setPrefSize(230, 20);
		numOfS.setStyle("-fx-border-color:purple");

		Button exit = new Button(" Exit  ");
		exit.setTranslateX(450);
		exit.setTranslateY(-60);
		exit.setPrefSize(230, 20);
		exit.setStyle("-fx-border-color:purple");

		Image image = new Image("C:\\Users\\Admin\\Desktop\\Data Strctur\\project_1\\Capture.PNG");
		ImageView imageView = new ImageView();
		imageView.setImage(image);
		imageView.setFitWidth(1000);
		imageView.setFitHeight(250);
		imageView.setTranslateY(-40);

		vb1.getChildren().addAll(label1, label2, Insert, delete, search, DTopS, mean, modA, numOfS, exit, imageView);
		vb1.setSpacing(10);

		bp.setCenter(vb1);

		Insert.setOnAction(a -> {
			try {
				addStudentWBL(stage);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

		delete.setOnAction(d -> {
			try {
				deleteStudentWBL(stage);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

		search.setOnAction(u -> {
			try {
				searchStudentWBL(stage);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

		DTopS.setOnAction(s -> {
			try {
				TopStudentWBL(stage);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

		mean.setOnAction(p -> {
			try {
				meanStudentWBL(stage);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

		modA.setOnAction(m -> {
			try {
				modeAStudentWBL(stage);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

		numOfS.setOnAction(m -> {
			try {
				returnNPStudentWBL(stage);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

		exit.setOnAction(m -> {
			try {
				WBLS(stage);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

		Scene scene = new Scene(bp, 1000, 600);
		stage.setScene(scene);
		stage.setTitle(" * List * ");
		stage.show();

	}

	private void addStudentWBL(Stage stage) throws Exception {
		BorderPane bp = new BorderPane();
		VBox vb1 = new VBox();

		Label label1 = new Label("High school results (Tawjihi 2022)");
		label1.setFont(new Font(" High school results (Tawjihi 2022)", 30));
		label1.setPrefWidth(500);
		label1.setTranslateY(60);
		label1.setTranslateX(255);
		// label1.setStyle("-fx-background-color:violate; -fx-padding: 20px;");
		Label label2 = new Label("Insert Student In WestBank ( Literary )");
		label2.setFont(new Font("Insert Student In WestBank ( Literary )", 20));
		label2.setPrefWidth(500);
		label2.setTranslateY(80);
		label2.setTranslateX(300);

		Label num = new Label(" Student Seat Number : ");
		num.setFont(new Font(15));
		num.setPrefWidth(200);
		num.setTranslateY(80);
		num.setTranslateX(170);

		Label branch = new Label(" Branch : ");
		branch.setFont(new Font(15));
		branch.setPrefWidth(200);
		branch.setTranslateY(80);
		branch.setTranslateX(170);

		Label average = new Label(" Average : ");
		average.setFont(new Font(15));
		average.setPrefWidth(200);
		average.setTranslateY(80);
		average.setTranslateX(170);

		GridPane gp = new GridPane();
		gp.setVgap(10);
		TextField numTF = new TextField();
		numTF.setPromptText(" Student Seat Number ");
		numTF.setTranslateX(330);
		numTF.setTranslateY(-13);
		numTF.setPrefWidth(150);
		gp.add(numTF, 3, 0);

		TextField branchTF = new TextField();
		branchTF.setPromptText(" Branch ");
		branchTF.setTranslateX(330);
		branchTF.setTranslateY(-15);
		branchTF.setPrefWidth(150);
		gp.add(branchTF, 3, 1);
		branchTF.setDisable(true);
		numTF.setOnKeyTyped(n -> {
			branchTF.setDisable(false);
		});

		TextField AverageTF = new TextField();
		AverageTF.setPrefWidth(150);
		gp.add(AverageTF, 3, 2);
		AverageTF.setPromptText(" Average ");
		AverageTF.setTranslateX(330);
		AverageTF.setTranslateY(-10);
		AverageTF.setDisable(true);
		branchTF.setOnKeyTyped(n -> {
			AverageTF.setDisable(false);
		});

		ImageView insertIm = new ImageView("https://img.icons8.com/color/344/add.png");
		insertIm.setFitWidth(30);
		insertIm.setFitHeight(30);
		Button insertB = new Button("Insert", insertIm);
		insertB.setTranslateX(300);
		insertB.setTranslateY(5);
		insertB.setPrefSize(150, 30);
		insertB.setStyle("-fx-border-color:purple");

		ImageView backIm = new ImageView("https://img.icons8.com/fluency/344/circled-left-2.png");
		backIm.setFitWidth(30);
		backIm.setFitHeight(30);
		Button backB = new Button("Back", backIm);
		backB.setTranslateX(490);
		backB.setTranslateY(-45);
		backB.setPrefSize(150, 30);
		backB.setStyle("-fx-border-color:purple");

		Image image = new Image("C:\\Users\\Admin\\Desktop\\Data Strctur\\project_1\\Capture.PNG");
		ImageView imageView = new ImageView();
		imageView.setImage(image);
		imageView.setFitWidth(1000);
		imageView.setFitHeight(250);
		imageView.setTranslateY(-45);

		vb1.getChildren().addAll(label1, label2, num, branch, average, gp, insertB, backB, imageView);
		vb1.setSpacing(10);

		bp.setCenter(vb1);

		insertB.setOnAction(a -> {

		int count = 0 ;	 
		WestBank.insertSorted(count,new Node(numTF.getText(), branchTF.getText(),AverageTF.getText()));
		count ++;
		System.out.println(literary); 
		});

		backB.setOnAction(b -> {
			try {
				listWBL(stage);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

		Scene scene = new Scene(bp, 1000, 600);
		stage.setScene(scene);
		stage.setTitle(" * Insert Student  * ");
		stage.show();
	}

	private void deleteStudentWBL(Stage stage) throws Exception {

		BorderPane bp = new BorderPane();
		VBox vb1 = new VBox();

		Label label1 = new Label("High school results (Tawjihi 2022)");
		label1.setFont(new Font(" High school results (Tawjihi 2022)", 30));
		label1.setPrefWidth(500);
		label1.setTranslateY(60);
		label1.setTranslateX(255);

		Label label2 = new Label("Detete Student In WestBank ( Literary )");
		label2.setFont(new Font("Delete Student In WestBank ( Literary )", 20));
		label2.setPrefWidth(500);
		label2.setTranslateY(80);
		label2.setTranslateX(300);

		Label num = new Label(" Student Seat Number : ");
		num.setFont(new Font(15));
		num.setPrefWidth(200);
		num.setTranslateY(80);
		num.setTranslateX(170);

		Label result = new Label(" Result : ");
		result.setFont(new Font(15));
		result.setPrefWidth(200);
		result.setTranslateY(80);
		result.setTranslateX(170);

		GridPane gp = new GridPane();
		gp.setVgap(10);
		TextField numTF = new TextField();
		numTF.setPromptText(" Student Seat Number ");
		numTF.setTranslateX(330);
		numTF.setTranslateY(-13);
		numTF.setPrefWidth(150);
		gp.add(numTF, 3, 3);

		Label result2 = new Label();
		result2.setFont(new Font(15));
		result2.setPrefWidth(400);
		result2.setPrefHeight(5);
		result2.setTranslateY(-10);
		result2.setTranslateX(330);
		gp.add(result2, 3, 4);
		result2.setStyle("-fx-background-color: Thistle; -fx-padding: 20px;");

		ImageView deleteIm = new ImageView("https://cdn-icons-png.flaticon.com/512/3221/3221897.png");
		deleteIm.setFitWidth(30);
		deleteIm.setFitHeight(30);
		Button deleteB = new Button("Delete", deleteIm);
		deleteB.setTranslateX(300);
		deleteB.setTranslateY(5);
		deleteB.setPrefSize(150, 30);
		deleteB.setStyle("-fx-border-color:purple");

		ImageView backIm = new ImageView("https://img.icons8.com/fluency/344/circled-left-2.png");
		backIm.setFitWidth(30);
		backIm.setFitHeight(30);
		Button backB = new Button("Back", backIm);
		backB.setTranslateX(490);
		backB.setTranslateY(-45);
		backB.setPrefSize(150, 30);
		backB.setStyle("-fx-border-color:purple");

		Image image = new Image("C:\\Users\\Admin\\Desktop\\Data Strctur\\project_1\\Capture.PNG");
		ImageView imageView = new ImageView();
		imageView.setImage(image);
		imageView.setFitWidth(1000);
		imageView.setFitHeight(250);
		imageView.setTranslateY(-45);

		vb1.getChildren().addAll(label1, label2, num, result, gp, deleteB, backB, imageView);
		vb1.setSpacing(10);

		bp.setCenter(vb1);

		deleteB.setOnAction(a -> {

			/*
			 * mange.addCustomer(nameTF.getText(), idTF.getText(), mobileTF.getText(),
			 * addressTF.getText(), planTF.getText());
			 * 
			 * System.out.println(mange.customers); try {
			 * 
			 * if (outputFile.createNewFile()) { System.out.println("File created: " +
			 * outputFile.getName()); } else { System.out.println("File already exists."); }
			 * FileWriter myWriter = new FileWriter("out.txt"); for (int i = 0; i <
			 * mange.customers.size(); i++) {
			 * myWriter.write(mange.customers.get(i).toString() + "\n"); } myWriter.close();
			 * } catch (IOException e) { System.out.println("An error occurred.");
			 * e.printStackTrace(); }
			 */
		});

		backB.setOnAction(b -> {
			try {
				listWBL(stage);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

		Scene scene = new Scene(bp, 1000, 600);
		stage.setScene(scene);
		stage.setTitle(" * Delete Student  * ");

	}

	private void searchStudentWBL(Stage stage) throws Exception {

		BorderPane bp = new BorderPane();
		VBox vb1 = new VBox();

		Label label1 = new Label("High school results (Tawjihi 2022)");
		label1.setFont(new Font(" High school results (Tawjihi 2022)", 30));
		label1.setPrefWidth(500);
		label1.setTranslateY(60);
		label1.setTranslateX(255);

		Label label2 = new Label("Search Student In WestBank ( Literary )");
		label2.setFont(new Font("Search Student In WestBank ( Literary )", 20));
		label2.setPrefWidth(500);
		label2.setTranslateY(80);
		label2.setTranslateX(300);

		Label num = new Label(" Student Seat Number : ");
		num.setFont(new Font(15));
		num.setPrefWidth(200);
		num.setTranslateY(80);
		num.setTranslateX(170);

		Label result = new Label(" Result : ");
		result.setFont(new Font(15));
		result.setPrefWidth(200);
		result.setTranslateY(80);
		result.setTranslateX(170);

		GridPane gp = new GridPane();
		gp.setVgap(10);
		TextField numTF = new TextField();
		numTF.setPromptText(" Student Seat Number ");
		numTF.setTranslateX(330);
		numTF.setTranslateY(-13);
		numTF.setPrefWidth(150);
		gp.add(numTF, 3, 3);

		Label result2 = new Label();
		result2.setFont(new Font(15));
		result2.setPrefWidth(200);
		result2.setPrefHeight(5);
		result2.setTranslateY(-10);
		result2.setTranslateX(330);
		gp.add(result2, 3, 4);
		result2.setStyle("-fx-background-color: Thistle; -fx-padding: 20px;");

		ImageView searchIm = new ImageView("https://cdn-icons-png.flaticon.com/512/954/954591.png");
		searchIm.setFitWidth(30);
		searchIm.setFitHeight(30);
		Button searchB = new Button("Search", searchIm);
		searchB.setTranslateX(300);
		searchB.setTranslateY(5);
		searchB.setPrefSize(150, 30);
		searchB.setStyle("-fx-border-color:purple");

		ImageView backIm = new ImageView("https://img.icons8.com/fluency/344/circled-left-2.png");
		backIm.setFitWidth(30);
		backIm.setFitHeight(30);
		Button backB = new Button("Back", backIm);
		backB.setTranslateX(490);
		backB.setTranslateY(-45);
		backB.setPrefSize(150, 30);
		backB.setStyle("-fx-border-color:purple");

		Image image = new Image("C:\\Users\\Admin\\Desktop\\Data Strctur\\project_1\\Capture.PNG");
		ImageView imageView = new ImageView();
		imageView.setImage(image);
		imageView.setFitWidth(1000);
		imageView.setFitHeight(250);
		imageView.setTranslateY(-45);

		vb1.getChildren().addAll(label1, label2, num, result, gp, searchB, backB, imageView);
		vb1.setSpacing(10);

		bp.setCenter(vb1);

		searchB.setOnAction(a -> {

			/*
			 * mange.addCustomer(nameTF.getText(), idTF.getText(), mobileTF.getText(),
			 * addressTF.getText(), planTF.getText());
			 * 
			 * System.out.println(mange.customers); try {
			 * 
			 * if (outputFile.createNewFile()) { System.out.println("File created: " +
			 * outputFile.getName()); } else { System.out.println("File already exists."); }
			 * FileWriter myWriter = new FileWriter("out.txt"); for (int i = 0; i <
			 * mange.customers.size(); i++) {
			 * myWriter.write(mange.customers.get(i).toString() + "\n"); } myWriter.close();
			 * } catch (IOException e) { System.out.println("An error occurred.");
			 * e.printStackTrace(); }
			 */
		});

		backB.setOnAction(b -> {
			try {
				listWBL(stage);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

		Scene scene = new Scene(bp, 1000, 600);
		stage.setScene(scene);
		stage.setTitle(" * Delete Student  * ");

	}

	private void TopStudentWBL(Stage stage) throws Exception {

		BorderPane bp = new BorderPane();
		VBox vb1 = new VBox();

		Label label1 = new Label("High school results (Tawjihi 2022)");
		label1.setFont(new Font(" High school results (Tawjihi 2022)", 30));
		label1.setPrefWidth(500);
		label1.setTranslateY(60);
		label1.setTranslateX(255);

		Label label2 = new Label(" Student In WestBank ( Literary )");
		label2.setFont(new Font(" Student In WestBank ( Literary )", 20));
		label2.setPrefWidth(500);
		label2.setTranslateY(80);
		label2.setTranslateX(300);

		Label top = new Label(" Top 10 Student In Literary : ");
		top.setFont(new Font(15));
		top.setPrefWidth(200);
		top.setTranslateY(80);
		top.setTranslateX(170);

		GridPane gp = new GridPane();
		gp.setVgap(10);
		TextArea area = new TextArea();
		area.setPromptText(" Top 10 Student  ");
		area.setTranslateX(365);
		area.setTranslateY(10);
		area.setPrefWidth(300);
		area.setDisable(true);
		gp.add(area, 3, 3);

		// result2.setStyle("-fx-background-color: Thistle; -fx-padding: 20px;");

		ImageView resultIm = new ImageView("https://cdn-icons-png.flaticon.com/512/1162/1162914.png");
		resultIm.setFitWidth(30);
		resultIm.setFitHeight(30);
		Button resultB = new Button("Result", resultIm);
		resultB.setTranslateX(300);
		resultB.setTranslateY(25);
		resultB.setPrefSize(150, 30);
		resultB.setStyle("-fx-border-color:purple");

		ImageView backIm = new ImageView("https://img.icons8.com/fluency/344/circled-left-2.png");
		backIm.setFitWidth(30);
		backIm.setFitHeight(30);
		Button backB = new Button("Back", backIm);
		backB.setTranslateX(490);
		backB.setTranslateY(-25);
		backB.setPrefSize(150, 30);
		backB.setStyle("-fx-border-color:purple");

		Image image = new Image("C:\\Users\\Admin\\Desktop\\Data Strctur\\project_1\\Capture.PNG");
		ImageView imageView = new ImageView();
		imageView.setImage(image);
		imageView.setFitWidth(1000);
		imageView.setFitHeight(250);
		imageView.setTranslateY(-10);

		vb1.getChildren().addAll(label1, label2, top, gp, resultB, backB, imageView);
		vb1.setSpacing(10);

		bp.setCenter(vb1);

		resultB.setOnAction(a -> {

			/*
			 * mange.addCustomer(nameTF.getText(), idTF.getText(), mobileTF.getText(),
			 * addressTF.getText(), planTF.getText());
			 * 
			 * System.out.println(mange.customers); try {
			 * 
			 * if (outputFile.createNewFile()) { System.out.println("File created: " +
			 * outputFile.getName()); } else { System.out.println("File already exists."); }
			 * FileWriter myWriter = new FileWriter("out.txt"); for (int i = 0; i <
			 * mange.customers.size(); i++) {
			 * myWriter.write(mange.customers.get(i).toString() + "\n"); } myWriter.close();
			 * } catch (IOException e) { System.out.println("An error occurred.");
			 * e.printStackTrace(); }
			 */
		});

		backB.setOnAction(b -> {
			try {
				listWBL(stage);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

		Scene scene = new Scene(bp, 1000, 600);
		stage.setScene(scene);
		stage.setTitle(" * Delete Student  * ");

	}

	private void meanStudentWBL(Stage stage) throws Exception {

		BorderPane bp = new BorderPane();
		VBox vb1 = new VBox();

		Label label1 = new Label("High school results (Tawjihi 2022)");
		label1.setFont(new Font(" High school results (Tawjihi 2022)", 30));
		label1.setPrefWidth(500);
		label1.setTranslateY(60);
		label1.setTranslateX(255);

		Label label2 = new Label("Mean Student In WestBank ( Literary )");
		label2.setFont(new Font("Mean Student In WestBank ( Literary )", 20));
		label2.setPrefWidth(500);
		label2.setTranslateY(80);
		label2.setTranslateX(300);

		Label mean = new Label("Mean Student Literary : ");
		mean.setFont(new Font(15));
		mean.setPrefWidth(200);
		mean.setTranslateY(80);
		mean.setTranslateX(170);

		GridPane gp = new GridPane();
		gp.setVgap(10);
		TextField meanTF = new TextField();
		meanTF.setPromptText("  Mean Student ");
		meanTF.setTranslateX(330);
		meanTF.setTranslateY(18);
		meanTF.setPrefWidth(150);
		meanTF.setDisable(true);
		gp.add(meanTF, 3, 3);

		ImageView resultIm = new ImageView("https://cdn-icons-png.flaticon.com/512/1162/1162914.png");
		resultIm.setFitWidth(30);
		resultIm.setFitHeight(30);
		Button resultB = new Button("Result", resultIm);
		resultB.setTranslateX(300);
		resultB.setTranslateY(85);
		resultB.setPrefSize(150, 30);
		resultB.setStyle("-fx-border-color:purple");

		ImageView backIm = new ImageView("https://img.icons8.com/fluency/344/circled-left-2.png");
		backIm.setFitWidth(30);
		backIm.setFitHeight(30);
		Button backB = new Button("Back", backIm);
		backB.setTranslateX(490);
		backB.setTranslateY(35);
		backB.setPrefSize(150, 30);
		backB.setStyle("-fx-border-color:purple");

		Image image = new Image("C:\\Users\\Admin\\Desktop\\Data Strctur\\project_1\\Capture.PNG");
		ImageView imageView = new ImageView();
		imageView.setImage(image);
		imageView.setFitWidth(1000);
		imageView.setFitHeight(250);
		imageView.setTranslateY(55);

		vb1.getChildren().addAll(label1, label2, mean, gp, resultB, backB, imageView);
		vb1.setSpacing(10);

		bp.setCenter(vb1);

		resultB.setOnAction(a -> {

			/*
			 * mange.addCustomer(nameTF.getText(), idTF.getText(), mobileTF.getText(),
			 * addressTF.getText(), planTF.getText());
			 * 
			 * System.out.println(mange.customers); try {
			 * 
			 * if (outputFile.createNewFile()) { System.out.println("File created: " +
			 * outputFile.getName()); } else { System.out.println("File already exists."); }
			 * FileWriter myWriter = new FileWriter("out.txt"); for (int i = 0; i <
			 * mange.customers.size(); i++) {
			 * myWriter.write(mange.customers.get(i).toString() + "\n"); } myWriter.close();
			 * } catch (IOException e) { System.out.println("An error occurred.");
			 * e.printStackTrace(); }
			 */
		});

		backB.setOnAction(b -> {
			try {
				listWBL(stage);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

		Scene scene = new Scene(bp, 1000, 600);
		stage.setScene(scene);
		stage.setTitle(" * Delete Student  * ");

	}

	private void modeAStudentWBL(Stage stage) throws Exception {

		BorderPane bp = new BorderPane();
		VBox vb1 = new VBox();

		Label label1 = new Label("High school results (Tawjihi 2022)");
		label1.setFont(new Font(" High school results (Tawjihi 2022)", 30));
		label1.setPrefWidth(500);
		label1.setTranslateY(60);
		label1.setTranslateX(255);

		Label label2 = new Label("Mode Average Student In WestBank ( Literary )");
		label2.setFont(new Font("Mode Average Student In WestBank ( Literary )", 20));
		label2.setPrefWidth(500);
		label2.setTranslateY(80);
		label2.setTranslateX(300);

		Label mode = new Label("Mode Average Student Literary : ");
		mode.setFont(new Font(15));
		mode.setPrefWidth(300);
		mode.setTranslateY(80);
		mode.setTranslateX(170);

		GridPane gp = new GridPane();
		gp.setVgap(10);
		TextField modeTF = new TextField();
		modeTF.setPromptText("  Mode Average ");
		modeTF.setTranslateX(390);
		modeTF.setTranslateY(18);
		modeTF.setPrefWidth(150);
		modeTF.setDisable(true);
		gp.add(modeTF, 3, 3);

		ImageView resultIm = new ImageView("https://cdn-icons-png.flaticon.com/512/1162/1162914.png");
		resultIm.setFitWidth(30);
		resultIm.setFitHeight(30);
		Button resultB = new Button("Result", resultIm);
		resultB.setTranslateX(300);
		resultB.setTranslateY(85);
		resultB.setPrefSize(150, 30);
		resultB.setStyle("-fx-border-color:purple");

		ImageView backIm = new ImageView("https://img.icons8.com/fluency/344/circled-left-2.png");
		backIm.setFitWidth(30);
		backIm.setFitHeight(30);
		Button backB = new Button("Back", backIm);
		backB.setTranslateX(490);
		backB.setTranslateY(35);
		backB.setPrefSize(150, 30);
		backB.setStyle("-fx-border-color:purple");

		Image image = new Image("C:\\Users\\Admin\\Desktop\\Data Strctur\\project_1\\Capture.PNG");
		ImageView imageView = new ImageView();
		imageView.setImage(image);
		imageView.setFitWidth(1000);
		imageView.setFitHeight(250);
		imageView.setTranslateY(55);

		vb1.getChildren().addAll(label1, label2, mode, gp, resultB, backB, imageView);
		vb1.setSpacing(10);

		bp.setCenter(vb1);

		resultB.setOnAction(a -> {

			/*
			 * mange.addCustomer(nameTF.getText(), idTF.getText(), mobileTF.getText(),
			 * addressTF.getText(), planTF.getText());
			 * 
			 * System.out.println(mange.customers); try {
			 * 
			 * if (outputFile.createNewFile()) { System.out.println("File created: " +
			 * outputFile.getName()); } else { System.out.println("File already exists."); }
			 * FileWriter myWriter = new FileWriter("out.txt"); for (int i = 0; i <
			 * mange.customers.size(); i++) {
			 * myWriter.write(mange.customers.get(i).toString() + "\n"); } myWriter.close();
			 * } catch (IOException e) { System.out.println("An error occurred.");
			 * e.printStackTrace(); }
			 */
		});

		backB.setOnAction(b -> {
			try {
				listWBL(stage);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

		Scene scene = new Scene(bp, 1000, 600);
		stage.setScene(scene);
		stage.setTitle(" * Delete Student  * ");

	}

	private void returnNPStudentWBL(Stage stage) throws Exception {

		BorderPane bp = new BorderPane();
		VBox vb1 = new VBox();

		Label label1 = new Label("High school results (Tawjihi 2022)");
		label1.setFont(new Font(" High school results (Tawjihi 2022)", 30));
		label1.setPrefWidth(500);
		label1.setTranslateY(60);
		label1.setTranslateX(255);

		Label label2 = new Label("Return Student In WestBank ( Literary )");
		label2.setFont(new Font("Return Student In WestBank ( Literary )", 20));
		label2.setPrefWidth(500);
		label2.setTranslateY(80);
		label2.setTranslateX(300);

		Label average = new Label(" Average : ");
		average.setFont(new Font(15));
		average.setPrefWidth(200);
		average.setTranslateY(80);
		average.setTranslateX(170);

		Label result = new Label(" Result : ");
		result.setFont(new Font(15));
		result.setPrefWidth(200);
		result.setTranslateY(80);
		result.setTranslateX(170);

		GridPane gp = new GridPane();
		gp.setVgap(10);
		TextField numTF = new TextField();
		numTF.setPromptText(" Average ");
		numTF.setTranslateX(330);
		numTF.setTranslateY(-13);
		numTF.setPrefWidth(150);
		gp.add(numTF, 3, 3);

		Label result2 = new Label();
		result2.setFont(new Font(15));
		result2.setPrefWidth(200);
		result2.setPrefHeight(5);
		result2.setTranslateY(-10);
		result2.setTranslateX(330);
		gp.add(result2, 3, 4);
		result2.setStyle("-fx-background-color: Thistle; -fx-padding: 20px;");

		ImageView returnIm = new ImageView("https://cdn-icons-png.flaticon.com/512/1585/1585197.png");
		returnIm.setFitWidth(30);
		returnIm.setFitHeight(30);
		Button returnB = new Button("Return", returnIm);
		returnB.setTranslateX(300);
		returnB.setTranslateY(5);
		returnB.setPrefSize(150, 30);
		returnB.setStyle("-fx-border-color:purple");

		ImageView backIm = new ImageView("https://img.icons8.com/fluency/344/circled-left-2.png");
		backIm.setFitWidth(30);
		backIm.setFitHeight(30);
		Button backB = new Button("Back", backIm);
		backB.setTranslateX(490);
		backB.setTranslateY(-45);
		backB.setPrefSize(150, 30);
		backB.setStyle("-fx-border-color:purple");

		Image image = new Image("C:\\Users\\Admin\\Desktop\\Data Strctur\\project_1\\Capture.PNG");
		ImageView imageView = new ImageView();
		imageView.setImage(image);
		imageView.setFitWidth(1000);
		imageView.setFitHeight(250);
		imageView.setTranslateY(-45);

		vb1.getChildren().addAll(label1, label2, average, result, gp, returnB, backB, imageView);
		vb1.setSpacing(10);

		bp.setCenter(vb1);

		returnB.setOnAction(a -> {

			/*
			 * mange.addCustomer(nameTF.getText(), idTF.getText(), mobileTF.getText(),
			 * addressTF.getText(), planTF.getText());
			 * 
			 * System.out.println(mange.customers); try {
			 * 
			 * if (outputFile.createNewFile()) { System.out.println("File created: " +
			 * outputFile.getName()); } else { System.out.println("File already exists."); }
			 * FileWriter myWriter = new FileWriter("out.txt"); for (int i = 0; i <
			 * mange.customers.size(); i++) {
			 * myWriter.write(mange.customers.get(i).toString() + "\n"); } myWriter.close();
			 * } catch (IOException e) { System.out.println("An error occurred.");
			 * e.printStackTrace(); }
			 */
		});

		backB.setOnAction(b -> {
			try {
				listWBL(stage);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

		Scene scene = new Scene(bp, 1000, 600);
		stage.setScene(scene);
		stage.setTitle(" * Delete Student  * ");

	}

	public void listWBS(Stage stage) throws Exception {
		BorderPane bp = new BorderPane();
		VBox vb1 = new VBox();
		Label label1 = new Label("High school results (Tawjihi 2022)");
		label1.setFont(new Font(" High school results (Tawjihi 2022)", 30));
		label1.setPrefWidth(500);
		label1.setTranslateY(60);
		label1.setTranslateX(255);
		// label1.setStyle("-fx-background-color:violate; -fx-padding: 20px;");
		Label label2 = new Label("In The West Bank ( Science )");
		label2.setFont(new Font("In The West Bank ( Science )", 20));
		label2.setPrefWidth(500);
		label2.setTranslateY(80);
		label2.setTranslateX(370);

		Button Insert = new Button(" Insert new Student ");
		Insert.setTranslateX(100);
		Insert.setTranslateY(90);
		Insert.setPrefSize(230, 20);
		Insert.setStyle("-fx-border-color:purple");

		Button delete = new Button(" Delete Student ");
		delete.setTranslateX(100);
		delete.setTranslateY(90);
		delete.setPrefSize(230, 20);
		delete.setStyle("-fx-border-color:purple");

		Button search = new Button(" Search ");
		search.setTranslateX(100);
		search.setTranslateY(90);
		search.setPrefSize(230, 20);
		search.setStyle("-fx-border-color:purple");

		Button DTopS = new Button(" Display The Top 10 Students ");
		DTopS.setTranslateX(100);
		DTopS.setTranslateY(90);
		DTopS.setPrefSize(230, 20);
		DTopS.setStyle("-fx-border-color:purple");

		Button mean = new Button(" Display the mean ");
		mean.setTranslateX(450);
		mean.setTranslateY(-60);
		mean.setPrefSize(230, 20);
		mean.setStyle("-fx-border-color:purple");

		Button modA = new Button(" display the mode average  ");
		modA.setTranslateX(450);
		modA.setTranslateY(-60);
		modA.setPrefSize(230, 20);
		modA.setStyle("-fx-border-color:purple");

		Button numOfS = new Button(" Number And Percentage Of Students   ");
		numOfS.setTranslateX(450);
		numOfS.setTranslateY(-60);
		numOfS.setPrefSize(230, 20);
		numOfS.setStyle("-fx-border-color:purple");

		Button exit = new Button(" Exit  ");
		exit.setTranslateX(450);
		exit.setTranslateY(-60);
		exit.setPrefSize(230, 20);
		exit.setStyle("-fx-border-color:purple");

		Image image = new Image("C:\\Users\\Admin\\Desktop\\Data Strctur\\project_1\\Capture.PNG");
		ImageView imageView = new ImageView();
		imageView.setImage(image);
		imageView.setFitWidth(1000);
		imageView.setFitHeight(250);
		imageView.setTranslateY(-40);

		vb1.getChildren().addAll(label1, label2, Insert, delete, search, DTopS, mean, modA, numOfS, exit, imageView);
		vb1.setSpacing(10);

		bp.setCenter(vb1);

		Insert.setOnAction(a -> {
			try {
				addStudentWBS(stage);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

		delete.setOnAction(d -> {
			try {
				deleteStudentWBS(stage);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

		search.setOnAction(u -> {
			try {
				searchStudentWBS(stage);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

		DTopS.setOnAction(s -> {
			try {
				TopStudentWBS(stage);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

		mean.setOnAction(p -> {
			try {
				meanStudentWBS(stage);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

		modA.setOnAction(m -> {
			try {
				modeAStudentWBS(stage);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

		numOfS.setOnAction(m -> {
			try {
				returnNPStudentWBS(stage);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

		exit.setOnAction(m -> {
			try {
				WBLS(stage);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

		Scene scene = new Scene(bp, 1000, 600);
		stage.setScene(scene);
		stage.setTitle(" * List * ");
		stage.show();

	}

	private void addStudentWBS(Stage stage) throws Exception {
		BorderPane bp = new BorderPane();
		VBox vb1 = new VBox();

		Label label1 = new Label("High school results (Tawjihi 2022)");
		label1.setFont(new Font(" High school results (Tawjihi 2022)", 30));
		label1.setPrefWidth(500);
		label1.setTranslateY(60);
		label1.setTranslateX(255);
		// label1.setStyle("-fx-background-color:violate; -fx-padding: 20px;");
		Label label2 = new Label("Insert Student In WestBank ( Science )");
		label2.setFont(new Font("Insert Student In WestBank ( Science )", 20));
		label2.setPrefWidth(500);
		label2.setTranslateY(80);
		label2.setTranslateX(300);

		Label num = new Label(" Student Seat Number : ");
		num.setFont(new Font(15));
		num.setPrefWidth(200);
		num.setTranslateY(80);
		num.setTranslateX(170);

		Label branch = new Label(" Branch : ");
		branch.setFont(new Font(15));
		branch.setPrefWidth(200);
		branch.setTranslateY(80);
		branch.setTranslateX(170);

		Label average = new Label(" Average : ");
		average.setFont(new Font(15));
		average.setPrefWidth(200);
		average.setTranslateY(80);
		average.setTranslateX(170);

		GridPane gp = new GridPane();
		gp.setVgap(10);
		TextField numTF = new TextField();
		numTF.setPromptText(" Student Seat Number ");
		numTF.setTranslateX(330);
		numTF.setTranslateY(-13);
		numTF.setPrefWidth(150);
		gp.add(numTF, 3, 0);

		TextField branchTF = new TextField();
		branchTF.setPromptText(" Branch ");
		branchTF.setTranslateX(330);
		branchTF.setTranslateY(-15);
		branchTF.setPrefWidth(150);
		gp.add(branchTF, 3, 1);
		branchTF.setDisable(true);
		numTF.setOnKeyTyped(n -> {
			branchTF.setDisable(false);
		});

		TextField AverageTF = new TextField();
		AverageTF.setPrefWidth(150);
		gp.add(AverageTF, 3, 2);
		AverageTF.setPromptText(" Average ");
		AverageTF.setTranslateX(330);
		AverageTF.setTranslateY(-10);
		AverageTF.setDisable(true);
		branchTF.setOnKeyTyped(n -> {
			AverageTF.setDisable(false);
		});

		ImageView insertIm = new ImageView("https://img.icons8.com/color/344/add.png");
		insertIm.setFitWidth(30);
		insertIm.setFitHeight(30);
		Button insertB = new Button("Insert", insertIm);
		insertB.setTranslateX(300);
		insertB.setTranslateY(5);
		insertB.setPrefSize(150, 30);
		insertB.setStyle("-fx-border-color:purple");

		ImageView backIm = new ImageView("https://img.icons8.com/fluency/344/circled-left-2.png");
		backIm.setFitWidth(30);
		backIm.setFitHeight(30);
		Button backB = new Button("Back", backIm);
		backB.setTranslateX(490);
		backB.setTranslateY(-45);
		backB.setPrefSize(150, 30);
		backB.setStyle("-fx-border-color:purple");

		Image image = new Image("C:\\Users\\Admin\\Desktop\\Data Strctur\\project_1\\Capture.PNG");
		ImageView imageView = new ImageView();
		imageView.setImage(image);
		imageView.setFitWidth(1000);
		imageView.setFitHeight(250);
		imageView.setTranslateY(-45);

		vb1.getChildren().addAll(label1, label2, num, branch, average, gp, insertB, backB, imageView);
		vb1.setSpacing(10);

		bp.setCenter(vb1);

		insertB.setOnAction(a -> {

			/*
			 * mange.addCustomer(nameTF.getText(), idTF.getText(), mobileTF.getText(),
			 * addressTF.getText(), planTF.getText());
			 * 
			 * System.out.println(mange.customers); try {
			 * 
			 * if (outputFile.createNewFile()) { System.out.println("File created: " +
			 * outputFile.getName()); } else { System.out.println("File already exists."); }
			 * FileWriter myWriter = new FileWriter("out.txt"); for (int i = 0; i <
			 * mange.customers.size(); i++) {
			 * myWriter.write(mange.customers.get(i).toString() + "\n"); } myWriter.close();
			 * } catch (IOException e) { System.out.println("An error occurred.");
			 * e.printStackTrace(); }
			 */
		});

		backB.setOnAction(b -> {
			try {
				listWBS(stage);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

		Scene scene = new Scene(bp, 1000, 600);
		stage.setScene(scene);
		stage.setTitle(" * Insert Student  * ");
		stage.show();
	}

	private void deleteStudentWBS(Stage stage) throws Exception {

		BorderPane bp = new BorderPane();
		VBox vb1 = new VBox();

		Label label1 = new Label("High school results (Tawjihi 2022)");
		label1.setFont(new Font(" High school results (Tawjihi 2022)", 30));
		label1.setPrefWidth(500);
		label1.setTranslateY(60);
		label1.setTranslateX(255);

		Label label2 = new Label("Detete Student In WestBank ( Science )");
		label2.setFont(new Font("Delete Student In WestBank ( Science )", 20));
		label2.setPrefWidth(500);
		label2.setTranslateY(80);
		label2.setTranslateX(300);

		Label num = new Label(" Student Seat Number : ");
		num.setFont(new Font(15));
		num.setPrefWidth(200);
		num.setTranslateY(80);
		num.setTranslateX(170);

		Label result = new Label(" Result : ");
		result.setFont(new Font(15));
		result.setPrefWidth(200);
		result.setTranslateY(80);
		result.setTranslateX(170);

		GridPane gp = new GridPane();
		gp.setVgap(10);
		TextField numTF = new TextField();
		numTF.setPromptText(" Student Seat Number ");
		numTF.setTranslateX(330);
		numTF.setTranslateY(-13);
		numTF.setPrefWidth(150);
		gp.add(numTF, 3, 3);

		Label result2 = new Label();
		result2.setFont(new Font(15));
		result2.setPrefWidth(400);
		result2.setPrefHeight(5);
		result2.setTranslateY(-10);
		result2.setTranslateX(330);
		gp.add(result2, 3, 4);
		result2.setStyle("-fx-background-color: Thistle; -fx-padding: 20px;");

		ImageView deleteIm = new ImageView("https://cdn-icons-png.flaticon.com/512/3221/3221897.png");
		deleteIm.setFitWidth(30);
		deleteIm.setFitHeight(30);
		Button deleteB = new Button("Delete", deleteIm);
		deleteB.setTranslateX(300);
		deleteB.setTranslateY(5);
		deleteB.setPrefSize(150, 30);
		deleteB.setStyle("-fx-border-color:purple");

		ImageView backIm = new ImageView("https://img.icons8.com/fluency/344/circled-left-2.png");
		backIm.setFitWidth(30);
		backIm.setFitHeight(30);
		Button backB = new Button("Back", backIm);
		backB.setTranslateX(490);
		backB.setTranslateY(-45);
		backB.setPrefSize(150, 30);
		backB.setStyle("-fx-border-color:purple");

		Image image = new Image("C:\\Users\\Admin\\Desktop\\Data Strctur\\project_1\\Capture.PNG");
		ImageView imageView = new ImageView();
		imageView.setImage(image);
		imageView.setFitWidth(1000);
		imageView.setFitHeight(250);
		imageView.setTranslateY(-45);

		vb1.getChildren().addAll(label1, label2, num, result, gp, deleteB, backB, imageView);
		vb1.setSpacing(10);

		bp.setCenter(vb1);

		deleteB.setOnAction(a -> {

			/*
			 * mange.addCustomer(nameTF.getText(), idTF.getText(), mobileTF.getText(),
			 * addressTF.getText(), planTF.getText());
			 * 
			 * System.out.println(mange.customers); try {
			 * 
			 * if (outputFile.createNewFile()) { System.out.println("File created: " +
			 * outputFile.getName()); } else { System.out.println("File already exists."); }
			 * FileWriter myWriter = new FileWriter("out.txt"); for (int i = 0; i <
			 * mange.customers.size(); i++) {
			 * myWriter.write(mange.customers.get(i).toString() + "\n"); } myWriter.close();
			 * } catch (IOException e) { System.out.println("An error occurred.");
			 * e.printStackTrace(); }
			 */
		});

		backB.setOnAction(b -> {
			try {
				listWBS(stage);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

		Scene scene = new Scene(bp, 1000, 600);
		stage.setScene(scene);
		stage.setTitle(" * Delete Student  * ");

	}

	private void searchStudentWBS(Stage stage) throws Exception {

		BorderPane bp = new BorderPane();
		VBox vb1 = new VBox();

		Label label1 = new Label("High school results (Tawjihi 2022)");
		label1.setFont(new Font(" High school results (Tawjihi 2022)", 30));
		label1.setPrefWidth(500);
		label1.setTranslateY(60);
		label1.setTranslateX(255);

		Label label2 = new Label("Search Student In WestBank ( Science )");
		label2.setFont(new Font("Search Student In WestBank ( Science )", 20));
		label2.setPrefWidth(500);
		label2.setTranslateY(80);
		label2.setTranslateX(300);

		Label num = new Label(" Student Seat Number : ");
		num.setFont(new Font(15));
		num.setPrefWidth(200);
		num.setTranslateY(80);
		num.setTranslateX(170);

		Label result = new Label(" Result : ");
		result.setFont(new Font(15));
		result.setPrefWidth(200);
		result.setTranslateY(80);
		result.setTranslateX(170);

		GridPane gp = new GridPane();
		gp.setVgap(10);
		TextField numTF = new TextField();
		numTF.setPromptText(" Student Seat Number ");
		numTF.setTranslateX(330);
		numTF.setTranslateY(-13);
		numTF.setPrefWidth(150);
		gp.add(numTF, 3, 3);

		Label result2 = new Label();
		result2.setFont(new Font(15));
		result2.setPrefWidth(200);
		result2.setPrefHeight(5);
		result2.setTranslateY(-10);
		result2.setTranslateX(330);
		gp.add(result2, 3, 4);
		result2.setStyle("-fx-background-color: Thistle; -fx-padding: 20px;");

		ImageView searchIm = new ImageView("https://cdn-icons-png.flaticon.com/512/954/954591.png");
		searchIm.setFitWidth(30);
		searchIm.setFitHeight(30);
		Button searchB = new Button("Search", searchIm);
		searchB.setTranslateX(300);
		searchB.setTranslateY(5);
		searchB.setPrefSize(150, 30);
		searchB.setStyle("-fx-border-color:purple");

		ImageView backIm = new ImageView("https://img.icons8.com/fluency/344/circled-left-2.png");
		backIm.setFitWidth(30);
		backIm.setFitHeight(30);
		Button backB = new Button("Back", backIm);
		backB.setTranslateX(490);
		backB.setTranslateY(-45);
		backB.setPrefSize(150, 30);
		backB.setStyle("-fx-border-color:purple");

		Image image = new Image("C:\\Users\\Admin\\Desktop\\Data Strctur\\project_1\\Capture.PNG");
		ImageView imageView = new ImageView();
		imageView.setImage(image);
		imageView.setFitWidth(1000);
		imageView.setFitHeight(250);
		imageView.setTranslateY(-45);

		vb1.getChildren().addAll(label1, label2, num, result, gp, searchB, backB, imageView);
		vb1.setSpacing(10);

		bp.setCenter(vb1);

		searchB.setOnAction(a -> {

			/*
			 * mange.addCustomer(nameTF.getText(), idTF.getText(), mobileTF.getText(),
			 * addressTF.getText(), planTF.getText());
			 * 
			 * System.out.println(mange.customers); try {
			 * 
			 * if (outputFile.createNewFile()) { System.out.println("File created: " +
			 * outputFile.getName()); } else { System.out.println("File already exists."); }
			 * FileWriter myWriter = new FileWriter("out.txt"); for (int i = 0; i <
			 * mange.customers.size(); i++) {
			 * myWriter.write(mange.customers.get(i).toString() + "\n"); } myWriter.close();
			 * } catch (IOException e) { System.out.println("An error occurred.");
			 * e.printStackTrace(); }
			 */
		});

		backB.setOnAction(b -> {
			try {
				listWBS(stage);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

		Scene scene = new Scene(bp, 1000, 600);
		stage.setScene(scene);
		stage.setTitle(" * Search Student  * ");

	}

	private void TopStudentWBS(Stage stage) throws Exception {

		BorderPane bp = new BorderPane();
		VBox vb1 = new VBox();

		Label label1 = new Label("High school results (Tawjihi 2022)");
		label1.setFont(new Font(" High school results (Tawjihi 2022)", 30));
		label1.setPrefWidth(500);
		label1.setTranslateY(60);
		label1.setTranslateX(255);

		Label label2 = new Label(" Student In WestBank ( Science )");
		label2.setFont(new Font(" Student In WestBank ( Science )", 20));
		label2.setPrefWidth(500);
		label2.setTranslateY(80);
		label2.setTranslateX(300);

		Label top = new Label(" Top 10 Student In Science : ");
		top.setFont(new Font(15));
		top.setPrefWidth(200);
		top.setTranslateY(80);
		top.setTranslateX(170);

		GridPane gp = new GridPane();
		gp.setVgap(10);
		TextArea area = new TextArea();
		area.setPromptText(" Top 10 Student  ");
		area.setTranslateX(365);
		area.setTranslateY(10);
		area.setPrefWidth(300);
		area.setDisable(true);
		gp.add(area, 3, 3);

		// result2.setStyle("-fx-background-color: Thistle; -fx-padding: 20px;");

		ImageView resultIm = new ImageView("https://cdn-icons-png.flaticon.com/512/1162/1162914.png");
		resultIm.setFitWidth(30);
		resultIm.setFitHeight(30);
		Button resultB = new Button("Result", resultIm);
		resultB.setTranslateX(300);
		resultB.setTranslateY(25);
		resultB.setPrefSize(150, 30);
		resultB.setStyle("-fx-border-color:purple");

		ImageView backIm = new ImageView("https://img.icons8.com/fluency/344/circled-left-2.png");
		backIm.setFitWidth(30);
		backIm.setFitHeight(30);
		Button backB = new Button("Back", backIm);
		backB.setTranslateX(490);
		backB.setTranslateY(-25);
		backB.setPrefSize(150, 30);
		backB.setStyle("-fx-border-color:purple");

		Image image = new Image("C:\\Users\\Admin\\Desktop\\Data Strctur\\project_1\\Capture.PNG");
		ImageView imageView = new ImageView();
		imageView.setImage(image);
		imageView.setFitWidth(1000);
		imageView.setFitHeight(250);
		imageView.setTranslateY(-10);

		vb1.getChildren().addAll(label1, label2, top, gp, resultB, backB, imageView);
		vb1.setSpacing(10);

		bp.setCenter(vb1);

		resultB.setOnAction(a -> {

			/*
			 * mange.addCustomer(nameTF.getText(), idTF.getText(), mobileTF.getText(),
			 * addressTF.getText(), planTF.getText());
			 * 
			 * System.out.println(mange.customers); try {
			 * 
			 * if (outputFile.createNewFile()) { System.out.println("File created: " +
			 * outputFile.getName()); } else { System.out.println("File already exists."); }
			 * FileWriter myWriter = new FileWriter("out.txt"); for (int i = 0; i <
			 * mange.customers.size(); i++) {
			 * myWriter.write(mange.customers.get(i).toString() + "\n"); } myWriter.close();
			 * } catch (IOException e) { System.out.println("An error occurred.");
			 * e.printStackTrace(); }
			 */
		});

		backB.setOnAction(b -> {
			try {
				listWBS(stage);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

		Scene scene = new Scene(bp, 1000, 600);
		stage.setScene(scene);

	}

	private void meanStudentWBS(Stage stage) throws Exception {

		BorderPane bp = new BorderPane();
		VBox vb1 = new VBox();

		Label label1 = new Label("High school results (Tawjihi 2022)");
		label1.setFont(new Font(" High school results (Tawjihi 2022)", 30));
		label1.setPrefWidth(500);
		label1.setTranslateY(60);
		label1.setTranslateX(255);

		Label label2 = new Label("Mean Student In WestBank ( Science )");
		label2.setFont(new Font("Mean Student In WestBank ( Science )", 20));
		label2.setPrefWidth(500);
		label2.setTranslateY(80);
		label2.setTranslateX(300);

		Label mean = new Label("Mean Student Science : ");
		mean.setFont(new Font(15));
		mean.setPrefWidth(200);
		mean.setTranslateY(80);
		mean.setTranslateX(170);

		GridPane gp = new GridPane();
		gp.setVgap(10);
		TextField meanTF = new TextField();
		meanTF.setPromptText("  Mean Student ");
		meanTF.setTranslateX(330);
		meanTF.setTranslateY(18);
		meanTF.setPrefWidth(150);
		meanTF.setDisable(true);
		gp.add(meanTF, 3, 3);

		ImageView resultIm = new ImageView("https://cdn-icons-png.flaticon.com/512/1162/1162914.png");
		resultIm.setFitWidth(30);
		resultIm.setFitHeight(30);
		Button resultB = new Button("Result", resultIm);
		resultB.setTranslateX(300);
		resultB.setTranslateY(85);
		resultB.setPrefSize(150, 30);
		resultB.setStyle("-fx-border-color:purple");

		ImageView backIm = new ImageView("https://img.icons8.com/fluency/344/circled-left-2.png");
		backIm.setFitWidth(30);
		backIm.setFitHeight(30);
		Button backB = new Button("Back", backIm);
		backB.setTranslateX(490);
		backB.setTranslateY(35);
		backB.setPrefSize(150, 30);
		backB.setStyle("-fx-border-color:purple");

		Image image = new Image("C:\\Users\\Admin\\Desktop\\Data Strctur\\project_1\\Capture.PNG");
		ImageView imageView = new ImageView();
		imageView.setImage(image);
		imageView.setFitWidth(1000);
		imageView.setFitHeight(250);
		imageView.setTranslateY(55);

		vb1.getChildren().addAll(label1, label2, mean, gp, resultB, backB, imageView);
		vb1.setSpacing(10);

		bp.setCenter(vb1);

		resultB.setOnAction(a -> {

			/*
			 * mange.addCustomer(nameTF.getText(), idTF.getText(), mobileTF.getText(),
			 * addressTF.getText(), planTF.getText());
			 * 
			 * System.out.println(mange.customers); try {
			 * 
			 * if (outputFile.createNewFile()) { System.out.println("File created: " +
			 * outputFile.getName()); } else { System.out.println("File already exists."); }
			 * FileWriter myWriter = new FileWriter("out.txt"); for (int i = 0; i <
			 * mange.customers.size(); i++) {
			 * myWriter.write(mange.customers.get(i).toString() + "\n"); } myWriter.close();
			 * } catch (IOException e) { System.out.println("An error occurred.");
			 * e.printStackTrace(); }
			 */
		});

		backB.setOnAction(b -> {
			try {
				listWBS(stage);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

		Scene scene = new Scene(bp, 1000, 600);
		stage.setScene(scene);

	}

	private void modeAStudentWBS(Stage stage) throws Exception {

		BorderPane bp = new BorderPane();
		VBox vb1 = new VBox();

		Label label1 = new Label("High school results (Tawjihi 2022)");
		label1.setFont(new Font(" High school results (Tawjihi 2022)", 30));
		label1.setPrefWidth(500);
		label1.setTranslateY(60);
		label1.setTranslateX(255);

		Label label2 = new Label("Mode Average Student In WestBank ( Science )");
		label2.setFont(new Font("Mode Average Student In WestBank ( Science )", 20));
		label2.setPrefWidth(500);
		label2.setTranslateY(80);
		label2.setTranslateX(300);

		Label mode = new Label("Mode Average Student Science : ");
		mode.setFont(new Font(15));
		mode.setPrefWidth(300);
		mode.setTranslateY(80);
		mode.setTranslateX(170);

		GridPane gp = new GridPane();
		gp.setVgap(10);
		TextField modeTF = new TextField();
		modeTF.setPromptText("  Mode Average ");
		modeTF.setTranslateX(390);
		modeTF.setTranslateY(18);
		modeTF.setPrefWidth(150);
		modeTF.setDisable(true);
		gp.add(modeTF, 3, 3);

		ImageView resultIm = new ImageView("https://cdn-icons-png.flaticon.com/512/1162/1162914.png");
		resultIm.setFitWidth(30);
		resultIm.setFitHeight(30);
		Button resultB = new Button("Result", resultIm);
		resultB.setTranslateX(300);
		resultB.setTranslateY(85);
		resultB.setPrefSize(150, 30);
		resultB.setStyle("-fx-border-color:purple");

		ImageView backIm = new ImageView("https://img.icons8.com/fluency/344/circled-left-2.png");
		backIm.setFitWidth(30);
		backIm.setFitHeight(30);
		Button backB = new Button("Back", backIm);
		backB.setTranslateX(490);
		backB.setTranslateY(35);
		backB.setPrefSize(150, 30);
		backB.setStyle("-fx-border-color:purple");

		Image image = new Image("C:\\Users\\Admin\\Desktop\\Data Strctur\\project_1\\Capture.PNG");
		ImageView imageView = new ImageView();
		imageView.setImage(image);
		imageView.setFitWidth(1000);
		imageView.setFitHeight(250);
		imageView.setTranslateY(55);

		vb1.getChildren().addAll(label1, label2, mode, gp, resultB, backB, imageView);
		vb1.setSpacing(10);

		bp.setCenter(vb1);

		resultB.setOnAction(a -> {

			/*
			 * mange.addCustomer(nameTF.getText(), idTF.getText(), mobileTF.getText(),
			 * addressTF.getText(), planTF.getText());
			 * 
			 * System.out.println(mange.customers); try {
			 * 
			 * if (outputFile.createNewFile()) { System.out.println("File created: " +
			 * outputFile.getName()); } else { System.out.println("File already exists."); }
			 * FileWriter myWriter = new FileWriter("out.txt"); for (int i = 0; i <
			 * mange.customers.size(); i++) {
			 * myWriter.write(mange.customers.get(i).toString() + "\n"); } myWriter.close();
			 * } catch (IOException e) { System.out.println("An error occurred.");
			 * e.printStackTrace(); }
			 */
		});

		backB.setOnAction(b -> {
			try {
				listWBS(stage);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

		Scene scene = new Scene(bp, 1000, 600);
		stage.setScene(scene);

	}

	private void returnNPStudentWBS(Stage stage) throws Exception {

		BorderPane bp = new BorderPane();
		VBox vb1 = new VBox();

		Label label1 = new Label("High school results (Tawjihi 2022)");
		label1.setFont(new Font(" High school results (Tawjihi 2022)", 30));
		label1.setPrefWidth(500);
		label1.setTranslateY(60);
		label1.setTranslateX(255);

		Label label2 = new Label("Return Student In WestBank ( Science )");
		label2.setFont(new Font("Return Student In WestBank ( Science )", 20));
		label2.setPrefWidth(500);
		label2.setTranslateY(80);
		label2.setTranslateX(300);

		Label average = new Label(" Average : ");
		average.setFont(new Font(15));
		average.setPrefWidth(200);
		average.setTranslateY(80);
		average.setTranslateX(170);

		Label result = new Label(" Result : ");
		result.setFont(new Font(15));
		result.setPrefWidth(200);
		result.setTranslateY(80);
		result.setTranslateX(170);

		GridPane gp = new GridPane();
		gp.setVgap(10);
		TextField numTF = new TextField();
		numTF.setPromptText(" Average ");
		numTF.setTranslateX(330);
		numTF.setTranslateY(-13);
		numTF.setPrefWidth(150);
		gp.add(numTF, 3, 3);

		Label result2 = new Label();
		result2.setFont(new Font(15));
		result2.setPrefWidth(200);
		result2.setPrefHeight(5);
		result2.setTranslateY(-10);
		result2.setTranslateX(330);
		gp.add(result2, 3, 4);
		result2.setStyle("-fx-background-color: Thistle; -fx-padding: 20px;");

		ImageView returnIm = new ImageView("https://cdn-icons-png.flaticon.com/512/1585/1585197.png");
		returnIm.setFitWidth(30);
		returnIm.setFitHeight(30);
		Button returnB = new Button("Return", returnIm);
		returnB.setTranslateX(300);
		returnB.setTranslateY(5);
		returnB.setPrefSize(150, 30);
		returnB.setStyle("-fx-border-color:purple");

		ImageView backIm = new ImageView("https://img.icons8.com/fluency/344/circled-left-2.png");
		backIm.setFitWidth(30);
		backIm.setFitHeight(30);
		Button backB = new Button("Back", backIm);
		backB.setTranslateX(490);
		backB.setTranslateY(-45);
		backB.setPrefSize(150, 30);
		backB.setStyle("-fx-border-color:purple");

		Image image = new Image("C:\\Users\\Admin\\Desktop\\Data Strctur\\project_1\\Capture.PNG");
		ImageView imageView = new ImageView();
		imageView.setImage(image);
		imageView.setFitWidth(1000);
		imageView.setFitHeight(250);
		imageView.setTranslateY(-45);

		vb1.getChildren().addAll(label1, label2, average, result, gp, returnB, backB, imageView);
		vb1.setSpacing(10);

		bp.setCenter(vb1);

		returnB.setOnAction(a -> {

			/*
			 * mange.addCustomer(nameTF.getText(), idTF.getText(), mobileTF.getText(),
			 * addressTF.getText(), planTF.getText());
			 * 
			 * System.out.println(mange.customers); try {
			 * 
			 * if (outputFile.createNewFile()) { System.out.println("File created: " +
			 * outputFile.getName()); } else { System.out.println("File already exists."); }
			 * FileWriter myWriter = new FileWriter("out.txt"); for (int i = 0; i <
			 * mange.customers.size(); i++) {
			 * myWriter.write(mange.customers.get(i).toString() + "\n"); } myWriter.close();
			 * } catch (IOException e) { System.out.println("An error occurred.");
			 * e.printStackTrace(); }
			 */
		});

		backB.setOnAction(b -> {
			try {
				listWBS(stage);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

		Scene scene = new Scene(bp, 1000, 600);
		stage.setScene(scene);

	}

	public void listGL(Stage stage) throws Exception {
		BorderPane bp = new BorderPane();
		VBox vb1 = new VBox();
		Label label1 = new Label("High school results (Tawjihi 2022)");
		label1.setFont(new Font(" High school results (Tawjihi 2022)", 30));
		label1.setPrefWidth(500);
		label1.setTranslateY(60);
		label1.setTranslateX(255);
		// label1.setStyle("-fx-background-color:violate; -fx-padding: 20px;");
		Label label2 = new Label("In The Gaza ( Literary )");
		label2.setFont(new Font("In The Gaza ( Literary )", 20));
		label2.setPrefWidth(500);
		label2.setTranslateY(80);
		label2.setTranslateX(370);

		Button Insert = new Button(" Insert new Student ");
		Insert.setTranslateX(100);
		Insert.setTranslateY(90);
		Insert.setPrefSize(230, 20);
		Insert.setStyle("-fx-border-color:purple");

		Button delete = new Button(" Delete Student ");
		delete.setTranslateX(100);
		delete.setTranslateY(90);
		delete.setPrefSize(230, 20);
		delete.setStyle("-fx-border-color:purple");

		Button search = new Button(" Search ");
		search.setTranslateX(100);
		search.setTranslateY(90);
		search.setPrefSize(230, 20);
		search.setStyle("-fx-border-color:purple");

		Button DTopS = new Button(" Display The Top 10 Students ");
		DTopS.setTranslateX(100);
		DTopS.setTranslateY(90);
		DTopS.setPrefSize(230, 20);
		DTopS.setStyle("-fx-border-color:purple");

		Button mean = new Button(" Display the mean ");
		mean.setTranslateX(450);
		mean.setTranslateY(-60);
		mean.setPrefSize(230, 20);
		mean.setStyle("-fx-border-color:purple");

		Button modA = new Button(" display the mode average  ");
		modA.setTranslateX(450);
		modA.setTranslateY(-60);
		modA.setPrefSize(230, 20);
		modA.setStyle("-fx-border-color:purple");

		Button numOfS = new Button(" Number And Percentage Of Students   ");
		numOfS.setTranslateX(450);
		numOfS.setTranslateY(-60);
		numOfS.setPrefSize(230, 20);
		numOfS.setStyle("-fx-border-color:purple");

		Button exit = new Button(" Exit  ");
		exit.setTranslateX(450);
		exit.setTranslateY(-60);
		exit.setPrefSize(230, 20);
		exit.setStyle("-fx-border-color:purple");

		Image image = new Image("C:\\Users\\Admin\\Desktop\\Data Strctur\\project_1\\Capture.PNG");
		ImageView imageView = new ImageView();
		imageView.setImage(image);
		imageView.setFitWidth(1000);
		imageView.setFitHeight(250);
		imageView.setTranslateY(-40);

		vb1.getChildren().addAll(label1, label2, Insert, delete, search, DTopS, mean, modA, numOfS, exit, imageView);
		vb1.setSpacing(10);

		bp.setCenter(vb1);

		Insert.setOnAction(a -> {
			try {
				addStudentGL(stage);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

		delete.setOnAction(d -> {
			try {
				deleteStudentGL(stage);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

		search.setOnAction(u -> {
			try {
				searchStudentGL(stage);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

		DTopS.setOnAction(s -> {
			try {
				TopStudentGL(stage);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

		mean.setOnAction(p -> {
			try {
				meanStudentGL(stage);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

		modA.setOnAction(m -> {
			try {
				modeAStudentGL(stage);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

		numOfS.setOnAction(m -> {
			try {
				returnNPStudentGL(stage);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

		exit.setOnAction(m -> {
			try {
				GLS(stage);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

		Scene scene = new Scene(bp, 1000, 600);
		stage.setScene(scene);
		stage.setTitle(" * List * ");
		stage.show();

	}

	private void addStudentGL(Stage stage) throws Exception {
		BorderPane bp = new BorderPane();
		VBox vb1 = new VBox();

		Label label1 = new Label("High school results (Tawjihi 2022)");
		label1.setFont(new Font(" High school results (Tawjihi 2022)", 30));
		label1.setPrefWidth(500);
		label1.setTranslateY(60);
		label1.setTranslateX(255);
		// label1.setStyle("-fx-background-color:violate; -fx-padding: 20px;");
		Label label2 = new Label("Insert Student In Gaza ( Literary )");
		label2.setFont(new Font("Insert Student In Gaza ( Literary )", 20));
		label2.setPrefWidth(500);
		label2.setTranslateY(80);
		label2.setTranslateX(300);

		Label num = new Label(" Student Seat Number : ");
		num.setFont(new Font(15));
		num.setPrefWidth(200);
		num.setTranslateY(80);
		num.setTranslateX(170);

		Label branch = new Label(" Branch : ");
		branch.setFont(new Font(15));
		branch.setPrefWidth(200);
		branch.setTranslateY(80);
		branch.setTranslateX(170);

		Label average = new Label(" Average : ");
		average.setFont(new Font(15));
		average.setPrefWidth(200);
		average.setTranslateY(80);
		average.setTranslateX(170);

		GridPane gp = new GridPane();
		gp.setVgap(10);
		TextField numTF = new TextField();
		numTF.setPromptText(" Student Seat Number ");
		numTF.setTranslateX(330);
		numTF.setTranslateY(-13);
		numTF.setPrefWidth(150);
		gp.add(numTF, 3, 0);

		TextField branchTF = new TextField();
		branchTF.setPromptText(" Branch ");
		branchTF.setTranslateX(330);
		branchTF.setTranslateY(-15);
		branchTF.setPrefWidth(150);
		gp.add(branchTF, 3, 1);
		branchTF.setDisable(true);
		numTF.setOnKeyTyped(n -> {
			branchTF.setDisable(false);
		});

		TextField AverageTF = new TextField();
		AverageTF.setPrefWidth(150);
		gp.add(AverageTF, 3, 2);
		AverageTF.setPromptText(" Average ");
		AverageTF.setTranslateX(330);
		AverageTF.setTranslateY(-10);
		AverageTF.setDisable(true);
		branchTF.setOnKeyTyped(n -> {
			AverageTF.setDisable(false);
		});

		ImageView insertIm = new ImageView("https://img.icons8.com/color/344/add.png");
		insertIm.setFitWidth(30);
		insertIm.setFitHeight(30);
		Button insertB = new Button("Insert", insertIm);
		insertB.setTranslateX(300);
		insertB.setTranslateY(5);
		insertB.setPrefSize(150, 30);
		insertB.setStyle("-fx-border-color:purple");

		ImageView backIm = new ImageView("https://img.icons8.com/fluency/344/circled-left-2.png");
		backIm.setFitWidth(30);
		backIm.setFitHeight(30);
		Button backB = new Button("Back", backIm);
		backB.setTranslateX(490);
		backB.setTranslateY(-45);
		backB.setPrefSize(150, 30);
		backB.setStyle("-fx-border-color:purple");

		Image image = new Image("C:\\Users\\Admin\\Desktop\\Data Strctur\\project_1\\Capture.PNG");
		ImageView imageView = new ImageView();
		imageView.setImage(image);
		imageView.setFitWidth(1000);
		imageView.setFitHeight(250);
		imageView.setTranslateY(-45);

		vb1.getChildren().addAll(label1, label2, num, branch, average, gp, insertB, backB, imageView);
		vb1.setSpacing(10);

		bp.setCenter(vb1);

		insertB.setOnAction(a -> {

			/*
			 * mange.addCustomer(nameTF.getText(), idTF.getText(), mobileTF.getText(),
			 * addressTF.getText(), planTF.getText());
			 * 
			 * System.out.println(mange.customers); try {
			 * 
			 * if (outputFile.createNewFile()) { System.out.println("File created: " +
			 * outputFile.getName()); } else { System.out.println("File already exists."); }
			 * FileWriter myWriter = new FileWriter("out.txt"); for (int i = 0; i <
			 * mange.customers.size(); i++) {
			 * myWriter.write(mange.customers.get(i).toString() + "\n"); } myWriter.close();
			 * } catch (IOException e) { System.out.println("An error occurred.");
			 * e.printStackTrace(); }
			 */
		});

		backB.setOnAction(b -> {
			try {
				listGL(stage);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

		Scene scene = new Scene(bp, 1000, 600);
		stage.setScene(scene);
		stage.setTitle(" * Insert Student  * ");
		stage.show();
	}

	private void deleteStudentGL(Stage stage) throws Exception {

		BorderPane bp = new BorderPane();
		VBox vb1 = new VBox();

		Label label1 = new Label("High school results (Tawjihi 2022)");
		label1.setFont(new Font(" High school results (Tawjihi 2022)", 30));
		label1.setPrefWidth(500);
		label1.setTranslateY(60);
		label1.setTranslateX(255);

		Label label2 = new Label("Detete Student In Gaza ( Literary )");
		label2.setFont(new Font("Delete Student In Gaza ( Literary )", 20));
		label2.setPrefWidth(500);
		label2.setTranslateY(80);
		label2.setTranslateX(300);

		Label num = new Label(" Student Seat Number : ");
		num.setFont(new Font(15));
		num.setPrefWidth(200);
		num.setTranslateY(80);
		num.setTranslateX(170);

		Label result = new Label(" Result : ");
		result.setFont(new Font(15));
		result.setPrefWidth(200);
		result.setTranslateY(80);
		result.setTranslateX(170);

		GridPane gp = new GridPane();
		gp.setVgap(10);
		TextField numTF = new TextField();
		numTF.setPromptText(" Student Seat Number ");
		numTF.setTranslateX(330);
		numTF.setTranslateY(-13);
		numTF.setPrefWidth(150);
		gp.add(numTF, 3, 3);

		Label result2 = new Label();
		result2.setFont(new Font(15));
		result2.setPrefWidth(400);
		result2.setPrefHeight(5);
		result2.setTranslateY(-10);
		result2.setTranslateX(330);
		gp.add(result2, 3, 4);
		result2.setStyle("-fx-background-color: Thistle; -fx-padding: 20px;");

		ImageView deleteIm = new ImageView("https://cdn-icons-png.flaticon.com/512/3221/3221897.png");
		deleteIm.setFitWidth(30);
		deleteIm.setFitHeight(30);
		Button deleteB = new Button("Delete", deleteIm);
		deleteB.setTranslateX(300);
		deleteB.setTranslateY(5);
		deleteB.setPrefSize(150, 30);
		deleteB.setStyle("-fx-border-color:purple");

		ImageView backIm = new ImageView("https://img.icons8.com/fluency/344/circled-left-2.png");
		backIm.setFitWidth(30);
		backIm.setFitHeight(30);
		Button backB = new Button("Back", backIm);
		backB.setTranslateX(490);
		backB.setTranslateY(-45);
		backB.setPrefSize(150, 30);
		backB.setStyle("-fx-border-color:purple");

		Image image = new Image("C:\\Users\\Admin\\Desktop\\Data Strctur\\project_1\\Capture.PNG");
		ImageView imageView = new ImageView();
		imageView.setImage(image);
		imageView.setFitWidth(1000);
		imageView.setFitHeight(250);
		imageView.setTranslateY(-45);

		vb1.getChildren().addAll(label1, label2, num, result, gp, deleteB, backB, imageView);
		vb1.setSpacing(10);

		bp.setCenter(vb1);

		deleteB.setOnAction(a -> {

			/*
			 * mange.addCustomer(nameTF.getText(), idTF.getText(), mobileTF.getText(),
			 * addressTF.getText(), planTF.getText());
			 * 
			 * System.out.println(mange.customers); try {
			 * 
			 * if (outputFile.createNewFile()) { System.out.println("File created: " +
			 * outputFile.getName()); } else { System.out.println("File already exists."); }
			 * FileWriter myWriter = new FileWriter("out.txt"); for (int i = 0; i <
			 * mange.customers.size(); i++) {
			 * myWriter.write(mange.customers.get(i).toString() + "\n"); } myWriter.close();
			 * } catch (IOException e) { System.out.println("An error occurred.");
			 * e.printStackTrace(); }
			 */
		});

		backB.setOnAction(b -> {
			try {
				listGL(stage);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

		Scene scene = new Scene(bp, 1000, 600);
		stage.setScene(scene);
		stage.setTitle(" * Delete Student  * ");

	}

	private void searchStudentGL(Stage stage) throws Exception {

		BorderPane bp = new BorderPane();
		VBox vb1 = new VBox();

		Label label1 = new Label("High school results (Tawjihi 2022)");
		label1.setFont(new Font(" High school results (Tawjihi 2022)", 30));
		label1.setPrefWidth(500);
		label1.setTranslateY(60);
		label1.setTranslateX(255);

		Label label2 = new Label("Search Student In Gaza ( Literary )");
		label2.setFont(new Font("Search Student In Gaza ( Literary )", 20));
		label2.setPrefWidth(500);
		label2.setTranslateY(80);
		label2.setTranslateX(300);

		Label num = new Label(" Student Seat Number : ");
		num.setFont(new Font(15));
		num.setPrefWidth(200);
		num.setTranslateY(80);
		num.setTranslateX(170);

		Label result = new Label(" Result : ");
		result.setFont(new Font(15));
		result.setPrefWidth(200);
		result.setTranslateY(80);
		result.setTranslateX(170);

		GridPane gp = new GridPane();
		gp.setVgap(10);
		TextField numTF = new TextField();
		numTF.setPromptText(" Student Seat Number ");
		numTF.setTranslateX(330);
		numTF.setTranslateY(-13);
		numTF.setPrefWidth(150);
		gp.add(numTF, 3, 3);

		Label result2 = new Label();
		result2.setFont(new Font(15));
		result2.setPrefWidth(200);
		result2.setPrefHeight(5);
		result2.setTranslateY(-10);
		result2.setTranslateX(330);
		gp.add(result2, 3, 4);
		result2.setStyle("-fx-background-color: Thistle; -fx-padding: 20px;");

		ImageView searchIm = new ImageView("https://cdn-icons-png.flaticon.com/512/954/954591.png");
		searchIm.setFitWidth(30);
		searchIm.setFitHeight(30);
		Button searchB = new Button("Search", searchIm);
		searchB.setTranslateX(300);
		searchB.setTranslateY(5);
		searchB.setPrefSize(150, 30);
		searchB.setStyle("-fx-border-color:purple");

		ImageView backIm = new ImageView("https://img.icons8.com/fluency/344/circled-left-2.png");
		backIm.setFitWidth(30);
		backIm.setFitHeight(30);
		Button backB = new Button("Back", backIm);
		backB.setTranslateX(490);
		backB.setTranslateY(-45);
		backB.setPrefSize(150, 30);
		backB.setStyle("-fx-border-color:purple");

		Image image = new Image("C:\\Users\\Admin\\Desktop\\Data Strctur\\project_1\\Capture.PNG");
		ImageView imageView = new ImageView();
		imageView.setImage(image);
		imageView.setFitWidth(1000);
		imageView.setFitHeight(250);
		imageView.setTranslateY(-45);

		vb1.getChildren().addAll(label1, label2, num, result, gp, searchB, backB, imageView);
		vb1.setSpacing(10);

		bp.setCenter(vb1);

		searchB.setOnAction(a -> {

			/*
			 * mange.addCustomer(nameTF.getText(), idTF.getText(), mobileTF.getText(),
			 * addressTF.getText(), planTF.getText());
			 * 
			 * System.out.println(mange.customers); try {
			 * 
			 * if (outputFile.createNewFile()) { System.out.println("File created: " +
			 * outputFile.getName()); } else { System.out.println("File already exists."); }
			 * FileWriter myWriter = new FileWriter("out.txt"); for (int i = 0; i <
			 * mange.customers.size(); i++) {
			 * myWriter.write(mange.customers.get(i).toString() + "\n"); } myWriter.close();
			 * } catch (IOException e) { System.out.println("An error occurred.");
			 * e.printStackTrace(); }
			 */
		});

		backB.setOnAction(b -> {
			try {
				listGL(stage);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

		Scene scene = new Scene(bp, 1000, 600);
		stage.setScene(scene);
		stage.setTitle(" * Search Student  * ");

	}

	private void TopStudentGL(Stage stage) throws Exception {

		BorderPane bp = new BorderPane();
		VBox vb1 = new VBox();

		Label label1 = new Label("High school results (Tawjihi 2022)");
		label1.setFont(new Font(" High school results (Tawjihi 2022)", 30));
		label1.setPrefWidth(500);
		label1.setTranslateY(60);
		label1.setTranslateX(255);

		Label label2 = new Label(" Student In Gaza ( Literary )");
		label2.setFont(new Font(" Student In Gaza ( Literary )", 20));
		label2.setPrefWidth(500);
		label2.setTranslateY(80);
		label2.setTranslateX(300);

		Label top = new Label(" Top 10 Student In Literary : ");
		top.setFont(new Font(15));
		top.setPrefWidth(200);
		top.setTranslateY(80);
		top.setTranslateX(170);

		GridPane gp = new GridPane();
		gp.setVgap(10);
		TextArea area = new TextArea();
		area.setPromptText(" Top 10 Student  ");
		area.setTranslateX(365);
		area.setTranslateY(10);
		area.setPrefWidth(300);
		area.setDisable(true);
		gp.add(area, 3, 3);

		// result2.setStyle("-fx-background-color: Thistle; -fx-padding: 20px;");

		ImageView resultIm = new ImageView("https://cdn-icons-png.flaticon.com/512/1162/1162914.png");
		resultIm.setFitWidth(30);
		resultIm.setFitHeight(30);
		Button resultB = new Button("Result", resultIm);
		resultB.setTranslateX(300);
		resultB.setTranslateY(25);
		resultB.setPrefSize(150, 30);
		resultB.setStyle("-fx-border-color:purple");

		ImageView backIm = new ImageView("https://img.icons8.com/fluency/344/circled-left-2.png");
		backIm.setFitWidth(30);
		backIm.setFitHeight(30);
		Button backB = new Button("Back", backIm);
		backB.setTranslateX(490);
		backB.setTranslateY(-25);
		backB.setPrefSize(150, 30);
		backB.setStyle("-fx-border-color:purple");

		Image image = new Image("C:\\Users\\Admin\\Desktop\\Data Strctur\\project_1\\Capture.PNG");
		ImageView imageView = new ImageView();
		imageView.setImage(image);
		imageView.setFitWidth(1000);
		imageView.setFitHeight(250);
		imageView.setTranslateY(-10);

		vb1.getChildren().addAll(label1, label2, top, gp, resultB, backB, imageView);
		vb1.setSpacing(10);

		bp.setCenter(vb1);

		resultB.setOnAction(a -> {

			/*
			 * mange.addCustomer(nameTF.getText(), idTF.getText(), mobileTF.getText(),
			 * addressTF.getText(), planTF.getText());
			 * 
			 * System.out.println(mange.customers); try {
			 * 
			 * if (outputFile.createNewFile()) { System.out.println("File created: " +
			 * outputFile.getName()); } else { System.out.println("File already exists."); }
			 * FileWriter myWriter = new FileWriter("out.txt"); for (int i = 0; i <
			 * mange.customers.size(); i++) {
			 * myWriter.write(mange.customers.get(i).toString() + "\n"); } myWriter.close();
			 * } catch (IOException e) { System.out.println("An error occurred.");
			 * e.printStackTrace(); }
			 */
		});

		backB.setOnAction(b -> {
			try {
				listGL(stage);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

		Scene scene = new Scene(bp, 1000, 600);
		stage.setScene(scene);

	}

	private void meanStudentGL(Stage stage) throws Exception {

		BorderPane bp = new BorderPane();
		VBox vb1 = new VBox();

		Label label1 = new Label("High school results (Tawjihi 2022)");
		label1.setFont(new Font(" High school results (Tawjihi 2022)", 30));
		label1.setPrefWidth(500);
		label1.setTranslateY(60);
		label1.setTranslateX(255);

		Label label2 = new Label("Mean Student In Gaza ( Literary )");
		label2.setFont(new Font("Mean Student In Gaza ( Literary )", 20));
		label2.setPrefWidth(500);
		label2.setTranslateY(80);
		label2.setTranslateX(300);

		Label mean = new Label("Mean Student Literary : ");
		mean.setFont(new Font(15));
		mean.setPrefWidth(200);
		mean.setTranslateY(80);
		mean.setTranslateX(170);

		GridPane gp = new GridPane();
		gp.setVgap(10);
		TextField meanTF = new TextField();
		meanTF.setPromptText("  Mean Student ");
		meanTF.setTranslateX(330);
		meanTF.setTranslateY(18);
		meanTF.setPrefWidth(150);
		meanTF.setDisable(true);
		gp.add(meanTF, 3, 3);

		ImageView resultIm = new ImageView("https://cdn-icons-png.flaticon.com/512/1162/1162914.png");
		resultIm.setFitWidth(30);
		resultIm.setFitHeight(30);
		Button resultB = new Button("Result", resultIm);
		resultB.setTranslateX(300);
		resultB.setTranslateY(85);
		resultB.setPrefSize(150, 30);
		resultB.setStyle("-fx-border-color:purple");

		ImageView backIm = new ImageView("https://img.icons8.com/fluency/344/circled-left-2.png");
		backIm.setFitWidth(30);
		backIm.setFitHeight(30);
		Button backB = new Button("Back", backIm);
		backB.setTranslateX(490);
		backB.setTranslateY(35);
		backB.setPrefSize(150, 30);
		backB.setStyle("-fx-border-color:purple");

		Image image = new Image("C:\\Users\\Admin\\Desktop\\Data Strctur\\project_1\\Capture.PNG");
		ImageView imageView = new ImageView();
		imageView.setImage(image);
		imageView.setFitWidth(1000);
		imageView.setFitHeight(250);
		imageView.setTranslateY(55);

		vb1.getChildren().addAll(label1, label2, mean, gp, resultB, backB, imageView);
		vb1.setSpacing(10);

		bp.setCenter(vb1);

		resultB.setOnAction(a -> {

			/*
			 * mange.addCustomer(nameTF.getText(), idTF.getText(), mobileTF.getText(),
			 * addressTF.getText(), planTF.getText());
			 * 
			 * System.out.println(mange.customers); try {
			 * 
			 * if (outputFile.createNewFile()) { System.out.println("File created: " +
			 * outputFile.getName()); } else { System.out.println("File already exists."); }
			 * FileWriter myWriter = new FileWriter("out.txt"); for (int i = 0; i <
			 * mange.customers.size(); i++) {
			 * myWriter.write(mange.customers.get(i).toString() + "\n"); } myWriter.close();
			 * } catch (IOException e) { System.out.println("An error occurred.");
			 * e.printStackTrace(); }
			 */
		});

		backB.setOnAction(b -> {
			try {
				listGL(stage);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

		Scene scene = new Scene(bp, 1000, 600);
		stage.setScene(scene);

	}

	private void modeAStudentGL(Stage stage) throws Exception {

		BorderPane bp = new BorderPane();
		VBox vb1 = new VBox();

		Label label1 = new Label("High school results (Tawjihi 2022)");
		label1.setFont(new Font(" High school results (Tawjihi 2022)", 30));
		label1.setPrefWidth(500);
		label1.setTranslateY(60);
		label1.setTranslateX(255);

		Label label2 = new Label("Mode Average Student In Gaza ( Literary )");
		label2.setFont(new Font("Mode Average Student In Gaza ( Literary )", 20));
		label2.setPrefWidth(500);
		label2.setTranslateY(80);
		label2.setTranslateX(300);

		Label mode = new Label("Mode Average Student Literary : ");
		mode.setFont(new Font(15));
		mode.setPrefWidth(300);
		mode.setTranslateY(80);
		mode.setTranslateX(170);

		GridPane gp = new GridPane();
		gp.setVgap(10);
		TextField modeTF = new TextField();
		modeTF.setPromptText("  Mode Average ");
		modeTF.setTranslateX(390);
		modeTF.setTranslateY(18);
		modeTF.setPrefWidth(150);
		modeTF.setDisable(true);
		gp.add(modeTF, 3, 3);

		ImageView resultIm = new ImageView("https://cdn-icons-png.flaticon.com/512/1162/1162914.png");
		resultIm.setFitWidth(30);
		resultIm.setFitHeight(30);
		Button resultB = new Button("Result", resultIm);
		resultB.setTranslateX(300);
		resultB.setTranslateY(85);
		resultB.setPrefSize(150, 30);
		resultB.setStyle("-fx-border-color:purple");

		ImageView backIm = new ImageView("https://img.icons8.com/fluency/344/circled-left-2.png");
		backIm.setFitWidth(30);
		backIm.setFitHeight(30);
		Button backB = new Button("Back", backIm);
		backB.setTranslateX(490);
		backB.setTranslateY(35);
		backB.setPrefSize(150, 30);
		backB.setStyle("-fx-border-color:purple");

		Image image = new Image("C:\\Users\\Admin\\Desktop\\Data Strctur\\project_1\\Capture.PNG");
		ImageView imageView = new ImageView();
		imageView.setImage(image);
		imageView.setFitWidth(1000);
		imageView.setFitHeight(250);
		imageView.setTranslateY(55);

		vb1.getChildren().addAll(label1, label2, mode, gp, resultB, backB, imageView);
		vb1.setSpacing(10);

		bp.setCenter(vb1);

		resultB.setOnAction(a -> {

			/*
			 * mange.addCustomer(nameTF.getText(), idTF.getText(), mobileTF.getText(),
			 * addressTF.getText(), planTF.getText());
			 * 
			 * System.out.println(mange.customers); try {
			 * 
			 * if (outputFile.createNewFile()) { System.out.println("File created: " +
			 * outputFile.getName()); } else { System.out.println("File already exists."); }
			 * FileWriter myWriter = new FileWriter("out.txt"); for (int i = 0; i <
			 * mange.customers.size(); i++) {
			 * myWriter.write(mange.customers.get(i).toString() + "\n"); } myWriter.close();
			 * } catch (IOException e) { System.out.println("An error occurred.");
			 * e.printStackTrace(); }
			 */
		});

		backB.setOnAction(b -> {
			try {
				listGL(stage);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

		Scene scene = new Scene(bp, 1000, 600);
		stage.setScene(scene);

	}

	private void returnNPStudentGL(Stage stage) throws Exception {

		BorderPane bp = new BorderPane();
		VBox vb1 = new VBox();

		Label label1 = new Label("High school results (Tawjihi 2022)");
		label1.setFont(new Font(" High school results (Tawjihi 2022)", 30));
		label1.setPrefWidth(500);
		label1.setTranslateY(60);
		label1.setTranslateX(255);

		Label label2 = new Label("Return Student In Gaza ( Literary )");
		label2.setFont(new Font("Return Student In Gaza ( Literary )", 20));
		label2.setPrefWidth(500);
		label2.setTranslateY(80);
		label2.setTranslateX(300);

		Label average = new Label(" Average : ");
		average.setFont(new Font(15));
		average.setPrefWidth(200);
		average.setTranslateY(80);
		average.setTranslateX(170);

		Label result = new Label(" Result : ");
		result.setFont(new Font(15));
		result.setPrefWidth(200);
		result.setTranslateY(80);
		result.setTranslateX(170);

		GridPane gp = new GridPane();
		gp.setVgap(10);
		TextField numTF = new TextField();
		numTF.setPromptText(" Average ");
		numTF.setTranslateX(330);
		numTF.setTranslateY(-13);
		numTF.setPrefWidth(150);
		gp.add(numTF, 3, 3);

		Label result2 = new Label();
		result2.setFont(new Font(15));
		result2.setPrefWidth(200);
		result2.setPrefHeight(5);
		result2.setTranslateY(-10);
		result2.setTranslateX(330);
		gp.add(result2, 3, 4);
		result2.setStyle("-fx-background-color: Thistle; -fx-padding: 20px;");

		ImageView returnIm = new ImageView("https://cdn-icons-png.flaticon.com/512/1585/1585197.png");
		returnIm.setFitWidth(30);
		returnIm.setFitHeight(30);
		Button returnB = new Button("Return", returnIm);
		returnB.setTranslateX(300);
		returnB.setTranslateY(5);
		returnB.setPrefSize(150, 30);
		returnB.setStyle("-fx-border-color:purple");

		ImageView backIm = new ImageView("https://img.icons8.com/fluency/344/circled-left-2.png");
		backIm.setFitWidth(30);
		backIm.setFitHeight(30);
		Button backB = new Button("Back", backIm);
		backB.setTranslateX(490);
		backB.setTranslateY(-45);
		backB.setPrefSize(150, 30);
		backB.setStyle("-fx-border-color:purple");

		Image image = new Image("C:\\Users\\Admin\\Desktop\\Data Strctur\\project_1\\Capture.PNG");
		ImageView imageView = new ImageView();
		imageView.setImage(image);
		imageView.setFitWidth(1000);
		imageView.setFitHeight(250);
		imageView.setTranslateY(-45);

		vb1.getChildren().addAll(label1, label2, average, result, gp, returnB, backB, imageView);
		vb1.setSpacing(10);

		bp.setCenter(vb1);

		returnB.setOnAction(a -> {

			/*
			 * mange.addCustomer(nameTF.getText(), idTF.getText(), mobileTF.getText(),
			 * addressTF.getText(), planTF.getText());
			 * 
			 * System.out.println(mange.customers); try {
			 * 
			 * if (outputFile.createNewFile()) { System.out.println("File created: " +
			 * outputFile.getName()); } else { System.out.println("File already exists."); }
			 * FileWriter myWriter = new FileWriter("out.txt"); for (int i = 0; i <
			 * mange.customers.size(); i++) {
			 * myWriter.write(mange.customers.get(i).toString() + "\n"); } myWriter.close();
			 * } catch (IOException e) { System.out.println("An error occurred.");
			 * e.printStackTrace(); }
			 */
		});

		backB.setOnAction(b -> {
			try {
				listGL(stage);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

		Scene scene = new Scene(bp, 1000, 600);
		stage.setScene(scene);

	}

	public void listGS(Stage stage) throws Exception {
		BorderPane bp = new BorderPane();
		VBox vb1 = new VBox();
		Label label1 = new Label("High school results (Tawjihi 2022)");
		label1.setFont(new Font(" High school results (Tawjihi 2022)", 30));
		label1.setPrefWidth(500);
		label1.setTranslateY(60);
		label1.setTranslateX(255);
		// label1.setStyle("-fx-background-color:violate; -fx-padding: 20px;");
		Label label2 = new Label("In The Gaza ( Science )");
		label2.setFont(new Font("In The Gaza ( Science )", 20));
		label2.setPrefWidth(500);
		label2.setTranslateY(80);
		label2.setTranslateX(370);

		Button Insert = new Button(" Insert new Student ");
		Insert.setTranslateX(100);
		Insert.setTranslateY(90);
		Insert.setPrefSize(230, 20);
		Insert.setStyle("-fx-border-color:purple");

		Button delete = new Button(" Delete Student ");
		delete.setTranslateX(100);
		delete.setTranslateY(90);
		delete.setPrefSize(230, 20);
		delete.setStyle("-fx-border-color:purple");

		Button search = new Button(" Search ");
		search.setTranslateX(100);
		search.setTranslateY(90);
		search.setPrefSize(230, 20);
		search.setStyle("-fx-border-color:purple");

		Button DTopS = new Button(" Display The Top 10 Students ");
		DTopS.setTranslateX(100);
		DTopS.setTranslateY(90);
		DTopS.setPrefSize(230, 20);
		DTopS.setStyle("-fx-border-color:purple");

		Button mean = new Button(" Display the mean ");
		mean.setTranslateX(450);
		mean.setTranslateY(-60);
		mean.setPrefSize(230, 20);
		mean.setStyle("-fx-border-color:purple");

		Button modA = new Button(" display the mode average  ");
		modA.setTranslateX(450);
		modA.setTranslateY(-60);
		modA.setPrefSize(230, 20);
		modA.setStyle("-fx-border-color:purple");

		Button numOfS = new Button(" Number And Percentage Of Students   ");
		numOfS.setTranslateX(450);
		numOfS.setTranslateY(-60);
		numOfS.setPrefSize(230, 20);
		numOfS.setStyle("-fx-border-color:purple");

		Button exit = new Button(" Exit  ");
		exit.setTranslateX(450);
		exit.setTranslateY(-60);
		exit.setPrefSize(230, 20);
		exit.setStyle("-fx-border-color:purple");

		Image image = new Image("C:\\Users\\Admin\\Desktop\\Data Strctur\\project_1\\Capture.PNG");
		ImageView imageView = new ImageView();
		imageView.setImage(image);
		imageView.setFitWidth(1000);
		imageView.setFitHeight(250);
		imageView.setTranslateY(-40);

		vb1.getChildren().addAll(label1, label2, Insert, delete, search, DTopS, mean, modA, numOfS, exit, imageView);
		vb1.setSpacing(10);

		bp.setCenter(vb1);

		Insert.setOnAction(a -> {
			try {
				addStudentGS(stage);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

		delete.setOnAction(d -> {
			try {
				deleteStudentGS(stage);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

		search.setOnAction(u -> {
			try {
				searchStudentGS(stage);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

		DTopS.setOnAction(s -> {
			try {
				TopStudentGS(stage);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

		mean.setOnAction(p -> {
			try {
				meanStudentGS(stage);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

		modA.setOnAction(m -> {
			try {
				modeAStudentGS(stage);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

		numOfS.setOnAction(m -> {
			try {
				returnNPStudentGS(stage);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

		exit.setOnAction(m -> {
			try {
				GLS(stage);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

		Scene scene = new Scene(bp, 1000, 600);
		stage.setScene(scene);
		stage.setTitle(" * List * ");
		stage.show();

	}

	private void addStudentGS(Stage stage) throws Exception {
		BorderPane bp = new BorderPane();
		VBox vb1 = new VBox();

		Label label1 = new Label("High school results (Tawjihi 2022)");
		label1.setFont(new Font(" High school results (Tawjihi 2022)", 30));
		label1.setPrefWidth(500);
		label1.setTranslateY(60);
		label1.setTranslateX(255);
		// label1.setStyle("-fx-background-color:violate; -fx-padding: 20px;");
		Label label2 = new Label("Insert Student In Gaza ( Science )");
		label2.setFont(new Font("Insert Student In Gaza ( Science )", 20));
		label2.setPrefWidth(500);
		label2.setTranslateY(80);
		label2.setTranslateX(300);

		Label num = new Label(" Student Seat Number : ");
		num.setFont(new Font(15));
		num.setPrefWidth(200);
		num.setTranslateY(80);
		num.setTranslateX(170);

		Label branch = new Label(" Branch : ");
		branch.setFont(new Font(15));
		branch.setPrefWidth(200);
		branch.setTranslateY(80);
		branch.setTranslateX(170);

		Label average = new Label(" Average : ");
		average.setFont(new Font(15));
		average.setPrefWidth(200);
		average.setTranslateY(80);
		average.setTranslateX(170);

		GridPane gp = new GridPane();
		gp.setVgap(10);
		TextField numTF = new TextField();
		numTF.setPromptText(" Student Seat Number ");
		numTF.setTranslateX(330);
		numTF.setTranslateY(-13);
		numTF.setPrefWidth(150);
		gp.add(numTF, 3, 0);

		TextField branchTF = new TextField();
		branchTF.setPromptText(" Branch ");
		branchTF.setTranslateX(330);
		branchTF.setTranslateY(-15);
		branchTF.setPrefWidth(150);
		gp.add(branchTF, 3, 1);
		branchTF.setDisable(true);
		numTF.setOnKeyTyped(n -> {
			branchTF.setDisable(false);
		});

		TextField AverageTF = new TextField();
		AverageTF.setPrefWidth(150);
		gp.add(AverageTF, 3, 2);
		AverageTF.setPromptText(" Average ");
		AverageTF.setTranslateX(330);
		AverageTF.setTranslateY(-10);
		AverageTF.setDisable(true);
		branchTF.setOnKeyTyped(n -> {
			AverageTF.setDisable(false);
		});

		ImageView insertIm = new ImageView("https://img.icons8.com/color/344/add.png");
		insertIm.setFitWidth(30);
		insertIm.setFitHeight(30);
		Button insertB = new Button("Insert", insertIm);
		insertB.setTranslateX(300);
		insertB.setTranslateY(5);
		insertB.setPrefSize(150, 30);
		insertB.setStyle("-fx-border-color:purple");

		ImageView backIm = new ImageView("https://img.icons8.com/fluency/344/circled-left-2.png");
		backIm.setFitWidth(30);
		backIm.setFitHeight(30);
		Button backB = new Button("Back", backIm);
		backB.setTranslateX(490);
		backB.setTranslateY(-45);
		backB.setPrefSize(150, 30);
		backB.setStyle("-fx-border-color:purple");

		Image image = new Image("C:\\Users\\Admin\\Desktop\\Data Strctur\\project_1\\Capture.PNG");
		ImageView imageView = new ImageView();
		imageView.setImage(image);
		imageView.setFitWidth(1000);
		imageView.setFitHeight(250);
		imageView.setTranslateY(-45);

		vb1.getChildren().addAll(label1, label2, num, branch, average, gp, insertB, backB, imageView);
		vb1.setSpacing(10);

		bp.setCenter(vb1);

		insertB.setOnAction(a -> {

			/*
			 * mange.addCustomer(nameTF.getText(), idTF.getText(), mobileTF.getText(),
			 * addressTF.getText(), planTF.getText());
			 * 
			 * System.out.println(mange.customers); try {
			 * 
			 * if (outputFile.createNewFile()) { System.out.println("File created: " +
			 * outputFile.getName()); } else { System.out.println("File already exists."); }
			 * FileWriter myWriter = new FileWriter("out.txt"); for (int i = 0; i <
			 * mange.customers.size(); i++) {
			 * myWriter.write(mange.customers.get(i).toString() + "\n"); } myWriter.close();
			 * } catch (IOException e) { System.out.println("An error occurred.");
			 * e.printStackTrace(); }
			 */
		});

		backB.setOnAction(b -> {
			try {
				listGS(stage);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

		Scene scene = new Scene(bp, 1000, 600);
		stage.setScene(scene);
		stage.setTitle(" * Insert Student  * ");
		stage.show();
	}

	private void deleteStudentGS(Stage stage) throws Exception {

		BorderPane bp = new BorderPane();
		VBox vb1 = new VBox();

		Label label1 = new Label("High school results (Tawjihi 2022)");
		label1.setFont(new Font(" High school results (Tawjihi 2022)", 30));
		label1.setPrefWidth(500);
		label1.setTranslateY(60);
		label1.setTranslateX(255);

		Label label2 = new Label("Detete Student In Gaza ( Science )");
		label2.setFont(new Font("Delete Student In Gaza ( Science )", 20));
		label2.setPrefWidth(500);
		label2.setTranslateY(80);
		label2.setTranslateX(300);

		Label num = new Label(" Student Seat Number : ");
		num.setFont(new Font(15));
		num.setPrefWidth(200);
		num.setTranslateY(80);
		num.setTranslateX(170);

		Label result = new Label(" Result : ");
		result.setFont(new Font(15));
		result.setPrefWidth(200);
		result.setTranslateY(80);
		result.setTranslateX(170);

		GridPane gp = new GridPane();
		gp.setVgap(10);
		TextField numTF = new TextField();
		numTF.setPromptText(" Student Seat Number ");
		numTF.setTranslateX(330);
		numTF.setTranslateY(-13);
		numTF.setPrefWidth(150);
		gp.add(numTF, 3, 3);

		Label result2 = new Label();
		result2.setFont(new Font(15));
		result2.setPrefWidth(400);
		result2.setPrefHeight(5);
		result2.setTranslateY(-10);
		result2.setTranslateX(330);
		gp.add(result2, 3, 4);
		result2.setStyle("-fx-background-color: Thistle; -fx-padding: 20px;");

		ImageView deleteIm = new ImageView("https://cdn-icons-png.flaticon.com/512/3221/3221897.png");
		deleteIm.setFitWidth(30);
		deleteIm.setFitHeight(30);
		Button deleteB = new Button("Delete", deleteIm);
		deleteB.setTranslateX(300);
		deleteB.setTranslateY(5);
		deleteB.setPrefSize(150, 30);
		deleteB.setStyle("-fx-border-color:purple");

		ImageView backIm = new ImageView("https://img.icons8.com/fluency/344/circled-left-2.png");
		backIm.setFitWidth(30);
		backIm.setFitHeight(30);
		Button backB = new Button("Back", backIm);
		backB.setTranslateX(490);
		backB.setTranslateY(-45);
		backB.setPrefSize(150, 30);
		backB.setStyle("-fx-border-color:purple");

		Image image = new Image("C:\\Users\\Admin\\Desktop\\Data Strctur\\project_1\\Capture.PNG");
		ImageView imageView = new ImageView();
		imageView.setImage(image);
		imageView.setFitWidth(1000);
		imageView.setFitHeight(250);
		imageView.setTranslateY(-45);

		vb1.getChildren().addAll(label1, label2, num, result, gp, deleteB, backB, imageView);
		vb1.setSpacing(10);

		bp.setCenter(vb1);

		deleteB.setOnAction(a -> {

			/*
			 * mange.addCustomer(nameTF.getText(), idTF.getText(), mobileTF.getText(),
			 * addressTF.getText(), planTF.getText());
			 * 
			 * System.out.println(mange.customers); try {
			 * 
			 * if (outputFile.createNewFile()) { System.out.println("File created: " +
			 * outputFile.getName()); } else { System.out.println("File already exists."); }
			 * FileWriter myWriter = new FileWriter("out.txt"); for (int i = 0; i <
			 * mange.customers.size(); i++) {
			 * myWriter.write(mange.customers.get(i).toString() + "\n"); } myWriter.close();
			 * } catch (IOException e) { System.out.println("An error occurred.");
			 * e.printStackTrace(); }
			 */
		});

		backB.setOnAction(b -> {
			try {
				listGS(stage);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

		Scene scene = new Scene(bp, 1000, 600);
		stage.setScene(scene);
		stage.setTitle(" * Delete Student  * ");

	}

	private void searchStudentGS(Stage stage) throws Exception {

		BorderPane bp = new BorderPane();
		VBox vb1 = new VBox();

		Label label1 = new Label("High school results (Tawjihi 2022)");
		label1.setFont(new Font(" High school results (Tawjihi 2022)", 30));
		label1.setPrefWidth(500);
		label1.setTranslateY(60);
		label1.setTranslateX(255);

		Label label2 = new Label("Search Student In Gaza ( Science )");
		label2.setFont(new Font("Search Student In Gaza ( Science )", 20));
		label2.setPrefWidth(500);
		label2.setTranslateY(80);
		label2.setTranslateX(300);

		Label num = new Label(" Student Seat Number : ");
		num.setFont(new Font(15));
		num.setPrefWidth(200);
		num.setTranslateY(80);
		num.setTranslateX(170);

		Label result = new Label(" Result : ");
		result.setFont(new Font(15));
		result.setPrefWidth(200);
		result.setTranslateY(80);
		result.setTranslateX(170);

		GridPane gp = new GridPane();
		gp.setVgap(10);
		TextField numTF = new TextField();
		numTF.setPromptText(" Student Seat Number ");
		numTF.setTranslateX(330);
		numTF.setTranslateY(-13);
		numTF.setPrefWidth(150);
		gp.add(numTF, 3, 3);

		Label result2 = new Label();
		result2.setFont(new Font(15));
		result2.setPrefWidth(200);
		result2.setPrefHeight(5);
		result2.setTranslateY(-10);
		result2.setTranslateX(330);
		gp.add(result2, 3, 4);
		result2.setStyle("-fx-background-color: Thistle; -fx-padding: 20px;");

		ImageView searchIm = new ImageView("https://cdn-icons-png.flaticon.com/512/954/954591.png");
		searchIm.setFitWidth(30);
		searchIm.setFitHeight(30);
		Button searchB = new Button("Search", searchIm);
		searchB.setTranslateX(300);
		searchB.setTranslateY(5);
		searchB.setPrefSize(150, 30);
		searchB.setStyle("-fx-border-color:purple");

		ImageView backIm = new ImageView("https://img.icons8.com/fluency/344/circled-left-2.png");
		backIm.setFitWidth(30);
		backIm.setFitHeight(30);
		Button backB = new Button("Back", backIm);
		backB.setTranslateX(490);
		backB.setTranslateY(-45);
		backB.setPrefSize(150, 30);
		backB.setStyle("-fx-border-color:purple");

		Image image = new Image("C:\\Users\\Admin\\Desktop\\Data Strctur\\project_1\\Capture.PNG");
		ImageView imageView = new ImageView();
		imageView.setImage(image);
		imageView.setFitWidth(1000);
		imageView.setFitHeight(250);
		imageView.setTranslateY(-45);

		vb1.getChildren().addAll(label1, label2, num, result, gp, searchB, backB, imageView);
		vb1.setSpacing(10);

		bp.setCenter(vb1);

		searchB.setOnAction(a -> {

			/*
			 * mange.addCustomer(nameTF.getText(), idTF.getText(), mobileTF.getText(),
			 * addressTF.getText(), planTF.getText());
			 * 
			 * System.out.println(mange.customers); try {
			 * 
			 * if (outputFile.createNewFile()) { System.out.println("File created: " +
			 * outputFile.getName()); } else { System.out.println("File already exists."); }
			 * FileWriter myWriter = new FileWriter("out.txt"); for (int i = 0; i <
			 * mange.customers.size(); i++) {
			 * myWriter.write(mange.customers.get(i).toString() + "\n"); } myWriter.close();
			 * } catch (IOException e) { System.out.println("An error occurred.");
			 * e.printStackTrace(); }
			 */
		});

		backB.setOnAction(b -> {
			try {
				listGS(stage);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

		Scene scene = new Scene(bp, 1000, 600);
		stage.setScene(scene);
	}

	private void TopStudentGS(Stage stage) throws Exception {

		BorderPane bp = new BorderPane();
		VBox vb1 = new VBox();

		Label label1 = new Label("High school results (Tawjihi 2022)");
		label1.setFont(new Font(" High school results (Tawjihi 2022)", 30));
		label1.setPrefWidth(500);
		label1.setTranslateY(60);
		label1.setTranslateX(255);

		Label label2 = new Label(" Student In Gaza ( Science )");
		label2.setFont(new Font(" Student In Gaza ( Science )", 20));
		label2.setPrefWidth(500);
		label2.setTranslateY(80);
		label2.setTranslateX(300);

		Label top = new Label(" Top 10 Student In Science : ");
		top.setFont(new Font(15));
		top.setPrefWidth(200);
		top.setTranslateY(80);
		top.setTranslateX(170);

		GridPane gp = new GridPane();
		gp.setVgap(10);
		TextArea area = new TextArea();
		area.setPromptText(" Top 10 Student  ");
		area.setTranslateX(365);
		area.setTranslateY(10);
		area.setPrefWidth(300);
		area.setDisable(true);
		gp.add(area, 3, 3);

		// result2.setStyle("-fx-background-color: Thistle; -fx-padding: 20px;");

		ImageView resultIm = new ImageView("https://cdn-icons-png.flaticon.com/512/1162/1162914.png");
		resultIm.setFitWidth(30);
		resultIm.setFitHeight(30);
		Button resultB = new Button("Result", resultIm);
		resultB.setTranslateX(300);
		resultB.setTranslateY(25);
		resultB.setPrefSize(150, 30);
		resultB.setStyle("-fx-border-color:purple");

		ImageView backIm = new ImageView("https://img.icons8.com/fluency/344/circled-left-2.png");
		backIm.setFitWidth(30);
		backIm.setFitHeight(30);
		Button backB = new Button("Back", backIm);
		backB.setTranslateX(490);
		backB.setTranslateY(-25);
		backB.setPrefSize(150, 30);
		backB.setStyle("-fx-border-color:purple");

		Image image = new Image("C:\\Users\\Admin\\Desktop\\Data Strctur\\project_1\\Capture.PNG");
		ImageView imageView = new ImageView();
		imageView.setImage(image);
		imageView.setFitWidth(1000);
		imageView.setFitHeight(250);
		imageView.setTranslateY(-10);

		vb1.getChildren().addAll(label1, label2, top, gp, resultB, backB, imageView);
		vb1.setSpacing(10);

		bp.setCenter(vb1);

		resultB.setOnAction(a -> {

			/*
			 * mange.addCustomer(nameTF.getText(), idTF.getText(), mobileTF.getText(),
			 * addressTF.getText(), planTF.getText());
			 * 
			 * System.out.println(mange.customers); try {
			 * 
			 * if (outputFile.createNewFile()) { System.out.println("File created: " +
			 * outputFile.getName()); } else { System.out.println("File already exists."); }
			 * FileWriter myWriter = new FileWriter("out.txt"); for (int i = 0; i <
			 * mange.customers.size(); i++) {
			 * myWriter.write(mange.customers.get(i).toString() + "\n"); } myWriter.close();
			 * } catch (IOException e) { System.out.println("An error occurred.");
			 * e.printStackTrace(); }
			 */
		});

		backB.setOnAction(b -> {
			try {
				listGS(stage);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

		Scene scene = new Scene(bp, 1000, 600);
		stage.setScene(scene);

	}

	private void meanStudentGS(Stage stage) throws Exception {

		BorderPane bp = new BorderPane();
		VBox vb1 = new VBox();

		Label label1 = new Label("High school results (Tawjihi 2022)");
		label1.setFont(new Font(" High school results (Tawjihi 2022)", 30));
		label1.setPrefWidth(500);
		label1.setTranslateY(60);
		label1.setTranslateX(255);

		Label label2 = new Label("Mean Student In Gaza ( Science )");
		label2.setFont(new Font("Mean Student In Gaza ( Science )", 20));
		label2.setPrefWidth(500);
		label2.setTranslateY(80);
		label2.setTranslateX(300);

		Label mean = new Label("Mean Student Science : ");
		mean.setFont(new Font(15));
		mean.setPrefWidth(200);
		mean.setTranslateY(80);
		mean.setTranslateX(170);

		GridPane gp = new GridPane();
		gp.setVgap(10);
		TextField meanTF = new TextField();
		meanTF.setPromptText("  Mean Student ");
		meanTF.setTranslateX(330);
		meanTF.setTranslateY(18);
		meanTF.setPrefWidth(150);
		meanTF.setDisable(true);
		gp.add(meanTF, 3, 3);

		ImageView resultIm = new ImageView("https://cdn-icons-png.flaticon.com/512/1162/1162914.png");
		resultIm.setFitWidth(30);
		resultIm.setFitHeight(30);
		Button resultB = new Button("Result", resultIm);
		resultB.setTranslateX(300);
		resultB.setTranslateY(85);
		resultB.setPrefSize(150, 30);
		resultB.setStyle("-fx-border-color:purple");

		ImageView backIm = new ImageView("https://img.icons8.com/fluency/344/circled-left-2.png");
		backIm.setFitWidth(30);
		backIm.setFitHeight(30);
		Button backB = new Button("Back", backIm);
		backB.setTranslateX(490);
		backB.setTranslateY(35);
		backB.setPrefSize(150, 30);
		backB.setStyle("-fx-border-color:purple");

		Image image = new Image("C:\\Users\\Admin\\Desktop\\Data Strctur\\project_1\\Capture.PNG");
		ImageView imageView = new ImageView();
		imageView.setImage(image);
		imageView.setFitWidth(1000);
		imageView.setFitHeight(250);
		imageView.setTranslateY(55);

		vb1.getChildren().addAll(label1, label2, mean, gp, resultB, backB, imageView);
		vb1.setSpacing(10);

		bp.setCenter(vb1);

		resultB.setOnAction(a -> {

			/*
			 * mange.addCustomer(nameTF.getText(), idTF.getText(), mobileTF.getText(),
			 * addressTF.getText(), planTF.getText());
			 * 
			 * System.out.println(mange.customers); try {
			 * 
			 * if (outputFile.createNewFile()) { System.out.println("File created: " +
			 * outputFile.getName()); } else { System.out.println("File already exists."); }
			 * FileWriter myWriter = new FileWriter("out.txt"); for (int i = 0; i <
			 * mange.customers.size(); i++) {
			 * myWriter.write(mange.customers.get(i).toString() + "\n"); } myWriter.close();
			 * } catch (IOException e) { System.out.println("An error occurred.");
			 * e.printStackTrace(); }
			 */
		});

		backB.setOnAction(b -> {
			try {
				listGS(stage);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

		Scene scene = new Scene(bp, 1000, 600);
		stage.setScene(scene);

	}

	private void modeAStudentGS(Stage stage) throws Exception {

		BorderPane bp = new BorderPane();
		VBox vb1 = new VBox();

		Label label1 = new Label("High school results (Tawjihi 2022)");
		label1.setFont(new Font(" High school results (Tawjihi 2022)", 30));
		label1.setPrefWidth(500);
		label1.setTranslateY(60);
		label1.setTranslateX(255);

		Label label2 = new Label("Mode Average Student In Gaza ( Science )");
		label2.setFont(new Font("Mode Average Student In Gaza ( Science )", 20));
		label2.setPrefWidth(500);
		label2.setTranslateY(80);
		label2.setTranslateX(300);

		Label mode = new Label("Mode Average Student Science : ");
		mode.setFont(new Font(15));
		mode.setPrefWidth(300);
		mode.setTranslateY(80);
		mode.setTranslateX(170);

		GridPane gp = new GridPane();
		gp.setVgap(10);
		TextField modeTF = new TextField();
		modeTF.setPromptText("  Mode Average ");
		modeTF.setTranslateX(390);
		modeTF.setTranslateY(18);
		modeTF.setPrefWidth(150);
		modeTF.setDisable(true);
		gp.add(modeTF, 3, 3);

		ImageView resultIm = new ImageView("https://cdn-icons-png.flaticon.com/512/1162/1162914.png");
		resultIm.setFitWidth(30);
		resultIm.setFitHeight(30);
		Button resultB = new Button("Result", resultIm);
		resultB.setTranslateX(300);
		resultB.setTranslateY(85);
		resultB.setPrefSize(150, 30);
		resultB.setStyle("-fx-border-color:purple");

		ImageView backIm = new ImageView("https://img.icons8.com/fluency/344/circled-left-2.png");
		backIm.setFitWidth(30);
		backIm.setFitHeight(30);
		Button backB = new Button("Back", backIm);
		backB.setTranslateX(490);
		backB.setTranslateY(35);
		backB.setPrefSize(150, 30);
		backB.setStyle("-fx-border-color:purple");

		Image image = new Image("C:\\Users\\Admin\\Desktop\\Data Strctur\\project_1\\Capture.PNG");
		ImageView imageView = new ImageView();
		imageView.setImage(image);
		imageView.setFitWidth(1000);
		imageView.setFitHeight(250);
		imageView.setTranslateY(55);

		vb1.getChildren().addAll(label1, label2, mode, gp, resultB, backB, imageView);
		vb1.setSpacing(10);

		bp.setCenter(vb1);

		resultB.setOnAction(a -> {

			/*
			 * mange.addCustomer(nameTF.getText(), idTF.getText(), mobileTF.getText(),
			 * addressTF.getText(), planTF.getText());
			 * 
			 * System.out.println(mange.customers); try {
			 * 
			 * if (outputFile.createNewFile()) { System.out.println("File created: " +
			 * outputFile.getName()); } else { System.out.println("File already exists."); }
			 * FileWriter myWriter = new FileWriter("out.txt"); for (int i = 0; i <
			 * mange.customers.size(); i++) {
			 * myWriter.write(mange.customers.get(i).toString() + "\n"); } myWriter.close();
			 * } catch (IOException e) { System.out.println("An error occurred.");
			 * e.printStackTrace(); }
			 */
		});

		backB.setOnAction(b -> {
			try {
				listGS(stage);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

		Scene scene = new Scene(bp, 1000, 600);
		stage.setScene(scene);

	}

	private void returnNPStudentGS(Stage stage) throws Exception {

		BorderPane bp = new BorderPane();
		VBox vb1 = new VBox();

		Label label1 = new Label("High school results (Tawjihi 2022)");
		label1.setFont(new Font(" High school results (Tawjihi 2022)", 30));
		label1.setPrefWidth(500);
		label1.setTranslateY(60);
		label1.setTranslateX(255);

		Label label2 = new Label("Return Student In Gaza ( Science )");
		label2.setFont(new Font("Return Student In Gaza ( Science )", 20));
		label2.setPrefWidth(500);
		label2.setTranslateY(80);
		label2.setTranslateX(300);

		Label average = new Label(" Average : ");
		average.setFont(new Font(15));
		average.setPrefWidth(200);
		average.setTranslateY(80);
		average.setTranslateX(170);

		Label result = new Label(" Result : ");
		result.setFont(new Font(15));
		result.setPrefWidth(200);
		result.setTranslateY(80);
		result.setTranslateX(170);

		GridPane gp = new GridPane();
		gp.setVgap(10);
		TextField numTF = new TextField();
		numTF.setPromptText(" Average ");
		numTF.setTranslateX(330);
		numTF.setTranslateY(-13);
		numTF.setPrefWidth(150);
		gp.add(numTF, 3, 3);

		Label result2 = new Label();
		result2.setFont(new Font(15));
		result2.setPrefWidth(200);
		result2.setPrefHeight(5);
		result2.setTranslateY(-10);
		result2.setTranslateX(330);
		gp.add(result2, 3, 4);
		result2.setStyle("-fx-background-color: Thistle; -fx-padding: 20px;");

		ImageView returnIm = new ImageView("https://cdn-icons-png.flaticon.com/512/1585/1585197.png");
		returnIm.setFitWidth(30);
		returnIm.setFitHeight(30);
		Button returnB = new Button("Return", returnIm);
		returnB.setTranslateX(300);
		returnB.setTranslateY(5);
		returnB.setPrefSize(150, 30);
		returnB.setStyle("-fx-border-color:purple");

		ImageView backIm = new ImageView("https://img.icons8.com/fluency/344/circled-left-2.png");
		backIm.setFitWidth(30);
		backIm.setFitHeight(30);
		Button backB = new Button("Back", backIm);
		backB.setTranslateX(490);
		backB.setTranslateY(-45);
		backB.setPrefSize(150, 30);
		backB.setStyle("-fx-border-color:purple");

		Image image = new Image("C:\\Users\\Admin\\Desktop\\Data Strctur\\project_1\\Capture.PNG");
		ImageView imageView = new ImageView();
		imageView.setImage(image);
		imageView.setFitWidth(1000);
		imageView.setFitHeight(250);
		imageView.setTranslateY(-45);

		vb1.getChildren().addAll(label1, label2, average, result, gp, returnB, backB, imageView);
		vb1.setSpacing(10);

		bp.setCenter(vb1);

		returnB.setOnAction(a -> {

			/*
			 * mange.addCustomer(nameTF.getText(), idTF.getText(), mobileTF.getText(),
			 * addressTF.getText(), planTF.getText());
			 * 
			 * System.out.println(mange.customers); try {
			 * 
			 * if (outputFile.createNewFile()) { System.out.println("File created: " +
			 * outputFile.getName()); } else { System.out.println("File already exists."); }
			 * FileWriter myWriter = new FileWriter("out.txt"); for (int i = 0; i <
			 * mange.customers.size(); i++) {
			 * myWriter.write(mange.customers.get(i).toString() + "\n"); } myWriter.close();
			 * } catch (IOException e) { System.out.println("An error occurred.");
			 * e.printStackTrace(); }
			 */
		});

		backB.setOnAction(b -> {
			try {
				listGS(stage);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

		Scene scene = new Scene(bp, 1000, 600);
		stage.setScene(scene);

	}
}
