(ns ogbe.fulcro.mui.icons.auto-delete-outlined
  #?(:cljs (:require
            ["@mui/icons-material/AutoDeleteOutlined" :default AutoDeleteOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-auto-delete-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AutoDeleteOutlined)))