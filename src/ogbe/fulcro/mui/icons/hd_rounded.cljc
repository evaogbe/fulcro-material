(ns ogbe.fulcro.mui.icons.hd-rounded
  #?(:cljs (:require
            ["@mui/icons-material/HdRounded" :default HdRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-hd-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HdRounded)))