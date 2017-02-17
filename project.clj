(defproject cljs-quickstart "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :plugins [[lein-cljsbuild "1.1.5"]]
  :dependencies [ [org.clojure/clojure "1.8.0"]
                  [org.clojure/clojurescript "1.9.473"]]

  :cljsbuild {
    :builds [{
        :source-paths ["src-cljs"]
        :compiler {
          :main 'hello-world.core
          :output-to "target/main.js"
          :optimizations :whitespace
          :pretty-print true}}]})
