(ns ogbe.fulcro.mui.icons.tungsten-rounded
  #?(:cljs (:require
            ["@mui/icons-material/TungstenRounded" :default TungstenRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-tungsten-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TungstenRounded)))