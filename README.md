# Steps to run the project

## Initially clone or download the project into the local machine
## open the terminal or the command prompt and navigate to the project folder and target folder inside the project
## type the following command to start the server
> java -jar adserver-0.0.1-SNAPSHOT.jar

## The above command will start the server
## go to http://localhost:8080/ad to look at the list of ad campaigns , initially it will show empty json list
## go to postman and add the values to http://localhost:8080/ad/post_data and enter the duration and the content values in the json format
Eg : {
	"duration" : 100,
	"ad_content" : "sample ad"
}
## each post method with have a partner_id associated with it which is automatically generated.
## To look at the list of ads i.e list of json
> http://localhost:8080/ad

## To search for a ad with a particular id

> http://localhost:8080/id/{id_value}

## The project uses a  Hsql db and does all the transaction in-memory.
