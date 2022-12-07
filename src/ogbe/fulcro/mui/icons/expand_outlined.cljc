(ns ogbe.fulcro.mui.icons.expand-outlined
  #?(:cljs (:require
            ["@mui/icons-material/ExpandOutlined" :default ExpandOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-expand-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ExpandOutlined)))