Trusted Shops shopSearch
========================

Quickstart
----------

### install the cloud infrastructure

* login to the aws console
* open cloudformer
* create new stack "ShopSearchStack"
* chose: "Upload a template to Amazon S3"
** chose local file: ShopSearch.template
* next
* select stage
* create

change throttling for stage "standard"
 * login to Amazon AWS console
 * open the Amazon API Gateway service console
 * open the ShopSearchApi API
 * open Settings for statge "standard"
 * change Rate to 1 requests per second

run tests (change BASE_URL if the deployment url has changed)

    cd test
     # you may have to change the url
    ./shopsearchTest.groovy https://x2c2yeap60.execute-api.eu-central-1.amazonaws.com/standard

run jmeter test
 * you may have to change the server
 * open the file shopsearchTest.jmx
