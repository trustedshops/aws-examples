
Trusted Shops shopReviews
=========================

Quickstart
----------

### install the cloud infrastructure

* login to the aws console
* open cloudformer
* create new stack "ShopReviewsStack"
* chose: "Upload a template to Amazon S3"
** chose local file: ShopReviews.template
* next
* select stage
* create

change throttling for stage "standard"
 * login to Amazon AWS console
 * open the Amazon API Gateway service console
 * open the ShopReviewsApi API
 * open Settings for statge "standard"
 * change Rate to 1 requests per second

