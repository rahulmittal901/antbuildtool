#!/usr/bin/env groovy

def call() {

  withAnt(installation: 'ant', jdk: 'jdk') {
            bat "ant compile"

       }

}
