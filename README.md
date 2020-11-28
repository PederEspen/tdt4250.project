# tdt4250.project

## Requirements
The plugins used for this project is:

* Ecore and Ecore Modeling Framework

* Sirius for visualization

* Jackson library for creating java objects from JSON strings

## Setup 

* Clone the repo: ``` git clone https://github.com/PederEspen/tdt4250.project.git ```

* Install Jackson

  * Navigate to "Install new software" in Eclipse
  * Click "Add..." to add Orbit repository
  * Insert "http://download.eclipse.org/tools/orbit/downloads/drops/R20170919201930/repository" in location
  * Click "Add"
  * Choose "All Bundles" and check "Jackson-annotations", "Jackson-core" and "jackson-databind"
  * Click "Next" and then "Finish"



## Fetch from API and transform from JSON to Java objects

The fetching is handled in the tdt4250.project project, inside /src/transformation/JSONtoModel.java file.
Here the data is saved to JSON files that we later use to create java classes. This is done by importing the Jackson library, which allows for converting JSON files to java objects.

The JavaMToEcoreM.java file creates a XMI file that we use together 
with Sirius to create the visualization of viewer and editor. This is done by using a custom model to 
model transformation. 

## Model

We had to add a UML class to the model since the original model had several "root" classes. 
When creating the XMI file we wanted to have a root class that points to the original "root" 
classes so that we only had to create one XMI file for the model, instead of having several XMI files for the model. 
We also made several changes to the original model like removing UML classes that we didn't have to use for this project. (dæh dårlig engelsk)

![](Images/Model.png)

## Viewer

For this project we decided to make different views for visualizing the different data. We decided to explore the different kinds of tools for displaying the view in this project, and therefore ended up making diagrams, tables, cross-tables and trees. 

### Diagram

We created two diagrams for this project. One visualizing all publishers and one visualizing a title for one book. 

![](Images/PublisherDiagramExample.png)

The publisher diagram shows the different publishers and the titles within the publishers. In the picture above we only show two diagrams and that is because we added a filter that filters out the publishers that do not have any titles within. There are actually three publishers total with titles in them, but when visualizing the diagrams they were too spaced and therefore would have taken much space in the documentation. 

We added navigation to the project, making it possible to click on a title in the publisher diagram, which then navigates to a title diagram as depicted in the picture below. When double-clicking on a title you create a new title diagram. 

![](Images/TitleDiagramExample.png) 

### Table

For visualizing the different stores in this project we used a table. As you can see in the picture below, we first visualize all stores in the database and then we the different orders a store currenctly have. 

![](Images/TableExample.png)

For this table we included a conditional style which changes the color of the table if the number of orders within a store is greater then two. As you can see in the picture above, the first two stores has a grey color since they only have two orders, whereas the remaining four stores has a blue color.

### Tree

When creating a tree we decided to show the different publishers and their employees. The picture below shows how this is represented using a tree view. 

![](Images/PublisherEmployeeTree.png)

In the picture you see different publishers, their employees and the employees' jobs.

### Cross-table 

The last feature we made was a cross-table view. As seen in the picture below, each line in this table represents different titltes and the columns represent different authors. The cross-table view then tells us which author that is connected to what title and is represented with an "X". 

![](Images/CrossTableExample.png)


