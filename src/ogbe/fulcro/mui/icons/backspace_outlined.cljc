(ns ogbe.fulcro.mui.icons.backspace-outlined
  #?(:cljs (:require
            ["@mui/icons-material/BackspaceOutlined" :default BackspaceOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-backspace-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BackspaceOutlined)))