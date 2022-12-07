(ns ogbe.fulcro.mui.icons.toc-rounded
  #?(:cljs (:require
            ["@mui/icons-material/TocRounded" :default TocRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-toc-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TocRounded)))