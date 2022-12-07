(ns ogbe.fulcro.mui.icons.savings-outlined
  #?(:cljs (:require
            ["@mui/icons-material/SavingsOutlined" :default SavingsOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-savings-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SavingsOutlined)))