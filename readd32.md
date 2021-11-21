## Serverless and Amplify

- **what is servless?** the servless computing allows you to build and run apps and services without thinking about servers. note that the the app will still run on servers, all server managment is done by AWS. so it allows developers to build applications without having to manage servers.

### AWS Amplify
- it's a set of tools and services that is used to help the front-end web as well as mobile developers to build scalable full stack app. 

![](https://d1.awsstatic.com/AWS%20Amplify/Features/product-page-diagram_Amplify_How-it-works_Develop%402x%20(1).86135eef1e1961cf5cc41fba8c1a5fc46bf38cf2.png)


### GraphQl
- **helps** developers to create backends on their web or mobile apps using AWS.

* ### @model top level entity used to create
DynamoDB , resolves & additional schema so it's used to:

manage the CRUD operations as well as the list operations.
subscriptions
Resolvers for all operations.
Type Todo @model { shcema }

* ### @connection
enables the relationships between @model types. Type post @model { id:Id! title:String! comments:[comment ]}

Type comment @model { id:Id ! content:String! createdAt:String! post:post @connnection(name:" com")}