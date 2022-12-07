(ns ogbe.fulcro.mui.icons.factory-rounded
  #?(:cljs (:require
            ["@mui/icons-material/FactoryRounded" :default FactoryRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-factory-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FactoryRounded)))