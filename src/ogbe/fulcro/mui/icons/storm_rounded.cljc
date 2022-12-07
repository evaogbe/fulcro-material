(ns ogbe.fulcro.mui.icons.storm-rounded
  #?(:cljs (:require
            ["@mui/icons-material/StormRounded" :default StormRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-storm-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory StormRounded)))