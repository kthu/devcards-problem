(defproject react-conflict "0.1.0-SNAPSHOT"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :min-lein-version "2.5.3"

  :dependencies [[org.clojure/clojure       "1.8.0"]
                 [org.clojure/clojurescript "1.8.51"]
                 [devcards                   "0.2.1-7"]
                 [cljsjs/react               "0.14.3-0"]
                 [sablono                    "0.5.3"]]

  :plugins [[lein-figwheel  "0.5.3-2"]
            [lein-cljsbuild "1.1.3" :exclusions [org.clojure/clojure]]]

  :clean-targets ^{:protect false} ["resources/public/js/compiled"
                                    "target"]

  :source-paths ["src"]

  :cljsbuild {:builds [{:id "prod"
                        :source-paths ["src"]
                        :compiler {:main       "react-conflict.core"
                                   :asset-path "js/compiled/out"
                                   :output-to  "resources/public/js/compiled/react_conflict.js"
                                   :optimizations :advanced}}]})
