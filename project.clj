(def hadoop-version "2.7.4")
(def hbase-version "1.1.7")

(defproject luhhujbb/hbase-admin "0.1.14"
  :description "A library to administer hbase"
  :url "https://github.com/luhhujbb/clj-hbase-admin"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/tools.logging "0.3.1"]
                 [org.clojure/tools.cli "0.3.1"]
                 [org.slf4j/slf4j-api "1.7.10"]
                 [org.slf4j/slf4j-log4j12 "1.7.10"]
                 [log4j "1.2.17"]

                 [org.apache.hadoop/hadoop-common ~hadoop-version]
                 [org.apache.hadoop/hadoop-hdfs ~hadoop-version]
                 [org.apache.hadoop/hadoop-client ~hadoop-version]
                 [org.apache.hadoop/hadoop-mapreduce-client-core ~hadoop-version]
                 [org.apache.hbase/hbase-client ~hbase-version]
                 [org.apache.hbase/hbase-server ~hbase-version]
                 [org.apache.hbase/hbase-protocol ~hbase-version]
                 [org.apache.hbase/hbase ~hbase-version :extension "pom"]
                 [org.apache.hadoop/hadoop-aws ~hadoop-version]
                 [org.apache.httpcomponents/httpclient "4.5.4"]]
  :source-paths ["src/clj"]
  :java-source-paths ["src/java"]
  :aot :all)
