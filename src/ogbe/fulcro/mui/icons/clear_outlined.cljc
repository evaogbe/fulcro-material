(ns ogbe.fulcro.mui.icons.clear-outlined
  #?(:cljs (:require
            ["@mui/icons-material/ClearOutlined" :default ClearOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-clear-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ClearOutlined)))