#!/usr/bin/env groovy

def call(args) {
 def antVersion = 'ant'
withEnv( ["ANT_HOME=${tool antVersion}"] ) {
 bat "%ANT_HOME%/bin/ant.bat ${args}"
}
}
