(ns ogbe.fulcro.mui.icons.factory-sharp
  #?(:cljs (:require
            ["@mui/icons-material/FactorySharp" :default FactorySharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-factory-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FactorySharp)))