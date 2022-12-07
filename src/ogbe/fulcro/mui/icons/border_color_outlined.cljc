(ns ogbe.fulcro.mui.icons.border-color-outlined
  #?(:cljs (:require
            ["@mui/icons-material/BorderColorOutlined" :default BorderColorOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-border-color-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BorderColorOutlined)))