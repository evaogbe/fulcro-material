(ns ogbe.fulcro.mui.icons.smartphone-rounded
  #?(:cljs (:require
            ["@mui/icons-material/SmartphoneRounded" :default SmartphoneRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-smartphone-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SmartphoneRounded)))