(defproject cljs-quickstart "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :plugins [[lein-cljsbuild "1.1.5"]
            [lein-figwheel "0.5.8"]]

  :clean-targets ["out" "resources/public/js"]

  :dependencies [ [org.clojure/clojure "1.8.0"]
                  [org.clojure/clojurescript "1.9.473"]
                  [org.omcljs/om "1.0.0-alpha46"]]

  :cljsbuild {
    :builds [{
        :id "dev"
        :source-paths ["src-cljs"]
        :figwheel true
        :compiler {
          :main "cljs-quickstart.core"; 'hello-world.core
          :asset-path "js/out"
          :output-to "resources/public/js/main.js"
          :output-dir "resources/public/js/out"
          :optimizations :none ;:whitespace
          :pretty-print true}}]})
