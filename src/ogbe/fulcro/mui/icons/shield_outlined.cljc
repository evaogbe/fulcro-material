(ns ogbe.fulcro.mui.icons.shield-outlined
  #?(:cljs (:require
            ["@mui/icons-material/ShieldOutlined" :default ShieldOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-shield-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ShieldOutlined)))