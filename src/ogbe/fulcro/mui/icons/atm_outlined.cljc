(ns ogbe.fulcro.mui.icons.atm-outlined
  #?(:cljs (:require
            ["@mui/icons-material/AtmOutlined" :default AtmOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-atm-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AtmOutlined)))