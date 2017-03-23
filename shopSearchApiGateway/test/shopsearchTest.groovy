#!/usr/bin/env groovy

import java.util.concurrent.atomic.AtomicInteger

class ShopsearchClient {

    def success = new AtomicInteger()
    def error = new AtomicInteger()
    def startTime = System.currentTimeMillis()
    def url

    def ShopsearchClient(url) {
      this.url = url
    }

	def findShopByTsId(tsId) {
		def u = new URL("$url/$tsId")
		try { 
		  def resp = u.text
		  success += 1
		  "SUCCESS" 
		} catch (Exception e) { 
		  error += 1
		  "ERROR: $e.message" 
		}
	}

    def getTimeDuration() {System.currentTimeMillis() - startTime  }

    def printStats() {
        def requestPerSecondFactor = 1000.0 / timeDuration
        println "time: $timeDuration ms | success: $success (${success * requestPerSecondFactor} requests/s) | errors: $error (${error * requestPerSecondFactor} requests/s)"
    }

}

if(args.size() < 1) {
  println "USAGE: ./shopsearchTest.groovy URL [runtimeSeconds]"
  System.exit(1)
}

BASE_URL = args[0]
runtime = 30 as long
if(args.size() > 1) {
  runtime = Long.valueOf(args[1]) 
}
runtime = runtime * 1000

client = new ShopsearchClient("$BASE_URL")

(0..9).collect {
  Thread.start {
    while(client.timeDuration < runtime) { 
      println client.findShopByTsId('X9235A668DA2B23F33A170D24985A6715')
      client.printStats()
    }

  }
}.each { t -> t.join() }

client.printStats()
println "DONE"

