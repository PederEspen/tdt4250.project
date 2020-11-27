# tdt4250.project

### Requirements
The plugins used for this project is:

* Ecore and Ecore Modeling Framework

* Sirius for visualization

* Jackson library for creating java objects from JSON strings

### Setup 

* Clone the repo: ``` git clone https://github.com/PederEspen/tdt4250.project.git ```

* Install Jackson

  * Navigate to "Install new software" in Eclipse
  * Click "Add..." to add Orbit repository
  * Insert "http://download.eclipse.org/tools/orbit/downloads/drops/R20170919201930/repository" in location
  * Click "Add"
  * Choose "All Bundles" and check "Jackson-annotations", "Jackson-core" and "jackson-databind"
  * Click "Next" and then "Finish"



### Fetch from API and transform from JSON to Java objects

The fetching is handled in the tdt4250.project project, inside /src/transformation/JSONtoModel.java file.
Here the data is saved to JSON files that we later use to create java classes. This is done by importing the Jackson library, which allows for converting JSON files to java objects.

The JavaMToEcoreM.java file creates a XMI file that we use together 
with Sirius to create the visualization of viewer and editor. This is done by using a custom model to 
model transformation. 

### Model

We had to add a UML class to the model since the original model had several "root" classes. 
When creating the XMI file we wanted to have a root class that points to the original "root" 
classes so that we only had to create one XMI file for the model, instead of having several XMI files for the model. 
We also made several changes to the original model like removing UML classes that we didn't have to use for this project. (dæh dårlig engelsk)

![](Images/Model.png)
