(ns ogbe.fulcro.mui.icons.factory-outlined
  #?(:cljs (:require
            ["@mui/icons-material/FactoryOutlined" :default FactoryOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-factory-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FactoryOutlined)))