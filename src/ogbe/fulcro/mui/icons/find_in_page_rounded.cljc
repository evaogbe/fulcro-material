(ns ogbe.fulcro.mui.icons.find-in-page-rounded
  #?(:cljs (:require
            ["@mui/icons-material/FindInPageRounded" :default FindInPageRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-find-in-page-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FindInPageRounded)))