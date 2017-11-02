Amazon AWS example templates
============================

This is a collection of Amazon AWS example templates.
Use CloudFormation to build the infrastructure.

ApiGateway to Lambda to Topic to Queue
--------------------------------------

Incoming traffic can be stored asynchroniosly in the cloud. The target service can poll the request from the queue.

Motivation: 

* higher availability
* buffer peak load

![ApiGatewayToLambdaToTopicToQueue](http://uml.mvnsearch.org/github/trustedshops/aws-examples/blob/master/doc/uml/ApiGatewayToLambdaToTopicToQueue_gist.puml)
