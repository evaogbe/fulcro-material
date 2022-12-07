(ns ogbe.fulcro.mui.icons.cable-outlined
  #?(:cljs (:require
            ["@mui/icons-material/CableOutlined" :default CableOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-cable-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CableOutlined)))