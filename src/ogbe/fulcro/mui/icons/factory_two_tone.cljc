(ns ogbe.fulcro.mui.icons.factory-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/FactoryTwoTone" :default FactoryTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-factory-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FactoryTwoTone)))