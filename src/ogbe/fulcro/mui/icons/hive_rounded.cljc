(ns ogbe.fulcro.mui.icons.hive-rounded
  #?(:cljs (:require
            ["@mui/icons-material/HiveRounded" :default HiveRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-hive-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HiveRounded)))