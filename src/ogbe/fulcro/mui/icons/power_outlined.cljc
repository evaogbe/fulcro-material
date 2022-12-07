(ns ogbe.fulcro.mui.icons.power-outlined
  #?(:cljs (:require
            ["@mui/icons-material/PowerOutlined" :default PowerOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-power-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PowerOutlined)))