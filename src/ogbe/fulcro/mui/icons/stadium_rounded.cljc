(ns ogbe.fulcro.mui.icons.stadium-rounded
  #?(:cljs (:require
            ["@mui/icons-material/StadiumRounded" :default StadiumRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-stadium-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory StadiumRounded)))