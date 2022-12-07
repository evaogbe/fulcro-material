(ns ogbe.fulcro.mui.icons.remove-outlined
  #?(:cljs (:require
            ["@mui/icons-material/RemoveOutlined" :default RemoveOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-remove-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RemoveOutlined)))