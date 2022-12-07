(ns ogbe.fulcro.mui.icons.last-page-rounded
  #?(:cljs (:require
            ["@mui/icons-material/LastPageRounded" :default LastPageRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-last-page-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LastPageRounded)))