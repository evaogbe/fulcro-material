(ns build
  (:require
   [clojure.tools.build.api :as b]
   [deps-deploy.deps-deploy :as dd]))

(def version "0.1.0-alpha0")
(def class-dir "target/classes")
(def lib 'net.clojars.eoogbe/fulcro-material)
(def basis (b/create-basis {:project "deps.edn"}))
(def jar-file (format "target/%s-%s.jar" (name lib) version))

(defn clean [_]
  (b/delete {:path "target"}))

(defn jar [_]
  (b/write-pom {:basis basis
                :class-dir class-dir
                :lib lib
                :scm {:url "https://github.com/eoogbe/fulcro-material"
                      :connection "scm:git:git://github.com/eoogbe/fulcro-material.git"
                      :developerConnection "scm:git:ssh://git@github.com:eoogbe/fulcro-material.git"
                      :tag (str "v" version)}
                :src-dirs ["src"]
                :version version})
  (b/copy-dir {:src-dirs ["src"]
               :target-dir class-dir})
  (b/jar {:class-dir class-dir
          :jar-file jar-file}))

(defn install [_]
  (b/install {:basis basis
              :class-dir class-dir
              :jar-file jar-file
              :lib lib
              :version version}))

(defn deploy [_]
  (dd/deploy {:artifact jar-file
              :installer :remote
              :pom-file (b/pom-path {:lib lib :class-dir class-dir})}))
