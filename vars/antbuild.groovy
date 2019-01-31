#!/usr/bin/env groovy

def call(arg) {

  withAnt(installation: $arg, jdk: 'jdk') {
            bat "ant compile"

       }

}
